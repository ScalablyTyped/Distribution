package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppValidationOutput extends js.Object {
  
  /**
    * Output from using SSM to validate the application.
    */
  var ssmOutput: js.UndefOr[SSMOutput] = js.native
}
object AppValidationOutput {
  
  @scala.inline
  def apply(): AppValidationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppValidationOutput]
  }
  
  @scala.inline
  implicit class AppValidationOutputOps[Self <: AppValidationOutput] (val x: Self) extends AnyVal {
    
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
    def setSsmOutput(value: SSMOutput): Self = this.set("ssmOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsmOutput: Self = this.set("ssmOutput", js.undefined)
  }
}
