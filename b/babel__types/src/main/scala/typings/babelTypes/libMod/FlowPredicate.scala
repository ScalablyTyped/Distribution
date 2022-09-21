package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.DeclaredPredicate_
  - typings.babelTypes.libMod.InferredPredicate_
*/
trait FlowPredicate extends StObject
object FlowPredicate {
  
  inline def DeclaredPredicate_(value: Flow): typings.babelTypes.libMod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclaredPredicate")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclaredPredicate_]
  }
  
  inline def InferredPredicate_(): typings.babelTypes.libMod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[typings.babelTypes.libMod.InferredPredicate_]
  }
}
