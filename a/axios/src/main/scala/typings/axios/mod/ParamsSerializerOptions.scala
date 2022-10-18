package typings.axios.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsSerializerOptions
  extends StObject
     with SerializerOptions {
  
  var encode: js.UndefOr[ParamEncoder] = js.undefined
  
  var serialize: js.UndefOr[CustomParamsSerializer] = js.undefined
}
object ParamsSerializerOptions {
  
  inline def apply(): ParamsSerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsSerializerOptions]
  }
  
  extension [Self <: ParamsSerializerOptions](x: Self) {
    
    inline def setEncode(value: (/* value */ Any, /* defaultEncoder */ js.Function1[/* value */ Any, Any]) => Any): Self = StObject.set(x, "encode", js.Any.fromFunction2(value))
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setSerialize(
      value: (/* params */ Record[String, Any], /* options */ js.UndefOr[ParamsSerializerOptions]) => String
    ): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
    
    inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
  }
}
