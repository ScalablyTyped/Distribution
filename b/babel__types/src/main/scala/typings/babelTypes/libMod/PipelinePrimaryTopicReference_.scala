package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelinePrimaryTopicReference_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_PipelinePrimaryTopicReference_ : "PipelinePrimaryTopicReference"
}
object PipelinePrimaryTopicReference_ {
  
  inline def apply(): PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[PipelinePrimaryTopicReference_]
  }
  
  extension [Self <: PipelinePrimaryTopicReference_](x: Self) {
    
    inline def setType(value: "PipelinePrimaryTopicReference"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
