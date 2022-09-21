package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NativeDataStream")
@js.native
open class NativeDataStream ()
  extends StObject
     with typings.babylonjs.BABYLON.NativeDataStream {
  
  /* private */ /* CompleteClass */
  override val _float32s: Any = js.native
  
  /* private */ /* CompleteClass */
  var _flush: Any = js.native
  
  /* private */ /* CompleteClass */
  var _flushIfNecessary: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _int32s: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _length: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _nativeDataStream: Any = js.native
  
  /* private */ /* CompleteClass */
  var _position: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _uint32s: Any = js.native
  
  /* CompleteClass */
  override def writeBoolean(value: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def writeFloat32(value: Double): Unit = js.native
  
  /* CompleteClass */
  override def writeFloat32Array(values: js.typedarray.Float32Array): Unit = js.native
  
  /* CompleteClass */
  override def writeInt32(value: Double): Unit = js.native
  
  /* CompleteClass */
  override def writeInt32Array(values: js.typedarray.Int32Array): Unit = js.native
  
  /* CompleteClass */
  override def writeNativeData(handle: js.typedarray.Uint32Array): Unit = js.native
  
  /* CompleteClass */
  override def writeUint32(value: Double): Unit = js.native
  
  /* CompleteClass */
  override def writeUint32Array(values: js.typedarray.Uint32Array): Unit = js.native
}
/* static members */
object NativeDataStream {
  
  @JSGlobal("BABYLON.NativeDataStream.DEFAULT_BUFFER_SIZE")
  @js.native
  val DEFAULT_BUFFER_SIZE: Any = js.native
}
