package typings.colorbrewer.ColorBrewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwelveColorScheme extends ElevenColorScheme {
  
  var `12`: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
}
object TwelveColorScheme {
  
  @scala.inline
  def apply(
    `10`: js.Tuple10[String, String, String, String, String, String, String, String, String, String],
    `11`: js.Tuple11[String, String, String, String, String, String, String, String, String, String, String],
    `12`: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String],
    `3`: js.Tuple3[String, String, String],
    `4`: js.Tuple4[String, String, String, String],
    `5`: js.Tuple5[String, String, String, String, String],
    `6`: js.Tuple6[String, String, String, String, String, String],
    `7`: js.Tuple7[String, String, String, String, String, String, String],
    `8`: js.Tuple8[String, String, String, String, String, String, String, String],
    `9`: js.Tuple9[String, String, String, String, String, String, String, String, String]
  ): TwelveColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("10")(`10`.asInstanceOf[js.Any])
    __obj.updateDynamic("11")(`11`.asInstanceOf[js.Any])
    __obj.updateDynamic("12")(`12`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.updateDynamic("9")(`9`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwelveColorScheme]
  }
  
  @scala.inline
  implicit class TwelveColorSchemeOps[Self <: TwelveColorScheme] (val x: Self) extends AnyVal {
    
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
    def set12(
      value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    ): Self = this.set("12", value.asInstanceOf[js.Any])
  }
}
