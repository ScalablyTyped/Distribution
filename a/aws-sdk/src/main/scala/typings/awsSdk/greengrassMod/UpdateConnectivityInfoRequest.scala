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
  
  inline def apply(ThingName: string): UpdateConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectivityInfoRequest]
  }
  
  extension [Self <: UpdateConnectivityInfoRequest](x: Self) {
    
    inline def setConnectivityInfo(value: listOfConnectivityInfo): Self = StObject.set(x, "ConnectivityInfo", value.asInstanceOf[js.Any])
    
    inline def setConnectivityInfoUndefined: Self = StObject.set(x, "ConnectivityInfo", js.undefined)
    
    inline def setConnectivityInfoVarargs(value: ConnectivityInfo*): Self = StObject.set(x, "ConnectivityInfo", js.Array(value*))
    
    inline def setThingName(value: string): Self = StObject.set(x, "ThingName", value.asInstanceOf[js.Any])
  }
}
