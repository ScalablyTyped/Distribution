package typings.awsSdkClientS3Browser.typesAccessControlTranslationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Destination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessControlTranslation extends js.Object {
  
  /**
    * <p>The override value for the owner of the replica object.</p>
    */
  var Owner: Destination | String = js.native
}
object AccessControlTranslation {
  
  @scala.inline
  def apply(Owner: Destination | String): AccessControlTranslation = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlTranslation]
  }
  
  @scala.inline
  implicit class AccessControlTranslationOps[Self <: AccessControlTranslation] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: Destination | String): Self = this.set("Owner", value.asInstanceOf[js.Any])
  }
}
