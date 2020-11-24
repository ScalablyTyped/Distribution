package typings.createEmotion.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emotion extends js.Object {
  
  var caches: EmotionCache = js.native
  
  def css(args: Interpolation*): String = js.native
  
  def cx(classNames: ClassNameArg*): String = js.native
  
  def flush(): Unit = js.native
  
  def getRegisteredStyles(registeredStyles: js.Array[String], classNames: String): String = js.native
  
  def hydrate(ids: js.Array[String]): Unit = js.native
  
  def injectGlobal(args: Interpolation*): Unit = js.native
  
  def keyframes(args: Interpolation*): String = js.native
  
  def merge(className: String): String = js.native
  def merge(className: String, sourceMap: String): String = js.native
  
  var sheet: StyleSheet = js.native
}
