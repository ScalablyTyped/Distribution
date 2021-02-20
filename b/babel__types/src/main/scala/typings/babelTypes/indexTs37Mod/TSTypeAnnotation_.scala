package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeAnnotation_
  extends BaseNode
     with _Node {
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSTypeAnnotation_ : TSTypeAnnotation = js.native
}
object TSTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: TSTypeAnnotation, typeAnnotation: TSType): TSTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeAnnotation_]
  }
  
  @scala.inline
  implicit class TSTypeAnnotation_MutableBuilder[Self <: TSTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
