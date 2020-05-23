package typings.bent.mod

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import typings.std.ReadableStream
import typings.std.ResponseType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Response & {  statusCode  :number} */
trait FetchResponse extends BentResponse {
  val body: ReadableStream[Uint8Array] | Null
  val bodyUsed: Boolean
  val headers: typings.std.Headers
  val ok: Boolean
  val redirected: Boolean
  val status: Double
  var statusCode: Double
  val statusText: String
  val trailer: js.Promise[typings.std.Headers]
  val `type`: ResponseType
  val url: String
  def arrayBuffer(): js.Promise[ArrayBuffer]
  def blob(): js.Promise[Blob]
  def formData(): js.Promise[FormData]
  def json(): js.Promise[_]
  def text(): js.Promise[String]
}

object FetchResponse {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    formData: () => js.Promise[FormData],
    headers: typings.std.Headers,
    json: () => js.Promise[_],
    ok: Boolean,
    redirected: Boolean,
    status: Double,
    statusCode: Double,
    statusText: String,
    text: () => js.Promise[String],
    trailer: js.Promise[typings.std.Headers],
    `type`: ResponseType,
    url: String,
    body: ReadableStream[Uint8Array] = null
  ): FetchResponse = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResponse]
  }
}

