package typings.concatStream

import typings.node.Buffer
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("concat-stream", JSImport.Namespace)
  @js.native
  def apply(cb: js.Function1[/* buf */ Buffer, Unit]): Writable = js.native
  @JSImport("concat-stream", JSImport.Namespace)
  @js.native
  def apply(opts: ConcatOpts, cb: js.Function1[/* buf */ Buffer, Unit]): Writable = js.native
  
  @js.native
  trait ConcatOpts extends StObject {
    
    var encoding: js.UndefOr[String] = js.native
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
