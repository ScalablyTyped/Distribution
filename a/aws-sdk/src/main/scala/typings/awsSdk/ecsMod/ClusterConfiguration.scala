package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterConfiguration extends StObject {
  
  /**
    * The details of the execute command configuration.
    */
  var executeCommandConfiguration: js.UndefOr[ExecuteCommandConfiguration] = js.undefined
}
object ClusterConfiguration {
  
  inline def apply(): ClusterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterConfiguration]
  }
  
  extension [Self <: ClusterConfiguration](x: Self) {
    
    inline def setExecuteCommandConfiguration(value: ExecuteCommandConfiguration): Self = StObject.set(x, "executeCommandConfiguration", value.asInstanceOf[js.Any])
    
    inline def setExecuteCommandConfigurationUndefined: Self = StObject.set(x, "executeCommandConfiguration", js.undefined)
  }
}
