package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDefaultConfig extends StObject {
  
  var Execution: js.UndefOr[FunctionDefaultExecutionConfig] = js.native
}
object FunctionDefaultConfig {
  
  @scala.inline
  def apply(): FunctionDefaultConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDefaultConfig]
  }
  
  @scala.inline
  implicit class FunctionDefaultConfigMutableBuilder[Self <: FunctionDefaultConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecution(value: FunctionDefaultExecutionConfig): Self = StObject.set(x, "Execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionUndefined: Self = StObject.set(x, "Execution", js.undefined)
  }
}
