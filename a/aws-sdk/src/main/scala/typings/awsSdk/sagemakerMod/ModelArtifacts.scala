package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelArtifacts extends StObject {
  
  /**
    * The path of the S3 object that contains the model artifacts. For example, s3://bucket-name/keynameprefix/model.tar.gz.
    */
  var S3ModelArtifacts: S3Uri
}
object ModelArtifacts {
  
  @scala.inline
  def apply(S3ModelArtifacts: S3Uri): ModelArtifacts = {
    val __obj = js.Dynamic.literal(S3ModelArtifacts = S3ModelArtifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArtifacts]
  }
  
  @scala.inline
  implicit class ModelArtifactsMutableBuilder[Self <: ModelArtifacts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3ModelArtifacts(value: S3Uri): Self = StObject.set(x, "S3ModelArtifacts", value.asInstanceOf[js.Any])
  }
}
