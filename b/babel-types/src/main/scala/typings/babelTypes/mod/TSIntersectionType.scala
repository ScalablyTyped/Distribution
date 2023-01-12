package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSIntersectionType
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSIntersectionType: typings.babelTypes.babelTypesStrings.TSIntersectionType
  
  var types: js.Array[TSType]
}
object TSIntersectionType {
  
  @JSImport("babel-types", "TSIntersectionType")
  @js.native
  def apply(types: js.Array[TSType]): TSIntersectionType = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSIntersectionType] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSIntersectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
