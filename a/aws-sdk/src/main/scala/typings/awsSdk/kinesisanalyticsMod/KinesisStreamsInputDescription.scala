package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamsInputDescription extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the Amazon Kinesis stream.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ResourceARN] = js.undefined
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.RoleARN] = js.undefined
}
object KinesisStreamsInputDescription {
  
  @scala.inline
  def apply(): KinesisStreamsInputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisStreamsInputDescription]
  }
  
  @scala.inline
  implicit class KinesisStreamsInputDescriptionMutableBuilder[Self <: KinesisStreamsInputDescription] (val x: Self) extends AnyVal {
    
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
