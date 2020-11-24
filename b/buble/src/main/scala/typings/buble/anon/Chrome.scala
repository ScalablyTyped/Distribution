package typings.buble.anon

import typings.buble.bubleNumbers.`0.10`
import typings.buble.bubleNumbers.`0.12`
import typings.buble.bubleNumbers.`10.1`
import typings.buble.bubleNumbers.`10`
import typings.buble.bubleNumbers.`11.1`
import typings.buble.bubleNumbers.`11`
import typings.buble.bubleNumbers.`12`
import typings.buble.bubleNumbers.`13`
import typings.buble.bubleNumbers.`14`
import typings.buble.bubleNumbers.`15`
import typings.buble.bubleNumbers.`16`
import typings.buble.bubleNumbers.`17`
import typings.buble.bubleNumbers.`18`
import typings.buble.bubleNumbers.`19`
import typings.buble.bubleNumbers.`43`
import typings.buble.bubleNumbers.`44`
import typings.buble.bubleNumbers.`45`
import typings.buble.bubleNumbers.`46`
import typings.buble.bubleNumbers.`47`
import typings.buble.bubleNumbers.`48`
import typings.buble.bubleNumbers.`49`
import typings.buble.bubleNumbers.`4`
import typings.buble.bubleNumbers.`50`
import typings.buble.bubleNumbers.`51`
import typings.buble.bubleNumbers.`52`
import typings.buble.bubleNumbers.`53`
import typings.buble.bubleNumbers.`54`
import typings.buble.bubleNumbers.`55`
import typings.buble.bubleNumbers.`56`
import typings.buble.bubleNumbers.`57`
import typings.buble.bubleNumbers.`58`
import typings.buble.bubleNumbers.`59`
import typings.buble.bubleNumbers.`5`
import typings.buble.bubleNumbers.`60`
import typings.buble.bubleNumbers.`61`
import typings.buble.bubleNumbers.`62`
import typings.buble.bubleNumbers.`63`
import typings.buble.bubleNumbers.`64`
import typings.buble.bubleNumbers.`65`
import typings.buble.bubleNumbers.`66`
import typings.buble.bubleNumbers.`67`
import typings.buble.bubleNumbers.`68`
import typings.buble.bubleNumbers.`69`
import typings.buble.bubleNumbers.`6`
import typings.buble.bubleNumbers.`70`
import typings.buble.bubleNumbers.`71`
import typings.buble.bubleNumbers.`8.10`
import typings.buble.bubleNumbers.`8.3`
import typings.buble.bubleNumbers.`8.7`
import typings.buble.bubleNumbers.`8`
import typings.buble.bubleNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chrome extends js.Object {
  
  var chrome: js.UndefOr[
    `48` | `49` | `50` | `51` | `52` | `53` | `54` | `55` | `56` | `57` | `58` | `59` | `60` | `61` | `62` | `63` | `64` | `65` | `66` | `67` | `68` | `69` | `70` | `71`
  ] = js.native
  
  var edge: js.UndefOr[`12` | `13` | `14` | `15` | `16` | `17` | `18` | `19`] = js.native
  
  var firefox: js.UndefOr[
    `43` | `44` | `45` | `46` | `47` | `48` | `49` | `50` | `51` | `52` | `53` | `54` | `55` | `56` | `57` | `58` | `59` | `60` | `61` | `62` | `63` | `64`
  ] = js.native
  
  var ie: js.UndefOr[`8` | `9` | `10` | `11`] = js.native
  
  var node: js.UndefOr[`0.10` | `0.12` | `4` | `5` | `6` | `8` | `8.3` | `8.7` | `8.10`] = js.native
  
  var safari: js.UndefOr[`8` | `9` | `10` | `10.1` | `11` | `11.1` | `12`] = js.native
}
object Chrome {
  
  @scala.inline
  def apply(): Chrome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chrome]
  }
  
  @scala.inline
  implicit class ChromeOps[Self <: Chrome] (val x: Self) extends AnyVal {
    
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
    def setChrome(
      value: `48` | `49` | `50` | `51` | `52` | `53` | `54` | `55` | `56` | `57` | `58` | `59` | `60` | `61` | `62` | `63` | `64` | `65` | `66` | `67` | `68` | `69` | `70` | `71`
    ): Self = this.set("chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    
    @scala.inline
    def setEdge(value: `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19`): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    
    @scala.inline
    def setFirefox(
      value: `43` | `44` | `45` | `46` | `47` | `48` | `49` | `50` | `51` | `52` | `53` | `54` | `55` | `56` | `57` | `58` | `59` | `60` | `61` | `62` | `63` | `64`
    ): Self = this.set("firefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirefox: Self = this.set("firefox", js.undefined)
    
    @scala.inline
    def setIe(value: `8` | `9` | `10` | `11`): Self = this.set("ie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIe: Self = this.set("ie", js.undefined)
    
    @scala.inline
    def setNode(value: `0.10` | `0.12` | `4` | `5` | `6` | `8` | `8.3` | `8.7` | `8.10`): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setSafari(value: `8` | `9` | `10` | `10.1` | `11` | `11.1` | `12`): Self = this.set("safari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafari: Self = this.set("safari", js.undefined)
  }
}
