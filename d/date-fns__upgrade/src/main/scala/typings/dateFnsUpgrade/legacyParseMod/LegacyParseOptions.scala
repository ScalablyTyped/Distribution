package typings.dateFnsUpgrade.legacyParseMod

import typings.dateFnsUpgrade.dateFnsUpgradeNumbers.`0`
import typings.dateFnsUpgrade.dateFnsUpgradeNumbers.`1`
import typings.dateFnsUpgrade.dateFnsUpgradeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacyParseOptions extends js.Object {
  
  var additionalDigits: js.UndefOr[`0` | `1` | `2`] = js.native
}
object LegacyParseOptions {
  
  @scala.inline
  def apply(): LegacyParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyParseOptions]
  }
  
  @scala.inline
  implicit class LegacyParseOptionsOps[Self <: LegacyParseOptions] (val x: Self) extends AnyVal {
    
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
    def setAdditionalDigits(value: `0` | `1` | `2`): Self = this.set("additionalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalDigits: Self = this.set("additionalDigits", js.undefined)
  }
}
