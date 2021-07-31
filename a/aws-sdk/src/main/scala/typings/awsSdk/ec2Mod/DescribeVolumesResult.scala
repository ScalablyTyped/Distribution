package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVolumesResult extends StObject {
  
  /**
    * The NextToken value to include in a future DescribeVolumes request. When the results of a DescribeVolumes request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the volumes.
    */
  var Volumes: js.UndefOr[VolumeList] = js.undefined
}
object DescribeVolumesResult {
  
  @scala.inline
  def apply(): DescribeVolumesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesResult]
  }
  
  @scala.inline
  implicit class DescribeVolumesResultMutableBuilder[Self <: DescribeVolumesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVolumes(value: VolumeList): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "Volumes", js.Array(value :_*))
  }
}
