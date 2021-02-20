package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.PipelineTopicExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `103` extends StObject {
  
  var `type`: PipelineTopicExpression = js.native
}
object `103` {
  
  @scala.inline
  def apply(`type`: PipelineTopicExpression): `103` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`103`]
  }
  
  @scala.inline
  implicit class `103MutableBuilder`[Self <: `103`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: PipelineTopicExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
