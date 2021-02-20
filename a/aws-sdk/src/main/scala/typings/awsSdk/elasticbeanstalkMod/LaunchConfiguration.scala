package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchConfiguration extends StObject {
  
  /**
    * The name of the launch configuration.
    */
  var Name: js.UndefOr[ResourceId] = js.native
}
object LaunchConfiguration {
  
  @scala.inline
  def apply(): LaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchConfiguration]
  }
  
  @scala.inline
  implicit class LaunchConfigurationMutableBuilder[Self <: LaunchConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceId): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
