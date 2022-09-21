package typings.barnard59Base

import typings.node.streamMod.Stream
import typings.readableStream.mod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  @JSImport("barnard59-base/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("barnard59-base/concat", JSImport.Default)
  @js.native
  val default: Factory = js.native
  
  inline def `object`(streams: Stream*): ConcatStream = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ConcatStream]
  
  @js.native
  trait ConcatStream extends Readable {
    
    var objectMode: Boolean = js.native
    
    var streams: js.Array[Stream] = js.native
  }
  
  @js.native
  trait Factory extends StObject {
    
    def apply(streams: Stream*): ConcatStream = js.native
    
    var `object`: js.Object = js.native
  }
}
