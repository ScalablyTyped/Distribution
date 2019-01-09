package typings
package botvsLib.botvsMod.Global.botvsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  def close(): scala.Unit = js.native
  def read(): java.lang.String | scala.Null = js.native
  def read(size: scala.Double): java.lang.String | scala.Null = js.native
  def write(data: java.lang.String): scala.Double = js.native
  def write(data: java.lang.String, timeout: scala.Double): scala.Double = js.native
}

