package typings
package bounceDotJsLib.bounceDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bounce.js", JSImport.Default)
@js.native
class default () extends Bounce

@JSImport("bounce.js", JSImport.Default)
@js.native
object default extends js.Object {
  var FPS: scala.Double = js.native
  var counter: scala.Double = js.native
  def isSupported(): scala.Boolean = js.native
}

