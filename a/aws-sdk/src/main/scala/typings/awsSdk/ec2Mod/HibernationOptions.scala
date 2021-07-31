package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HibernationOptions extends StObject {
  
  /**
    * If this parameter is set to true, your instance is enabled for hibernation; otherwise, it is not enabled for hibernation.
    */
  var Configured: js.UndefOr[Boolean] = js.undefined
}
object HibernationOptions {
  
  @scala.inline
  def apply(): HibernationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HibernationOptions]
  }
  
  @scala.inline
  implicit class HibernationOptionsMutableBuilder[Self <: HibernationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigured(value: Boolean): Self = StObject.set(x, "Configured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguredUndefined: Self = StObject.set(x, "Configured", js.undefined)
  }
}
