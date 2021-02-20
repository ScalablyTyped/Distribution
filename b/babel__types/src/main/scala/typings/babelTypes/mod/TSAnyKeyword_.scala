package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSAnyKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSAnyKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSAnyKeyword_ : TSAnyKeyword = js.native
}
object TSAnyKeyword_ {
  
  @scala.inline
  def apply(`type`: TSAnyKeyword): TSAnyKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSAnyKeyword_]
  }
  
  @scala.inline
  implicit class TSAnyKeyword_MutableBuilder[Self <: TSAnyKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSAnyKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
