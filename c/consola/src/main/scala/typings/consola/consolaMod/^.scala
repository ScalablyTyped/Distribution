package typings.consola.consolaMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("consola", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def error(arguments: (String | Error)*): Unit = js.native
  def info(arguments: String*): Unit = js.native
  def start(arguments: String*): Unit = js.native
  def success(arguments: String*): Unit = js.native
}

