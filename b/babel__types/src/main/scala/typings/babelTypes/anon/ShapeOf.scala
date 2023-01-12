package typings.babelTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.babelTypes.libMod.FieldOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeOf extends StObject {
  
  var shapeOf: StringDictionary[FieldOptions]
}
object ShapeOf {
  
  inline def apply(shapeOf: StringDictionary[FieldOptions]): ShapeOf = {
    val __obj = js.Dynamic.literal(shapeOf = shapeOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeOf] (val x: Self) extends AnyVal {
    
    inline def setShapeOf(value: StringDictionary[FieldOptions]): Self = StObject.set(x, "shapeOf", value.asInstanceOf[js.Any])
  }
}
