package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateCpuOptions extends StObject {
  
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of threads per CPU core.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.undefined
}
object LaunchTemplateCpuOptions {
  
  @scala.inline
  def apply(): LaunchTemplateCpuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCpuOptions]
  }
  
  @scala.inline
  implicit class LaunchTemplateCpuOptionsMutableBuilder[Self <: LaunchTemplateCpuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoreCount(value: Integer): Self = StObject.set(x, "CoreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreCountUndefined: Self = StObject.set(x, "CoreCount", js.undefined)
    
    @scala.inline
    def setThreadsPerCore(value: Integer): Self = StObject.set(x, "ThreadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsPerCoreUndefined: Self = StObject.set(x, "ThreadsPerCore", js.undefined)
  }
}
