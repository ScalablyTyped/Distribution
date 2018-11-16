package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "ConnectionStringParser")
@js.native
class ConnectionStringParser protected () extends js.Object {
  def this(connectionString: java.lang.String) = this()
  var _pos: scala.Double = js.native
  var _state: java.lang.String = js.native
  var _value: java.lang.String = js.native
  def _extractKey(): java.lang.String = js.native
  def _extractString(quote: java.lang.String): java.lang.String = js.native
  def _extractValue(): java.lang.String = js.native
  def _parse(options: ConnectionStringParseOptions): Dictionary[java.lang.String] = js.native
  def _skipOperator(operator: java.lang.String): scala.Unit = js.native
  def _skipWhitespaces(): scala.Unit = js.native
}

@JSImport("azure", "ConnectionStringParser")
@js.native
object ConnectionStringParser extends js.Object {
  def parse(connectionString: java.lang.String): azureLib.azureMod.Dictionary[java.lang.String] = js.native
}

