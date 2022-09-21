package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatedNativeDataStream
  extends StObject
     with NativeDataStream
object ValidatedNativeDataStream {
  
  inline def apply(
    _float32s: Any,
    _flush: Any,
    _flushIfNecessary: Any,
    _int32s: Any,
    _length: Any,
    _nativeDataStream: Any,
    _position: Any,
    _uint32s: Any,
    writeBoolean: Boolean => Unit,
    writeFloat32: Double => Unit,
    writeFloat32Array: js.typedarray.Float32Array => Unit,
    writeInt32: Double => Unit,
    writeInt32Array: js.typedarray.Int32Array => Unit,
    writeNativeData: js.typedarray.Uint32Array => Unit,
    writeUint32: Double => Unit,
    writeUint32Array: js.typedarray.Uint32Array => Unit
  ): ValidatedNativeDataStream = {
    val __obj = js.Dynamic.literal(_float32s = _float32s.asInstanceOf[js.Any], _flush = _flush.asInstanceOf[js.Any], _flushIfNecessary = _flushIfNecessary.asInstanceOf[js.Any], _int32s = _int32s.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _nativeDataStream = _nativeDataStream.asInstanceOf[js.Any], _position = _position.asInstanceOf[js.Any], _uint32s = _uint32s.asInstanceOf[js.Any], writeBoolean = js.Any.fromFunction1(writeBoolean), writeFloat32 = js.Any.fromFunction1(writeFloat32), writeFloat32Array = js.Any.fromFunction1(writeFloat32Array), writeInt32 = js.Any.fromFunction1(writeInt32), writeInt32Array = js.Any.fromFunction1(writeInt32Array), writeNativeData = js.Any.fromFunction1(writeNativeData), writeUint32 = js.Any.fromFunction1(writeUint32), writeUint32Array = js.Any.fromFunction1(writeUint32Array))
    __obj.asInstanceOf[ValidatedNativeDataStream]
  }
}
