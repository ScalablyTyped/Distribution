package typings.blueimpLoadImage.mod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceHead extends StObject {
  
  def apply(blob: Blob, head: js.typedarray.ArrayBuffer): js.Promise[Blob | Null] = js.native
  def apply(blob: Blob, head: js.typedarray.ArrayBuffer, callback: js.Function1[/* blob */ Blob | Null, Unit]): Unit = js.native
  def apply(blob: Blob, head: js.typedarray.Uint8Array): js.Promise[Blob | Null] = js.native
  def apply(blob: Blob, head: js.typedarray.Uint8Array, callback: js.Function1[/* blob */ Blob | Null, Unit]): Unit = js.native
}
