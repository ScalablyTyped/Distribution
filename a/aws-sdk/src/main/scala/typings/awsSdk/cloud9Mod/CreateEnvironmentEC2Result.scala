package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEnvironmentEC2Result extends js.Object {
  
  /**
    * The ID of the environment that was created.
    */
  var environmentId: js.UndefOr[EnvironmentId] = js.native
}
object CreateEnvironmentEC2Result {
  
  @scala.inline
  def apply(): CreateEnvironmentEC2Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEnvironmentEC2Result]
  }
  
  @scala.inline
  implicit class CreateEnvironmentEC2ResultOps[Self <: CreateEnvironmentEC2Result] (val x: Self) extends AnyVal {
    
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
    def setEnvironmentId(value: EnvironmentId): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentId: Self = this.set("environmentId", js.undefined)
  }
}
