package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeActivityInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the activity to describe.
    */
  var activityArn: Arn
}
object DescribeActivityInput {
  
  inline def apply(activityArn: Arn): DescribeActivityInput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActivityInput]
  }
  
  extension [Self <: DescribeActivityInput](x: Self) {
    
    inline def setActivityArn(value: Arn): Self = StObject.set(x, "activityArn", value.asInstanceOf[js.Any])
  }
}
