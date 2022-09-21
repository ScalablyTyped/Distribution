package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePlaceIndexRequest extends StObject {
  
  /**
    * The name of the place index resource to be deleted.
    */
  var IndexName: ResourceName
}
object DeletePlaceIndexRequest {
  
  inline def apply(IndexName: ResourceName): DeletePlaceIndexRequest = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlaceIndexRequest]
  }
  
  extension [Self <: DeletePlaceIndexRequest](x: Self) {
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
  }
}
