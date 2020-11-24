package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugSetting extends js.Object {
  
  /**
    * Specifies the type of information to log for debugging. The permitted values are none,
    * requestContent, responseContent, or both requestContent and responseContent separated by a
    * comma. The default is none. When setting this value, carefully consider the type of
    * information you are passing in during deployment. By logging information about the request or
    * response, you could potentially expose sensitive data that is retrieved through the deployment
    * operations.
    */
  var detailLevel: js.UndefOr[String] = js.native
}
object DebugSetting {
  
  @scala.inline
  def apply(): DebugSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugSetting]
  }
  
  @scala.inline
  implicit class DebugSettingOps[Self <: DebugSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetailLevel(value: String): Self = this.set("detailLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailLevel: Self = this.set("detailLevel", js.undefined)
  }
}
