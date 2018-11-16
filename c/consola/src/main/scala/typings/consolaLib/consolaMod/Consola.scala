package typings
package consolaLib.consolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("consola", "Consola")
@js.native
class Consola () extends js.Object {
  def this(option: Option) = this()
  def add(reporter: Reporter): Consola = js.native
  def clear(): Consola = js.native
  def error(arguments: (java.lang.String | stdLib.Error)*): scala.Unit = js.native
  def info(arguments: java.lang.String*): scala.Unit = js.native
  def remove(reporter: Reporter): Consola = js.native
  def start(arguments: java.lang.String*): scala.Unit = js.native
  def success(arguments: java.lang.String*): scala.Unit = js.native
  def withScope(scope: java.lang.String): scala.Unit = js.native
}

