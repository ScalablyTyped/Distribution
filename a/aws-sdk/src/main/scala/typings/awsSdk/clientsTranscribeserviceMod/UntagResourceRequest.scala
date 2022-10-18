package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Transcribe resource you want to remove tags from. ARNs have the format arn:partition:service:region:account-id:resource-type/resource-id. For example, arn:aws:transcribe:us-west-2:account-id:transcription-job/transcription-job-name. Valid values for resource-type are: transcription-job, medical-transcription-job, vocabulary, medical-vocabulary, vocabulary-filter, and language-model.
    */
  var ResourceArn: TranscribeArn
  
  /**
    * Removes the specified tag keys from the specified Amazon Transcribe resource.
    */
  var TagKeys: TagKeyList
}
object UntagResourceRequest {
  
  inline def apply(ResourceArn: TranscribeArn, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: TranscribeArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
