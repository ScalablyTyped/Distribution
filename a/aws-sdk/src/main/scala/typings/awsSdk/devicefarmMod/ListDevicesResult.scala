package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDevicesResult extends StObject {
  
  /**
    * Information about the devices.
    */
  var devices: js.UndefOr[Devices] = js.native
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListDevicesResult {
  
  @scala.inline
  def apply(): ListDevicesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesResult]
  }
  
  @scala.inline
  implicit class ListDevicesResultMutableBuilder[Self <: ListDevicesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: Devices): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
