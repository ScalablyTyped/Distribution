package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactDetail extends js.Object {
  
  /**
    * The artifact object name for the action execution.
    */
  var name: js.UndefOr[ArtifactName] = js.native
  
  /**
    * The Amazon S3 artifact location for the action execution.
    */
  var s3location: js.UndefOr[S3Location] = js.native
}
object ArtifactDetail {
  
  @scala.inline
  def apply(): ArtifactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactDetail]
  }
  
  @scala.inline
  implicit class ArtifactDetailOps[Self <: ArtifactDetail] (val x: Self) extends AnyVal {
    
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
    def setName(value: ArtifactName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setS3location(value: S3Location): Self = this.set("s3location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3location: Self = this.set("s3location", js.undefined)
  }
}
