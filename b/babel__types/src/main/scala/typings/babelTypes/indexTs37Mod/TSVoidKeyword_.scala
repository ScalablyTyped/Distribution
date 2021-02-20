package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSVoidKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSVoidKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSVoidKeyword_ : TSVoidKeyword = js.native
}
object TSVoidKeyword_ {
  
  @scala.inline
  def apply(`type`: TSVoidKeyword): TSVoidKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSVoidKeyword_]
  }
  
  @scala.inline
  implicit class TSVoidKeyword_MutableBuilder[Self <: TSVoidKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSVoidKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
