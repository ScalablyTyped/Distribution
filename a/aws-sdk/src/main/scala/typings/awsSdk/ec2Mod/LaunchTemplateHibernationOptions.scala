package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateHibernationOptions extends StObject {
  
  /**
    * If this parameter is set to true, the instance is enabled for hibernation; otherwise, it is not enabled for hibernation.
    */
  var Configured: js.UndefOr[Boolean] = js.native
}
object LaunchTemplateHibernationOptions {
  
  @scala.inline
  def apply(): LaunchTemplateHibernationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateHibernationOptions]
  }
  
  @scala.inline
  implicit class LaunchTemplateHibernationOptionsMutableBuilder[Self <: LaunchTemplateHibernationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigured(value: Boolean): Self = StObject.set(x, "Configured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguredUndefined: Self = StObject.set(x, "Configured", js.undefined)
  }
}
