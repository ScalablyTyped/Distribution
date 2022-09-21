package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationFsxLustreResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the FSx for Lustre file system location that's created. 
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
}
object CreateLocationFsxLustreResponse {
  
  inline def apply(): CreateLocationFsxLustreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationFsxLustreResponse]
  }
  
  extension [Self <: CreateLocationFsxLustreResponse](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
