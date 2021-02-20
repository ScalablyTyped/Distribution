package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSThisType_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSThisType_ : TSThisType = js.native
}
object TSThisType_ {
  
  @scala.inline
  def apply(`type`: TSThisType): TSThisType_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSThisType_]
  }
  
  @scala.inline
  implicit class TSThisType_MutableBuilder[Self <: TSThisType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSThisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
