package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.PipelineTopicExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  var `type`: PipelineTopicExpression
}
object `106` {
  
  inline def apply(): `106` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PipelineTopicExpression")
    __obj.asInstanceOf[`106`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `106`] (val x: Self) extends AnyVal {
    
    inline def setType(value: PipelineTopicExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
