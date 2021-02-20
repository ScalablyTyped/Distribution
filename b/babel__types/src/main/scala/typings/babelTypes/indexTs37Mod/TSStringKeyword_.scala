package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSStringKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSStringKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSStringKeyword_ : TSStringKeyword = js.native
}
object TSStringKeyword_ {
  
  @scala.inline
  def apply(`type`: TSStringKeyword): TSStringKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSStringKeyword_]
  }
  
  @scala.inline
  implicit class TSStringKeyword_MutableBuilder[Self <: TSStringKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSStringKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
