package typings.consola.consolaMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("consola", "Consola")
@js.native
class Consola () extends js.Object {
  def this(option: Option) = this()
  def add(reporter: Reporter): Consola = js.native
  def clear(): Consola = js.native
  def error(arguments: (String | Error)*): Unit = js.native
  def info(arguments: String*): Unit = js.native
  def remove(reporter: Reporter): Consola = js.native
  def start(arguments: String*): Unit = js.native
  def success(arguments: String*): Unit = js.native
  def withScope(scope: String): Unit = js.native
}

