package typings
package consolaLib.consolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("consola", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def error(arguments: (java.lang.String | stdLib.Error)*): scala.Unit = js.native
  def info(arguments: java.lang.String*): scala.Unit = js.native
  def start(arguments: java.lang.String*): scala.Unit = js.native
  def success(arguments: java.lang.String*): scala.Unit = js.native
}

