package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentLink extends js.Object {
  
  /**
    * The name of the linked environment (the dependency).
    */
  var EnvironmentName: js.UndefOr[String] = js.native
  
  /**
    * The name of the link.
    */
  var LinkName: js.UndefOr[String] = js.native
}
object EnvironmentLink {
  
  @scala.inline
  def apply(): EnvironmentLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentLink]
  }
  
  @scala.inline
  implicit class EnvironmentLinkOps[Self <: EnvironmentLink] (val x: Self) extends AnyVal {
    
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
    def setEnvironmentName(value: String): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    
    @scala.inline
    def setLinkName(value: String): Self = this.set("LinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkName: Self = this.set("LinkName", js.undefined)
  }
}
