package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendingOptions extends StObject {
  
  /**
    * If true, email sending is enabled for the configuration set. If false, email sending is disabled for the configuration set.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}
object SendingOptions {
  
  @scala.inline
  def apply(): SendingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendingOptions]
  }
  
  @scala.inline
  implicit class SendingOptionsMutableBuilder[Self <: SendingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendingEnabled(value: Enabled): Self = StObject.set(x, "SendingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendingEnabledUndefined: Self = StObject.set(x, "SendingEnabled", js.undefined)
  }
}
