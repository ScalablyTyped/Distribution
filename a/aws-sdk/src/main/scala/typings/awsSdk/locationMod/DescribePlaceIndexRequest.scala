package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePlaceIndexRequest extends StObject {
  
  /**
    * The name of the place index resource.
    */
  var IndexName: ResourceName
}
object DescribePlaceIndexRequest {
  
  inline def apply(IndexName: ResourceName): DescribePlaceIndexRequest = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlaceIndexRequest]
  }
  
  extension [Self <: DescribePlaceIndexRequest](x: Self) {
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
  }
}
