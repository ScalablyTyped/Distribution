package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSUnknownKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSUnknownKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSUnknownKeyword_ : TSUnknownKeyword = js.native
}
object TSUnknownKeyword_ {
  
  @scala.inline
  def apply(`type`: TSUnknownKeyword): TSUnknownKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSUnknownKeyword_]
  }
  
  @scala.inline
  implicit class TSUnknownKeyword_MutableBuilder[Self <: TSUnknownKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSUnknownKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
