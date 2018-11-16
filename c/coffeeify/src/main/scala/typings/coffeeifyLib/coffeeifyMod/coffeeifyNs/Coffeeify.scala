package typings
package coffeeifyLib.coffeeifyMod.coffeeifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coffeeify extends js.Object {
  var sourceMap: scala.Boolean = js.native
  def apply(file: java.lang.String): throughLib.throughMod.throughNs.ThroughStream = js.native
  def compile(file: java.lang.String, data: java.lang.String, callback: Callback): scala.Unit = js.native
  def isCoffee(file: java.lang.String): scala.Boolean = js.native
  def isLiterate(file: java.lang.String): scala.Boolean = js.native
}

