package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComponentRequest extends StObject {
  
  /**
    * The ARN of the component version.
    */
  var arn: ComponentVersionARN
}
object DescribeComponentRequest {
  
  inline def apply(arn: ComponentVersionARN): DescribeComponentRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComponentRequest]
  }
  
  extension [Self <: DescribeComponentRequest](x: Self) {
    
    inline def setArn(value: ComponentVersionARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
