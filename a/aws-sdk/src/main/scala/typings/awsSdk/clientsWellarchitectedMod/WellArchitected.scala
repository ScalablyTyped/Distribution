package typings.awsSdk.clientsWellarchitectedMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WellArchitected extends Service {
  
  /**
    * Associate a lens to a workload. Up to 10 lenses can be associated with a workload in a single API operation. A maximum of 20 lenses can be associated with a workload.   Disclaimer  By accessing and/or applying custom lenses created by another Amazon Web Services user or account, you acknowledge that custom lenses created by other users and shared with you are Third Party Content as defined in the Amazon Web Services Customer Agreement.  
    */
  def associateLenses(): Request[js.Object, AWSError] = js.native
  def associateLenses(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associate a lens to a workload. Up to 10 lenses can be associated with a workload in a single API operation. A maximum of 20 lenses can be associated with a workload.   Disclaimer  By accessing and/or applying custom lenses created by another Amazon Web Services user or account, you acknowledge that custom lenses created by other users and shared with you are Third Party Content as defined in the Amazon Web Services Customer Agreement.  
    */
  def associateLenses(params: AssociateLensesInput): Request[js.Object, AWSError] = js.native
  def associateLenses(
    params: AssociateLensesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_WellArchitected: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create a lens share. The owner of a lens can share it with other Amazon Web Services accounts, users, an organization, and organizational units (OUs) in the same Amazon Web Services Region. Lenses provided by Amazon Web Services (Amazon Web Services Official Content) cannot be shared.  Shared access to a lens is not removed until the lens invitation is deleted. If you share a lens with an organization or OU, all accounts in the organization or OU are granted access to the lens. For more information, see Sharing a custom lens in the Well-Architected Tool User Guide.   Disclaimer  By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services will make your custom lenses available to those other accounts. Those other accounts may continue to access and use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or terminate your Amazon Web Services account. 
    */
  def createLensShare(): Request[CreateLensShareOutput, AWSError] = js.native
  def createLensShare(callback: js.Function2[/* err */ AWSError, /* data */ CreateLensShareOutput, Unit]): Request[CreateLensShareOutput, AWSError] = js.native
  /**
    * Create a lens share. The owner of a lens can share it with other Amazon Web Services accounts, users, an organization, and organizational units (OUs) in the same Amazon Web Services Region. Lenses provided by Amazon Web Services (Amazon Web Services Official Content) cannot be shared.  Shared access to a lens is not removed until the lens invitation is deleted. If you share a lens with an organization or OU, all accounts in the organization or OU are granted access to the lens. For more information, see Sharing a custom lens in the Well-Architected Tool User Guide.   Disclaimer  By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services will make your custom lenses available to those other accounts. Those other accounts may continue to access and use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or terminate your Amazon Web Services account. 
    */
  def createLensShare(params: CreateLensShareInput): Request[CreateLensShareOutput, AWSError] = js.native
  def createLensShare(
    params: CreateLensShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLensShareOutput, Unit]
  ): Request[CreateLensShareOutput, AWSError] = js.native
  
  /**
    * Create a new lens version. A lens can have up to 100 versions. Use this operation to publish a new lens version after you have imported a lens. The LensAlias is used to identify the lens to be published. The owner of a lens can share the lens with other Amazon Web Services accounts and users in the same Amazon Web Services Region. Only the owner of a lens can delete it. 
    */
  def createLensVersion(): Request[CreateLensVersionOutput, AWSError] = js.native
  def createLensVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateLensVersionOutput, Unit]): Request[CreateLensVersionOutput, AWSError] = js.native
  /**
    * Create a new lens version. A lens can have up to 100 versions. Use this operation to publish a new lens version after you have imported a lens. The LensAlias is used to identify the lens to be published. The owner of a lens can share the lens with other Amazon Web Services accounts and users in the same Amazon Web Services Region. Only the owner of a lens can delete it. 
    */
  def createLensVersion(params: CreateLensVersionInput): Request[CreateLensVersionOutput, AWSError] = js.native
  def createLensVersion(
    params: CreateLensVersionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLensVersionOutput, Unit]
  ): Request[CreateLensVersionOutput, AWSError] = js.native
  
  /**
    * Create a milestone for an existing workload.
    */
  def createMilestone(): Request[CreateMilestoneOutput, AWSError] = js.native
  def createMilestone(callback: js.Function2[/* err */ AWSError, /* data */ CreateMilestoneOutput, Unit]): Request[CreateMilestoneOutput, AWSError] = js.native
  /**
    * Create a milestone for an existing workload.
    */
  def createMilestone(params: CreateMilestoneInput): Request[CreateMilestoneOutput, AWSError] = js.native
  def createMilestone(
    params: CreateMilestoneInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMilestoneOutput, Unit]
  ): Request[CreateMilestoneOutput, AWSError] = js.native
  
  /**
    * Create a new workload. The owner of a workload can share the workload with other Amazon Web Services accounts, users, an organization, and organizational units (OUs) in the same Amazon Web Services Region. Only the owner of a workload can delete it. For more information, see Defining a Workload in the Well-Architected Tool User Guide.  Either AwsRegions, NonAwsRegions, or both must be specified when creating a workload. You also must specify ReviewOwner, even though the parameter is listed as not being required in the following section.  
    */
  def createWorkload(): Request[CreateWorkloadOutput, AWSError] = js.native
  def createWorkload(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkloadOutput, Unit]): Request[CreateWorkloadOutput, AWSError] = js.native
  /**
    * Create a new workload. The owner of a workload can share the workload with other Amazon Web Services accounts, users, an organization, and organizational units (OUs) in the same Amazon Web Services Region. Only the owner of a workload can delete it. For more information, see Defining a Workload in the Well-Architected Tool User Guide.  Either AwsRegions, NonAwsRegions, or both must be specified when creating a workload. You also must specify ReviewOwner, even though the parameter is listed as not being required in the following section.  
    */
  def createWorkload(params: CreateWorkloadInput): Request[CreateWorkloadOutput, AWSError] = js.native
  def createWorkload(
    params: CreateWorkloadInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkloadOutput, Unit]
  ): Request[CreateWorkloadOutput, AWSError] = js.native
  
  /**
    * Create a workload share. The owner of a workload can share it with other Amazon Web Services accounts and users in the same Amazon Web Services Region. Shared access to a workload is not removed until the workload invitation is deleted. If you share a workload with an organization or OU, all accounts in the organization or OU are granted access to the workload. For more information, see Sharing a workload in the Well-Architected Tool User Guide.
    */
  def createWorkloadShare(): Request[CreateWorkloadShareOutput, AWSError] = js.native
  def createWorkloadShare(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkloadShareOutput, Unit]): Request[CreateWorkloadShareOutput, AWSError] = js.native
  /**
    * Create a workload share. The owner of a workload can share it with other Amazon Web Services accounts and users in the same Amazon Web Services Region. Shared access to a workload is not removed until the workload invitation is deleted. If you share a workload with an organization or OU, all accounts in the organization or OU are granted access to the workload. For more information, see Sharing a workload in the Well-Architected Tool User Guide.
    */
  def createWorkloadShare(params: CreateWorkloadShareInput): Request[CreateWorkloadShareOutput, AWSError] = js.native
  def createWorkloadShare(
    params: CreateWorkloadShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkloadShareOutput, Unit]
  ): Request[CreateWorkloadShareOutput, AWSError] = js.native
  
  /**
    * Delete an existing lens. Only the owner of a lens can delete it. After the lens is deleted, Amazon Web Services accounts and users that you shared the lens with can continue to use it, but they will no longer be able to apply it to new workloads.    Disclaimer  By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services will make your custom lenses available to those other accounts. Those other accounts may continue to access and use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or terminate your Amazon Web Services account. 
    */
  def deleteLens(): Request[js.Object, AWSError] = js.native
  def deleteLens(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an existing lens. Only the owner of a lens can delete it. After the lens is deleted, Amazon Web Services accounts and users that you shared the lens with can continue to use it, but they will no longer be able to apply it to new workloads.    Disclaimer  By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services will make your custom lenses available to those other accounts. Those other accounts may continue to access and use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or terminate your Amazon Web Services account. 
    */
  def deleteLens(params: DeleteLensInput): Request[js.Object, AWSError] = js.native
  def deleteLens(params: DeleteLensInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete a lens share. After the lens share is deleted, Amazon Web Services accounts, users, organizations, and organizational units (OUs) that you shared the lens with can continue to use it, but they will no longer be able to apply it to new workloads.   Disclaimer  By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services will make your custom lenses available to those other accounts. Those other accounts may continue to access and use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or terminate your Amazon Web Services account. 
    */
  def deleteLensShare(): Request[js.Object, AWSError] = js.native
  def deleteLensShare(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a lens share. After the lens share is deleted, Amazon Web Services accounts, users, organizations, and organizational units (OUs) that you shared the lens with can continue to use it, but they will no longer be able to apply it to new workloads.   Disclaimer  By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services will make your custom lenses available to those other accounts. Those other accounts may continue to access and use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or terminate your Amazon Web Services account. 
    */
  def deleteLensShare(params: DeleteLensShareInput): Request[js.Object, AWSError] = js.native
  def deleteLensShare(
    params: DeleteLensShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete an existing workload.
    */
  def deleteWorkload(): Request[js.Object, AWSError] = js.native
  def deleteWorkload(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an existing workload.
    */
  def deleteWorkload(params: DeleteWorkloadInput): Request[js.Object, AWSError] = js.native
  def deleteWorkload(
    params: DeleteWorkloadInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete a workload share.
    */
  def deleteWorkloadShare(): Request[js.Object, AWSError] = js.native
  def deleteWorkloadShare(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a workload share.
    */
  def deleteWorkloadShare(params: DeleteWorkloadShareInput): Request[js.Object, AWSError] = js.native
  def deleteWorkloadShare(
    params: DeleteWorkloadShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disassociate a lens from a workload. Up to 10 lenses can be disassociated from a workload in a single API operation.  The Amazon Web Services Well-Architected Framework lens (wellarchitected) cannot be removed from a workload. 
    */
  def disassociateLenses(): Request[js.Object, AWSError] = js.native
  def disassociateLenses(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociate a lens from a workload. Up to 10 lenses can be disassociated from a workload in a single API operation.  The Amazon Web Services Well-Architected Framework lens (wellarchitected) cannot be removed from a workload. 
    */
  def disassociateLenses(params: DisassociateLensesInput): Request[js.Object, AWSError] = js.native
  def disassociateLenses(
    params: DisassociateLensesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Export an existing lens. Only the owner of a lens can export it. Lenses provided by Amazon Web Services (Amazon Web Services Official Content) cannot be exported. Lenses are defined in JSON. For more information, see JSON format specification in the Well-Architected Tool User Guide.   Disclaimer  Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals in or via your custom lenses. If your custom lens or those shared with you and used in your account do include or collect PII you are responsible for: ensuring that the included PII is processed in accordance with applicable law, providing adequate privacy notices, and obtaining necessary consents for processing such data. 
    */
  def exportLens(): Request[ExportLensOutput, AWSError] = js.native
  def exportLens(callback: js.Function2[/* err */ AWSError, /* data */ ExportLensOutput, Unit]): Request[ExportLensOutput, AWSError] = js.native
  /**
    * Export an existing lens. Only the owner of a lens can export it. Lenses provided by Amazon Web Services (Amazon Web Services Official Content) cannot be exported. Lenses are defined in JSON. For more information, see JSON format specification in the Well-Architected Tool User Guide.   Disclaimer  Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals in or via your custom lenses. If your custom lens or those shared with you and used in your account do include or collect PII you are responsible for: ensuring that the included PII is processed in accordance with applicable law, providing adequate privacy notices, and obtaining necessary consents for processing such data. 
    */
  def exportLens(params: ExportLensInput): Request[ExportLensOutput, AWSError] = js.native
  def exportLens(
    params: ExportLensInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportLensOutput, Unit]
  ): Request[ExportLensOutput, AWSError] = js.native
  
  /**
    * Get the answer to a specific question in a workload review.
    */
  def getAnswer(): Request[GetAnswerOutput, AWSError] = js.native
  def getAnswer(callback: js.Function2[/* err */ AWSError, /* data */ GetAnswerOutput, Unit]): Request[GetAnswerOutput, AWSError] = js.native
  /**
    * Get the answer to a specific question in a workload review.
    */
  def getAnswer(params: GetAnswerInput): Request[GetAnswerOutput, AWSError] = js.native
  def getAnswer(
    params: GetAnswerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnswerOutput, Unit]
  ): Request[GetAnswerOutput, AWSError] = js.native
  
  /**
    * Get a consolidated report of your workloads. You can optionally choose to include workloads that have been shared with you.
    */
  def getConsolidatedReport(): Request[GetConsolidatedReportOutput, AWSError] = js.native
  def getConsolidatedReport(callback: js.Function2[/* err */ AWSError, /* data */ GetConsolidatedReportOutput, Unit]): Request[GetConsolidatedReportOutput, AWSError] = js.native
  /**
    * Get a consolidated report of your workloads. You can optionally choose to include workloads that have been shared with you.
    */
  def getConsolidatedReport(params: GetConsolidatedReportInput): Request[GetConsolidatedReportOutput, AWSError] = js.native
  def getConsolidatedReport(
    params: GetConsolidatedReportInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConsolidatedReportOutput, Unit]
  ): Request[GetConsolidatedReportOutput, AWSError] = js.native
  
  /**
    * Get an existing lens.
    */
  def getLens(): Request[GetLensOutput, AWSError] = js.native
  def getLens(callback: js.Function2[/* err */ AWSError, /* data */ GetLensOutput, Unit]): Request[GetLensOutput, AWSError] = js.native
  /**
    * Get an existing lens.
    */
  def getLens(params: GetLensInput): Request[GetLensOutput, AWSError] = js.native
  def getLens(params: GetLensInput, callback: js.Function2[/* err */ AWSError, /* data */ GetLensOutput, Unit]): Request[GetLensOutput, AWSError] = js.native
  
  /**
    * Get lens review.
    */
  def getLensReview(): Request[GetLensReviewOutput, AWSError] = js.native
  def getLensReview(callback: js.Function2[/* err */ AWSError, /* data */ GetLensReviewOutput, Unit]): Request[GetLensReviewOutput, AWSError] = js.native
  /**
    * Get lens review.
    */
  def getLensReview(params: GetLensReviewInput): Request[GetLensReviewOutput, AWSError] = js.native
  def getLensReview(
    params: GetLensReviewInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLensReviewOutput, Unit]
  ): Request[GetLensReviewOutput, AWSError] = js.native
  
  /**
    * Get lens review report.
    */
  def getLensReviewReport(): Request[GetLensReviewReportOutput, AWSError] = js.native
  def getLensReviewReport(callback: js.Function2[/* err */ AWSError, /* data */ GetLensReviewReportOutput, Unit]): Request[GetLensReviewReportOutput, AWSError] = js.native
  /**
    * Get lens review report.
    */
  def getLensReviewReport(params: GetLensReviewReportInput): Request[GetLensReviewReportOutput, AWSError] = js.native
  def getLensReviewReport(
    params: GetLensReviewReportInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLensReviewReportOutput, Unit]
  ): Request[GetLensReviewReportOutput, AWSError] = js.native
  
  /**
    * Get lens version differences.
    */
  def getLensVersionDifference(): Request[GetLensVersionDifferenceOutput, AWSError] = js.native
  def getLensVersionDifference(callback: js.Function2[/* err */ AWSError, /* data */ GetLensVersionDifferenceOutput, Unit]): Request[GetLensVersionDifferenceOutput, AWSError] = js.native
  /**
    * Get lens version differences.
    */
  def getLensVersionDifference(params: GetLensVersionDifferenceInput): Request[GetLensVersionDifferenceOutput, AWSError] = js.native
  def getLensVersionDifference(
    params: GetLensVersionDifferenceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLensVersionDifferenceOutput, Unit]
  ): Request[GetLensVersionDifferenceOutput, AWSError] = js.native
  
  /**
    * Get a milestone for an existing workload.
    */
  def getMilestone(): Request[GetMilestoneOutput, AWSError] = js.native
  def getMilestone(callback: js.Function2[/* err */ AWSError, /* data */ GetMilestoneOutput, Unit]): Request[GetMilestoneOutput, AWSError] = js.native
  /**
    * Get a milestone for an existing workload.
    */
  def getMilestone(params: GetMilestoneInput): Request[GetMilestoneOutput, AWSError] = js.native
  def getMilestone(
    params: GetMilestoneInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMilestoneOutput, Unit]
  ): Request[GetMilestoneOutput, AWSError] = js.native
  
  /**
    * Get an existing workload.
    */
  def getWorkload(): Request[GetWorkloadOutput, AWSError] = js.native
  def getWorkload(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkloadOutput, Unit]): Request[GetWorkloadOutput, AWSError] = js.native
  /**
    * Get an existing workload.
    */
  def getWorkload(params: GetWorkloadInput): Request[GetWorkloadOutput, AWSError] = js.native
  def getWorkload(
    params: GetWorkloadInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkloadOutput, Unit]
  ): Request[GetWorkloadOutput, AWSError] = js.native
  
  /**
    * Import a new custom lens or update an existing custom lens. To update an existing custom lens, specify its ARN as the LensAlias. If no ARN is specified, a new custom lens is created. The new or updated lens will have a status of DRAFT. The lens cannot be applied to workloads or shared with other Amazon Web Services accounts until it's published with CreateLensVersion. Lenses are defined in JSON. For more information, see JSON format specification in the Well-Architected Tool User Guide. A custom lens cannot exceed 500 KB in size.   Disclaimer  Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals in or via your custom lenses. If your custom lens or those shared with you and used in your account do include or collect PII you are responsible for: ensuring that the included PII is processed in accordance with applicable law, providing adequate privacy notices, and obtaining necessary consents for processing such data. 
    */
  def importLens(): Request[ImportLensOutput, AWSError] = js.native
  def importLens(callback: js.Function2[/* err */ AWSError, /* data */ ImportLensOutput, Unit]): Request[ImportLensOutput, AWSError] = js.native
  /**
    * Import a new custom lens or update an existing custom lens. To update an existing custom lens, specify its ARN as the LensAlias. If no ARN is specified, a new custom lens is created. The new or updated lens will have a status of DRAFT. The lens cannot be applied to workloads or shared with other Amazon Web Services accounts until it's published with CreateLensVersion. Lenses are defined in JSON. For more information, see JSON format specification in the Well-Architected Tool User Guide. A custom lens cannot exceed 500 KB in size.   Disclaimer  Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals in or via your custom lenses. If your custom lens or those shared with you and used in your account do include or collect PII you are responsible for: ensuring that the included PII is processed in accordance with applicable law, providing adequate privacy notices, and obtaining necessary consents for processing such data. 
    */
  def importLens(params: ImportLensInput): Request[ImportLensOutput, AWSError] = js.native
  def importLens(
    params: ImportLensInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportLensOutput, Unit]
  ): Request[ImportLensOutput, AWSError] = js.native
  
  /**
    * List of answers for a particular workload and lens.
    */
  def listAnswers(): Request[ListAnswersOutput, AWSError] = js.native
  def listAnswers(callback: js.Function2[/* err */ AWSError, /* data */ ListAnswersOutput, Unit]): Request[ListAnswersOutput, AWSError] = js.native
  /**
    * List of answers for a particular workload and lens.
    */
  def listAnswers(params: ListAnswersInput): Request[ListAnswersOutput, AWSError] = js.native
  def listAnswers(
    params: ListAnswersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnswersOutput, Unit]
  ): Request[ListAnswersOutput, AWSError] = js.native
  
  /**
    * List of Trusted Advisor check details by account related to the workload.
    */
  def listCheckDetails(): Request[ListCheckDetailsOutput, AWSError] = js.native
  def listCheckDetails(callback: js.Function2[/* err */ AWSError, /* data */ ListCheckDetailsOutput, Unit]): Request[ListCheckDetailsOutput, AWSError] = js.native
  /**
    * List of Trusted Advisor check details by account related to the workload.
    */
  def listCheckDetails(params: ListCheckDetailsInput): Request[ListCheckDetailsOutput, AWSError] = js.native
  def listCheckDetails(
    params: ListCheckDetailsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCheckDetailsOutput, Unit]
  ): Request[ListCheckDetailsOutput, AWSError] = js.native
  
  /**
    * List of Trusted Advisor checks summarized for all accounts related to the workload.
    */
  def listCheckSummaries(): Request[ListCheckSummariesOutput, AWSError] = js.native
  def listCheckSummaries(callback: js.Function2[/* err */ AWSError, /* data */ ListCheckSummariesOutput, Unit]): Request[ListCheckSummariesOutput, AWSError] = js.native
  /**
    * List of Trusted Advisor checks summarized for all accounts related to the workload.
    */
  def listCheckSummaries(params: ListCheckSummariesInput): Request[ListCheckSummariesOutput, AWSError] = js.native
  def listCheckSummaries(
    params: ListCheckSummariesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCheckSummariesOutput, Unit]
  ): Request[ListCheckSummariesOutput, AWSError] = js.native
  
  /**
    * List lens review improvements.
    */
  def listLensReviewImprovements(): Request[ListLensReviewImprovementsOutput, AWSError] = js.native
  def listLensReviewImprovements(callback: js.Function2[/* err */ AWSError, /* data */ ListLensReviewImprovementsOutput, Unit]): Request[ListLensReviewImprovementsOutput, AWSError] = js.native
  /**
    * List lens review improvements.
    */
  def listLensReviewImprovements(params: ListLensReviewImprovementsInput): Request[ListLensReviewImprovementsOutput, AWSError] = js.native
  def listLensReviewImprovements(
    params: ListLensReviewImprovementsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLensReviewImprovementsOutput, Unit]
  ): Request[ListLensReviewImprovementsOutput, AWSError] = js.native
  
  /**
    * List lens reviews for a particular workload.
    */
  def listLensReviews(): Request[ListLensReviewsOutput, AWSError] = js.native
  def listLensReviews(callback: js.Function2[/* err */ AWSError, /* data */ ListLensReviewsOutput, Unit]): Request[ListLensReviewsOutput, AWSError] = js.native
  /**
    * List lens reviews for a particular workload.
    */
  def listLensReviews(params: ListLensReviewsInput): Request[ListLensReviewsOutput, AWSError] = js.native
  def listLensReviews(
    params: ListLensReviewsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLensReviewsOutput, Unit]
  ): Request[ListLensReviewsOutput, AWSError] = js.native
  
  /**
    * List the lens shares associated with the lens.
    */
  def listLensShares(): Request[ListLensSharesOutput, AWSError] = js.native
  def listLensShares(callback: js.Function2[/* err */ AWSError, /* data */ ListLensSharesOutput, Unit]): Request[ListLensSharesOutput, AWSError] = js.native
  /**
    * List the lens shares associated with the lens.
    */
  def listLensShares(params: ListLensSharesInput): Request[ListLensSharesOutput, AWSError] = js.native
  def listLensShares(
    params: ListLensSharesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLensSharesOutput, Unit]
  ): Request[ListLensSharesOutput, AWSError] = js.native
  
  /**
    * List the available lenses.
    */
  def listLenses(): Request[ListLensesOutput, AWSError] = js.native
  def listLenses(callback: js.Function2[/* err */ AWSError, /* data */ ListLensesOutput, Unit]): Request[ListLensesOutput, AWSError] = js.native
  /**
    * List the available lenses.
    */
  def listLenses(params: ListLensesInput): Request[ListLensesOutput, AWSError] = js.native
  def listLenses(
    params: ListLensesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLensesOutput, Unit]
  ): Request[ListLensesOutput, AWSError] = js.native
  
  /**
    * List all milestones for an existing workload.
    */
  def listMilestones(): Request[ListMilestonesOutput, AWSError] = js.native
  def listMilestones(callback: js.Function2[/* err */ AWSError, /* data */ ListMilestonesOutput, Unit]): Request[ListMilestonesOutput, AWSError] = js.native
  /**
    * List all milestones for an existing workload.
    */
  def listMilestones(params: ListMilestonesInput): Request[ListMilestonesOutput, AWSError] = js.native
  def listMilestones(
    params: ListMilestonesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMilestonesOutput, Unit]
  ): Request[ListMilestonesOutput, AWSError] = js.native
  
  /**
    * List lens notifications.
    */
  def listNotifications(): Request[ListNotificationsOutput, AWSError] = js.native
  def listNotifications(callback: js.Function2[/* err */ AWSError, /* data */ ListNotificationsOutput, Unit]): Request[ListNotificationsOutput, AWSError] = js.native
  /**
    * List lens notifications.
    */
  def listNotifications(params: ListNotificationsInput): Request[ListNotificationsOutput, AWSError] = js.native
  def listNotifications(
    params: ListNotificationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotificationsOutput, Unit]
  ): Request[ListNotificationsOutput, AWSError] = js.native
  
  /**
    * List the workload invitations.
    */
  def listShareInvitations(): Request[ListShareInvitationsOutput, AWSError] = js.native
  def listShareInvitations(callback: js.Function2[/* err */ AWSError, /* data */ ListShareInvitationsOutput, Unit]): Request[ListShareInvitationsOutput, AWSError] = js.native
  /**
    * List the workload invitations.
    */
  def listShareInvitations(params: ListShareInvitationsInput): Request[ListShareInvitationsOutput, AWSError] = js.native
  def listShareInvitations(
    params: ListShareInvitationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListShareInvitationsOutput, Unit]
  ): Request[ListShareInvitationsOutput, AWSError] = js.native
  
  /**
    * List the tags for a resource.  The WorkloadArn parameter can be either a workload ARN or a custom lens ARN. 
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * List the tags for a resource.  The WorkloadArn parameter can be either a workload ARN or a custom lens ARN. 
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * List the workload shares associated with the workload.
    */
  def listWorkloadShares(): Request[ListWorkloadSharesOutput, AWSError] = js.native
  def listWorkloadShares(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkloadSharesOutput, Unit]): Request[ListWorkloadSharesOutput, AWSError] = js.native
  /**
    * List the workload shares associated with the workload.
    */
  def listWorkloadShares(params: ListWorkloadSharesInput): Request[ListWorkloadSharesOutput, AWSError] = js.native
  def listWorkloadShares(
    params: ListWorkloadSharesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkloadSharesOutput, Unit]
  ): Request[ListWorkloadSharesOutput, AWSError] = js.native
  
  /**
    * Paginated list of workloads.
    */
  def listWorkloads(): Request[ListWorkloadsOutput, AWSError] = js.native
  def listWorkloads(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkloadsOutput, Unit]): Request[ListWorkloadsOutput, AWSError] = js.native
  /**
    * Paginated list of workloads.
    */
  def listWorkloads(params: ListWorkloadsInput): Request[ListWorkloadsOutput, AWSError] = js.native
  def listWorkloads(
    params: ListWorkloadsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkloadsOutput, Unit]
  ): Request[ListWorkloadsOutput, AWSError] = js.native
  
  /**
    * Adds one or more tags to the specified resource.  The WorkloadArn parameter can be either a workload ARN or a custom lens ARN. 
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds one or more tags to the specified resource.  The WorkloadArn parameter can be either a workload ARN or a custom lens ARN. 
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Deletes specified tags from a resource.  The WorkloadArn parameter can be either a workload ARN or a custom lens ARN.  To specify multiple tags, use separate tagKeys parameters, for example:  DELETE /tags/WorkloadArn?tagKeys=key1&amp;tagKeys=key2 
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.  The WorkloadArn parameter can be either a workload ARN or a custom lens ARN.  To specify multiple tags, use separate tagKeys parameters, for example:  DELETE /tags/WorkloadArn?tagKeys=key1&amp;tagKeys=key2 
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Update the answer to a specific question in a workload review.
    */
  def updateAnswer(): Request[UpdateAnswerOutput, AWSError] = js.native
  def updateAnswer(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnswerOutput, Unit]): Request[UpdateAnswerOutput, AWSError] = js.native
  /**
    * Update the answer to a specific question in a workload review.
    */
  def updateAnswer(params: UpdateAnswerInput): Request[UpdateAnswerOutput, AWSError] = js.native
  def updateAnswer(
    params: UpdateAnswerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnswerOutput, Unit]
  ): Request[UpdateAnswerOutput, AWSError] = js.native
  
  /**
    * Updates whether the Amazon Web Services account is opted into organization sharing and discovery integration features.
    */
  def updateGlobalSettings(): Request[js.Object, AWSError] = js.native
  def updateGlobalSettings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates whether the Amazon Web Services account is opted into organization sharing and discovery integration features.
    */
  def updateGlobalSettings(params: UpdateGlobalSettingsInput): Request[js.Object, AWSError] = js.native
  def updateGlobalSettings(
    params: UpdateGlobalSettingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Update lens review for a particular workload.
    */
  def updateLensReview(): Request[UpdateLensReviewOutput, AWSError] = js.native
  def updateLensReview(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLensReviewOutput, Unit]): Request[UpdateLensReviewOutput, AWSError] = js.native
  /**
    * Update lens review for a particular workload.
    */
  def updateLensReview(params: UpdateLensReviewInput): Request[UpdateLensReviewOutput, AWSError] = js.native
  def updateLensReview(
    params: UpdateLensReviewInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLensReviewOutput, Unit]
  ): Request[UpdateLensReviewOutput, AWSError] = js.native
  
  /**
    * Update a workload or custom lens share invitation.  This API operation can be called independently of any resource. Previous documentation implied that a workload ARN must be specified. 
    */
  def updateShareInvitation(): Request[UpdateShareInvitationOutput, AWSError] = js.native
  def updateShareInvitation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateShareInvitationOutput, Unit]): Request[UpdateShareInvitationOutput, AWSError] = js.native
  /**
    * Update a workload or custom lens share invitation.  This API operation can be called independently of any resource. Previous documentation implied that a workload ARN must be specified. 
    */
  def updateShareInvitation(params: UpdateShareInvitationInput): Request[UpdateShareInvitationOutput, AWSError] = js.native
  def updateShareInvitation(
    params: UpdateShareInvitationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateShareInvitationOutput, Unit]
  ): Request[UpdateShareInvitationOutput, AWSError] = js.native
  
  /**
    * Update an existing workload.
    */
  def updateWorkload(): Request[UpdateWorkloadOutput, AWSError] = js.native
  def updateWorkload(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkloadOutput, Unit]): Request[UpdateWorkloadOutput, AWSError] = js.native
  /**
    * Update an existing workload.
    */
  def updateWorkload(params: UpdateWorkloadInput): Request[UpdateWorkloadOutput, AWSError] = js.native
  def updateWorkload(
    params: UpdateWorkloadInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkloadOutput, Unit]
  ): Request[UpdateWorkloadOutput, AWSError] = js.native
  
  /**
    * Update a workload share.
    */
  def updateWorkloadShare(): Request[UpdateWorkloadShareOutput, AWSError] = js.native
  def updateWorkloadShare(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkloadShareOutput, Unit]): Request[UpdateWorkloadShareOutput, AWSError] = js.native
  /**
    * Update a workload share.
    */
  def updateWorkloadShare(params: UpdateWorkloadShareInput): Request[UpdateWorkloadShareOutput, AWSError] = js.native
  def updateWorkloadShare(
    params: UpdateWorkloadShareInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkloadShareOutput, Unit]
  ): Request[UpdateWorkloadShareOutput, AWSError] = js.native
  
  /**
    * Upgrade lens review for a particular workload.
    */
  def upgradeLensReview(): Request[js.Object, AWSError] = js.native
  def upgradeLensReview(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Upgrade lens review for a particular workload.
    */
  def upgradeLensReview(params: UpgradeLensReviewInput): Request[js.Object, AWSError] = js.native
  def upgradeLensReview(
    params: UpgradeLensReviewInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
