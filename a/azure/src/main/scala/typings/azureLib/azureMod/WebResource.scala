package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "WebResource")
@js.native
class WebResource () extends js.Object {
  var queryString: Dictionary[java.lang.String] = js.native
  var rawResponse: scala.Boolean = js.native
  def addOptionalMetadataHeaders(metadata: StorageMetadata): WebResource = js.native
  def del(path: java.lang.String): WebResource = js.native
  def get(path: java.lang.String): WebResource = js.native
  def head(path: java.lang.String): WebResource = js.native
  def merge(path: java.lang.String): WebResource = js.native
  def pipeInput(inputStream: nodeLib.streamMod.Stream, destStream: nodeLib.streamMod.Stream): nodeLib.streamMod.Stream = js.native
  def post(path: java.lang.String): WebResource = js.native
  def put(path: java.lang.String): WebResource = js.native
  def validResponse(statusCode: scala.Double): scala.Boolean = js.native
  def withBody(body: js.Any): WebResource = js.native
  def withHeader(name: java.lang.String, value: java.lang.String): WebResource = js.native
  def withHeaders(headers: Dictionary[java.lang.String]): WebResource = js.native
  def withHeadersOnly(headersOnly: scala.Boolean): WebResource = js.native
  def withProperty(name: java.lang.String, value: java.lang.String): WebResource = js.native
  def withQueryOption(name: java.lang.String, value: java.lang.String, defaultValue: java.lang.String): WebResource = js.native
  def withQueryOptions(queryOptions: Dictionary[java.lang.String]): WebResource = js.native
  def withRawResponse(rawResponse: scala.Boolean): WebResource = js.native
}

