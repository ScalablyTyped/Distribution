package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailabilityZoneDetail extends js.Object {
  
  /**
    * The name of a corresponding Availability Zone.
    */
  var Name: js.UndefOr[String] = js.native
}
object AvailabilityZoneDetail {
  
  @scala.inline
  def apply(): AvailabilityZoneDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZoneDetail]
  }
  
  @scala.inline
  implicit class AvailabilityZoneDetailOps[Self <: AvailabilityZoneDetail] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
