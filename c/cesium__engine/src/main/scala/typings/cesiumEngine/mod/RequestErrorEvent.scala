package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "RequestErrorEvent")
@js.native
open class RequestErrorEvent () extends StObject {
  def this(statusCode: Double) = this()
  def this(statusCode: Double, response: Any) = this()
  def this(statusCode: Unit, response: Any) = this()
  def this(statusCode: Double, response: Any, responseHeaders: String) = this()
  def this(statusCode: Double, response: Any, responseHeaders: Any) = this()
  def this(statusCode: Double, response: Unit, responseHeaders: String) = this()
  def this(statusCode: Double, response: Unit, responseHeaders: Any) = this()
  def this(statusCode: Unit, response: Any, responseHeaders: String) = this()
  def this(statusCode: Unit, response: Any, responseHeaders: Any) = this()
  def this(statusCode: Unit, response: Unit, responseHeaders: String) = this()
  def this(statusCode: Unit, response: Unit, responseHeaders: Any) = this()
  
  /**
    * The response included along with the error.  If the error does not include a response,
    * this property will be undefined.
    */
  var response: Any = js.native
  
  /**
    * The headers included in the response, represented as an object literal of key/value pairs.
    * If the error does not include any headers, this property will be undefined.
    */
  var responseHeaders: Any = js.native
  
  /**
    * The HTTP error status code, such as 404.  If the error does not have a particular
    * HTTP code, this property will be undefined.
    */
  var statusCode: Double = js.native
}
