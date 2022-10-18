package typings.bytestreamjs

import typings.bytestreamjs.buildTypesByteStreamMod.ByteStream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHelpersMod {
  
  @JSImport("bytestreamjs/build/types/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseByteMap(stream: ByteStream, map: js.Array[ByteMap], elements: Double): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteMap")(stream.asInstanceOf[js.Any], map.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def parseByteMap(stream: ByteStream, map: js.Array[ByteMap], elements: Double, start: Double): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteMap")(stream.asInstanceOf[js.Any], map.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def parseByteMap(stream: ByteStream, map: js.Array[ByteMap], elements: Double, start: Double, length: Double): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteMap")(stream.asInstanceOf[js.Any], map.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def parseByteMap(stream: ByteStream, map: js.Array[ByteMap], elements: Double, start: Null, length: Double): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteMap")(stream.asInstanceOf[js.Any], map.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def parseByteMap(stream: ByteStream, map: js.Array[ByteMap], elements: Double, start: Unit, length: Double): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteMap")(stream.asInstanceOf[js.Any], map.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  
  trait ByteMap extends StObject {
    
    var defaultValue: js.UndefOr[Double | String] = js.undefined
    
    def func(array: js.typedarray.Uint8Array): ByteMapFunctionResult
    
    var maxlength: Double
    
    var minlength: Double
    
    var name: String
    
    var `type`: String
  }
  object ByteMap {
    
    inline def apply(
      func: js.typedarray.Uint8Array => ByteMapFunctionResult,
      maxlength: Double,
      minlength: Double,
      name: String,
      `type`: String
    ): ByteMap = {
      val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func), maxlength = maxlength.asInstanceOf[js.Any], minlength = minlength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteMap]
    }
    
    extension [Self <: ByteMap](x: Self) {
      
      inline def setDefaultValue(value: Double | String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setFunc(value: js.typedarray.Uint8Array => ByteMapFunctionResult): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
      
      inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
      
      inline def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ByteMapFunctionResult extends StObject {
    
    var length: Double
    
    var status: Double
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object ByteMapFunctionResult {
    
    inline def apply(length: Double, status: Double): ByteMapFunctionResult = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteMapFunctionResult]
    }
    
    extension [Self <: ByteMapFunctionResult](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
