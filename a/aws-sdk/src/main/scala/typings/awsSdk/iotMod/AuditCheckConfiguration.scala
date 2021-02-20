package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditCheckConfiguration extends StObject {
  
  /**
    * True if this audit check is enabled for this account.
    */
  var enabled: js.UndefOr[Enabled] = js.native
}
object AuditCheckConfiguration {
  
  @scala.inline
  def apply(): AuditCheckConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditCheckConfiguration]
  }
  
  @scala.inline
  implicit class AuditCheckConfigurationMutableBuilder[Self <: AuditCheckConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
