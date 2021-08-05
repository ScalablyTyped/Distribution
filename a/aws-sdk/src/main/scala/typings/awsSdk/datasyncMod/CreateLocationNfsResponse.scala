package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationNfsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source NFS file system location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
}
object CreateLocationNfsResponse {
  
  inline def apply(): CreateLocationNfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationNfsResponse]
  }
  
  extension [Self <: CreateLocationNfsResponse](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
