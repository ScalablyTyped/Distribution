package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactLocation extends StObject {
  
  /**
    * The S3 bucket that contains the artifact.
    */
  var s3Location: js.UndefOr[S3ArtifactLocation] = js.native
  
  /**
    * The type of artifact in the location.
    */
  var `type`: js.UndefOr[ArtifactLocationType] = js.native
}
object ArtifactLocation {
  
  @scala.inline
  def apply(): ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactLocation]
  }
  
  @scala.inline
  implicit class ArtifactLocationMutableBuilder[Self <: ArtifactLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Location(value: S3ArtifactLocation): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
    
    @scala.inline
    def setType(value: ArtifactLocationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
