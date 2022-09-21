package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameter
  extends StObject
     with Node {
  
  var default: TSType | Null
  
  var constraint: TSType | Null
  
  var name: String | Null
  
  @JSName("type")
  var type_TSTypeParameter: typings.babelTypes.babelTypesStrings.TSTypeParameter
}
object TSTypeParameter {
  
  @JSImport("babel-types", "TSTypeParameter")
  @js.native
  def apply(): TSTypeParameter = js.native
  @JSImport("babel-types", "TSTypeParameter")
  @js.native
  def apply(constraint: Unit, default_ : TSType): TSTypeParameter = js.native
  @JSImport("babel-types", "TSTypeParameter")
  @js.native
  def apply(constraint: TSType): TSTypeParameter = js.native
  @JSImport("babel-types", "TSTypeParameter")
  @js.native
  def apply(constraint: TSType, default_ : TSType): TSTypeParameter = js.native
  
  extension [Self <: TSTypeParameter](x: Self) {
    
    inline def setConstraint(value: TSType): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintNull: Self = StObject.set(x, "constraint", null)
    
    inline def setDefault(value: TSType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
