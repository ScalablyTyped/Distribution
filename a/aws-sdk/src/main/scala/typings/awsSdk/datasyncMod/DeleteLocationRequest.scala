package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the location to delete.
    */
  var LocationArn: typings.awsSdk.datasyncMod.LocationArn
}
object DeleteLocationRequest {
  
  inline def apply(LocationArn: LocationArn): DeleteLocationRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLocationRequest]
  }
  
  extension [Self <: DeleteLocationRequest](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
