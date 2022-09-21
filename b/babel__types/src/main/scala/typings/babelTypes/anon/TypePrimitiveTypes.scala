package typings.babelTypes.anon

import typings.babelTypes.libMod.PrimitiveTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypePrimitiveTypes extends StObject {
  
  var `type`: PrimitiveTypes
}
object TypePrimitiveTypes {
  
  inline def apply(`type`: PrimitiveTypes): TypePrimitiveTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePrimitiveTypes]
  }
  
  extension [Self <: TypePrimitiveTypes](x: Self) {
    
    inline def setType(value: PrimitiveTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
