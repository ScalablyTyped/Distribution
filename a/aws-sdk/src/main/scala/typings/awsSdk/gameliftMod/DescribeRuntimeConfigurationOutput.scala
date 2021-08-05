package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuntimeConfigurationOutput extends StObject {
  
  /**
    * Instructions describing how server processes should be launched and maintained on each instance in the fleet.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.RuntimeConfiguration] = js.undefined
}
object DescribeRuntimeConfigurationOutput {
  
  inline def apply(): DescribeRuntimeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuntimeConfigurationOutput]
  }
  
  extension [Self <: DescribeRuntimeConfigurationOutput](x: Self) {
    
    inline def setRuntimeConfiguration(value: RuntimeConfiguration): Self = StObject.set(x, "RuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigurationUndefined: Self = StObject.set(x, "RuntimeConfiguration", js.undefined)
  }
}
