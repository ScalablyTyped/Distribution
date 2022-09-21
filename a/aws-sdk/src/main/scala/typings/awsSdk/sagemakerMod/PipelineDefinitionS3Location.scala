package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineDefinitionS3Location extends StObject {
  
  /**
    * Name of the S3 bucket.
    */
  var Bucket: BucketName
  
  /**
    * The object key (or key name) uniquely identifies the object in an S3 bucket. 
    */
  var ObjectKey: Key
  
  /**
    * Version Id of the pipeline definition file. If not specified, Amazon SageMaker will retrieve the latest version.
    */
  var VersionId: js.UndefOr[typings.awsSdk.sagemakerMod.VersionId] = js.undefined
}
object PipelineDefinitionS3Location {
  
  inline def apply(Bucket: BucketName, ObjectKey: Key): PipelineDefinitionS3Location = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ObjectKey = ObjectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineDefinitionS3Location]
  }
  
  extension [Self <: PipelineDefinitionS3Location](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setObjectKey(value: Key): Self = StObject.set(x, "ObjectKey", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: VersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
