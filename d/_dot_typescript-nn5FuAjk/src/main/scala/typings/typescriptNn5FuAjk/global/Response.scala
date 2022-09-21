package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.BodyInit
import typings.typescriptNn5FuAjk.ResponseInit
import typings.typescriptNn5FuAjk.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Response")
@js.native
open class Response ()
  extends StObject
     with typings.typescriptNn5FuAjk.Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  
  /* CompleteClass */
  override def arrayBuffer(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.ArrayBuffer] = js.native
  
  /* CompleteClass */
  override def blob(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.Blob] = js.native
  
  /* CompleteClass */
  override val body: typings.typescriptNn5FuAjk.ReadableStream[typings.typescriptNn5FuAjk.Uint8Array] | Null = js.native
  
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  
  /* CompleteClass */
  override def formData(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.FormData] = js.native
  
  /* CompleteClass */
  override val headers: typings.typescriptNn5FuAjk.Headers = js.native
  
  /* CompleteClass */
  override def json(): typings.typescriptNn5FuAjk.Promise[Any] = js.native
  
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  
  /* CompleteClass */
  override val status: Double = js.native
  
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  
  /* CompleteClass */
  override def text(): typings.typescriptNn5FuAjk.Promise[java.lang.String] = js.native
  
  /* CompleteClass */
  override val `type`: ResponseType = js.native
  
  /* CompleteClass */
  override val url: java.lang.String = js.native
}
object Response {
  
  @JSGlobal("Response")
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(): typings.typescriptNn5FuAjk.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.typescriptNn5FuAjk.Response]
  
  inline def redirect(url: java.lang.String): typings.typescriptNn5FuAjk.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Response]
  inline def redirect(url: java.lang.String, status: Double): typings.typescriptNn5FuAjk.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Response]
  inline def redirect(url: typings.typescriptNn5FuAjk.URL): typings.typescriptNn5FuAjk.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Response]
  inline def redirect(url: typings.typescriptNn5FuAjk.URL, status: Double): typings.typescriptNn5FuAjk.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Response]
}
