package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsInput extends StObject {
  
  /**
    * The Amazon Resource Names (ARN) of the resources. You can specify up to 20 resources in a single call.
    */
  var ResourceArns: typings.awsSdk.elbv2Mod.ResourceArns
}
object DescribeTagsInput {
  
  inline def apply(ResourceArns: ResourceArns): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsInput]
  }
  
  extension [Self <: DescribeTagsInput](x: Self) {
    
    inline def setResourceArns(value: ResourceArns): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value :_*))
  }
}
