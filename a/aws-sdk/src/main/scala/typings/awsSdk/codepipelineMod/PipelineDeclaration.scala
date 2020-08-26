package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineDeclaration extends js.Object {
  /**
    * Represents information about the S3 bucket where artifacts are stored for the pipeline.  You must include either artifactStore or artifactStores in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use artifactStores. 
    */
  var artifactStore: js.UndefOr[ArtifactStore] = js.native
  /**
    * A mapping of artifactStore objects and their corresponding AWS Regions. There must be an artifact store for the pipeline Region and for each cross-region action in the pipeline.  You must include either artifactStore or artifactStores in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use artifactStores. 
    */
  var artifactStores: js.UndefOr[ArtifactStoreMap] = js.native
  /**
    * The name of the action to be performed.
    */
  var name: PipelineName = js.native
  /**
    * The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no actionRoleArn, or to use to assume roles for actions with an actionRoleArn.
    */
  var roleArn: RoleArn = js.native
  /**
    * The stage in which to perform the action.
    */
  var stages: PipelineStageDeclarationList = js.native
  /**
    * The version number of the pipeline. A new pipeline always has a version number of 1. This number is incremented when a pipeline is updated.
    */
  var version: js.UndefOr[PipelineVersion] = js.native
}

object PipelineDeclaration {
  @scala.inline
  def apply(name: PipelineName, roleArn: RoleArn, stages: PipelineStageDeclarationList): PipelineDeclaration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineDeclaration]
  }
  @scala.inline
  implicit class PipelineDeclarationOps[Self <: PipelineDeclaration] (val x: Self) extends AnyVal {
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
    def setName(value: PipelineName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStagesVarargs(value: StageDeclaration*): Self = this.set("stages", js.Array(value :_*))
    @scala.inline
    def setStages(value: PipelineStageDeclarationList): Self = this.set("stages", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactStore(value: ArtifactStore): Self = this.set("artifactStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactStore: Self = this.set("artifactStore", js.undefined)
    @scala.inline
    def setArtifactStores(value: ArtifactStoreMap): Self = this.set("artifactStores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactStores: Self = this.set("artifactStores", js.undefined)
    @scala.inline
    def setVersion(value: PipelineVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

