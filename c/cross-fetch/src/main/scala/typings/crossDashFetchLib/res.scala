package typings
package crossDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("res")
@js.native
class res ()
  extends stdLib.Response {
  def this(body: stdLib.BodyInit) = this()
  def this(body: scala.Null, init: stdLib.ResponseInit) = this()
  def this(body: stdLib.BodyInit, init: stdLib.ResponseInit) = this()
  /* CompleteClass */
  override val body: stdLib.ReadableStream[stdLib.Uint8Array] | scala.Null = js.native
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  /* CompleteClass */
  override val headers: stdLib.Headers = js.native
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  /* CompleteClass */
  override val status: scala.Double = js.native
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  /* CompleteClass */
  override val trailer: js.Promise[stdLib.Headers] = js.native
  /* CompleteClass */
  override val `type`: stdLib.ResponseType = js.native
  /* CompleteClass */
  override val url: java.lang.String = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[stdLib.ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[stdLib.Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[stdLib.FormData] = js.native
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
}

@JSGlobal("res")
@js.native
object res
  extends org.scalablytyped.runtime.Instantiable1[/* body */ stdLib.BodyInit, stdLib.Response]
     with org.scalablytyped.runtime.Instantiable0[stdLib.Response]
     with org.scalablytyped.runtime.Instantiable2[
      (/* body */ stdLib.BodyInit) | (/* body */ scala.Null), 
      /* init */ stdLib.ResponseInit, 
      stdLib.Response
    ] {
  def error(): stdLib.Response = js.native
  def redirect(url: java.lang.String): stdLib.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): stdLib.Response = js.native
}

