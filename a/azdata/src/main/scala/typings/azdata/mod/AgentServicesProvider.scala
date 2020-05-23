package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentServicesProvider extends DataProvider {
  def createAlert(ownerUri: String, alertInfo: AgentAlertInfo): Thenable[CreateAgentAlertResult]
  def createJob(ownerUri: String, jobInfo: AgentJobInfo): Thenable[CreateAgentJobResult]
  def createJobSchedule(ownerUri: String, scheduleInfo: AgentJobScheduleInfo): Thenable[CreateAgentJobScheduleResult]
  // Job Step management methods
  def createJobStep(ownerUri: String, stepInfo: AgentJobStepInfo): Thenable[CreateAgentJobStepResult]
  def createNotebook(ownerUri: String, notebook: AgentNotebookInfo, templateFilePath: String): Thenable[CreateAgentNotebookResult]
  def createOperator(ownerUri: String, operatorInfo: AgentOperatorInfo): Thenable[CreateAgentOperatorResult]
  def createProxy(ownerUri: String, proxyInfo: AgentProxyInfo): Thenable[CreateAgentOperatorResult]
  def deleteAlert(ownerUri: String, alertInfo: AgentAlertInfo): Thenable[ResultStatus]
  def deleteJob(ownerUri: String, jobInfo: AgentJobInfo): Thenable[ResultStatus]
  def deleteJobSchedule(ownerUri: String, scheduleInfo: AgentJobScheduleInfo): Thenable[ResultStatus]
  def deleteJobStep(ownerUri: String, stepInfo: AgentJobStepInfo): Thenable[ResultStatus]
  def deleteMaterializedNotebook(ownerUri: String, agentNotebookHistory: AgentNotebookHistoryInfo, targetDatabase: String): Thenable[ResultStatus]
  def deleteNotebook(ownerUri: String, notebook: AgentNotebookInfo): Thenable[ResultStatus]
  def deleteOperator(ownerUri: String, operatorInfo: AgentOperatorInfo): Thenable[ResultStatus]
  def deleteProxy(ownerUri: String, proxyInfo: AgentProxyInfo): Thenable[ResultStatus]
  // Alert management methods
  def getAlerts(ownerUri: String): Thenable[AgentAlertsResult]
  // Credential method
  def getCredentials(ownerUri: String): Thenable[GetCredentialsResult]
  def getJobDefaults(ownerUri: String): Thenable[AgentJobDefaultsResult]
  def getJobHistory(ownerUri: String, jobId: String, jobName: String): Thenable[AgentJobHistoryResult]
  // Job Schedule management methods
  def getJobSchedules(ownerUri: String): Thenable[AgentJobSchedulesResult]
  // Job management methods
  def getJobs(ownerUri: String): Thenable[AgentJobsResult]
  def getMaterializedNotebook(ownerUri: String, targetDatabase: String, notebookMaterializedId: Double): Thenable[AgentNotebookMaterializedResult]
  def getNotebookHistory(ownerUri: String, jobId: String, jobName: String, targetDatabase: String): Thenable[AgentNotebookHistoryResult]
  // Notebook management methods
  def getNotebooks(ownerUri: String): Thenable[AgentNotebooksResult]
  // Operator management methods
  def getOperators(ownerUri: String): Thenable[AgentOperatorsResult]
  // Proxy management methods
  def getProxies(ownerUri: String): Thenable[AgentProxiesResult]
  def getTemplateNotebook(ownerUri: String, targetDatabase: String, jobId: String): Thenable[AgentNotebookTemplateResult]
  def jobAction(ownerUri: String, jobName: String, action: String): Thenable[ResultStatus]
  def registerOnUpdated(handler: js.Function0[_]): Unit
  def updateAlert(ownerUri: String, originalAlertName: String, alertInfo: AgentAlertInfo): Thenable[UpdateAgentAlertResult]
  def updateJob(ownerUri: String, originalJobName: String, jobInfo: AgentJobInfo): Thenable[UpdateAgentJobResult]
  def updateJobSchedule(ownerUri: String, originalScheduleName: String, scheduleInfo: AgentJobScheduleInfo): Thenable[UpdateAgentJobScheduleResult]
  def updateJobStep(ownerUri: String, originalJobStepName: String, stepInfo: AgentJobStepInfo): Thenable[UpdateAgentJobStepResult]
  def updateNotebook(
    ownerUri: String,
    originialNotebookName: String,
    notebook: AgentNotebookInfo,
    templateFilePath: String
  ): Thenable[UpdateAgentNotebookResult]
  def updateNotebookMaterializedName(
    ownerUri: String,
    agentNotebookHistory: AgentNotebookHistoryInfo,
    targetDatabase: String,
    name: String
  ): Thenable[ResultStatus]
  def updateNotebookMaterializedPin(
    ownerUri: String,
    agentNotebookHistory: AgentNotebookHistoryInfo,
    targetDatabase: String,
    pin: Boolean
  ): Thenable[ResultStatus]
  def updateOperator(ownerUri: String, originalOperatorName: String, operatorInfo: AgentOperatorInfo): Thenable[UpdateAgentOperatorResult]
  def updateProxy(ownerUri: String, originalProxyName: String, proxyInfo: AgentProxyInfo): Thenable[UpdateAgentOperatorResult]
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
    updateProxy: (String, String, AgentProxyInfo) => Thenable[UpdateAgentOperatorResult],
    handle: js.UndefOr[Double] = js.undefined
  ): AgentServicesProvider = {
    val __obj = js.Dynamic.literal(createAlert = js.Any.fromFunction2(createAlert), createJob = js.Any.fromFunction2(createJob), createJobSchedule = js.Any.fromFunction2(createJobSchedule), createJobStep = js.Any.fromFunction2(createJobStep), createNotebook = js.Any.fromFunction3(createNotebook), createOperator = js.Any.fromFunction2(createOperator), createProxy = js.Any.fromFunction2(createProxy), deleteAlert = js.Any.fromFunction2(deleteAlert), deleteJob = js.Any.fromFunction2(deleteJob), deleteJobSchedule = js.Any.fromFunction2(deleteJobSchedule), deleteJobStep = js.Any.fromFunction2(deleteJobStep), deleteMaterializedNotebook = js.Any.fromFunction3(deleteMaterializedNotebook), deleteNotebook = js.Any.fromFunction2(deleteNotebook), deleteOperator = js.Any.fromFunction2(deleteOperator), deleteProxy = js.Any.fromFunction2(deleteProxy), getAlerts = js.Any.fromFunction1(getAlerts), getCredentials = js.Any.fromFunction1(getCredentials), getJobDefaults = js.Any.fromFunction1(getJobDefaults), getJobHistory = js.Any.fromFunction3(getJobHistory), getJobSchedules = js.Any.fromFunction1(getJobSchedules), getJobs = js.Any.fromFunction1(getJobs), getMaterializedNotebook = js.Any.fromFunction3(getMaterializedNotebook), getNotebookHistory = js.Any.fromFunction4(getNotebookHistory), getNotebooks = js.Any.fromFunction1(getNotebooks), getOperators = js.Any.fromFunction1(getOperators), getProxies = js.Any.fromFunction1(getProxies), getTemplateNotebook = js.Any.fromFunction3(getTemplateNotebook), jobAction = js.Any.fromFunction3(jobAction), providerId = providerId.asInstanceOf[js.Any], registerOnUpdated = js.Any.fromFunction1(registerOnUpdated), updateAlert = js.Any.fromFunction3(updateAlert), updateJob = js.Any.fromFunction3(updateJob), updateJobSchedule = js.Any.fromFunction3(updateJobSchedule), updateJobStep = js.Any.fromFunction3(updateJobStep), updateNotebook = js.Any.fromFunction4(updateNotebook), updateNotebookMaterializedName = js.Any.fromFunction4(updateNotebookMaterializedName), updateNotebookMaterializedPin = js.Any.fromFunction4(updateNotebookMaterializedPin), updateOperator = js.Any.fromFunction3(updateOperator), updateProxy = js.Any.fromFunction3(updateProxy))
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentServicesProvider]
  }
}

