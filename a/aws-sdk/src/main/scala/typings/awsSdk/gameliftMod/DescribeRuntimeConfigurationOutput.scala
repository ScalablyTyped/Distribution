package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRuntimeConfigurationOutput extends StObject {
  
  /**
    * Instructions describing how server processes should be launched and maintained on each instance in the fleet.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.RuntimeConfiguration] = js.native
}
object DescribeRuntimeConfigurationOutput {
  
  @scala.inline
  def apply(): DescribeRuntimeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuntimeConfigurationOutput]
  }
  
  @scala.inline
  implicit class DescribeRuntimeConfigurationOutputMutableBuilder[Self <: DescribeRuntimeConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuntimeConfiguration(value: RuntimeConfiguration): Self = StObject.set(x, "RuntimeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeConfigurationUndefined: Self = StObject.set(x, "RuntimeConfiguration", js.undefined)
  }
}
