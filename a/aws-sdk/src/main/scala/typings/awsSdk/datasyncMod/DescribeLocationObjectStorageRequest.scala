package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationObjectStorageRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the self-managed object storage server location that was described.
    */
  var LocationArn: typings.awsSdk.datasyncMod.LocationArn
}
object DescribeLocationObjectStorageRequest {
  
  inline def apply(LocationArn: LocationArn): DescribeLocationObjectStorageRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationObjectStorageRequest]
  }
  
  extension [Self <: DescribeLocationObjectStorageRequest](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
