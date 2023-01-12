package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.PipelineBareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineBareFunction_
  extends StObject
     with BaseNode
     with Expression
     with Node {
  
  var callee: Expression
  
  @JSName("type")
  var type_PipelineBareFunction_ : PipelineBareFunction
}
object PipelineBareFunction_ {
  
  inline def apply(callee: Expression): PipelineBareFunction_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PipelineBareFunction")
    __obj.asInstanceOf[PipelineBareFunction_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineBareFunction_] (val x: Self) extends AnyVal {
    
    inline def setCallee(value: Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setType(value: PipelineBareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
