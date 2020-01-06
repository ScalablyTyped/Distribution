package typings.crossDashFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.BodyInit
import typings.std.FormData
import typings.std.Headers
import typings.std.ReadableStream
import typings.std.Response
import typings.std.ResponseInit
import typings.std.ResponseType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("res")
@js.native
class res () extends Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  /* CompleteClass */
  override val body: ReadableStream[Uint8Array] | Null = js.native
  /* CompleteClass */
  override val bodyUsed: Boolean = js.native
  /* CompleteClass */
  override val headers: Headers = js.native
  /* CompleteClass */
  override val ok: Boolean = js.native
  /* CompleteClass */
  override val redirected: Boolean = js.native
  /* CompleteClass */
  override val status: Double = js.native
  /* CompleteClass */
  override val statusText: String = js.native
  /* CompleteClass */
  override val trailer: js.Promise[Headers] = js.native
  /* CompleteClass */
  override val `type`: ResponseType = js.native
  /* CompleteClass */
  override val url: String = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[FormData] = js.native
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  /* CompleteClass */
  override def text(): js.Promise[String] = js.native
}

@JSGlobal("res")
@js.native
object res
  extends Instantiable0[Response]
     with Instantiable1[/* body */ BodyInit, Response]
     with Instantiable2[(/* body */ BodyInit) | (/* body */ Null), /* init */ ResponseInit, Response] {
  def error(): Response = js.native
  def redirect(url: String): Response = js.native
  def redirect(url: String, status: Double): Response = js.native
}

