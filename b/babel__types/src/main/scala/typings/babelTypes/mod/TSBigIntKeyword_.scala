package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSBigIntKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSBigIntKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSBigIntKeyword_ : TSBigIntKeyword = js.native
}
object TSBigIntKeyword_ {
  
  @scala.inline
  def apply(`type`: TSBigIntKeyword): TSBigIntKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSBigIntKeyword_]
  }
  
  @scala.inline
  implicit class TSBigIntKeyword_MutableBuilder[Self <: TSBigIntKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSBigIntKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
