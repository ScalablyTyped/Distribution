package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface is a read-only map of media key statuses by key IDs.
  * Available only in secure contexts.
  */
@js.native
trait MediaKeyStatusMap extends StObject {
  
  def entries(): IterableIterator[js.Tuple2[BufferSource, MediaKeyStatus]] = js.native
  
  def forEach(
    callbackfn: js.Function3[/* value */ MediaKeyStatus, /* key */ BufferSource, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ MediaKeyStatus, /* key */ BufferSource, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  def get(keyId: BufferSource): js.UndefOr[MediaKeyStatus] = js.native
  
  def has(keyId: BufferSource): scala.Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[BufferSource, MediaKeyStatus]]] = js.native
  
  def keys(): IterableIterator[BufferSource] = js.native
  
  val size: Double = js.native
  
  def values(): IterableIterator[MediaKeyStatus] = js.native
}
