package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSBooleanKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSBooleanKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSBooleanKeyword_ : TSBooleanKeyword = js.native
}
object TSBooleanKeyword_ {
  
  @scala.inline
  def apply(`type`: TSBooleanKeyword): TSBooleanKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSBooleanKeyword_]
  }
  
  @scala.inline
  implicit class TSBooleanKeyword_MutableBuilder[Self <: TSBooleanKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSBooleanKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
