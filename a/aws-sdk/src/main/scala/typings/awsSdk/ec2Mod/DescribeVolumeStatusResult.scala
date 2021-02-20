package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVolumeStatusResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the status of the volumes.
    */
  var VolumeStatuses: js.UndefOr[VolumeStatusList] = js.native
}
object DescribeVolumeStatusResult {
  
  @scala.inline
  def apply(): DescribeVolumeStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumeStatusResult]
  }
  
  @scala.inline
  implicit class DescribeVolumeStatusResultMutableBuilder[Self <: DescribeVolumeStatusResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVolumeStatuses(value: VolumeStatusList): Self = StObject.set(x, "VolumeStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeStatusesUndefined: Self = StObject.set(x, "VolumeStatuses", js.undefined)
    
    @scala.inline
    def setVolumeStatusesVarargs(value: VolumeStatusItem*): Self = StObject.set(x, "VolumeStatuses", js.Array(value :_*))
  }
}
