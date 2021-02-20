package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.FunctionTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionTypeParam_
  extends Node
     with Flow {
  
  var name: Identifier_ = js.native
  
  var typeAnnotation: FlowTypeAnnotation = js.native
  
  @JSName("type")
  var type_FunctionTypeParam_ : FunctionTypeParam = js.native
}
object FunctionTypeParam_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: Identifier_,
    start: Double,
    `type`: FunctionTypeParam,
    typeAnnotation: FlowTypeAnnotation
  ): FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
