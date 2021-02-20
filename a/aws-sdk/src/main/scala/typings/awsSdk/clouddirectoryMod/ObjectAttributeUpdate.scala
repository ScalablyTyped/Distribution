package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectAttributeUpdate extends StObject {
  
  /**
    * The action to perform as part of the attribute update.
    */
  var ObjectAttributeAction: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectAttributeAction] = js.native
  
  /**
    * The key of the attribute being updated.
    */
  var ObjectAttributeKey: js.UndefOr[AttributeKey] = js.native
}
object ObjectAttributeUpdate {
  
  @scala.inline
  def apply(): ObjectAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAttributeUpdate]
  }
  
  @scala.inline
  implicit class ObjectAttributeUpdateMutableBuilder[Self <: ObjectAttributeUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectAttributeAction(value: ObjectAttributeAction): Self = StObject.set(x, "ObjectAttributeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectAttributeActionUndefined: Self = StObject.set(x, "ObjectAttributeAction", js.undefined)
    
    @scala.inline
    def setObjectAttributeKey(value: AttributeKey): Self = StObject.set(x, "ObjectAttributeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectAttributeKeyUndefined: Self = StObject.set(x, "ObjectAttributeKey", js.undefined)
  }
}
