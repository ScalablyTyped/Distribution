package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TopicReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `101` extends StObject {
  
  var `type`: TopicReference
}
object `101` {
  
  inline def apply(): `101` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TopicReference")
    __obj.asInstanceOf[`101`]
  }
  
  extension [Self <: `101`](x: Self) {
    
    inline def setType(value: TopicReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
