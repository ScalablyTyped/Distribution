package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSModuleBlock
  extends StObject
     with Node {
  
  var body: js.Array[Statement]
  
  @JSName("type")
  var type_TSModuleBlock: typings.babelTypes.babelTypesStrings.TSModuleBlock
}
object TSModuleBlock {
  
  @JSImport("babel-types", "TSModuleBlock")
  @js.native
  def apply(body: js.Array[Statement]): TSModuleBlock = js.native
  
  extension [Self <: TSModuleBlock](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSModuleBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
