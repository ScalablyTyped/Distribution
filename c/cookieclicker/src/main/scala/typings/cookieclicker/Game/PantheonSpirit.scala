package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerNumbers.`-1`
import typings.cookieclicker.cookieclickerNumbers.`0`
import typings.cookieclicker.cookieclickerNumbers.`1`
import typings.cookieclicker.cookieclickerNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PantheonSpirit extends StObject {
  
  /**
    * Additional description which is only shown if the spirit is slotted
    */
  var activeDescFunc: js.UndefOr[js.Function0[String]] = js.undefined
  
  /**
    * The description of the effects of having the spirit in the first slot in HTML text
    */
  var desc1: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the effects of having the spirit in the second slot in HTML text
    */
  var desc2: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the effects of having the spirit in the third slot in HTLM text
    */
  var desc3: js.UndefOr[String] = js.undefined
  
  /**
    * The text to display after all other descriptions
    */
  var descAfter: js.UndefOr[String] = js.undefined
  
  /**
    * The text to display before all other descriptions
    */
  var descBefore: js.UndefOr[String] = js.undefined
  
  var icon: Icon
  
  var id: Double
  
  var name: String
  
  /**
    * The flavour text of the spirit
    */
  var quote: js.UndefOr[String] = js.undefined
  
  /**
    * The current slot the spirit is in
    */
  var slot: `-1` | `0` | `1` | `2`
}
object PantheonSpirit {
  
  inline def apply(icon: Icon, id: Double, name: String, slot: `-1` | `0` | `1` | `2`): PantheonSpirit = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[PantheonSpirit]
  }
  
  extension [Self <: PantheonSpirit](x: Self) {
    
    inline def setActiveDescFunc(value: () => String): Self = StObject.set(x, "activeDescFunc", js.Any.fromFunction0(value))
    
    inline def setActiveDescFuncUndefined: Self = StObject.set(x, "activeDescFunc", js.undefined)
    
    inline def setDesc1(value: String): Self = StObject.set(x, "desc1", value.asInstanceOf[js.Any])
    
    inline def setDesc1Undefined: Self = StObject.set(x, "desc1", js.undefined)
    
    inline def setDesc2(value: String): Self = StObject.set(x, "desc2", value.asInstanceOf[js.Any])
    
    inline def setDesc2Undefined: Self = StObject.set(x, "desc2", js.undefined)
    
    inline def setDesc3(value: String): Self = StObject.set(x, "desc3", value.asInstanceOf[js.Any])
    
    inline def setDesc3Undefined: Self = StObject.set(x, "desc3", js.undefined)
    
    inline def setDescAfter(value: String): Self = StObject.set(x, "descAfter", value.asInstanceOf[js.Any])
    
    inline def setDescAfterUndefined: Self = StObject.set(x, "descAfter", js.undefined)
    
    inline def setDescBefore(value: String): Self = StObject.set(x, "descBefore", value.asInstanceOf[js.Any])
    
    inline def setDescBeforeUndefined: Self = StObject.set(x, "descBefore", js.undefined)
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setSlot(value: `-1` | `0` | `1` | `2`): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
  }
}
