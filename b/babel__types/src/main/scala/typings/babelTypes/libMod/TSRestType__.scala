package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSRestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSRestType__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSRestType__ : TSRestType
}
object TSRestType__ {
  
  inline def apply(typeAnnotation: TSType): TSRestType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[TSRestType__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSRestType__] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSRestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
