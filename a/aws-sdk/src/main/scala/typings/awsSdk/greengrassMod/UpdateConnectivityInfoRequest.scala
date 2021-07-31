package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectivityInfoRequest extends StObject {
  
  /**
    * A list of connectivity info.
    */
  var ConnectivityInfo: js.UndefOr[listOfConnectivityInfo] = js.undefined
  
  /**
    * The thing name.
    */
  var ThingName: string
}
object UpdateConnectivityInfoRequest {
  
  @scala.inline
  def apply(ThingName: string): UpdateConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectivityInfoRequest]
  }
  
  @scala.inline
  implicit class UpdateConnectivityInfoRequestMutableBuilder[Self <: UpdateConnectivityInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectivityInfo(value: listOfConnectivityInfo): Self = StObject.set(x, "ConnectivityInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectivityInfoUndefined: Self = StObject.set(x, "ConnectivityInfo", js.undefined)
    
    @scala.inline
    def setConnectivityInfoVarargs(value: ConnectivityInfo*): Self = StObject.set(x, "ConnectivityInfo", js.Array(value :_*))
    
    @scala.inline
    def setThingName(value: string): Self = StObject.set(x, "ThingName", value.asInstanceOf[js.Any])
  }
}
