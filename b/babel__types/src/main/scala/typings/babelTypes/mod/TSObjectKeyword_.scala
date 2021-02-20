package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSObjectKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSObjectKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSObjectKeyword_ : TSObjectKeyword = js.native
}
object TSObjectKeyword_ {
  
  @scala.inline
  def apply(`type`: TSObjectKeyword): TSObjectKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSObjectKeyword_]
  }
  
  @scala.inline
  implicit class TSObjectKeyword_MutableBuilder[Self <: TSObjectKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSObjectKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
