package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSNeverKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSNeverKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSNeverKeyword_ : TSNeverKeyword = js.native
}
object TSNeverKeyword_ {
  
  @scala.inline
  def apply(`type`: TSNeverKeyword): TSNeverKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSNeverKeyword_]
  }
  
  @scala.inline
  implicit class TSNeverKeyword_MutableBuilder[Self <: TSNeverKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSNeverKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
