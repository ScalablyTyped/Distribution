package typings.babelTypes.ts36Mod

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
  
  @JSImport("babel-types/ts3.6", "TSModuleBlock")
  @js.native
  def apply(body: js.Array[Statement]): TSModuleBlock = js.native
  
  @scala.inline
  implicit class TSModuleBlockMutableBuilder[Self <: TSModuleBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSModuleBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
