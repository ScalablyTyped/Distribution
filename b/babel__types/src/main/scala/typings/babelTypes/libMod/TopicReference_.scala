package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicReference_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TopicReference_ : "TopicReference"
}
object TopicReference_ {
  
  inline def apply(): TopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TopicReference")
    __obj.asInstanceOf[TopicReference_]
  }
  
  extension [Self <: TopicReference_](x: Self) {
    
    inline def setType(value: "TopicReference"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
