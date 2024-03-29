package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TopicReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicReference_
  extends StObject
     with BaseNode
     with Expression
     with Node {
  
  @JSName("type")
  var type_TopicReference_ : TopicReference
}
object TopicReference_ {
  
  inline def apply(): TopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TopicReference")
    __obj.asInstanceOf[TopicReference_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicReference_] (val x: Self) extends AnyVal {
    
    inline def setType(value: TopicReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
