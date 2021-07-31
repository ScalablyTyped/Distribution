package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PipelinePrimaryTopicReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait PipelinePrimaryTopicReference_
  extends StObject
     with BaseNode
     with Expression {
  
  @JSName("type")
  var type_PipelinePrimaryTopicReference_ : PipelinePrimaryTopicReference
}
object PipelinePrimaryTopicReference_ {
  
  @scala.inline
  def apply(): PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[PipelinePrimaryTopicReference_]
  }
  
  @scala.inline
  implicit class PipelinePrimaryTopicReference_MutableBuilder[Self <: PipelinePrimaryTopicReference_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: PipelinePrimaryTopicReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
