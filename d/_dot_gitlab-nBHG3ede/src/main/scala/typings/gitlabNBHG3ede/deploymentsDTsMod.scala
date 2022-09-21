package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.commitsDTsMod.CommitSchema
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.pipelinesDTsMod.PipelineSchema
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import typings.gitlabNBHG3ede.runnersDTsMod.RunnerSchema
import typings.gitlabNBHG3ede.usersDTsMod.UserSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentsDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Deployments.d.ts", "Deployments")
  @js.native
  open class Deployments () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def mergeRequests(projectId: String, deploymentId: Double): js.Promise[GetResponse] = js.native
    def mergeRequests(projectId: String, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def mergeRequests(projectId: Double, deploymentId: Double): js.Promise[GetResponse] = js.native
    def mergeRequests(projectId: Double, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def show(projectId: String, deploymentId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, deploymentId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  trait Deployable extends StObject {
    
    var commit: js.UndefOr[CommitSchema] = js.undefined
    
    var coverage: js.UndefOr[String] = js.undefined
    
    var created_at: js.UndefOr[js.Date] = js.undefined
    
    var finished_at: js.UndefOr[js.Date] = js.undefined
    
    var id: Double
    
    var name: String
    
    var pipeline: js.UndefOr[PipelineSchema] = js.undefined
    
    var ref: String
    
    var runner: js.UndefOr[RunnerSchema] = js.undefined
    
    var stage: js.UndefOr[String] = js.undefined
    
    var started_at: js.UndefOr[js.Date] = js.undefined
    
    var status: js.UndefOr[DeploymentStatus] = js.undefined
    
    var tag: Boolean
    
    var user: js.UndefOr[UserSchema] = js.undefined
  }
  object Deployable {
    
    inline def apply(id: Double, name: String, ref: String, tag: Boolean): Deployable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deployable]
    }
    
    extension [Self <: Deployable](x: Self) {
      
      inline def setCommit(value: CommitSchema): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      inline def setCoverage(value: String): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
      
      inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      inline def setFinished_at(value: js.Date): Self = StObject.set(x, "finished_at", value.asInstanceOf[js.Any])
      
      inline def setFinished_atUndefined: Self = StObject.set(x, "finished_at", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPipeline(value: PipelineSchema): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
      
      inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRunner(value: RunnerSchema): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      inline def setStarted_at(value: js.Date): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
      
      inline def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
      
      inline def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTag(value: Boolean): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setUser(value: UserSchema): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait DeploymentSchema extends StObject {
    
    var id: Double
    
    var iid: Double
    
    var ref: String
    
    var sha: String
    
    var user: UserSchema
  }
  object DeploymentSchema {
    
    inline def apply(id: Double, iid: Double, ref: String, sha: String, user: UserSchema): DeploymentSchema = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], iid = iid.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentSchema]
    }
    
    extension [Self <: DeploymentSchema](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIid(value: Double): Self = StObject.set(x, "iid", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      inline def setUser(value: UserSchema): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.created
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.running
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.success
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.failed
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.canceled
  */
  trait DeploymentStatus extends StObject
  object DeploymentStatus {
    
    inline def canceled: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.canceled = "canceled".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.canceled]
    
    inline def created: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.created = "created".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.created]
    
    inline def failed: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.failed = "failed".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.failed]
    
    inline def running: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.running = "running".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.running]
    
    inline def success: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.success = "success".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.success]
  }
}
