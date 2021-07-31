package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactDetail extends StObject {
  
  /**
    * The artifact object name for the action execution.
    */
  var name: js.UndefOr[ArtifactName] = js.undefined
  
  /**
    * The Amazon S3 artifact location for the action execution.
    */
  var s3location: js.UndefOr[S3Location] = js.undefined
}
object ArtifactDetail {
  
  @scala.inline
  def apply(): ArtifactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactDetail]
  }
  
  @scala.inline
  implicit class ArtifactDetailMutableBuilder[Self <: ArtifactDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ArtifactName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setS3location(value: S3Location): Self = StObject.set(x, "s3location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3locationUndefined: Self = StObject.set(x, "s3location", js.undefined)
  }
}
