package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaOutputDescription extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the destination Lambda function.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ResourceARN] = js.undefined
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.RoleARN] = js.undefined
}
object LambdaOutputDescription {
  
  @scala.inline
  def apply(): LambdaOutputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaOutputDescription]
  }
  
  @scala.inline
  implicit class LambdaOutputDescriptionMutableBuilder[Self <: LambdaOutputDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
