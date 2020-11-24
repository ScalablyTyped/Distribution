package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationOutput extends js.Object {
  
  /**
    * A unique application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.native
}
object CreateApplicationOutput {
  
  @scala.inline
  def apply(): CreateApplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationOutput]
  }
  
  @scala.inline
  implicit class CreateApplicationOutputOps[Self <: CreateApplicationOutput] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: ApplicationId): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
  }
}
