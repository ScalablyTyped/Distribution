package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVolumeStatusResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the status of the volumes.
    */
  var VolumeStatuses: js.UndefOr[VolumeStatusList] = js.undefined
}
object DescribeVolumeStatusResult {
  
  inline def apply(): DescribeVolumeStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumeStatusResult]
  }
  
  extension [Self <: DescribeVolumeStatusResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVolumeStatuses(value: VolumeStatusList): Self = StObject.set(x, "VolumeStatuses", value.asInstanceOf[js.Any])
    
    inline def setVolumeStatusesUndefined: Self = StObject.set(x, "VolumeStatuses", js.undefined)
    
    inline def setVolumeStatusesVarargs(value: VolumeStatusItem*): Self = StObject.set(x, "VolumeStatuses", js.Array(value*))
  }
}
