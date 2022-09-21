package typings.gitlabNBHG3ede

import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.indexDTsMod.BaseService
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/services/Services.d.ts", "Services")
  @js.native
  open class Services () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def edit(projectId: String, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def edit(projectId: String, serviceName: SupportedService, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def edit(projectId: Double, serviceName: SupportedService, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def remove(projectId: String, serviceName: SupportedService, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def remove(projectId: Double, serviceName: SupportedService, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, serviceName: SupportedService): js.Promise[GetResponse] = js.native
    def show(projectId: String, serviceName: SupportedService, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, serviceName: SupportedService): js.Promise[GetResponse] = js.native
    def show(projectId: Double, serviceName: SupportedService, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.asana
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.assembla
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.bamboo
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.bugzilla
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.buildkite
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.campfire
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`custom-issue-tracker`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`drone-ci`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`emails-on-push`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`external-wiki`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.flowdock
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.hangouts_chat
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.hipchat
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.irker
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.jira
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.kubernetes
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`slack-slash-commands`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.slack
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.packagist
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`pipelines-email`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.pivotaltracker
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.prometheus
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.pushover
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.redmine
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`microsoft-teams`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.mattermost
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`mattermost-slash-commands`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.teamcity
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.jenkins
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`jenkins-deprecated`
    - typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`mock-ci`
  */
  trait SupportedService extends StObject
  object SupportedService {
    
    inline def asana: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.asana = "asana".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.asana]
    
    inline def assembla: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.assembla = "assembla".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.assembla]
    
    inline def bamboo: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.bamboo = "bamboo".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.bamboo]
    
    inline def bugzilla: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.bugzilla = "bugzilla".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.bugzilla]
    
    inline def buildkite: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.buildkite = "buildkite".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.buildkite]
    
    inline def campfire: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.campfire = "campfire".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.campfire]
    
    inline def `custom-issue-tracker`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`custom-issue-tracker` = "custom-issue-tracker".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`custom-issue-tracker`]
    
    inline def `drone-ci`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`drone-ci` = "drone-ci".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`drone-ci`]
    
    inline def `emails-on-push`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`emails-on-push` = "emails-on-push".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`emails-on-push`]
    
    inline def `external-wiki`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`external-wiki` = "external-wiki".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`external-wiki`]
    
    inline def flowdock: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.flowdock = "flowdock".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.flowdock]
    
    inline def hangouts_chat: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.hangouts_chat = "hangouts_chat".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.hangouts_chat]
    
    inline def hipchat: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.hipchat = "hipchat".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.hipchat]
    
    inline def irker: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.irker = "irker".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.irker]
    
    inline def jenkins: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.jenkins = "jenkins".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.jenkins]
    
    inline def `jenkins-deprecated`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`jenkins-deprecated` = "jenkins-deprecated".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`jenkins-deprecated`]
    
    inline def jira: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.jira = "jira".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.jira]
    
    inline def kubernetes: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.kubernetes = "kubernetes".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.kubernetes]
    
    inline def mattermost: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.mattermost = "mattermost".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.mattermost]
    
    inline def `mattermost-slash-commands`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`mattermost-slash-commands` = "mattermost-slash-commands".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`mattermost-slash-commands`]
    
    inline def `microsoft-teams`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`microsoft-teams` = "microsoft-teams".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`microsoft-teams`]
    
    inline def `mock-ci`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`mock-ci` = "mock-ci".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`mock-ci`]
    
    inline def packagist: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.packagist = "packagist".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.packagist]
    
    inline def `pipelines-email`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`pipelines-email` = "pipelines-email".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`pipelines-email`]
    
    inline def pivotaltracker: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.pivotaltracker = "pivotaltracker".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.pivotaltracker]
    
    inline def prometheus: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.prometheus = "prometheus".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.prometheus]
    
    inline def pushover: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.pushover = "pushover".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.pushover]
    
    inline def redmine: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.redmine = "redmine".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.redmine]
    
    inline def slack: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.slack = "slack".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.slack]
    
    inline def `slack-slash-commands`: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`slack-slash-commands` = "slack-slash-commands".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.`slack-slash-commands`]
    
    inline def teamcity: typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.teamcity = "teamcity".asInstanceOf[typings.gitlabNBHG3ede.gitlabNBHG3edeStrings.teamcity]
  }
}
