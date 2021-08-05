package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrailsResponse extends StObject {
  
  /**
    * The list of trail objects. Trail objects with string values are only returned if values for the objects exist in a trail's configuration. For example, SNSTopicName and SNSTopicARN are only returned in results if a trail is configured to send SNS notifications. Similarly, KMSKeyId only appears in results if a trail's log files are encrypted with AWS KMS-managed keys.
    */
  var trailList: js.UndefOr[TrailList] = js.undefined
}
object DescribeTrailsResponse {
  
  inline def apply(): DescribeTrailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrailsResponse]
  }
  
  extension [Self <: DescribeTrailsResponse](x: Self) {
    
    inline def setTrailList(value: TrailList): Self = StObject.set(x, "trailList", value.asInstanceOf[js.Any])
    
    inline def setTrailListUndefined: Self = StObject.set(x, "trailList", js.undefined)
    
    inline def setTrailListVarargs(value: Trail*): Self = StObject.set(x, "trailList", js.Array(value :_*))
  }
}
