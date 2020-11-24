package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactDetails extends js.Object {
  
  /**
    * The maximum number of artifacts allowed for the action type.
    */
  var maximumCount: MaximumArtifactCount = js.native
  
  /**
    * The minimum number of artifacts allowed for the action type.
    */
  var minimumCount: MinimumArtifactCount = js.native
}
object ArtifactDetails {
  
  @scala.inline
  def apply(maximumCount: MaximumArtifactCount, minimumCount: MinimumArtifactCount): ArtifactDetails = {
    val __obj = js.Dynamic.literal(maximumCount = maximumCount.asInstanceOf[js.Any], minimumCount = minimumCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDetails]
  }
  
  @scala.inline
  implicit class ArtifactDetailsOps[Self <: ArtifactDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaximumCount(value: MaximumArtifactCount): Self = this.set("maximumCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumCount(value: MinimumArtifactCount): Self = this.set("minimumCount", value.asInstanceOf[js.Any])
  }
}
