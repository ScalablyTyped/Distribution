package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactDetails extends StObject {
  
  /**
    * The maximum number of artifacts allowed for the action type.
    */
  var maximumCount: MaximumArtifactCount
  
  /**
    * The minimum number of artifacts allowed for the action type.
    */
  var minimumCount: MinimumArtifactCount
}
object ArtifactDetails {
  
  @scala.inline
  def apply(maximumCount: MaximumArtifactCount, minimumCount: MinimumArtifactCount): ArtifactDetails = {
    val __obj = js.Dynamic.literal(maximumCount = maximumCount.asInstanceOf[js.Any], minimumCount = minimumCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDetails]
  }
  
  @scala.inline
  implicit class ArtifactDetailsMutableBuilder[Self <: ArtifactDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumCount(value: MaximumArtifactCount): Self = StObject.set(x, "maximumCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumCount(value: MinimumArtifactCount): Self = StObject.set(x, "minimumCount", value.asInstanceOf[js.Any])
  }
}
