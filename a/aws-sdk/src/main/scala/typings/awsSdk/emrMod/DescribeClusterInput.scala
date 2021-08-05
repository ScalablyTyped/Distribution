package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterInput extends StObject {
  
  /**
    * The identifier of the cluster to describe.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId
}
object DescribeClusterInput {
  
  inline def apply(ClusterId: ClusterId): DescribeClusterInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterInput]
  }
  
  extension [Self <: DescribeClusterInput](x: Self) {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
