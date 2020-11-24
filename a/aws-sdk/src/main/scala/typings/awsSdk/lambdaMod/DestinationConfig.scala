package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationConfig extends js.Object {
  
  /**
    * The destination configuration for failed invocations.
    */
  var OnFailure: js.UndefOr[typings.awsSdk.lambdaMod.OnFailure] = js.native
  
  /**
    * The destination configuration for successful invocations.
    */
  var OnSuccess: js.UndefOr[typings.awsSdk.lambdaMod.OnSuccess] = js.native
}
object DestinationConfig {
  
  @scala.inline
  def apply(): DestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationConfig]
  }
  
  @scala.inline
  implicit class DestinationConfigOps[Self <: DestinationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnFailure(value: OnFailure): Self = this.set("OnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFailure: Self = this.set("OnFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: OnSuccess): Self = this.set("OnSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("OnSuccess", js.undefined)
  }
}
