package typings.createDashEmotion.createDashEmotionMod

import typings.csstype.csstypeMod.PropertiesFallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ K in csstype.csstype.Pseudos ]:? create-emotion.create-emotion.CSSObject} */ trait CSSObject
  extends PropertiesFallback[Double | String]
     with CSSOthersObject
     with _Interpolation

object CSSObject {
  @scala.inline
  def apply(
    CSSOthersObject: CSSOthersObject = null,
    PropertiesFallback: PropertiesFallback[Double | String] = null,
    _Interpolation: _Interpolation = null
  ): CSSObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CSSOthersObject)
    js.Dynamic.global.Object.assign(__obj, PropertiesFallback)
    js.Dynamic.global.Object.assign(__obj, _Interpolation)
    __obj.asInstanceOf[CSSObject]
  }
}

