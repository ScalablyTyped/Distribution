package typings.awsSdk.lexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogAction extends StObject {
  
  /**
    * Configures the slot to use spell-by-letter or spell-by-word style. When you use a style on a slot, users can spell out their input to make it clear to your bot.   Spell by letter - "b" "o" "b"   Spell by word - "b as in boy" "o as in oscar" "b as in boy"   For more information, see  Using spelling to enter slot values .
    */
  var slotElicitationStyle: js.UndefOr[StyleType] = js.undefined
  
  /**
    * The name of the slot that should be elicited from the user.
    */
  var slotToElicit: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the constituent sub slot of the composite slot specified in slotToElicit that should be elicited from the user.
    */
  var subSlotToElicit: js.UndefOr[ElicitSubSlot] = js.undefined
  
  /**
    * The next action that the bot should take in its interaction with the user. The possible values are:    Close - Indicates that there will not be a response from the user. For example, the statement "Your order has been placed" does not require a response.    ConfirmIntent - The next action is asking the user if the intent is complete and ready to be fulfilled. This is a yes/no question such as "Place the order?"    Delegate - The next action is determined by Amazon Lex V2.    ElicitIntent - The next action is to elicit an intent from the user.    ElicitSlot - The next action is to elicit a slot value from the user.  
    */
  var `type`: DialogActionType
}
object DialogAction {
  
  inline def apply(`type`: DialogActionType): DialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAction]
  }
  
  extension [Self <: DialogAction](x: Self) {
    
    inline def setSlotElicitationStyle(value: StyleType): Self = StObject.set(x, "slotElicitationStyle", value.asInstanceOf[js.Any])
    
    inline def setSlotElicitationStyleUndefined: Self = StObject.set(x, "slotElicitationStyle", js.undefined)
    
    inline def setSlotToElicit(value: NonEmptyString): Self = StObject.set(x, "slotToElicit", value.asInstanceOf[js.Any])
    
    inline def setSlotToElicitUndefined: Self = StObject.set(x, "slotToElicit", js.undefined)
    
    inline def setSubSlotToElicit(value: ElicitSubSlot): Self = StObject.set(x, "subSlotToElicit", value.asInstanceOf[js.Any])
    
    inline def setSubSlotToElicitUndefined: Self = StObject.set(x, "subSlotToElicit", js.undefined)
    
    inline def setType(value: DialogActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
