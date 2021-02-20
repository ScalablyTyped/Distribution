package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkAttributeUpdate extends StObject {
  
  /**
    * The action to perform as part of the attribute update.
    */
  var AttributeAction: js.UndefOr[LinkAttributeAction] = js.native
  
  /**
    * The key of the attribute being updated.
    */
  var AttributeKey: js.UndefOr[typings.awsSdk.clouddirectoryMod.AttributeKey] = js.native
}
object LinkAttributeUpdate {
  
  @scala.inline
  def apply(): LinkAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAttributeUpdate]
  }
  
  @scala.inline
  implicit class LinkAttributeUpdateMutableBuilder[Self <: LinkAttributeUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeAction(value: LinkAttributeAction): Self = StObject.set(x, "AttributeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeActionUndefined: Self = StObject.set(x, "AttributeAction", js.undefined)
    
    @scala.inline
    def setAttributeKey(value: AttributeKey): Self = StObject.set(x, "AttributeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeKeyUndefined: Self = StObject.set(x, "AttributeKey", js.undefined)
  }
}
