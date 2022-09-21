package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSimulationApplicationVersionRequest extends StObject {
  
  /**
    * The application information for the simulation application.
    */
  var application: Arn
  
  /**
    * The current revision id for the simulation application. If you provide a value and it matches the latest revision ID, a new version will be created.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
  
  /**
    * The SHA256 digest used to identify the Docker image URI used to created the simulation application.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.undefined
  
  /**
    * The Amazon S3 eTag identifier for the zip file bundle that you use to create the simulation application.
    */
  var s3Etags: js.UndefOr[S3Etags] = js.undefined
}
object CreateSimulationApplicationVersionRequest {
  
  inline def apply(application: Arn): CreateSimulationApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSimulationApplicationVersionRequest]
  }
  
  extension [Self <: CreateSimulationApplicationVersionRequest](x: Self) {
    
    inline def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevisionId(value: RevisionId): Self = StObject.set(x, "currentRevisionId", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevisionIdUndefined: Self = StObject.set(x, "currentRevisionId", js.undefined)
    
    inline def setImageDigest(value: ImageDigest): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setS3Etags(value: S3Etags): Self = StObject.set(x, "s3Etags", value.asInstanceOf[js.Any])
    
    inline def setS3EtagsUndefined: Self = StObject.set(x, "s3Etags", js.undefined)
    
    inline def setS3EtagsVarargs(value: S3Etag*): Self = StObject.set(x, "s3Etags", js.Array(value*))
  }
}
