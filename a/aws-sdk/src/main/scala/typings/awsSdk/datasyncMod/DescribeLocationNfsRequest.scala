package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationNfsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the NFS location to describe.
    */
  var LocationArn: typings.awsSdk.datasyncMod.LocationArn
}
object DescribeLocationNfsRequest {
  
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationNfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationNfsRequest]
  }
  
  @scala.inline
  implicit class DescribeLocationNfsRequestMutableBuilder[Self <: DescribeLocationNfsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
