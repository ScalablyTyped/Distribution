package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClusterRequest extends StObject {
  
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: typings.awsSdk.snowballMod.ClusterId = js.native
}
object DescribeClusterRequest {
  
  @scala.inline
  def apply(ClusterId: ClusterId): DescribeClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterRequest]
  }
  
  @scala.inline
  implicit class DescribeClusterRequestMutableBuilder[Self <: DescribeClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
