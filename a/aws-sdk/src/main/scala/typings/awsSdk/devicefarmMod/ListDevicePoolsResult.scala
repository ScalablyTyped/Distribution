package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDevicePoolsResult extends js.Object {
  
  /**
    * Information about the device pools.
    */
  var devicePools: js.UndefOr[DevicePools] = js.native
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListDevicePoolsResult {
  
  @scala.inline
  def apply(): ListDevicePoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicePoolsResult]
  }
  
  @scala.inline
  implicit class ListDevicePoolsResultOps[Self <: ListDevicePoolsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDevicePoolsVarargs(value: DevicePool*): Self = this.set("devicePools", js.Array(value :_*))
    
    @scala.inline
    def setDevicePools(value: DevicePools): Self = this.set("devicePools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicePools: Self = this.set("devicePools", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
