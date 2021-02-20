package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclaredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait DeclaredPredicate_
  extends Flow
     with BaseNode
     with FlowPredicate {
  
  @JSName("type")
  var type_DeclaredPredicate_ : DeclaredPredicate = js.native
  
  var value: Flow = js.native
}
object DeclaredPredicate_ {
  
  @scala.inline
  def apply(`type`: DeclaredPredicate, value: Flow): DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclaredPredicate_]
  }
  
  @scala.inline
  implicit class DeclaredPredicate_MutableBuilder[Self <: DeclaredPredicate_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclaredPredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Flow): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
