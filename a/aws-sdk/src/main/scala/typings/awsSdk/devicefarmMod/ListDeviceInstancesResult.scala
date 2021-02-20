package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeviceInstancesResult extends StObject {
  
  /**
    * An object that contains information about your device instances.
    */
  var deviceInstances: js.UndefOr[DeviceInstances] = js.native
  
  /**
    * An identifier that can be used in the next call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListDeviceInstancesResult {
  
  @scala.inline
  def apply(): ListDeviceInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceInstancesResult]
  }
  
  @scala.inline
  implicit class ListDeviceInstancesResultMutableBuilder[Self <: ListDeviceInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceInstances(value: DeviceInstances): Self = StObject.set(x, "deviceInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceInstancesUndefined: Self = StObject.set(x, "deviceInstances", js.undefined)
    
    @scala.inline
    def setDeviceInstancesVarargs(value: DeviceInstance*): Self = StObject.set(x, "deviceInstances", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
