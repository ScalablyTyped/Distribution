package typings.bounceJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bounce.js", JSImport.Default)
@js.native
class default () extends Bounce

/* static members */
@JSImport("bounce.js", JSImport.Default)
@js.native
object default extends js.Object {
  var FPS: Double = js.native
  var counter: Double = js.native
  def isSupported(): Boolean = js.native
}

