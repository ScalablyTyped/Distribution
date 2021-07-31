package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterRequest extends StObject {
  
  /**
    * The name of the cluster to describe.
    */
  var name: String
}
object DescribeClusterRequest {
  
  @scala.inline
  def apply(name: String): DescribeClusterRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterRequest]
  }
  
  @scala.inline
  implicit class DescribeClusterRequestMutableBuilder[Self <: DescribeClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
