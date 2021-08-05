package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String
  extends StObject
     with ShapeDef
     with Shape {
  
  var `enum`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var idempotencyToken: js.UndefOr[scala.Boolean] = js.undefined
  
  var jsonValue: js.UndefOr[scala.Boolean] = js.undefined
  
  var max: js.UndefOr[scala.Double] = js.undefined
  
  var min: js.UndefOr[scala.Double] = js.undefined
  
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  
  @JSName("type")
  val type_String: string
}
object String {
  
  inline def apply(): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[String]
  }
  
  extension [Self <: String](x: Self) {
    
    inline def setEnum(value: js.Array[java.lang.String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: java.lang.String*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    inline def setIdempotencyToken(value: scala.Boolean): Self = StObject.set(x, "idempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "idempotencyToken", js.undefined)
    
    inline def setJsonValue(value: scala.Boolean): Self = StObject.set(x, "jsonValue", value.asInstanceOf[js.Any])
    
    inline def setJsonValueUndefined: Self = StObject.set(x, "jsonValue", js.undefined)
    
    inline def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPattern(value: java.lang.String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
