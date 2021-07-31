package typings.awsSdk.mobileMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mobile extends Service {
  
  @JSName("config")
  var config_Mobile: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  Creates an AWS Mobile Hub project. 
    */
  def createProject(): Request[CreateProjectResult, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResult, Unit]): Request[CreateProjectResult, AWSError] = js.native
  /**
    *  Creates an AWS Mobile Hub project. 
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResult, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResult, Unit]
  ): Request[CreateProjectResult, AWSError] = js.native
  
  /**
    *  Delets a project in AWS Mobile Hub. 
    */
  def deleteProject(): Request[DeleteProjectResult, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResult, Unit]): Request[DeleteProjectResult, AWSError] = js.native
  /**
    *  Delets a project in AWS Mobile Hub. 
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResult, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResult, Unit]
  ): Request[DeleteProjectResult, AWSError] = js.native
  
  /**
    *  Get the bundle details for the requested bundle id. 
    */
  def describeBundle(): Request[DescribeBundleResult, AWSError] = js.native
  def describeBundle(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBundleResult, Unit]): Request[DescribeBundleResult, AWSError] = js.native
  /**
    *  Get the bundle details for the requested bundle id. 
    */
  def describeBundle(params: DescribeBundleRequest): Request[DescribeBundleResult, AWSError] = js.native
  def describeBundle(
    params: DescribeBundleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBundleResult, Unit]
  ): Request[DescribeBundleResult, AWSError] = js.native
  
  /**
    *  Gets details about a project in AWS Mobile Hub. 
    */
  def describeProject(): Request[DescribeProjectResult, AWSError] = js.native
  def describeProject(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResult, Unit]): Request[DescribeProjectResult, AWSError] = js.native
  /**
    *  Gets details about a project in AWS Mobile Hub. 
    */
  def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResult, AWSError] = js.native
  def describeProject(
    params: DescribeProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResult, Unit]
  ): Request[DescribeProjectResult, AWSError] = js.native
  
  /**
    *  Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile app clients with backend AWS resources. 
    */
  def exportBundle(): Request[ExportBundleResult, AWSError] = js.native
  def exportBundle(callback: js.Function2[/* err */ AWSError, /* data */ ExportBundleResult, Unit]): Request[ExportBundleResult, AWSError] = js.native
  /**
    *  Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile app clients with backend AWS resources. 
    */
  def exportBundle(params: ExportBundleRequest): Request[ExportBundleResult, AWSError] = js.native
  def exportBundle(
    params: ExportBundleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportBundleResult, Unit]
  ): Request[ExportBundleResult, AWSError] = js.native
  
  /**
    *  Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS account. 
    */
  def exportProject(): Request[ExportProjectResult, AWSError] = js.native
  def exportProject(callback: js.Function2[/* err */ AWSError, /* data */ ExportProjectResult, Unit]): Request[ExportProjectResult, AWSError] = js.native
  /**
    *  Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS account. 
    */
  def exportProject(params: ExportProjectRequest): Request[ExportProjectResult, AWSError] = js.native
  def exportProject(
    params: ExportProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportProjectResult, Unit]
  ): Request[ExportProjectResult, AWSError] = js.native
  
  /**
    *  List all available bundles. 
    */
  def listBundles(): Request[ListBundlesResult, AWSError] = js.native
  def listBundles(callback: js.Function2[/* err */ AWSError, /* data */ ListBundlesResult, Unit]): Request[ListBundlesResult, AWSError] = js.native
  /**
    *  List all available bundles. 
    */
  def listBundles(params: ListBundlesRequest): Request[ListBundlesResult, AWSError] = js.native
  def listBundles(
    params: ListBundlesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBundlesResult, Unit]
  ): Request[ListBundlesResult, AWSError] = js.native
  
  /**
    *  Lists projects in AWS Mobile Hub. 
    */
  def listProjects(): Request[ListProjectsResult, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResult, Unit]): Request[ListProjectsResult, AWSError] = js.native
  /**
    *  Lists projects in AWS Mobile Hub. 
    */
  def listProjects(params: ListProjectsRequest): Request[ListProjectsResult, AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResult, Unit]
  ): Request[ListProjectsResult, AWSError] = js.native
  
  /**
    *  Update an existing project. 
    */
  def updateProject(): Request[UpdateProjectResult, AWSError] = js.native
  def updateProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResult, Unit]): Request[UpdateProjectResult, AWSError] = js.native
  /**
    *  Update an existing project. 
    */
  def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResult, AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResult, Unit]
  ): Request[UpdateProjectResult, AWSError] = js.native
}
