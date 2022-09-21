package typings.concatStream

import typings.concatStream.anon.Encoding
import typings.concatStream.anon.`0`
import typings.concatStream.anon.`1`
import typings.concatStream.anon.`2`
import typings.concatStream.anon.`3`
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cb: js.Function1[/* buf */ Buffer, Unit]): Writable = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def apply(opts: js.Object, cb: js.Function1[/* buf */ Buffer, Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: Encoding, cb: js.Function1[/* buf */ js.Array[js.Object], Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: `0`, cb: js.Function1[/* buf */ js.typedarray.Uint8Array, Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: `1`, cb: js.Function1[/* buf */ js.Array[js.BigInt], Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: `2`, cb: js.Function1[/* buf */ String, Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: `3`, cb: js.Function1[/* buf */ Buffer, Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  
  @JSImport("concat-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
