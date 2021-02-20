package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfiguration extends StObject {
  
  /**
    * Indicates whether logging is enabled.
    */
  var Enabled: js.UndefOr[typings.awsSdk.managedblockchainMod.Enabled] = js.native
}
object LogConfiguration {
  
  @scala.inline
  def apply(): LogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfiguration]
  }
  
  @scala.inline
  implicit class LogConfigurationMutableBuilder[Self <: LogConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
