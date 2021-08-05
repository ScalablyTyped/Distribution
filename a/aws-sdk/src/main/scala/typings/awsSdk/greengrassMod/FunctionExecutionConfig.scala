package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionExecutionConfig extends StObject {
  
  var IsolationMode: js.UndefOr[FunctionIsolationMode] = js.undefined
  
  var RunAs: js.UndefOr[FunctionRunAsConfig] = js.undefined
}
object FunctionExecutionConfig {
  
  inline def apply(): FunctionExecutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionExecutionConfig]
  }
  
  extension [Self <: FunctionExecutionConfig](x: Self) {
    
    inline def setIsolationMode(value: FunctionIsolationMode): Self = StObject.set(x, "IsolationMode", value.asInstanceOf[js.Any])
    
    inline def setIsolationModeUndefined: Self = StObject.set(x, "IsolationMode", js.undefined)
    
    inline def setRunAs(value: FunctionRunAsConfig): Self = StObject.set(x, "RunAs", value.asInstanceOf[js.Any])
    
    inline def setRunAsUndefined: Self = StObject.set(x, "RunAs", js.undefined)
  }
}
