package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Import
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait Import_
  extends Expression
     with BaseNode {
  
  @JSName("type")
  var type_Import_ : Import = js.native
}
object Import_ {
  
  @scala.inline
  def apply(`type`: Import): Import_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import_]
  }
  
  @scala.inline
  implicit class Import_MutableBuilder[Self <: Import_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Import): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
