package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.PipelinePrimaryTopicReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait PipelinePrimaryTopicReference_
  extends Expression
     with BaseNode {
  
  @JSName("type")
  var type_PipelinePrimaryTopicReference_ : PipelinePrimaryTopicReference = js.native
}
object PipelinePrimaryTopicReference_ {
  
  @scala.inline
  def apply(`type`: PipelinePrimaryTopicReference): PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelinePrimaryTopicReference_]
  }
  
  @scala.inline
  implicit class PipelinePrimaryTopicReference_MutableBuilder[Self <: PipelinePrimaryTopicReference_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: PipelinePrimaryTopicReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
