package typings.concatStream

import typings.node.Buffer
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(cb: js.Function1[/* buf */ Buffer, Unit]): Writable = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Writable]
  @scala.inline
  def apply(opts: ConcatOpts, cb: js.Function1[/* buf */ Buffer, Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  
  @JSImport("concat-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ConcatOpts extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
  }
  object ConcatOpts {
    
    @scala.inline
    def apply(): ConcatOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcatOpts]
    }
    
    @scala.inline
    implicit class ConcatOptsMutableBuilder[Self <: ConcatOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
