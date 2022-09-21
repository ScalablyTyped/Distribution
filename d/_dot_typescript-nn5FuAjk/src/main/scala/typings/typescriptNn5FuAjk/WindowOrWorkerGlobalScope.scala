package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOrWorkerGlobalScope extends StObject {
  
  def atob(data: java.lang.String): java.lang.String = js.native
  
  def btoa(data: java.lang.String): java.lang.String = js.native
  
  /** Available only in secure contexts. */
  val caches: CacheStorage = js.native
  
  def clearInterval(): Unit = js.native
  def clearInterval(id: Double): Unit = js.native
  
  def clearTimeout(): Unit = js.native
  def clearTimeout(id: Double): Unit = js.native
  
  def createImageBitmap(image: ImageBitmapSource): Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): Promise[ImageBitmap] = js.native
  def createImageBitmap(
    image: ImageBitmapSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ImageBitmapOptions
  ): Promise[ImageBitmap] = js.native
  
  val crossOriginIsolated: scala.Boolean = js.native
  
  val crypto: Crypto = js.native
  
  def fetch(input: RequestInfo): Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): Promise[Response] = js.native
  def fetch(input: URL): Promise[Response] = js.native
  def fetch(input: URL, init: RequestInit): Promise[Response] = js.native
  
  val indexedDB: IDBFactory = js.native
  
  val isSecureContext: scala.Boolean = js.native
  
  val origin: java.lang.String = js.native
  
  val performance: Performance = js.native
  
  def queueMicrotask(callback: VoidFunction): Unit = js.native
  
  def reportError(e: Any): Unit = js.native
  
  def setInterval(handler: TimerHandler, timeout: Double, arguments: Any*): Double = js.native
  def setInterval(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = js.native
  
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: Any*): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = js.native
  
  def structuredClone(value: Any): Any = js.native
  def structuredClone(value: Any, options: StructuredSerializeOptions): Any = js.native
}
