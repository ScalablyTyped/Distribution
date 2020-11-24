package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionConfiguration extends js.Object {
  
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
  implicit class FunctionConfigurationOps[Self <: FunctionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncodingType(value: EncodingType): Self = this.set("EncodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodingType: Self = this.set("EncodingType", js.undefined)
    
    @scala.inline
    def setEnvironment(value: FunctionConfigurationEnvironment): Self = this.set("Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    
    @scala.inline
    def setExecArgs(value: string): Self = this.set("ExecArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecArgs: Self = this.set("ExecArgs", js.undefined)
    
    @scala.inline
    def setExecutable(value: string): Self = this.set("Executable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutable: Self = this.set("Executable", js.undefined)
    
    @scala.inline
    def setMemorySize(value: integer): Self = this.set("MemorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemorySize: Self = this.set("MemorySize", js.undefined)
    
    @scala.inline
    def setPinned(value: boolean): Self = this.set("Pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("Pinned", js.undefined)
    
    @scala.inline
    def setTimeout(value: integer): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
  }
}
