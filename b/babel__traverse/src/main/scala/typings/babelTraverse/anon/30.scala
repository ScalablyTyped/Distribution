package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.PipelinePrimaryTopicReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var `type`: PipelinePrimaryTopicReference
}
object `30` {
  
  inline def apply(): `30` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[`30`]
  }
  
  extension [Self <: `30`](x: Self) {
    
    inline def setType(value: PipelinePrimaryTopicReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
