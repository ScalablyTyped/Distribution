package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SymbolTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait SymbolTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  
  @JSName("type")
  var type_SymbolTypeAnnotation_ : SymbolTypeAnnotation = js.native
}
object SymbolTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: SymbolTypeAnnotation): SymbolTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTypeAnnotation_]
  }
  
  @scala.inline
  implicit class SymbolTypeAnnotation_MutableBuilder[Self <: SymbolTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: SymbolTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
