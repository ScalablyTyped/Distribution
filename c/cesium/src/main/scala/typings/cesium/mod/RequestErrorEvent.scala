package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "RequestErrorEvent")
@js.native
class RequestErrorEvent () extends StObject {
  def this(statusCode: Double) = this()
  def this(statusCode: Double, response: js.Any) = this()
  def this(statusCode: Unit, response: js.Any) = this()
  def this(statusCode: Double, response: js.Any, responseHeaders: String) = this()
  def this(statusCode: Double, response: js.Any, responseHeaders: js.Object) = this()
  def this(statusCode: Double, response: Unit, responseHeaders: String) = this()
  def this(statusCode: Double, response: Unit, responseHeaders: js.Object) = this()
  def this(statusCode: Unit, response: js.Any, responseHeaders: String) = this()
  def this(statusCode: Unit, response: js.Any, responseHeaders: js.Object) = this()
  def this(statusCode: Unit, response: Unit, responseHeaders: String) = this()
  def this(statusCode: Unit, response: Unit, responseHeaders: js.Object) = this()
  
  var response: js.Any = js.native
  
  var responseHeaders: js.Any = js.native
  
  var statusCode: Double = js.native
}
