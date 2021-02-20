package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentServicesProvider extends DataProvider {
  
  def createAlert(ownerUri: String, alertInfo: AgentAlertInfo): Thenable[CreateAgentAlertResult] = js.native
  
  def createJob(ownerUri: String, jobInfo: AgentJobInfo): Thenable[CreateAgentJobResult] = js.native
  
  def createJobSchedule(ownerUri: String, scheduleInfo: AgentJobScheduleInfo): Thenable[CreateAgentJobScheduleResult] = js.native
  
  // Job Step management methods
  def createJobStep(ownerUri: String, stepInfo: AgentJobStepInfo): Thenable[CreateAgentJobStepResult] = js.native
  
  def createNotebook(ownerUri: String, notebook: AgentNotebookInfo, templateFilePath: String): Thenable[CreateAgentNotebookResult] = js.native
  
  def createOperator(ownerUri: String, operatorInfo: AgentOperatorInfo): Thenable[CreateAgentOperatorResult] = js.native
  
  def createProxy(ownerUri: String, proxyInfo: AgentProxyInfo): Thenable[CreateAgentOperatorResult] = js.native
  
  def deleteAlert(ownerUri: String, alertInfo: AgentAlertInfo): Thenable[ResultStatus] = js.native
  
  def deleteJob(ownerUri: String, jobInfo: AgentJobInfo): Thenable[ResultStatus] = js.native
  
  def deleteJobSchedule(ownerUri: String, scheduleInfo: AgentJobScheduleInfo): Thenable[ResultStatus] = js.native
  
  def deleteJobStep(ownerUri: String, stepInfo: AgentJobStepInfo): Thenable[ResultStatus] = js.native
  
  def deleteMaterializedNotebook(ownerUri: String, agentNotebookHistory: AgentNotebookHistoryInfo, targetDatabase: String): Thenable[ResultStatus] = js.native
  
  def deleteNotebook(ownerUri: String, notebook: AgentNotebookInfo): Thenable[ResultStatus] = js.native
  
  def deleteOperator(ownerUri: String, operatorInfo: AgentOperatorInfo): Thenable[ResultStatus] = js.native
  
  def deleteProxy(ownerUri: String, proxyInfo: AgentProxyInfo): Thenable[ResultStatus] = js.native
  
  // Alert management methods
  def getAlerts(ownerUri: String): Thenable[AgentAlertsResult] = js.native
  
  // Credential method
  def getCredentials(ownerUri: String): Thenable[GetCredentialsResult] = js.native
  
  def getJobDefaults(ownerUri: String): Thenable[AgentJobDefaultsResult] = js.native
  
  def getJobHistory(ownerUri: String, jobId: String, jobName: String): Thenable[AgentJobHistoryResult] = js.native
  
  // Job Schedule management methods
  def getJobSchedules(ownerUri: String): Thenable[AgentJobSchedulesResult] = js.native
  
  // Job management methods
  def getJobs(ownerUri: String): Thenable[AgentJobsResult] = js.native
  
  def getMaterializedNotebook(ownerUri: String, targetDatabase: String, notebookMaterializedId: Double): Thenable[AgentNotebookMaterializedResult] = js.native
  
  def getNotebookHistory(ownerUri: String, jobId: String, jobName: String, targetDatabase: String): Thenable[AgentNotebookHistoryResult] = js.native
  
  // Notebook management methods
  def getNotebooks(ownerUri: String): Thenable[AgentNotebooksResult] = js.native
  
  // Operator management methods
  def getOperators(ownerUri: String): Thenable[AgentOperatorsResult] = js.native
  
  // Proxy management methods
  def getProxies(ownerUri: String): Thenable[AgentProxiesResult] = js.native
  
  def getTemplateNotebook(ownerUri: String, targetDatabase: String, jobId: String): Thenable[AgentNotebookTemplateResult] = js.native
  
  def jobAction(ownerUri: String, jobName: String, action: String): Thenable[ResultStatus] = js.native
  
  def registerOnUpdated(handler: js.Function0[_]): Unit = js.native
  
  def updateAlert(ownerUri: String, originalAlertName: String, alertInfo: AgentAlertInfo): Thenable[UpdateAgentAlertResult] = js.native
  
  def updateJob(ownerUri: String, originalJobName: String, jobInfo: AgentJobInfo): Thenable[UpdateAgentJobResult] = js.native
  
  def updateJobSchedule(ownerUri: String, originalScheduleName: String, scheduleInfo: AgentJobScheduleInfo): Thenable[UpdateAgentJobScheduleResult] = js.native
  
  def updateJobStep(ownerUri: String, originalJobStepName: String, stepInfo: AgentJobStepInfo): Thenable[UpdateAgentJobStepResult] = js.native
  
  def updateNotebook(
    ownerUri: String,
    originialNotebookName: String,
    notebook: AgentNotebookInfo,
    templateFilePath: String
  ): Thenable[UpdateAgentNotebookResult] = js.native
  
  def updateNotebookMaterializedName(
    ownerUri: String,
    agentNotebookHistory: AgentNotebookHistoryInfo,
    targetDatabase: String,
    name: String
  ): Thenable[ResultStatus] = js.native
  
  def updateNotebookMaterializedPin(
    ownerUri: String,
    agentNotebookHistory: AgentNotebookHistoryInfo,
    targetDatabase: String,
    pin: Boolean
  ): Thenable[ResultStatus] = js.native
  
  def updateOperator(ownerUri: String, originalOperatorName: String, operatorInfo: AgentOperatorInfo): Thenable[UpdateAgentOperatorResult] = js.native
  
  def updateProxy(ownerUri: String, originalProxyName: String, proxyInfo: AgentProxyInfo): Thenable[UpdateAgentOperatorResult] = js.native
}
object AgentServicesProvider {
  
  @scala.inline
  def apply(
    createAlert: (String, AgentAlertInfo) => Thenable[CreateAgentAlertResult],
    createJob: (String, AgentJobInfo) => Thenable[CreateAgentJobResult],
    createJobSchedule: (String, AgentJobScheduleInfo) => Thenable[CreateAgentJobScheduleResult],
    createJobStep: (String, AgentJobStepInfo) => Thenable[CreateAgentJobStepResult],
    createNotebook: (String, AgentNotebookInfo, String) => Thenable[CreateAgentNotebookResult],
    createOperator: (String, AgentOperatorInfo) => Thenable[CreateAgentOperatorResult],
    createProxy: (String, AgentProxyInfo) => Thenable[CreateAgentOperatorResult],
    deleteAlert: (String, AgentAlertInfo) => Thenable[ResultStatus],
    deleteJob: (String, AgentJobInfo) => Thenable[ResultStatus],
    deleteJobSchedule: (String, AgentJobScheduleInfo) => Thenable[ResultStatus],
    deleteJobStep: (String, AgentJobStepInfo) => Thenable[ResultStatus],
    deleteMaterializedNotebook: (String, AgentNotebookHistoryInfo, String) => Thenable[ResultStatus],
    deleteNotebook: (String, AgentNotebookInfo) => Thenable[ResultStatus],
    deleteOperator: (String, AgentOperatorInfo) => Thenable[ResultStatus],
    deleteProxy: (String, AgentProxyInfo) => Thenable[ResultStatus],
    getAlerts: String => Thenable[AgentAlertsResult],
    getCredentials: String => Thenable[GetCredentialsResult],
    getJobDefaults: String => Thenable[AgentJobDefaultsResult],
    getJobHistory: (String, String, String) => Thenable[AgentJobHistoryResult],
    getJobSchedules: String => Thenable[AgentJobSchedulesResult],
    getJobs: String => Thenable[AgentJobsResult],
    getMaterializedNotebook: (String, String, Double) => Thenable[AgentNotebookMaterializedResult],
    getNotebookHistory: (String, String, String, String) => Thenable[AgentNotebookHistoryResult],
    getNotebooks: String => Thenable[AgentNotebooksResult],
    getOperators: String => Thenable[AgentOperatorsResult],
    getProxies: String => Thenable[AgentProxiesResult],
    getTemplateNotebook: (String, String, String) => Thenable[AgentNotebookTemplateResult],
    jobAction: (String, String, String) => Thenable[ResultStatus],
    providerId: String,
    registerOnUpdated: js.Function0[_] => Unit,
    updateAlert: (String, String, AgentAlertInfo) => Thenable[UpdateAgentAlertResult],
    updateJob: (String, String, AgentJobInfo) => Thenable[UpdateAgentJobResult],
    updateJobSchedule: (String, String, AgentJobScheduleInfo) => Thenable[UpdateAgentJobScheduleResult],
    updateJobStep: (String, String, AgentJobStepInfo) => Thenable[UpdateAgentJobStepResult],
    updateNotebook: (String, String, AgentNotebookInfo, String) => Thenable[UpdateAgentNotebookResult],
    updateNotebookMaterializedName: (String, AgentNotebookHistoryInfo, String, String) => Thenable[ResultStatus],
    updateNotebookMaterializedPin: (String, AgentNotebookHistoryInfo, String, Boolean) => Thenable[ResultStatus],
    updateOperator: (String, String, AgentOperatorInfo) => Thenable[UpdateAgentOperatorResult],
    updateProxy: (String, String, AgentProxyInfo) => Thenable[UpdateAgentOperatorResult]
  ): AgentServicesProvider = {
    val __obj = js.Dynamic.literal(createAlert = js.Any.fromFunction2(createAlert), createJob = js.Any.fromFunction2(createJob), createJobSchedule = js.Any.fromFunction2(createJobSchedule), createJobStep = js.Any.fromFunction2(createJobStep), createNotebook = js.Any.fromFunction3(createNotebook), createOperator = js.Any.fromFunction2(createOperator), createProxy = js.Any.fromFunction2(createProxy), deleteAlert = js.Any.fromFunction2(deleteAlert), deleteJob = js.Any.fromFunction2(deleteJob), deleteJobSchedule = js.Any.fromFunction2(deleteJobSchedule), deleteJobStep = js.Any.fromFunction2(deleteJobStep), deleteMaterializedNotebook = js.Any.fromFunction3(deleteMaterializedNotebook), deleteNotebook = js.Any.fromFunction2(deleteNotebook), deleteOperator = js.Any.fromFunction2(deleteOperator), deleteProxy = js.Any.fromFunction2(deleteProxy), getAlerts = js.Any.fromFunction1(getAlerts), getCredentials = js.Any.fromFunction1(getCredentials), getJobDefaults = js.Any.fromFunction1(getJobDefaults), getJobHistory = js.Any.fromFunction3(getJobHistory), getJobSchedules = js.Any.fromFunction1(getJobSchedules), getJobs = js.Any.fromFunction1(getJobs), getMaterializedNotebook = js.Any.fromFunction3(getMaterializedNotebook), getNotebookHistory = js.Any.fromFunction4(getNotebookHistory), getNotebooks = js.Any.fromFunction1(getNotebooks), getOperators = js.Any.fromFunction1(getOperators), getProxies = js.Any.fromFunction1(getProxies), getTemplateNotebook = js.Any.fromFunction3(getTemplateNotebook), jobAction = js.Any.fromFunction3(jobAction), providerId = providerId.asInstanceOf[js.Any], registerOnUpdated = js.Any.fromFunction1(registerOnUpdated), updateAlert = js.Any.fromFunction3(updateAlert), updateJob = js.Any.fromFunction3(updateJob), updateJobSchedule = js.Any.fromFunction3(updateJobSchedule), updateJobStep = js.Any.fromFunction3(updateJobStep), updateNotebook = js.Any.fromFunction4(updateNotebook), updateNotebookMaterializedName = js.Any.fromFunction4(updateNotebookMaterializedName), updateNotebookMaterializedPin = js.Any.fromFunction4(updateNotebookMaterializedPin), updateOperator = js.Any.fromFunction3(updateOperator), updateProxy = js.Any.fromFunction3(updateProxy))
    __obj.asInstanceOf[AgentServicesProvider]
  }
  
  @scala.inline
  implicit class AgentServicesProviderMutableBuilder[Self <: AgentServicesProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAlert(value: (String, AgentAlertInfo) => Thenable[CreateAgentAlertResult]): Self = StObject.set(x, "createAlert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateJob(value: (String, AgentJobInfo) => Thenable[CreateAgentJobResult]): Self = StObject.set(x, "createJob", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateJobSchedule(value: (String, AgentJobScheduleInfo) => Thenable[CreateAgentJobScheduleResult]): Self = StObject.set(x, "createJobSchedule", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateJobStep(value: (String, AgentJobStepInfo) => Thenable[CreateAgentJobStepResult]): Self = StObject.set(x, "createJobStep", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateNotebook(value: (String, AgentNotebookInfo, String) => Thenable[CreateAgentNotebookResult]): Self = StObject.set(x, "createNotebook", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateOperator(value: (String, AgentOperatorInfo) => Thenable[CreateAgentOperatorResult]): Self = StObject.set(x, "createOperator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateProxy(value: (String, AgentProxyInfo) => Thenable[CreateAgentOperatorResult]): Self = StObject.set(x, "createProxy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteAlert(value: (String, AgentAlertInfo) => Thenable[ResultStatus]): Self = StObject.set(x, "deleteAlert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteJob(value: (String, AgentJobInfo) => Thenable[ResultStatus]): Self = StObject.set(x, "deleteJob", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteJobSchedule(value: (String, AgentJobScheduleInfo) => Thenable[ResultStatus]): Self = StObject.set(x, "deleteJobSchedule", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteJobStep(value: (String, AgentJobStepInfo) => Thenable[ResultStatus]): Self = StObject.set(x, "deleteJobStep", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteMaterializedNotebook(value: (String, AgentNotebookHistoryInfo, String) => Thenable[ResultStatus]): Self = StObject.set(x, "deleteMaterializedNotebook", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDeleteNotebook(value: (String, AgentNotebookInfo) => Thenable[ResultStatus]): Self = StObject.set(x, "deleteNotebook", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteOperator(value: (String, AgentOperatorInfo) => Thenable[ResultStatus]): Self = StObject.set(x, "deleteOperator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteProxy(value: (String, AgentProxyInfo) => Thenable[ResultStatus]): Self = StObject.set(x, "deleteProxy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAlerts(value: String => Thenable[AgentAlertsResult]): Self = StObject.set(x, "getAlerts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCredentials(value: String => Thenable[GetCredentialsResult]): Self = StObject.set(x, "getCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJobDefaults(value: String => Thenable[AgentJobDefaultsResult]): Self = StObject.set(x, "getJobDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJobHistory(value: (String, String, String) => Thenable[AgentJobHistoryResult]): Self = StObject.set(x, "getJobHistory", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetJobSchedules(value: String => Thenable[AgentJobSchedulesResult]): Self = StObject.set(x, "getJobSchedules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJobs(value: String => Thenable[AgentJobsResult]): Self = StObject.set(x, "getJobs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMaterializedNotebook(value: (String, String, Double) => Thenable[AgentNotebookMaterializedResult]): Self = StObject.set(x, "getMaterializedNotebook", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetNotebookHistory(value: (String, String, String, String) => Thenable[AgentNotebookHistoryResult]): Self = StObject.set(x, "getNotebookHistory", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetNotebooks(value: String => Thenable[AgentNotebooksResult]): Self = StObject.set(x, "getNotebooks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOperators(value: String => Thenable[AgentOperatorsResult]): Self = StObject.set(x, "getOperators", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProxies(value: String => Thenable[AgentProxiesResult]): Self = StObject.set(x, "getProxies", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTemplateNotebook(value: (String, String, String) => Thenable[AgentNotebookTemplateResult]): Self = StObject.set(x, "getTemplateNotebook", js.Any.fromFunction3(value))
    
    @scala.inline
    def setJobAction(value: (String, String, String) => Thenable[ResultStatus]): Self = StObject.set(x, "jobAction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRegisterOnUpdated(value: js.Function0[_] => Unit): Self = StObject.set(x, "registerOnUpdated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateAlert(value: (String, String, AgentAlertInfo) => Thenable[UpdateAgentAlertResult]): Self = StObject.set(x, "updateAlert", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateJob(value: (String, String, AgentJobInfo) => Thenable[UpdateAgentJobResult]): Self = StObject.set(x, "updateJob", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateJobSchedule(value: (String, String, AgentJobScheduleInfo) => Thenable[UpdateAgentJobScheduleResult]): Self = StObject.set(x, "updateJobSchedule", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateJobStep(value: (String, String, AgentJobStepInfo) => Thenable[UpdateAgentJobStepResult]): Self = StObject.set(x, "updateJobStep", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateNotebook(value: (String, String, AgentNotebookInfo, String) => Thenable[UpdateAgentNotebookResult]): Self = StObject.set(x, "updateNotebook", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUpdateNotebookMaterializedName(value: (String, AgentNotebookHistoryInfo, String, String) => Thenable[ResultStatus]): Self = StObject.set(x, "updateNotebookMaterializedName", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUpdateNotebookMaterializedPin(value: (String, AgentNotebookHistoryInfo, String, Boolean) => Thenable[ResultStatus]): Self = StObject.set(x, "updateNotebookMaterializedPin", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUpdateOperator(value: (String, String, AgentOperatorInfo) => Thenable[UpdateAgentOperatorResult]): Self = StObject.set(x, "updateOperator", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateProxy(value: (String, String, AgentProxyInfo) => Thenable[UpdateAgentOperatorResult]): Self = StObject.set(x, "updateProxy", js.Any.fromFunction3(value))
  }
}
