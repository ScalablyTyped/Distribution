package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCustomActionTypeInput extends StObject {
  
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
  implicit class DeleteCustomActionTypeInputMutableBuilder[Self <: DeleteCustomActionTypeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: ActionCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: ActionProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
