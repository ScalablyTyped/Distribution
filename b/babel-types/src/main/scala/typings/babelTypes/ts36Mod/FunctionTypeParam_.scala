package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.FunctionTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionTypeParam_
  extends StObject
     with Node
     with Flow {
  
  var name: Identifier_
  
  var typeAnnotation: FlowTypeAnnotation
  
  @JSName("type")
  var type_FunctionTypeParam_ : FunctionTypeParam
}
object FunctionTypeParam_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: Identifier_,
    start: Double,
    typeAnnotation: FlowTypeAnnotation
  ): FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[FunctionTypeParam_]
  }
  
  @scala.inline
  implicit class FunctionTypeParam_MutableBuilder[Self <: FunctionTypeParam_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Identifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FunctionTypeParam): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: FlowTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
