package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocationObjectStorageRequest extends js.Object {
  
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
  implicit class DescribeLocationObjectStorageRequestOps[Self <: DescribeLocationObjectStorageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = this.set("LocationArn", value.asInstanceOf[js.Any])
  }
}
