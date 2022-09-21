package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActionTypeInput extends StObject {
  
  /**
    * Defines what kind of action can be taken in the stage. The following are the valid values:    Source     Build     Test     Deploy     Approval     Invoke   
    */
  var category: ActionCategory
  
  /**
    * The creator of an action type that was created with any supported integration model. There are two valid values: AWS and ThirdParty.
    */
  var owner: ActionTypeOwner
  
  /**
    * The provider of the action type being called. The provider name is specified when the action type is created.
    */
  var provider: ActionProvider
  
  /**
    * A string that describes the action type version.
    */
  var version: Version
}
object GetActionTypeInput {
  
  inline def apply(category: ActionCategory, owner: ActionTypeOwner, provider: ActionProvider, version: Version): GetActionTypeInput = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActionTypeInput]
  }
  
  extension [Self <: GetActionTypeInput](x: Self) {
    
    inline def setCategory(value: ActionCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: ActionTypeOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: ActionProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
