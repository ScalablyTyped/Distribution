package typings.awsSdk.curMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CUR extends Service {
  
  @JSName("config")
  var config_CUR: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Deletes the specified report.
    */
  def deleteReportDefinition(): Request[DeleteReportDefinitionResponse, AWSError] = js.native
  def deleteReportDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReportDefinitionResponse, Unit]): Request[DeleteReportDefinitionResponse, AWSError] = js.native
  /**
    * Deletes the specified report.
    */
  def deleteReportDefinition(params: DeleteReportDefinitionRequest): Request[DeleteReportDefinitionResponse, AWSError] = js.native
  def deleteReportDefinition(
    params: DeleteReportDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReportDefinitionResponse, Unit]
  ): Request[DeleteReportDefinitionResponse, AWSError] = js.native
  
  /**
    * Lists the AWS Cost and Usage reports available to this account.
    */
  def describeReportDefinitions(): Request[DescribeReportDefinitionsResponse, AWSError] = js.native
  def describeReportDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReportDefinitionsResponse, Unit]): Request[DescribeReportDefinitionsResponse, AWSError] = js.native
  /**
    * Lists the AWS Cost and Usage reports available to this account.
    */
  def describeReportDefinitions(params: DescribeReportDefinitionsRequest): Request[DescribeReportDefinitionsResponse, AWSError] = js.native
  def describeReportDefinitions(
    params: DescribeReportDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReportDefinitionsResponse, Unit]
  ): Request[DescribeReportDefinitionsResponse, AWSError] = js.native
  
  /**
    * Allows you to programatically update your report preferences.
    */
  def modifyReportDefinition(): Request[ModifyReportDefinitionResponse, AWSError] = js.native
  def modifyReportDefinition(callback: js.Function2[/* err */ AWSError, /* data */ ModifyReportDefinitionResponse, Unit]): Request[ModifyReportDefinitionResponse, AWSError] = js.native
  /**
    * Allows you to programatically update your report preferences.
    */
  def modifyReportDefinition(params: ModifyReportDefinitionRequest): Request[ModifyReportDefinitionResponse, AWSError] = js.native
  def modifyReportDefinition(
    params: ModifyReportDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReportDefinitionResponse, Unit]
  ): Request[ModifyReportDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates a new report using the description that you provide.
    */
  def putReportDefinition(): Request[PutReportDefinitionResponse, AWSError] = js.native
  def putReportDefinition(callback: js.Function2[/* err */ AWSError, /* data */ PutReportDefinitionResponse, Unit]): Request[PutReportDefinitionResponse, AWSError] = js.native
  /**
    * Creates a new report using the description that you provide.
    */
  def putReportDefinition(params: PutReportDefinitionRequest): Request[PutReportDefinitionResponse, AWSError] = js.native
  def putReportDefinition(
    params: PutReportDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutReportDefinitionResponse, Unit]
  ): Request[PutReportDefinitionResponse, AWSError] = js.native
}
