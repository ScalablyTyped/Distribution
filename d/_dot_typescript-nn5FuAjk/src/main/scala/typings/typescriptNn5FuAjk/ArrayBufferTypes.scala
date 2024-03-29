package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allowed ArrayBuffer types for the buffer of an ArrayBufferView and related Typed Arrays.
  */
trait ArrayBufferTypes extends StObject {
  
  var ArrayBuffer: typings.typescriptNn5FuAjk.ArrayBuffer
  
  var SharedArrayBuffer: typings.typescriptNn5FuAjk.SharedArrayBuffer
}
object ArrayBufferTypes {
  
  inline def apply(ArrayBuffer: ArrayBuffer, SharedArrayBuffer: SharedArrayBuffer): ArrayBufferTypes = {
    val __obj = js.Dynamic.literal(ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any], SharedArrayBuffer = SharedArrayBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferTypes]
  }
  
  extension [Self <: ArrayBufferTypes](x: Self) {
    
    inline def setArrayBuffer(value: ArrayBuffer): Self = StObject.set(x, "ArrayBuffer", value.asInstanceOf[js.Any])
    
    inline def setSharedArrayBuffer(value: SharedArrayBuffer): Self = StObject.set(x, "SharedArrayBuffer", value.asInstanceOf[js.Any])
  }
}
