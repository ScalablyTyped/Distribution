package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDataStreamMod {
  
  @JSImport("babylonjs/Engines/Native/nativeDataStream", "NativeDataStream")
  @js.native
  open class NativeDataStream () extends StObject {
    
    /* private */ val _float32s: Any = js.native
    
    /* private */ var _flush: Any = js.native
    
    /* private */ var _flushIfNecessary: Any = js.native
    
    /* private */ val _int32s: Any = js.native
    
    /* private */ val _length: Any = js.native
    
    /* private */ val _nativeDataStream: Any = js.native
    
    /* private */ var _position: Any = js.native
    
    /* private */ val _uint32s: Any = js.native
    
    def writeBoolean(value: Boolean): Unit = js.native
    
    def writeFloat32(value: Double): Unit = js.native
    
    def writeFloat32Array(values: js.typedarray.Float32Array): Unit = js.native
    
    def writeInt32(value: Double): Unit = js.native
    
    def writeInt32Array(values: js.typedarray.Int32Array): Unit = js.native
    
    def writeNativeData(handle: js.typedarray.Uint32Array): Unit = js.native
    
    def writeUint32(value: Double): Unit = js.native
    
    def writeUint32Array(values: js.typedarray.Uint32Array): Unit = js.native
  }
  /* static members */
  object NativeDataStream {
    
    @JSImport("babylonjs/Engines/Native/nativeDataStream", "NativeDataStream.DEFAULT_BUFFER_SIZE")
    @js.native
    val DEFAULT_BUFFER_SIZE: Any = js.native
  }
  
  type NativeData = js.typedarray.Uint32Array
}
