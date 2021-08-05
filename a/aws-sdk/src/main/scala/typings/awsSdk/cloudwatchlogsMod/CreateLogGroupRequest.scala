package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLogGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data. For more information, see Amazon Resource Names - AWS Key Management Service (AWS KMS).
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  
  /**
    * The key-value pairs to use for the tags.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateLogGroupRequest {
  
  inline def apply(logGroupName: LogGroupName): CreateLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLogGroupRequest]
  }
  
  extension [Self <: CreateLogGroupRequest](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
