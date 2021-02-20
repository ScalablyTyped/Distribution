package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionConfiguration extends StObject {
  
  /**
    * The expected encoding type of the input payload for the function. The default is ''json''.
    */
  var EncodingType: js.UndefOr[typings.awsSdk.greengrassMod.EncodingType] = js.native
  
  /**
    * The environment configuration of the function.
    */
  var Environment: js.UndefOr[FunctionConfigurationEnvironment] = js.native
  
  /**
    * The execution arguments.
    */
  var ExecArgs: js.UndefOr[string] = js.native
  
  /**
    * The name of the function executable.
    */
  var Executable: js.UndefOr[string] = js.native
  
  /**
    * The memory size, in KB, which the function requires. This setting is not applicable and should be cleared when you run the Lambda function without containerization.
    */
  var MemorySize: js.UndefOr[integer] = js.native
  
  /**
    * True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
    */
  var Pinned: js.UndefOr[boolean] = js.native
  
  /**
    * The allowed function execution time, after which Lambda should terminate the function. This timeout still applies to pinned Lambda functions for each request.
    */
  var Timeout: js.UndefOr[integer] = js.native
}
object FunctionConfiguration {
  
  @scala.inline
  def apply(): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfiguration]
  }
  
  @scala.inline
  implicit class FunctionConfigurationMutableBuilder[Self <: FunctionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodingType(value: EncodingType): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
    
    @scala.inline
    def setEnvironment(value: FunctionConfigurationEnvironment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setExecArgs(value: string): Self = StObject.set(x, "ExecArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecArgsUndefined: Self = StObject.set(x, "ExecArgs", js.undefined)
    
    @scala.inline
    def setExecutable(value: string): Self = StObject.set(x, "Executable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutableUndefined: Self = StObject.set(x, "Executable", js.undefined)
    
    @scala.inline
    def setMemorySize(value: integer): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
    
    @scala.inline
    def setPinned(value: boolean): Self = StObject.set(x, "Pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "Pinned", js.undefined)
    
    @scala.inline
    def setTimeout(value: integer): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
