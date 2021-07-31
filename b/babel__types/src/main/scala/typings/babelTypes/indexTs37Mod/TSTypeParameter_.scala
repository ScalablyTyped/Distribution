package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSTypeParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeParameter_
  extends StObject
     with BaseNode
     with _Node {
  
  var default: TSType | Null
  
  var constraint: TSType | Null
  
  var name: String
  
  @JSName("type")
  var type_TSTypeParameter_ : TSTypeParameter
}
object TSTypeParameter_ {
  
  @scala.inline
  def apply(name: String): TSTypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], constraint = null, default = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[TSTypeParameter_]
  }
  
  @scala.inline
  implicit class TSTypeParameter_MutableBuilder[Self <: TSTypeParameter_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraint(value: TSType): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintNull: Self = StObject.set(x, "constraint", null)
    
    @scala.inline
    def setDefault(value: TSType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = StObject.set(x, "default", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSTypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
