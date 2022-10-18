package typings.awsSdkNodeHttpHandler

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesReadableDotmockMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/readable.mock", "ReadFromBuffers")
  @js.native
  open class ReadFromBuffers protected () extends Readable {
    def this(options: ReadFromBuffersOptions) = this()
    
    def _read(): js.UndefOr[Boolean] = js.native
    
    /* private */ var buffersToRead: Any = js.native
    
    /* private */ var errorAfter: Any = js.native
    
    /* private */ var numBuffersRead: Any = js.native
  }
  
  trait ReadFromBuffersOptions
    extends StObject
       with ReadableOptions {
    
    var buffers: js.Array[Buffer]
    
    var errorAfter: js.UndefOr[Double] = js.undefined
  }
  object ReadFromBuffersOptions {
    
    inline def apply(buffers: js.Array[Buffer]): ReadFromBuffersOptions = {
      val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadFromBuffersOptions]
    }
    
    extension [Self <: ReadFromBuffersOptions](x: Self) {
      
      inline def setBuffers(value: js.Array[Buffer]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
      
      inline def setBuffersVarargs(value: Buffer*): Self = StObject.set(x, "buffers", js.Array(value*))
      
      inline def setErrorAfter(value: Double): Self = StObject.set(x, "errorAfter", value.asInstanceOf[js.Any])
      
      inline def setErrorAfterUndefined: Self = StObject.set(x, "errorAfter", js.undefined)
    }
  }
}
