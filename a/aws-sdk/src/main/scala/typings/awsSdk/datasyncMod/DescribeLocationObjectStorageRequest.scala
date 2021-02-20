package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocationObjectStorageRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the self-managed object storage server location that was described.
    */
  var LocationArn: typings.awsSdk.datasyncMod.LocationArn = js.native
}
object DescribeLocationObjectStorageRequest {
  
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationObjectStorageRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationObjectStorageRequest]
  }
  
  @scala.inline
  implicit class DescribeLocationObjectStorageRequestMutableBuilder[Self <: DescribeLocationObjectStorageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
