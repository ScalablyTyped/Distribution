package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.PipelinePrimaryTopicReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  var `type`: PipelinePrimaryTopicReference
}
object `31` {
  
  inline def apply(): `31` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `31`] (val x: Self) extends AnyVal {
    
    inline def setType(value: PipelinePrimaryTopicReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
