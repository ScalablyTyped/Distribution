package typings.awsSdk.macieMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Macie extends Service {
  @JSName("config")
  var config_Macie: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a specified AWS account with Amazon Macie as a member account.
    */
  def associateMemberAccount(): Request[js.Object, AWSError] = js.native
  def associateMemberAccount(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates a specified AWS account with Amazon Macie as a member account.
    */
  def associateMemberAccount(params: AssociateMemberAccountRequest): Request[js.Object, AWSError] = js.native
  def associateMemberAccount(
    params: AssociateMemberAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
    */
  def associateS3Resources(): Request[AssociateS3ResourcesResult, AWSError] = js.native
  def associateS3Resources(callback: js.Function2[/* err */ AWSError, /* data */ AssociateS3ResourcesResult, Unit]): Request[AssociateS3ResourcesResult, AWSError] = js.native
  /**
    * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
    */
  def associateS3Resources(params: AssociateS3ResourcesRequest): Request[AssociateS3ResourcesResult, AWSError] = js.native
  def associateS3Resources(
    params: AssociateS3ResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateS3ResourcesResult, Unit]
  ): Request[AssociateS3ResourcesResult, AWSError] = js.native
  /**
    * Removes the specified member account from Amazon Macie.
    */
  def disassociateMemberAccount(): Request[js.Object, AWSError] = js.native
  def disassociateMemberAccount(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified member account from Amazon Macie.
    */
  def disassociateMemberAccount(params: DisassociateMemberAccountRequest): Request[js.Object, AWSError] = js.native
  def disassociateMemberAccount(
    params: DisassociateMemberAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
    */
  def disassociateS3Resources(): Request[DisassociateS3ResourcesResult, AWSError] = js.native
  def disassociateS3Resources(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateS3ResourcesResult, Unit]): Request[DisassociateS3ResourcesResult, AWSError] = js.native
  /**
    * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
    */
  def disassociateS3Resources(params: DisassociateS3ResourcesRequest): Request[DisassociateS3ResourcesResult, AWSError] = js.native
  def disassociateS3Resources(
    params: DisassociateS3ResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateS3ResourcesResult, Unit]
  ): Request[DisassociateS3ResourcesResult, AWSError] = js.native
  /**
    * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
    */
  def listMemberAccounts(): Request[ListMemberAccountsResult, AWSError] = js.native
  def listMemberAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListMemberAccountsResult, Unit]): Request[ListMemberAccountsResult, AWSError] = js.native
  /**
    * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
    */
  def listMemberAccounts(params: ListMemberAccountsRequest): Request[ListMemberAccountsResult, AWSError] = js.native
  def listMemberAccounts(
    params: ListMemberAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMemberAccountsResult, Unit]
  ): Request[ListMemberAccountsResult, AWSError] = js.native
  /**
    * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action lists the S3 resources associated with Amazon Macie for the specified member account. 
    */
  def listS3Resources(): Request[ListS3ResourcesResult, AWSError] = js.native
  def listS3Resources(callback: js.Function2[/* err */ AWSError, /* data */ ListS3ResourcesResult, Unit]): Request[ListS3ResourcesResult, AWSError] = js.native
  /**
    * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action lists the S3 resources associated with Amazon Macie for the specified member account. 
    */
  def listS3Resources(params: ListS3ResourcesRequest): Request[ListS3ResourcesResult, AWSError] = js.native
  def listS3Resources(
    params: ListS3ResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListS3ResourcesResult, Unit]
  ): Request[ListS3ResourcesResult, AWSError] = js.native
  /**
    * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the specified member account. 
    */
  def updateS3Resources(): Request[UpdateS3ResourcesResult, AWSError] = js.native
  def updateS3Resources(callback: js.Function2[/* err */ AWSError, /* data */ UpdateS3ResourcesResult, Unit]): Request[UpdateS3ResourcesResult, AWSError] = js.native
  /**
    * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the specified member account. 
    */
  def updateS3Resources(params: UpdateS3ResourcesRequest): Request[UpdateS3ResourcesResult, AWSError] = js.native
  def updateS3Resources(
    params: UpdateS3ResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateS3ResourcesResult, Unit]
  ): Request[UpdateS3ResourcesResult, AWSError] = js.native
}

