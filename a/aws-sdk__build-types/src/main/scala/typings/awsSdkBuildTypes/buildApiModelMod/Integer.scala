package typings.awsSdkBuildTypes.buildApiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integer
  extends StObject
     with ShapeDef
     with Shape {
  
  var max: js.UndefOr[scala.Double] = js.undefined
  
  var min: js.UndefOr[scala.Double] = js.undefined
  
  @JSName("type")
  val type_Integer: integer
}
object Integer {
  
  inline def apply(): Integer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[Integer]
  }
  
  extension [Self <: Integer](x: Self) {
    
    inline def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
