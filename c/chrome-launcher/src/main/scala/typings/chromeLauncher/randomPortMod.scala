package typings.chromeLauncher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chrome-launcher/dist/random-port", JSImport.Namespace)
@js.native
object randomPortMod extends js.Object {
  def getRandomPort(): js.Promise[Double] = js.native
}

