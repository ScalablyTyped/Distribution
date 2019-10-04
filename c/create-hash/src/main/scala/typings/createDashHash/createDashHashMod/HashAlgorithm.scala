package typings.createDashHash.createDashHashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashAlgorithm extends js.Object {
  def digest(): String = js.native
  def digest(target: encoding): String = js.native
  def end(): Unit = js.native
  def read(): Unit = js.native
  def update(data: String): Unit = js.native
  def write(data: String): Unit = js.native
}

