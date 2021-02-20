package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSSymbolKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSSymbolKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSSymbolKeyword_ : TSSymbolKeyword = js.native
}
object TSSymbolKeyword_ {
  
  @scala.inline
  def apply(`type`: TSSymbolKeyword): TSSymbolKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSSymbolKeyword_]
  }
  
  @scala.inline
  implicit class TSSymbolKeyword_MutableBuilder[Self <: TSSymbolKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSSymbolKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
