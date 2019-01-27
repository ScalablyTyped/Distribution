package typings
package createDashEmotionLib.createDashEmotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emotion extends js.Object {
  var cache: atEmotionUtilsLib.atEmotionUtilsMod.EmotionCache = js.native
  var sheet: atEmotionSheetLib.atEmotionSheetMod.StyleSheet = js.native
  def css(args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*): java.lang.String = js.native
  def css(
    template: stdLib.TemplateStringsArray,
    args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*
  ): java.lang.String = js.native
  def cx(classNames: ClassNamesArg*): java.lang.String = js.native
  def flush(): scala.Unit = js.native
  def getRegisteredStyles(registeredStyles: js.Array[java.lang.String], className: java.lang.String): java.lang.String = js.native
  def hydrate(ids: js.Array[java.lang.String]): scala.Unit = js.native
  def injectGlobal(args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*): scala.Unit = js.native
  def injectGlobal(
    template: stdLib.TemplateStringsArray,
    args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*
  ): scala.Unit = js.native
  def keyframes(args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*): java.lang.String = js.native
  def keyframes(
    template: stdLib.TemplateStringsArray,
    args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*
  ): java.lang.String = js.native
  def merge(className: java.lang.String): java.lang.String = js.native
}

