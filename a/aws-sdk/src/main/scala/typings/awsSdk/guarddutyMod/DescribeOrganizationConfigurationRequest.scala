package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationConfigurationRequest extends js.Object {
  
  /**
    * The ID of the detector to retrieve information about the delegated administrator from.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}
object DescribeOrganizationConfigurationRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId): DescribeOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationRequest]
  }
  
  @scala.inline
  implicit class DescribeOrganizationConfigurationRequestOps[Self <: DescribeOrganizationConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
  }
}
