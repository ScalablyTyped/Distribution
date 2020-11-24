package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerNumbers.`-1`
import typings.cookieclicker.cookieclickerNumbers.`0`
import typings.cookieclicker.cookieclickerNumbers.`1`
import typings.cookieclicker.cookieclickerNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PantheonSpirit extends js.Object {
  
  /**
    * Additional description which is only shown if the spirit is slotted
    */
  var activeDescFunc: js.UndefOr[js.Function0[String]] = js.native
  
  /**
    * The description of the effects of having the spirit in the first slot in HTML text
    */
  var desc1: js.UndefOr[String] = js.native
  
  /**
    * The description of the effects of having the spirit in the second slot in HTML text
    */
  var desc2: js.UndefOr[String] = js.native
  
  /**
    * The description of the effects of having the spirit in the third slot in HTLM text
    */
  var desc3: js.UndefOr[String] = js.native
  
  /**
    * The text to display after all other descriptions
    */
  var descAfter: js.UndefOr[String] = js.native
  
  /**
    * The text to display before all other descriptions
    */
  var descBefore: js.UndefOr[String] = js.native
  
  var icon: Icon = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  /**
    * The flavour text of the spirit
    */
  var quote: String = js.native
  
  /**
    * The current slot the spirit is in
    */
  var slot: `-1` | `0` | `1` | `2` = js.native
}
object PantheonSpirit {
  
  @scala.inline
  def apply(icon: Icon, id: Double, name: String, quote: String, slot: `-1` | `0` | `1` | `2`): PantheonSpirit = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[PantheonSpirit]
  }
  
  @scala.inline
  implicit class PantheonSpiritOps[Self <: PantheonSpirit] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlot(value: `-1` | `0` | `1` | `2`): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDescFunc(value: () => String): Self = this.set("activeDescFunc", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteActiveDescFunc: Self = this.set("activeDescFunc", js.undefined)
    
    @scala.inline
    def setDesc1(value: String): Self = this.set("desc1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc1: Self = this.set("desc1", js.undefined)
    
    @scala.inline
    def setDesc2(value: String): Self = this.set("desc2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc2: Self = this.set("desc2", js.undefined)
    
    @scala.inline
    def setDesc3(value: String): Self = this.set("desc3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc3: Self = this.set("desc3", js.undefined)
    
    @scala.inline
    def setDescAfter(value: String): Self = this.set("descAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescAfter: Self = this.set("descAfter", js.undefined)
    
    @scala.inline
    def setDescBefore(value: String): Self = this.set("descBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescBefore: Self = this.set("descBefore", js.undefined)
  }
}
