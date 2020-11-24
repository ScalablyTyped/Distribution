package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudTrailConfigurationResult extends js.Object {
  
  /**
    * Describes whether CloudTrail is enabled as a data source for the detector.
    */
  var Status: DataSourceStatus = js.native
}
object CloudTrailConfigurationResult {
  
  @scala.inline
  def apply(Status: DataSourceStatus): CloudTrailConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudTrailConfigurationResult]
  }
  
  @scala.inline
  implicit class CloudTrailConfigurationResultOps[Self <: CloudTrailConfigurationResult] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: DataSourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
}
