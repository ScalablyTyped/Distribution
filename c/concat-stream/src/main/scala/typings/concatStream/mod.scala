package typings.concatStream

import typings.node.Buffer
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cb: js.Function1[/* buf */ Buffer, Unit]): Writable = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def apply(opts: ConcatOpts, cb: js.Function1[/* buf */ Buffer, Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  
  @JSImport("concat-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ConcatOpts extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
  }
  object ConcatOpts {
    
    inline def apply(): ConcatOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcatOpts]
    }
    
    extension [Self <: ConcatOpts](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
