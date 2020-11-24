package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDefaultExecutionConfig extends js.Object {
  
  var IsolationMode: js.UndefOr[FunctionIsolationMode] = js.native
  
  var RunAs: js.UndefOr[FunctionRunAsConfig] = js.native
}
object FunctionDefaultExecutionConfig {
  
  @scala.inline
  def apply(): FunctionDefaultExecutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDefaultExecutionConfig]
  }
  
  @scala.inline
  implicit class FunctionDefaultExecutionConfigOps[Self <: FunctionDefaultExecutionConfig] (val x: Self) extends AnyVal {
    
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
    def setIsolationMode(value: FunctionIsolationMode): Self = this.set("IsolationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolationMode: Self = this.set("IsolationMode", js.undefined)
    
    @scala.inline
    def setRunAs(value: FunctionRunAsConfig): Self = this.set("RunAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAs: Self = this.set("RunAs", js.undefined)
  }
}
