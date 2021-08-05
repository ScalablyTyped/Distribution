package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourceRequest extends StObject {
  
  /**
    * The resource ARN.
    */
  var ResourceArn: ResourceArnString
}
object DescribeResourceRequest {
  
  inline def apply(ResourceArn: ResourceArnString): DescribeResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceRequest]
  }
  
  extension [Self <: DescribeResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
