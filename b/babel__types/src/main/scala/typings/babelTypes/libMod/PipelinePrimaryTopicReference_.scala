package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.PipelinePrimaryTopicReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelinePrimaryTopicReference_
  extends StObject
     with BaseNode
     with Expression
     with Node {
  
  @JSName("type")
  var type_PipelinePrimaryTopicReference_ : PipelinePrimaryTopicReference
}
object PipelinePrimaryTopicReference_ {
  
  inline def apply(): PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[PipelinePrimaryTopicReference_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelinePrimaryTopicReference_] (val x: Self) extends AnyVal {
    
    inline def setType(value: PipelinePrimaryTopicReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
