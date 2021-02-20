package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSNumberKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSNumberKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSNumberKeyword_ : TSNumberKeyword = js.native
}
object TSNumberKeyword_ {
  
  @scala.inline
  def apply(`type`: TSNumberKeyword): TSNumberKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSNumberKeyword_]
  }
  
  @scala.inline
  implicit class TSNumberKeyword_MutableBuilder[Self <: TSNumberKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSNumberKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
