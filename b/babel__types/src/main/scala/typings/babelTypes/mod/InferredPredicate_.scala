package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.InferredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait InferredPredicate_
  extends Flow
     with BaseNode
     with FlowPredicate {
  
  @JSName("type")
  var type_InferredPredicate_ : InferredPredicate = js.native
}
object InferredPredicate_ {
  
  @scala.inline
  def apply(`type`: InferredPredicate): InferredPredicate_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferredPredicate_]
  }
  
  @scala.inline
  implicit class InferredPredicate_MutableBuilder[Self <: InferredPredicate_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: InferredPredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
