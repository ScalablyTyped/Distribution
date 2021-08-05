package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectAttributeAction extends StObject {
  
  /**
    * A type that can be either Update or Delete.
    */
  var ObjectAttributeActionType: js.UndefOr[UpdateActionType] = js.undefined
  
  /**
    * The value that you want to update to.
    */
  var ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined
}
object ObjectAttributeAction {
  
  inline def apply(): ObjectAttributeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAttributeAction]
  }
  
  extension [Self <: ObjectAttributeAction](x: Self) {
    
    inline def setObjectAttributeActionType(value: UpdateActionType): Self = StObject.set(x, "ObjectAttributeActionType", value.asInstanceOf[js.Any])
    
    inline def setObjectAttributeActionTypeUndefined: Self = StObject.set(x, "ObjectAttributeActionType", js.undefined)
    
    inline def setObjectAttributeUpdateValue(value: TypedAttributeValue): Self = StObject.set(x, "ObjectAttributeUpdateValue", value.asInstanceOf[js.Any])
    
    inline def setObjectAttributeUpdateValueUndefined: Self = StObject.set(x, "ObjectAttributeUpdateValue", js.undefined)
  }
}
