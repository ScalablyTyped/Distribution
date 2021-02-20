package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.Super
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait Super_
  extends Expression
     with BaseNode {
  
  @JSName("type")
  var type_Super_ : Super = js.native
}
object Super_ {
  
  @scala.inline
  def apply(`type`: Super): Super_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Super_]
  }
  
  @scala.inline
  implicit class Super_MutableBuilder[Self <: Super_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
