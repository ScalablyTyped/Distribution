package typings.azure.mod

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "WebResource")
@js.native
class WebResource () extends StObject {
  
  def addOptionalMetadataHeaders(metadata: StorageMetadata): WebResource = js.native
  
  def del(path: String): WebResource = js.native
  
  def get(path: String): WebResource = js.native
  
  def head(path: String): WebResource = js.native
  
  def merge(path: String): WebResource = js.native
  
  def pipeInput(inputStream: Stream, destStream: Stream): Stream = js.native
  
  def post(path: String): WebResource = js.native
  
  def put(path: String): WebResource = js.native
  
  var queryString: Dictionary[String] = js.native
  
  var rawResponse: Boolean = js.native
  
  def validResponse(statusCode: Double): Boolean = js.native
  
  def withBody(body: js.Any): WebResource = js.native
  
  def withHeader(name: String, value: String): WebResource = js.native
  
  def withHeaders(headers: Dictionary[String]): WebResource = js.native
  
  def withHeadersOnly(headersOnly: Boolean): WebResource = js.native
  
  def withProperty(name: String, value: String): WebResource = js.native
  
  def withQueryOption(name: String, value: String, defaultValue: String): WebResource = js.native
  
  def withQueryOptions(queryOptions: Dictionary[String]): WebResource = js.native
  
  def withRawResponse(rawResponse: Boolean): WebResource = js.native
}
