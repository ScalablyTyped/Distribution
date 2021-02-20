package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServicesListResult extends StObject {
  
  /**
    * An array of objects that describe one or more container services.
    */
  var containerServices: js.UndefOr[ContainerServiceList] = js.native
}
object ContainerServicesListResult {
  
  @scala.inline
  def apply(): ContainerServicesListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServicesListResult]
  }
  
  @scala.inline
  implicit class ContainerServicesListResultMutableBuilder[Self <: ContainerServicesListResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerServices(value: ContainerServiceList): Self = StObject.set(x, "containerServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerServicesUndefined: Self = StObject.set(x, "containerServices", js.undefined)
    
    @scala.inline
    def setContainerServicesVarargs(value: ContainerService*): Self = StObject.set(x, "containerServices", js.Array(value :_*))
  }
}
