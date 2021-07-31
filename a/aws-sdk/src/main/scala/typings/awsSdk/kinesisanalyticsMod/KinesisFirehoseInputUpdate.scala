package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseInputUpdate extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the input Amazon Kinesis Firehose delivery stream to read.
    */
  var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
}
object KinesisFirehoseInputUpdate {
  
  @scala.inline
  def apply(): KinesisFirehoseInputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisFirehoseInputUpdate]
  }
  
  @scala.inline
  implicit class KinesisFirehoseInputUpdateMutableBuilder[Self <: KinesisFirehoseInputUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUpdateUndefined: Self = StObject.set(x, "ResourceARNUpdate", js.undefined)
    
    @scala.inline
    def setRoleARNUpdate(value: RoleARN): Self = StObject.set(x, "RoleARNUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUpdateUndefined: Self = StObject.set(x, "RoleARNUpdate", js.undefined)
  }
}
