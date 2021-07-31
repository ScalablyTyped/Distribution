package typings.awsSdk.robomakerMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoboMaker extends Service {
  
  /**
    * Deletes one or more worlds in a batch operation.
    */
  def batchDeleteWorlds(): Request[BatchDeleteWorldsResponse, AWSError] = js.native
  def batchDeleteWorlds(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteWorldsResponse, Unit]): Request[BatchDeleteWorldsResponse, AWSError] = js.native
  /**
    * Deletes one or more worlds in a batch operation.
    */
  def batchDeleteWorlds(params: BatchDeleteWorldsRequest): Request[BatchDeleteWorldsResponse, AWSError] = js.native
  def batchDeleteWorlds(
    params: BatchDeleteWorldsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteWorldsResponse, Unit]
  ): Request[BatchDeleteWorldsResponse, AWSError] = js.native
  
  /**
    * Describes one or more simulation jobs.
    */
  def batchDescribeSimulationJob(): Request[BatchDescribeSimulationJobResponse, AWSError] = js.native
  def batchDescribeSimulationJob(callback: js.Function2[/* err */ AWSError, /* data */ BatchDescribeSimulationJobResponse, Unit]): Request[BatchDescribeSimulationJobResponse, AWSError] = js.native
  /**
    * Describes one or more simulation jobs.
    */
  def batchDescribeSimulationJob(params: BatchDescribeSimulationJobRequest): Request[BatchDescribeSimulationJobResponse, AWSError] = js.native
  def batchDescribeSimulationJob(
    params: BatchDescribeSimulationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDescribeSimulationJobResponse, Unit]
  ): Request[BatchDescribeSimulationJobResponse, AWSError] = js.native
  
  /**
    * Cancels the specified deployment job.
    */
  def cancelDeploymentJob(): Request[CancelDeploymentJobResponse, AWSError] = js.native
  def cancelDeploymentJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelDeploymentJobResponse, Unit]): Request[CancelDeploymentJobResponse, AWSError] = js.native
  /**
    * Cancels the specified deployment job.
    */
  def cancelDeploymentJob(params: CancelDeploymentJobRequest): Request[CancelDeploymentJobResponse, AWSError] = js.native
  def cancelDeploymentJob(
    params: CancelDeploymentJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelDeploymentJobResponse, Unit]
  ): Request[CancelDeploymentJobResponse, AWSError] = js.native
  
  /**
    * Cancels the specified simulation job.
    */
  def cancelSimulationJob(): Request[CancelSimulationJobResponse, AWSError] = js.native
  def cancelSimulationJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelSimulationJobResponse, Unit]): Request[CancelSimulationJobResponse, AWSError] = js.native
  /**
    * Cancels the specified simulation job.
    */
  def cancelSimulationJob(params: CancelSimulationJobRequest): Request[CancelSimulationJobResponse, AWSError] = js.native
  def cancelSimulationJob(
    params: CancelSimulationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelSimulationJobResponse, Unit]
  ): Request[CancelSimulationJobResponse, AWSError] = js.native
  
  /**
    * Cancels a simulation job batch. When you cancel a simulation job batch, you are also cancelling all of the active simulation jobs created as part of the batch. 
    */
  def cancelSimulationJobBatch(): Request[CancelSimulationJobBatchResponse, AWSError] = js.native
  def cancelSimulationJobBatch(callback: js.Function2[/* err */ AWSError, /* data */ CancelSimulationJobBatchResponse, Unit]): Request[CancelSimulationJobBatchResponse, AWSError] = js.native
  /**
    * Cancels a simulation job batch. When you cancel a simulation job batch, you are also cancelling all of the active simulation jobs created as part of the batch. 
    */
  def cancelSimulationJobBatch(params: CancelSimulationJobBatchRequest): Request[CancelSimulationJobBatchResponse, AWSError] = js.native
  def cancelSimulationJobBatch(
    params: CancelSimulationJobBatchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelSimulationJobBatchResponse, Unit]
  ): Request[CancelSimulationJobBatchResponse, AWSError] = js.native
  
  /**
    * Cancels the specified export job.
    */
  def cancelWorldExportJob(): Request[CancelWorldExportJobResponse, AWSError] = js.native
  def cancelWorldExportJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelWorldExportJobResponse, Unit]): Request[CancelWorldExportJobResponse, AWSError] = js.native
  /**
    * Cancels the specified export job.
    */
  def cancelWorldExportJob(params: CancelWorldExportJobRequest): Request[CancelWorldExportJobResponse, AWSError] = js.native
  def cancelWorldExportJob(
    params: CancelWorldExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelWorldExportJobResponse, Unit]
  ): Request[CancelWorldExportJobResponse, AWSError] = js.native
  
  /**
    * Cancels the specified world generator job.
    */
  def cancelWorldGenerationJob(): Request[CancelWorldGenerationJobResponse, AWSError] = js.native
  def cancelWorldGenerationJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelWorldGenerationJobResponse, Unit]): Request[CancelWorldGenerationJobResponse, AWSError] = js.native
  /**
    * Cancels the specified world generator job.
    */
  def cancelWorldGenerationJob(params: CancelWorldGenerationJobRequest): Request[CancelWorldGenerationJobResponse, AWSError] = js.native
  def cancelWorldGenerationJob(
    params: CancelWorldGenerationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelWorldGenerationJobResponse, Unit]
  ): Request[CancelWorldGenerationJobResponse, AWSError] = js.native
  
  @JSName("config")
  var config_RoboMaker: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deploys a specific version of a robot application to robots in a fleet. The robot application must have a numbered applicationVersion for consistency reasons. To create a new version, use CreateRobotApplicationVersion or see Creating a Robot Application Version.   After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.  
    */
  def createDeploymentJob(): Request[CreateDeploymentJobResponse, AWSError] = js.native
  def createDeploymentJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentJobResponse, Unit]): Request[CreateDeploymentJobResponse, AWSError] = js.native
  /**
    * Deploys a specific version of a robot application to robots in a fleet. The robot application must have a numbered applicationVersion for consistency reasons. To create a new version, use CreateRobotApplicationVersion or see Creating a Robot Application Version.   After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.  
    */
  def createDeploymentJob(params: CreateDeploymentJobRequest): Request[CreateDeploymentJobResponse, AWSError] = js.native
  def createDeploymentJob(
    params: CreateDeploymentJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentJobResponse, Unit]
  ): Request[CreateDeploymentJobResponse, AWSError] = js.native
  
  /**
    * Creates a fleet, a logical group of robots running the same robot application.
    */
  def createFleet(): Request[CreateFleetResponse, AWSError] = js.native
  def createFleet(callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetResponse, Unit]): Request[CreateFleetResponse, AWSError] = js.native
  /**
    * Creates a fleet, a logical group of robots running the same robot application.
    */
  def createFleet(params: CreateFleetRequest): Request[CreateFleetResponse, AWSError] = js.native
  def createFleet(
    params: CreateFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetResponse, Unit]
  ): Request[CreateFleetResponse, AWSError] = js.native
  
  /**
    * Creates a robot.
    */
  def createRobot(): Request[CreateRobotResponse, AWSError] = js.native
  def createRobot(callback: js.Function2[/* err */ AWSError, /* data */ CreateRobotResponse, Unit]): Request[CreateRobotResponse, AWSError] = js.native
  /**
    * Creates a robot.
    */
  def createRobot(params: CreateRobotRequest): Request[CreateRobotResponse, AWSError] = js.native
  def createRobot(
    params: CreateRobotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRobotResponse, Unit]
  ): Request[CreateRobotResponse, AWSError] = js.native
  
  /**
    * Creates a robot application. 
    */
  def createRobotApplication(): Request[CreateRobotApplicationResponse, AWSError] = js.native
  def createRobotApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateRobotApplicationResponse, Unit]): Request[CreateRobotApplicationResponse, AWSError] = js.native
  /**
    * Creates a robot application. 
    */
  def createRobotApplication(params: CreateRobotApplicationRequest): Request[CreateRobotApplicationResponse, AWSError] = js.native
  def createRobotApplication(
    params: CreateRobotApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRobotApplicationResponse, Unit]
  ): Request[CreateRobotApplicationResponse, AWSError] = js.native
  
  /**
    * Creates a version of a robot application.
    */
  def createRobotApplicationVersion(): Request[CreateRobotApplicationVersionResponse, AWSError] = js.native
  def createRobotApplicationVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateRobotApplicationVersionResponse, Unit]): Request[CreateRobotApplicationVersionResponse, AWSError] = js.native
  /**
    * Creates a version of a robot application.
    */
  def createRobotApplicationVersion(params: CreateRobotApplicationVersionRequest): Request[CreateRobotApplicationVersionResponse, AWSError] = js.native
  def createRobotApplicationVersion(
    params: CreateRobotApplicationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRobotApplicationVersionResponse, Unit]
  ): Request[CreateRobotApplicationVersionResponse, AWSError] = js.native
  
  /**
    * Creates a simulation application.
    */
  def createSimulationApplication(): Request[CreateSimulationApplicationResponse, AWSError] = js.native
  def createSimulationApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateSimulationApplicationResponse, Unit]): Request[CreateSimulationApplicationResponse, AWSError] = js.native
  /**
    * Creates a simulation application.
    */
  def createSimulationApplication(params: CreateSimulationApplicationRequest): Request[CreateSimulationApplicationResponse, AWSError] = js.native
  def createSimulationApplication(
    params: CreateSimulationApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSimulationApplicationResponse, Unit]
  ): Request[CreateSimulationApplicationResponse, AWSError] = js.native
  
  /**
    * Creates a simulation application with a specific revision id.
    */
  def createSimulationApplicationVersion(): Request[CreateSimulationApplicationVersionResponse, AWSError] = js.native
  def createSimulationApplicationVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSimulationApplicationVersionResponse, Unit]
  ): Request[CreateSimulationApplicationVersionResponse, AWSError] = js.native
  /**
    * Creates a simulation application with a specific revision id.
    */
  def createSimulationApplicationVersion(params: CreateSimulationApplicationVersionRequest): Request[CreateSimulationApplicationVersionResponse, AWSError] = js.native
  def createSimulationApplicationVersion(
    params: CreateSimulationApplicationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSimulationApplicationVersionResponse, Unit]
  ): Request[CreateSimulationApplicationVersionResponse, AWSError] = js.native
  
  /**
    * Creates a simulation job.  After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.  
    */
  def createSimulationJob(): Request[CreateSimulationJobResponse, AWSError] = js.native
  def createSimulationJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateSimulationJobResponse, Unit]): Request[CreateSimulationJobResponse, AWSError] = js.native
  /**
    * Creates a simulation job.  After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.  
    */
  def createSimulationJob(params: CreateSimulationJobRequest): Request[CreateSimulationJobResponse, AWSError] = js.native
  def createSimulationJob(
    params: CreateSimulationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSimulationJobResponse, Unit]
  ): Request[CreateSimulationJobResponse, AWSError] = js.native
  
  /**
    * Creates a world export job.
    */
  def createWorldExportJob(): Request[CreateWorldExportJobResponse, AWSError] = js.native
  def createWorldExportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorldExportJobResponse, Unit]): Request[CreateWorldExportJobResponse, AWSError] = js.native
  /**
    * Creates a world export job.
    */
  def createWorldExportJob(params: CreateWorldExportJobRequest): Request[CreateWorldExportJobResponse, AWSError] = js.native
  def createWorldExportJob(
    params: CreateWorldExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorldExportJobResponse, Unit]
  ): Request[CreateWorldExportJobResponse, AWSError] = js.native
  
  /**
    * Creates worlds using the specified template.
    */
  def createWorldGenerationJob(): Request[CreateWorldGenerationJobResponse, AWSError] = js.native
  def createWorldGenerationJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorldGenerationJobResponse, Unit]): Request[CreateWorldGenerationJobResponse, AWSError] = js.native
  /**
    * Creates worlds using the specified template.
    */
  def createWorldGenerationJob(params: CreateWorldGenerationJobRequest): Request[CreateWorldGenerationJobResponse, AWSError] = js.native
  def createWorldGenerationJob(
    params: CreateWorldGenerationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorldGenerationJobResponse, Unit]
  ): Request[CreateWorldGenerationJobResponse, AWSError] = js.native
  
  /**
    * Creates a world template.
    */
  def createWorldTemplate(): Request[CreateWorldTemplateResponse, AWSError] = js.native
  def createWorldTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorldTemplateResponse, Unit]): Request[CreateWorldTemplateResponse, AWSError] = js.native
  /**
    * Creates a world template.
    */
  def createWorldTemplate(params: CreateWorldTemplateRequest): Request[CreateWorldTemplateResponse, AWSError] = js.native
  def createWorldTemplate(
    params: CreateWorldTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorldTemplateResponse, Unit]
  ): Request[CreateWorldTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes a fleet.
    */
  def deleteFleet(): Request[DeleteFleetResponse, AWSError] = js.native
  def deleteFleet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetResponse, Unit]): Request[DeleteFleetResponse, AWSError] = js.native
  /**
    * Deletes a fleet.
    */
  def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResponse, AWSError] = js.native
  def deleteFleet(
    params: DeleteFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetResponse, Unit]
  ): Request[DeleteFleetResponse, AWSError] = js.native
  
  /**
    * Deletes a robot.
    */
  def deleteRobot(): Request[DeleteRobotResponse, AWSError] = js.native
  def deleteRobot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRobotResponse, Unit]): Request[DeleteRobotResponse, AWSError] = js.native
  /**
    * Deletes a robot.
    */
  def deleteRobot(params: DeleteRobotRequest): Request[DeleteRobotResponse, AWSError] = js.native
  def deleteRobot(
    params: DeleteRobotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRobotResponse, Unit]
  ): Request[DeleteRobotResponse, AWSError] = js.native
  
  /**
    * Deletes a robot application.
    */
  def deleteRobotApplication(): Request[DeleteRobotApplicationResponse, AWSError] = js.native
  def deleteRobotApplication(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRobotApplicationResponse, Unit]): Request[DeleteRobotApplicationResponse, AWSError] = js.native
  /**
    * Deletes a robot application.
    */
  def deleteRobotApplication(params: DeleteRobotApplicationRequest): Request[DeleteRobotApplicationResponse, AWSError] = js.native
  def deleteRobotApplication(
    params: DeleteRobotApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRobotApplicationResponse, Unit]
  ): Request[DeleteRobotApplicationResponse, AWSError] = js.native
  
  /**
    * Deletes a simulation application.
    */
  def deleteSimulationApplication(): Request[DeleteSimulationApplicationResponse, AWSError] = js.native
  def deleteSimulationApplication(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSimulationApplicationResponse, Unit]): Request[DeleteSimulationApplicationResponse, AWSError] = js.native
  /**
    * Deletes a simulation application.
    */
  def deleteSimulationApplication(params: DeleteSimulationApplicationRequest): Request[DeleteSimulationApplicationResponse, AWSError] = js.native
  def deleteSimulationApplication(
    params: DeleteSimulationApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSimulationApplicationResponse, Unit]
  ): Request[DeleteSimulationApplicationResponse, AWSError] = js.native
  
  /**
    * Deletes a world template.
    */
  def deleteWorldTemplate(): Request[DeleteWorldTemplateResponse, AWSError] = js.native
  def deleteWorldTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorldTemplateResponse, Unit]): Request[DeleteWorldTemplateResponse, AWSError] = js.native
  /**
    * Deletes a world template.
    */
  def deleteWorldTemplate(params: DeleteWorldTemplateRequest): Request[DeleteWorldTemplateResponse, AWSError] = js.native
  def deleteWorldTemplate(
    params: DeleteWorldTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorldTemplateResponse, Unit]
  ): Request[DeleteWorldTemplateResponse, AWSError] = js.native
  
  /**
    * Deregisters a robot.
    */
  def deregisterRobot(): Request[DeregisterRobotResponse, AWSError] = js.native
  def deregisterRobot(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterRobotResponse, Unit]): Request[DeregisterRobotResponse, AWSError] = js.native
  /**
    * Deregisters a robot.
    */
  def deregisterRobot(params: DeregisterRobotRequest): Request[DeregisterRobotResponse, AWSError] = js.native
  def deregisterRobot(
    params: DeregisterRobotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterRobotResponse, Unit]
  ): Request[DeregisterRobotResponse, AWSError] = js.native
  
  /**
    * Describes a deployment job.
    */
  def describeDeploymentJob(): Request[DescribeDeploymentJobResponse, AWSError] = js.native
  def describeDeploymentJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeploymentJobResponse, Unit]): Request[DescribeDeploymentJobResponse, AWSError] = js.native
  /**
    * Describes a deployment job.
    */
  def describeDeploymentJob(params: DescribeDeploymentJobRequest): Request[DescribeDeploymentJobResponse, AWSError] = js.native
  def describeDeploymentJob(
    params: DescribeDeploymentJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeploymentJobResponse, Unit]
  ): Request[DescribeDeploymentJobResponse, AWSError] = js.native
  
  /**
    * Describes a fleet.
    */
  def describeFleet(): Request[DescribeFleetResponse, AWSError] = js.native
  def describeFleet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetResponse, Unit]): Request[DescribeFleetResponse, AWSError] = js.native
  /**
    * Describes a fleet.
    */
  def describeFleet(params: DescribeFleetRequest): Request[DescribeFleetResponse, AWSError] = js.native
  def describeFleet(
    params: DescribeFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFleetResponse, Unit]
  ): Request[DescribeFleetResponse, AWSError] = js.native
  
  /**
    * Describes a robot.
    */
  def describeRobot(): Request[DescribeRobotResponse, AWSError] = js.native
  def describeRobot(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRobotResponse, Unit]): Request[DescribeRobotResponse, AWSError] = js.native
  /**
    * Describes a robot.
    */
  def describeRobot(params: DescribeRobotRequest): Request[DescribeRobotResponse, AWSError] = js.native
  def describeRobot(
    params: DescribeRobotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRobotResponse, Unit]
  ): Request[DescribeRobotResponse, AWSError] = js.native
  
  /**
    * Describes a robot application.
    */
  def describeRobotApplication(): Request[DescribeRobotApplicationResponse, AWSError] = js.native
  def describeRobotApplication(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRobotApplicationResponse, Unit]): Request[DescribeRobotApplicationResponse, AWSError] = js.native
  /**
    * Describes a robot application.
    */
  def describeRobotApplication(params: DescribeRobotApplicationRequest): Request[DescribeRobotApplicationResponse, AWSError] = js.native
  def describeRobotApplication(
    params: DescribeRobotApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRobotApplicationResponse, Unit]
  ): Request[DescribeRobotApplicationResponse, AWSError] = js.native
  
  /**
    * Describes a simulation application.
    */
  def describeSimulationApplication(): Request[DescribeSimulationApplicationResponse, AWSError] = js.native
  def describeSimulationApplication(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSimulationApplicationResponse, Unit]): Request[DescribeSimulationApplicationResponse, AWSError] = js.native
  /**
    * Describes a simulation application.
    */
  def describeSimulationApplication(params: DescribeSimulationApplicationRequest): Request[DescribeSimulationApplicationResponse, AWSError] = js.native
  def describeSimulationApplication(
    params: DescribeSimulationApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSimulationApplicationResponse, Unit]
  ): Request[DescribeSimulationApplicationResponse, AWSError] = js.native
  
  /**
    * Describes a simulation job.
    */
  def describeSimulationJob(): Request[DescribeSimulationJobResponse, AWSError] = js.native
  def describeSimulationJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSimulationJobResponse, Unit]): Request[DescribeSimulationJobResponse, AWSError] = js.native
  /**
    * Describes a simulation job.
    */
  def describeSimulationJob(params: DescribeSimulationJobRequest): Request[DescribeSimulationJobResponse, AWSError] = js.native
  def describeSimulationJob(
    params: DescribeSimulationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSimulationJobResponse, Unit]
  ): Request[DescribeSimulationJobResponse, AWSError] = js.native
  
  /**
    * Describes a simulation job batch.
    */
  def describeSimulationJobBatch(): Request[DescribeSimulationJobBatchResponse, AWSError] = js.native
  def describeSimulationJobBatch(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSimulationJobBatchResponse, Unit]): Request[DescribeSimulationJobBatchResponse, AWSError] = js.native
  /**
    * Describes a simulation job batch.
    */
  def describeSimulationJobBatch(params: DescribeSimulationJobBatchRequest): Request[DescribeSimulationJobBatchResponse, AWSError] = js.native
  def describeSimulationJobBatch(
    params: DescribeSimulationJobBatchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSimulationJobBatchResponse, Unit]
  ): Request[DescribeSimulationJobBatchResponse, AWSError] = js.native
  
  /**
    * Describes a world.
    */
  def describeWorld(): Request[DescribeWorldResponse, AWSError] = js.native
  def describeWorld(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorldResponse, Unit]): Request[DescribeWorldResponse, AWSError] = js.native
  /**
    * Describes a world.
    */
  def describeWorld(params: DescribeWorldRequest): Request[DescribeWorldResponse, AWSError] = js.native
  def describeWorld(
    params: DescribeWorldRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorldResponse, Unit]
  ): Request[DescribeWorldResponse, AWSError] = js.native
  
  /**
    * Describes a world export job.
    */
  def describeWorldExportJob(): Request[DescribeWorldExportJobResponse, AWSError] = js.native
  def describeWorldExportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorldExportJobResponse, Unit]): Request[DescribeWorldExportJobResponse, AWSError] = js.native
  /**
    * Describes a world export job.
    */
  def describeWorldExportJob(params: DescribeWorldExportJobRequest): Request[DescribeWorldExportJobResponse, AWSError] = js.native
  def describeWorldExportJob(
    params: DescribeWorldExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorldExportJobResponse, Unit]
  ): Request[DescribeWorldExportJobResponse, AWSError] = js.native
  
  /**
    * Describes a world generation job.
    */
  def describeWorldGenerationJob(): Request[DescribeWorldGenerationJobResponse, AWSError] = js.native
  def describeWorldGenerationJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorldGenerationJobResponse, Unit]): Request[DescribeWorldGenerationJobResponse, AWSError] = js.native
  /**
    * Describes a world generation job.
    */
  def describeWorldGenerationJob(params: DescribeWorldGenerationJobRequest): Request[DescribeWorldGenerationJobResponse, AWSError] = js.native
  def describeWorldGenerationJob(
    params: DescribeWorldGenerationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorldGenerationJobResponse, Unit]
  ): Request[DescribeWorldGenerationJobResponse, AWSError] = js.native
  
  /**
    * Describes a world template.
    */
  def describeWorldTemplate(): Request[DescribeWorldTemplateResponse, AWSError] = js.native
  def describeWorldTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorldTemplateResponse, Unit]): Request[DescribeWorldTemplateResponse, AWSError] = js.native
  /**
    * Describes a world template.
    */
  def describeWorldTemplate(params: DescribeWorldTemplateRequest): Request[DescribeWorldTemplateResponse, AWSError] = js.native
  def describeWorldTemplate(
    params: DescribeWorldTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorldTemplateResponse, Unit]
  ): Request[DescribeWorldTemplateResponse, AWSError] = js.native
  
  /**
    * Gets the world template body.
    */
  def getWorldTemplateBody(): Request[GetWorldTemplateBodyResponse, AWSError] = js.native
  def getWorldTemplateBody(callback: js.Function2[/* err */ AWSError, /* data */ GetWorldTemplateBodyResponse, Unit]): Request[GetWorldTemplateBodyResponse, AWSError] = js.native
  /**
    * Gets the world template body.
    */
  def getWorldTemplateBody(params: GetWorldTemplateBodyRequest): Request[GetWorldTemplateBodyResponse, AWSError] = js.native
  def getWorldTemplateBody(
    params: GetWorldTemplateBodyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorldTemplateBodyResponse, Unit]
  ): Request[GetWorldTemplateBodyResponse, AWSError] = js.native
  
  /**
    * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment jobs. 
    */
  def listDeploymentJobs(): Request[ListDeploymentJobsResponse, AWSError] = js.native
  def listDeploymentJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentJobsResponse, Unit]): Request[ListDeploymentJobsResponse, AWSError] = js.native
  /**
    * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment jobs. 
    */
  def listDeploymentJobs(params: ListDeploymentJobsRequest): Request[ListDeploymentJobsResponse, AWSError] = js.native
  def listDeploymentJobs(
    params: ListDeploymentJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentJobsResponse, Unit]
  ): Request[ListDeploymentJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets. 
    */
  def listFleets(): Request[ListFleetsResponse, AWSError] = js.native
  def listFleets(callback: js.Function2[/* err */ AWSError, /* data */ ListFleetsResponse, Unit]): Request[ListFleetsResponse, AWSError] = js.native
  /**
    * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets. 
    */
  def listFleets(params: ListFleetsRequest): Request[ListFleetsResponse, AWSError] = js.native
  def listFleets(
    params: ListFleetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFleetsResponse, Unit]
  ): Request[ListFleetsResponse, AWSError] = js.native
  
  /**
    * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
    */
  def listRobotApplications(): Request[ListRobotApplicationsResponse, AWSError] = js.native
  def listRobotApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListRobotApplicationsResponse, Unit]): Request[ListRobotApplicationsResponse, AWSError] = js.native
  /**
    * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
    */
  def listRobotApplications(params: ListRobotApplicationsRequest): Request[ListRobotApplicationsResponse, AWSError] = js.native
  def listRobotApplications(
    params: ListRobotApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRobotApplicationsResponse, Unit]
  ): Request[ListRobotApplicationsResponse, AWSError] = js.native
  
  /**
    * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
    */
  def listRobots(): Request[ListRobotsResponse, AWSError] = js.native
  def listRobots(callback: js.Function2[/* err */ AWSError, /* data */ ListRobotsResponse, Unit]): Request[ListRobotsResponse, AWSError] = js.native
  /**
    * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
    */
  def listRobots(params: ListRobotsRequest): Request[ListRobotsResponse, AWSError] = js.native
  def listRobots(
    params: ListRobotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRobotsResponse, Unit]
  ): Request[ListRobotsResponse, AWSError] = js.native
  
  /**
    * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation applications. 
    */
  def listSimulationApplications(): Request[ListSimulationApplicationsResponse, AWSError] = js.native
  def listSimulationApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListSimulationApplicationsResponse, Unit]): Request[ListSimulationApplicationsResponse, AWSError] = js.native
  /**
    * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation applications. 
    */
  def listSimulationApplications(params: ListSimulationApplicationsRequest): Request[ListSimulationApplicationsResponse, AWSError] = js.native
  def listSimulationApplications(
    params: ListSimulationApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSimulationApplicationsResponse, Unit]
  ): Request[ListSimulationApplicationsResponse, AWSError] = js.native
  
  /**
    * Returns a list simulation job batches. You can optionally provide filters to retrieve specific simulation batch jobs. 
    */
  def listSimulationJobBatches(): Request[ListSimulationJobBatchesResponse, AWSError] = js.native
  def listSimulationJobBatches(callback: js.Function2[/* err */ AWSError, /* data */ ListSimulationJobBatchesResponse, Unit]): Request[ListSimulationJobBatchesResponse, AWSError] = js.native
  /**
    * Returns a list simulation job batches. You can optionally provide filters to retrieve specific simulation batch jobs. 
    */
  def listSimulationJobBatches(params: ListSimulationJobBatchesRequest): Request[ListSimulationJobBatchesResponse, AWSError] = js.native
  def listSimulationJobBatches(
    params: ListSimulationJobBatchesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSimulationJobBatchesResponse, Unit]
  ): Request[ListSimulationJobBatchesResponse, AWSError] = js.native
  
  /**
    * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs. 
    */
  def listSimulationJobs(): Request[ListSimulationJobsResponse, AWSError] = js.native
  def listSimulationJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListSimulationJobsResponse, Unit]): Request[ListSimulationJobsResponse, AWSError] = js.native
  /**
    * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs. 
    */
  def listSimulationJobs(params: ListSimulationJobsRequest): Request[ListSimulationJobsResponse, AWSError] = js.native
  def listSimulationJobs(
    params: ListSimulationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSimulationJobsResponse, Unit]
  ): Request[ListSimulationJobsResponse, AWSError] = js.native
  
  /**
    * Lists all tags on a AWS RoboMaker resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags on a AWS RoboMaker resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists world export jobs.
    */
  def listWorldExportJobs(): Request[ListWorldExportJobsResponse, AWSError] = js.native
  def listWorldExportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListWorldExportJobsResponse, Unit]): Request[ListWorldExportJobsResponse, AWSError] = js.native
  /**
    * Lists world export jobs.
    */
  def listWorldExportJobs(params: ListWorldExportJobsRequest): Request[ListWorldExportJobsResponse, AWSError] = js.native
  def listWorldExportJobs(
    params: ListWorldExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorldExportJobsResponse, Unit]
  ): Request[ListWorldExportJobsResponse, AWSError] = js.native
  
  /**
    * Lists world generator jobs.
    */
  def listWorldGenerationJobs(): Request[ListWorldGenerationJobsResponse, AWSError] = js.native
  def listWorldGenerationJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListWorldGenerationJobsResponse, Unit]): Request[ListWorldGenerationJobsResponse, AWSError] = js.native
  /**
    * Lists world generator jobs.
    */
  def listWorldGenerationJobs(params: ListWorldGenerationJobsRequest): Request[ListWorldGenerationJobsResponse, AWSError] = js.native
  def listWorldGenerationJobs(
    params: ListWorldGenerationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorldGenerationJobsResponse, Unit]
  ): Request[ListWorldGenerationJobsResponse, AWSError] = js.native
  
  /**
    * Lists world templates.
    */
  def listWorldTemplates(): Request[ListWorldTemplatesResponse, AWSError] = js.native
  def listWorldTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListWorldTemplatesResponse, Unit]): Request[ListWorldTemplatesResponse, AWSError] = js.native
  /**
    * Lists world templates.
    */
  def listWorldTemplates(params: ListWorldTemplatesRequest): Request[ListWorldTemplatesResponse, AWSError] = js.native
  def listWorldTemplates(
    params: ListWorldTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorldTemplatesResponse, Unit]
  ): Request[ListWorldTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists worlds.
    */
  def listWorlds(): Request[ListWorldsResponse, AWSError] = js.native
  def listWorlds(callback: js.Function2[/* err */ AWSError, /* data */ ListWorldsResponse, Unit]): Request[ListWorldsResponse, AWSError] = js.native
  /**
    * Lists worlds.
    */
  def listWorlds(params: ListWorldsRequest): Request[ListWorldsResponse, AWSError] = js.native
  def listWorlds(
    params: ListWorldsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorldsResponse, Unit]
  ): Request[ListWorldsResponse, AWSError] = js.native
  
  /**
    * Registers a robot with a fleet.
    */
  def registerRobot(): Request[RegisterRobotResponse, AWSError] = js.native
  def registerRobot(callback: js.Function2[/* err */ AWSError, /* data */ RegisterRobotResponse, Unit]): Request[RegisterRobotResponse, AWSError] = js.native
  /**
    * Registers a robot with a fleet.
    */
  def registerRobot(params: RegisterRobotRequest): Request[RegisterRobotResponse, AWSError] = js.native
  def registerRobot(
    params: RegisterRobotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterRobotResponse, Unit]
  ): Request[RegisterRobotResponse, AWSError] = js.native
  
  /**
    * Restarts a running simulation job.
    */
  def restartSimulationJob(): Request[RestartSimulationJobResponse, AWSError] = js.native
  def restartSimulationJob(callback: js.Function2[/* err */ AWSError, /* data */ RestartSimulationJobResponse, Unit]): Request[RestartSimulationJobResponse, AWSError] = js.native
  /**
    * Restarts a running simulation job.
    */
  def restartSimulationJob(params: RestartSimulationJobRequest): Request[RestartSimulationJobResponse, AWSError] = js.native
  def restartSimulationJob(
    params: RestartSimulationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestartSimulationJobResponse, Unit]
  ): Request[RestartSimulationJobResponse, AWSError] = js.native
  
  /**
    * Starts a new simulation job batch. The batch is defined using one or more SimulationJobRequest objects. 
    */
  def startSimulationJobBatch(): Request[StartSimulationJobBatchResponse, AWSError] = js.native
  def startSimulationJobBatch(callback: js.Function2[/* err */ AWSError, /* data */ StartSimulationJobBatchResponse, Unit]): Request[StartSimulationJobBatchResponse, AWSError] = js.native
  /**
    * Starts a new simulation job batch. The batch is defined using one or more SimulationJobRequest objects. 
    */
  def startSimulationJobBatch(params: StartSimulationJobBatchRequest): Request[StartSimulationJobBatchResponse, AWSError] = js.native
  def startSimulationJobBatch(
    params: StartSimulationJobBatchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSimulationJobBatchResponse, Unit]
  ): Request[StartSimulationJobBatchResponse, AWSError] = js.native
  
  /**
    * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
    */
  def syncDeploymentJob(): Request[SyncDeploymentJobResponse, AWSError] = js.native
  def syncDeploymentJob(callback: js.Function2[/* err */ AWSError, /* data */ SyncDeploymentJobResponse, Unit]): Request[SyncDeploymentJobResponse, AWSError] = js.native
  /**
    * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
    */
  def syncDeploymentJob(params: SyncDeploymentJobRequest): Request[SyncDeploymentJobResponse, AWSError] = js.native
  def syncDeploymentJob(
    params: SyncDeploymentJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SyncDeploymentJobResponse, Unit]
  ): Request[SyncDeploymentJobResponse, AWSError] = js.native
  
  /**
    * Adds or edits tags for a AWS RoboMaker resource. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty strings.  For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds or edits tags for a AWS RoboMaker resource. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty strings.  For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified AWS RoboMaker resource. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource . 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified AWS RoboMaker resource. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource . 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a robot application.
    */
  def updateRobotApplication(): Request[UpdateRobotApplicationResponse, AWSError] = js.native
  def updateRobotApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRobotApplicationResponse, Unit]): Request[UpdateRobotApplicationResponse, AWSError] = js.native
  /**
    * Updates a robot application.
    */
  def updateRobotApplication(params: UpdateRobotApplicationRequest): Request[UpdateRobotApplicationResponse, AWSError] = js.native
  def updateRobotApplication(
    params: UpdateRobotApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRobotApplicationResponse, Unit]
  ): Request[UpdateRobotApplicationResponse, AWSError] = js.native
  
  /**
    * Updates a simulation application.
    */
  def updateSimulationApplication(): Request[UpdateSimulationApplicationResponse, AWSError] = js.native
  def updateSimulationApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSimulationApplicationResponse, Unit]): Request[UpdateSimulationApplicationResponse, AWSError] = js.native
  /**
    * Updates a simulation application.
    */
  def updateSimulationApplication(params: UpdateSimulationApplicationRequest): Request[UpdateSimulationApplicationResponse, AWSError] = js.native
  def updateSimulationApplication(
    params: UpdateSimulationApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSimulationApplicationResponse, Unit]
  ): Request[UpdateSimulationApplicationResponse, AWSError] = js.native
  
  /**
    * Updates a world template.
    */
  def updateWorldTemplate(): Request[UpdateWorldTemplateResponse, AWSError] = js.native
  def updateWorldTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorldTemplateResponse, Unit]): Request[UpdateWorldTemplateResponse, AWSError] = js.native
  /**
    * Updates a world template.
    */
  def updateWorldTemplate(params: UpdateWorldTemplateRequest): Request[UpdateWorldTemplateResponse, AWSError] = js.native
  def updateWorldTemplate(
    params: UpdateWorldTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorldTemplateResponse, Unit]
  ): Request[UpdateWorldTemplateResponse, AWSError] = js.native
}
