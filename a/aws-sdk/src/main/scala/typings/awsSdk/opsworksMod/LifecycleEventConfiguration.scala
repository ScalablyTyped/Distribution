package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleEventConfiguration extends StObject {
  
  /**
    * A ShutdownEventConfiguration object that specifies the Shutdown event configuration.
    */
  var Shutdown: js.UndefOr[ShutdownEventConfiguration] = js.native
}
object LifecycleEventConfiguration {
  
  @scala.inline
  def apply(): LifecycleEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleEventConfiguration]
  }
  
  @scala.inline
  implicit class LifecycleEventConfigurationMutableBuilder[Self <: LifecycleEventConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShutdown(value: ShutdownEventConfiguration): Self = StObject.set(x, "Shutdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutdownUndefined: Self = StObject.set(x, "Shutdown", js.undefined)
  }
}
