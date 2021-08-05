package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationSmbResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
}
object CreateLocationSmbResponse {
  
  inline def apply(): CreateLocationSmbResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationSmbResponse]
  }
  
  extension [Self <: CreateLocationSmbResponse](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
