package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HibernationOptions extends js.Object {
  
  /**
    * If this parameter is set to true, your instance is enabled for hibernation; otherwise, it is not enabled for hibernation.
    */
  var Configured: js.UndefOr[Boolean] = js.native
}
object HibernationOptions {
  
  @scala.inline
  def apply(): HibernationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HibernationOptions]
  }
  
  @scala.inline
  implicit class HibernationOptionsOps[Self <: HibernationOptions] (val x: Self) extends AnyVal {
    
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
    def setConfigured(value: Boolean): Self = this.set("Configured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigured: Self = this.set("Configured", js.undefined)
  }
}
