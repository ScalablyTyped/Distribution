package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.PipelineBareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineBareFunction_
  extends BaseNode
     with _Node {
  
  var callee: Expression = js.native
  
  @JSName("type")
  var type_PipelineBareFunction_ : PipelineBareFunction = js.native
}
object PipelineBareFunction_ {
  
  @scala.inline
  def apply(callee: Expression, `type`: PipelineBareFunction): PipelineBareFunction_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineBareFunction_]
  }
  
  @scala.inline
  implicit class PipelineBareFunction_MutableBuilder[Self <: PipelineBareFunction_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallee(value: Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PipelineBareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
