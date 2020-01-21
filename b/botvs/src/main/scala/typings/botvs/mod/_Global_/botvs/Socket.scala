package typings.botvs.mod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  def close(): Unit = js.native
  def read(): String | Null = js.native
  def read(size: Double): String | Null = js.native
  def write(data: String): Double = js.native
  def write(data: String, timeout: Double): Double = js.native
}

