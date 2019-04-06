package typings
package createDashEmotionLib.createDashEmotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emotion extends js.Object {
  var caches: EmotionCache = js.native
  var sheet: StyleSheet = js.native
  def css(args: Interpolation*): java.lang.String = js.native
  def cx(classNames: ClassNameArg*): java.lang.String = js.native
  def flush(): scala.Unit = js.native
  def getRegisteredStyles(registeredStyles: js.Array[java.lang.String], classNames: java.lang.String): java.lang.String = js.native
  def hydrate(ids: js.Array[java.lang.String]): scala.Unit = js.native
  def injectGlobal(args: Interpolation*): scala.Unit = js.native
  def keyframes(args: Interpolation*): java.lang.String = js.native
  def merge(className: java.lang.String): java.lang.String = js.native
  def merge(className: java.lang.String, sourceMap: java.lang.String): java.lang.String = js.native
}

