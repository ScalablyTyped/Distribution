package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceProfileResult extends js.Object {
  
  /**
    * An object that contains information about an instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.native
}
object GetInstanceProfileResult {
  
  @scala.inline
  def apply(): GetInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceProfileResult]
  }
  
  @scala.inline
  implicit class GetInstanceProfileResultOps[Self <: GetInstanceProfileResult] (val x: Self) extends AnyVal {
    
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
    def setInstanceProfile(value: InstanceProfile): Self = this.set("instanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProfile: Self = this.set("instanceProfile", js.undefined)
  }
}
