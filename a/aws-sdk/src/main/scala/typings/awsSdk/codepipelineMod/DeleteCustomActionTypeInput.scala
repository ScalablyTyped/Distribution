package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCustomActionTypeInput extends js.Object {
  
  /**
    * The category of the custom action that you want to delete, such as source or deploy.
    */
  var category: ActionCategory = js.native
  
  /**
    * The provider of the service used in the custom action, such as AWS CodeDeploy.
    */
  var provider: ActionProvider = js.native
  
  /**
    * The version of the custom action to delete.
    */
  var version: Version = js.native
}
object DeleteCustomActionTypeInput {
  
  @scala.inline
  def apply(category: ActionCategory, provider: ActionProvider, version: Version): DeleteCustomActionTypeInput = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomActionTypeInput]
  }
  
  @scala.inline
  implicit class DeleteCustomActionTypeInputOps[Self <: DeleteCustomActionTypeInput] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: ActionCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: ActionProvider): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
