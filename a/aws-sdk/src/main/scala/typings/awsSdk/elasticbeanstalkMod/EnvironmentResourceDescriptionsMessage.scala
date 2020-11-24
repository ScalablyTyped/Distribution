package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentResourceDescriptionsMessage extends js.Object {
  
  /**
    *  A list of EnvironmentResourceDescription. 
    */
  var EnvironmentResources: js.UndefOr[EnvironmentResourceDescription] = js.native
}
object EnvironmentResourceDescriptionsMessage {
  
  @scala.inline
  def apply(): EnvironmentResourceDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResourceDescriptionsMessage]
  }
  
  @scala.inline
  implicit class EnvironmentResourceDescriptionsMessageOps[Self <: EnvironmentResourceDescriptionsMessage] (val x: Self) extends AnyVal {
    
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
    def setEnvironmentResources(value: EnvironmentResourceDescription): Self = this.set("EnvironmentResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentResources: Self = this.set("EnvironmentResources", js.undefined)
  }
}
