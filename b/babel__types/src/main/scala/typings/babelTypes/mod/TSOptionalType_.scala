package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSOptionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSOptionalType_
  extends TSType
     with BaseNode {
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSOptionalType_ : TSOptionalType = js.native
}
object TSOptionalType_ {
  
  @scala.inline
  def apply(`type`: TSOptionalType, typeAnnotation: TSType): TSOptionalType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSOptionalType_]
  }
  
  @scala.inline
  implicit class TSOptionalType_MutableBuilder[Self <: TSOptionalType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSOptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
