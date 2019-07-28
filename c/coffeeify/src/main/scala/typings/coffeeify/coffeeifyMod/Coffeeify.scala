package typings.coffeeify.coffeeifyMod

import typings.through.throughMod.ThroughStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coffeeify extends js.Object {
  var sourceMap: Boolean = js.native
  def apply(file: String): ThroughStream = js.native
  def compile(file: String, data: String, callback: Callback): Unit = js.native
  def isCoffee(file: String): Boolean = js.native
  def isLiterate(file: String): Boolean = js.native
}

