package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "ConnectionStringParser")
@js.native
class ConnectionStringParser protected () extends StObject {
  def this(connectionString: String) = this()
  
  def _extractKey(): String = js.native
  
  def _extractString(quote: String): String = js.native
  
  def _extractValue(): String = js.native
  
  def _parse(options: ConnectionStringParseOptions): Dictionary[String] = js.native
  
  var _pos: Double = js.native
  
  def _skipOperator(operator: String): Unit = js.native
  
  def _skipWhitespaces(): Unit = js.native
  
  var _state: String = js.native
  
  var _value: String = js.native
}
/* static members */
object ConnectionStringParser {
  
  @JSImport("azure", "ConnectionStringParser")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(connectionString: String): Dictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(connectionString.asInstanceOf[js.Any]).asInstanceOf[Dictionary[String]]
}
