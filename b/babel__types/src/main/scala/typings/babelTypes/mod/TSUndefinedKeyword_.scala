package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSUndefinedKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSUndefinedKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSUndefinedKeyword_ : TSUndefinedKeyword = js.native
}
object TSUndefinedKeyword_ {
  
  @scala.inline
  def apply(`type`: TSUndefinedKeyword): TSUndefinedKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSUndefinedKeyword_]
  }
  
  @scala.inline
  implicit class TSUndefinedKeyword_MutableBuilder[Self <: TSUndefinedKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSUndefinedKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
