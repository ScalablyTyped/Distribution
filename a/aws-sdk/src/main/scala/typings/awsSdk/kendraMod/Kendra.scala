package typings.awsSdk.kendraMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kendra extends Service {
  
  /**
    * Grants users or groups in your Amazon Web Services SSO identity source access to your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def associateEntitiesToExperience(): Request[AssociateEntitiesToExperienceResponse, AWSError] = js.native
  def associateEntitiesToExperience(callback: js.Function2[/* err */ AWSError, /* data */ AssociateEntitiesToExperienceResponse, Unit]): Request[AssociateEntitiesToExperienceResponse, AWSError] = js.native
  /**
    * Grants users or groups in your Amazon Web Services SSO identity source access to your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def associateEntitiesToExperience(params: AssociateEntitiesToExperienceRequest): Request[AssociateEntitiesToExperienceResponse, AWSError] = js.native
  def associateEntitiesToExperience(
    params: AssociateEntitiesToExperienceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateEntitiesToExperienceResponse, Unit]
  ): Request[AssociateEntitiesToExperienceResponse, AWSError] = js.native
  
  /**
    * Defines the specific permissions of users or groups in your Amazon Web Services SSO identity source with access to your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def associatePersonasToEntities(): Request[AssociatePersonasToEntitiesResponse, AWSError] = js.native
  def associatePersonasToEntities(callback: js.Function2[/* err */ AWSError, /* data */ AssociatePersonasToEntitiesResponse, Unit]): Request[AssociatePersonasToEntitiesResponse, AWSError] = js.native
  /**
    * Defines the specific permissions of users or groups in your Amazon Web Services SSO identity source with access to your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def associatePersonasToEntities(params: AssociatePersonasToEntitiesRequest): Request[AssociatePersonasToEntitiesResponse, AWSError] = js.native
  def associatePersonasToEntities(
    params: AssociatePersonasToEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociatePersonasToEntitiesResponse, Unit]
  ): Request[AssociatePersonasToEntitiesResponse, AWSError] = js.native
  
  /**
    * Removes one or more documents from an index. The documents must have been added with the BatchPutDocument API. The documents are deleted asynchronously. You can see the progress of the deletion by using Amazon Web Services CloudWatch. Any error messages related to the processing of the batch are sent to you CloudWatch log.
    */
  def batchDeleteDocument(): Request[BatchDeleteDocumentResponse, AWSError] = js.native
  def batchDeleteDocument(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteDocumentResponse, Unit]): Request[BatchDeleteDocumentResponse, AWSError] = js.native
  /**
    * Removes one or more documents from an index. The documents must have been added with the BatchPutDocument API. The documents are deleted asynchronously. You can see the progress of the deletion by using Amazon Web Services CloudWatch. Any error messages related to the processing of the batch are sent to you CloudWatch log.
    */
  def batchDeleteDocument(params: BatchDeleteDocumentRequest): Request[BatchDeleteDocumentResponse, AWSError] = js.native
  def batchDeleteDocument(
    params: BatchDeleteDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteDocumentResponse, Unit]
  ): Request[BatchDeleteDocumentResponse, AWSError] = js.native
  
  /**
    * Returns the indexing status for one or more documents submitted with the  BatchPutDocument API. When you use the BatchPutDocument API, documents are indexed asynchronously. You can use the BatchGetDocumentStatus API to get the current status of a list of documents so that you can determine if they have been successfully indexed. You can also use the BatchGetDocumentStatus API to check the status of the  BatchDeleteDocument API. When a document is deleted from the index, Amazon Kendra returns NOT_FOUND as the status.
    */
  def batchGetDocumentStatus(): Request[BatchGetDocumentStatusResponse, AWSError] = js.native
  def batchGetDocumentStatus(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDocumentStatusResponse, Unit]): Request[BatchGetDocumentStatusResponse, AWSError] = js.native
  /**
    * Returns the indexing status for one or more documents submitted with the  BatchPutDocument API. When you use the BatchPutDocument API, documents are indexed asynchronously. You can use the BatchGetDocumentStatus API to get the current status of a list of documents so that you can determine if they have been successfully indexed. You can also use the BatchGetDocumentStatus API to check the status of the  BatchDeleteDocument API. When a document is deleted from the index, Amazon Kendra returns NOT_FOUND as the status.
    */
  def batchGetDocumentStatus(params: BatchGetDocumentStatusRequest): Request[BatchGetDocumentStatusResponse, AWSError] = js.native
  def batchGetDocumentStatus(
    params: BatchGetDocumentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetDocumentStatusResponse, Unit]
  ): Request[BatchGetDocumentStatusResponse, AWSError] = js.native
  
  /**
    * Adds one or more documents to an index. The BatchPutDocument API enables you to ingest inline documents or a set of documents stored in an Amazon S3 bucket. Use this API to ingest your text and unstructured text into an index, add custom attributes to the documents, and to attach an access control list to the documents added to the index. The documents are indexed asynchronously. You can see the progress of the batch using Amazon Web Services CloudWatch. Any error messages related to processing the batch are sent to your Amazon Web Services CloudWatch log. For an example of ingesting inline documents using Python and Java SDKs, see Adding files directly to an index.
    */
  def batchPutDocument(): Request[BatchPutDocumentResponse, AWSError] = js.native
  def batchPutDocument(callback: js.Function2[/* err */ AWSError, /* data */ BatchPutDocumentResponse, Unit]): Request[BatchPutDocumentResponse, AWSError] = js.native
  /**
    * Adds one or more documents to an index. The BatchPutDocument API enables you to ingest inline documents or a set of documents stored in an Amazon S3 bucket. Use this API to ingest your text and unstructured text into an index, add custom attributes to the documents, and to attach an access control list to the documents added to the index. The documents are indexed asynchronously. You can see the progress of the batch using Amazon Web Services CloudWatch. Any error messages related to processing the batch are sent to your Amazon Web Services CloudWatch log. For an example of ingesting inline documents using Python and Java SDKs, see Adding files directly to an index.
    */
  def batchPutDocument(params: BatchPutDocumentRequest): Request[BatchPutDocumentResponse, AWSError] = js.native
  def batchPutDocument(
    params: BatchPutDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutDocumentResponse, Unit]
  ): Request[BatchPutDocumentResponse, AWSError] = js.native
  
  /**
    * Clears existing query suggestions from an index. This deletes existing suggestions only, not the queries in the query log. After you clear suggestions, Amazon Kendra learns new suggestions based on new queries added to the query log from the time you cleared suggestions. If you do not see any new suggestions, then please allow Amazon Kendra to collect enough queries to learn new suggestions.  ClearQuerySuggestions is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def clearQuerySuggestions(): Request[js.Object, AWSError] = js.native
  def clearQuerySuggestions(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Clears existing query suggestions from an index. This deletes existing suggestions only, not the queries in the query log. After you clear suggestions, Amazon Kendra learns new suggestions based on new queries added to the query log from the time you cleared suggestions. If you do not see any new suggestions, then please allow Amazon Kendra to collect enough queries to learn new suggestions.  ClearQuerySuggestions is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def clearQuerySuggestions(params: ClearQuerySuggestionsRequest): Request[js.Object, AWSError] = js.native
  def clearQuerySuggestions(
    params: ClearQuerySuggestionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_Kendra: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an access configuration for your documents. This includes user and group access information for your documents. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents. You can use this to re-configure your existing document level access control without indexing all of your documents again. For example, your index contains top-secret company documents that only certain employees or users should access. One of these users leaves the company or switches to a team that should be blocked from accessing top-secret documents. The user still has access to top-secret documents because the user had access when your documents were previously indexed. You can create a specific access control configuration for the user with deny access. You can later update the access control configuration to allow access if the user returns to the company and re-joins the 'top-secret' team. You can re-configure access control for your documents as circumstances change. To apply your access control configuration to certain documents, you call the BatchPutDocument API with the AccessControlConfigurationId included in the Document object. If you use an S3 bucket as a data source, you update the .metadata.json with the AccessControlConfigurationId and synchronize your data source. Amazon Kendra currently only supports access control configuration for S3 data sources and documents indexed using the BatchPutDocument API.
    */
  def createAccessControlConfiguration(): Request[CreateAccessControlConfigurationResponse, AWSError] = js.native
  def createAccessControlConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessControlConfigurationResponse, Unit]
  ): Request[CreateAccessControlConfigurationResponse, AWSError] = js.native
  /**
    * Creates an access configuration for your documents. This includes user and group access information for your documents. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents. You can use this to re-configure your existing document level access control without indexing all of your documents again. For example, your index contains top-secret company documents that only certain employees or users should access. One of these users leaves the company or switches to a team that should be blocked from accessing top-secret documents. The user still has access to top-secret documents because the user had access when your documents were previously indexed. You can create a specific access control configuration for the user with deny access. You can later update the access control configuration to allow access if the user returns to the company and re-joins the 'top-secret' team. You can re-configure access control for your documents as circumstances change. To apply your access control configuration to certain documents, you call the BatchPutDocument API with the AccessControlConfigurationId included in the Document object. If you use an S3 bucket as a data source, you update the .metadata.json with the AccessControlConfigurationId and synchronize your data source. Amazon Kendra currently only supports access control configuration for S3 data sources and documents indexed using the BatchPutDocument API.
    */
  def createAccessControlConfiguration(params: CreateAccessControlConfigurationRequest): Request[CreateAccessControlConfigurationResponse, AWSError] = js.native
  def createAccessControlConfiguration(
    params: CreateAccessControlConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessControlConfigurationResponse, Unit]
  ): Request[CreateAccessControlConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates a data source connector that you want to use with an Amazon Kendra index. You specify a name, data source connector type and description for your data source. You also specify configuration information for the data source connector.  CreateDataSource is a synchronous operation. The operation returns 200 if the data source was successfully created. Otherwise, an exception is raised. Amazon S3 and custom data sources are the only supported data sources in the Amazon Web Services GovCloud (US-West) region. For an example of creating an index and data source using the Python SDK, see Getting started with Python SDK. For an example of creating an index and data source using the Java SDK, see Getting started with Java SDK.
    */
  def createDataSource(): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]): Request[CreateDataSourceResponse, AWSError] = js.native
  /**
    * Creates a data source connector that you want to use with an Amazon Kendra index. You specify a name, data source connector type and description for your data source. You also specify configuration information for the data source connector.  CreateDataSource is a synchronous operation. The operation returns 200 if the data source was successfully created. Otherwise, an exception is raised. Amazon S3 and custom data sources are the only supported data sources in the Amazon Web Services GovCloud (US-West) region. For an example of creating an index and data source using the Python SDK, see Getting started with Python SDK. For an example of creating an index and data source using the Java SDK, see Getting started with Java SDK.
    */
  def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(
    params: CreateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]
  ): Request[CreateDataSourceResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Kendra experience such as a search application. For more information on creating a search application experience, including using the Python and Java SDKs, see Building a search experience with no code.
    */
  def createExperience(): Request[CreateExperienceResponse, AWSError] = js.native
  def createExperience(callback: js.Function2[/* err */ AWSError, /* data */ CreateExperienceResponse, Unit]): Request[CreateExperienceResponse, AWSError] = js.native
  /**
    * Creates an Amazon Kendra experience such as a search application. For more information on creating a search application experience, including using the Python and Java SDKs, see Building a search experience with no code.
    */
  def createExperience(params: CreateExperienceRequest): Request[CreateExperienceResponse, AWSError] = js.native
  def createExperience(
    params: CreateExperienceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExperienceResponse, Unit]
  ): Request[CreateExperienceResponse, AWSError] = js.native
  
  /**
    * Creates an new set of frequently asked question (FAQ) questions and answers. Adding FAQs to an index is an asynchronous operation. For an example of adding an FAQ to an index using Python and Java SDKs, see Using your FAQ file.
    */
  def createFaq(): Request[CreateFaqResponse, AWSError] = js.native
  def createFaq(callback: js.Function2[/* err */ AWSError, /* data */ CreateFaqResponse, Unit]): Request[CreateFaqResponse, AWSError] = js.native
  /**
    * Creates an new set of frequently asked question (FAQ) questions and answers. Adding FAQs to an index is an asynchronous operation. For an example of adding an FAQ to an index using Python and Java SDKs, see Using your FAQ file.
    */
  def createFaq(params: CreateFaqRequest): Request[CreateFaqResponse, AWSError] = js.native
  def createFaq(
    params: CreateFaqRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFaqResponse, Unit]
  ): Request[CreateFaqResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Kendra index. Index creation is an asynchronous API. To determine if index creation has completed, check the Status field returned from a call to DescribeIndex. The Status field is set to ACTIVE when the index is ready to use. Once the index is active you can index your documents using the BatchPutDocument API or using one of the supported data sources. For an example of creating an index and data source using the Python SDK, see Getting started with Python SDK. For an example of creating an index and data source using the Java SDK, see Getting started with Java SDK.
    */
  def createIndex(): Request[CreateIndexResponse, AWSError] = js.native
  def createIndex(callback: js.Function2[/* err */ AWSError, /* data */ CreateIndexResponse, Unit]): Request[CreateIndexResponse, AWSError] = js.native
  /**
    * Creates an Amazon Kendra index. Index creation is an asynchronous API. To determine if index creation has completed, check the Status field returned from a call to DescribeIndex. The Status field is set to ACTIVE when the index is ready to use. Once the index is active you can index your documents using the BatchPutDocument API or using one of the supported data sources. For an example of creating an index and data source using the Python SDK, see Getting started with Python SDK. For an example of creating an index and data source using the Java SDK, see Getting started with Java SDK.
    */
  def createIndex(params: CreateIndexRequest): Request[CreateIndexResponse, AWSError] = js.native
  def createIndex(
    params: CreateIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIndexResponse, Unit]
  ): Request[CreateIndexResponse, AWSError] = js.native
  
  /**
    * Creates a block list to exlcude certain queries from suggestions. Any query that contains words or phrases specified in the block list is blocked or filtered out from being shown as a suggestion. You need to provide the file location of your block list text file in your S3 bucket. In your text file, enter each block word or phrase on a separate line. For information on the current quota limits for block lists, see Quotas for Amazon Kendra.  CreateQuerySuggestionsBlockList is currently not supported in the Amazon Web Services GovCloud (US-West) region. For an example of creating a block list for query suggestions using the Python SDK, see Query suggestions block list.
    */
  def createQuerySuggestionsBlockList(): Request[CreateQuerySuggestionsBlockListResponse, AWSError] = js.native
  def createQuerySuggestionsBlockList(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateQuerySuggestionsBlockListResponse, Unit]
  ): Request[CreateQuerySuggestionsBlockListResponse, AWSError] = js.native
  /**
    * Creates a block list to exlcude certain queries from suggestions. Any query that contains words or phrases specified in the block list is blocked or filtered out from being shown as a suggestion. You need to provide the file location of your block list text file in your S3 bucket. In your text file, enter each block word or phrase on a separate line. For information on the current quota limits for block lists, see Quotas for Amazon Kendra.  CreateQuerySuggestionsBlockList is currently not supported in the Amazon Web Services GovCloud (US-West) region. For an example of creating a block list for query suggestions using the Python SDK, see Query suggestions block list.
    */
  def createQuerySuggestionsBlockList(params: CreateQuerySuggestionsBlockListRequest): Request[CreateQuerySuggestionsBlockListResponse, AWSError] = js.native
  def createQuerySuggestionsBlockList(
    params: CreateQuerySuggestionsBlockListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateQuerySuggestionsBlockListResponse, Unit]
  ): Request[CreateQuerySuggestionsBlockListResponse, AWSError] = js.native
  
  /**
    * Creates a thesaurus for an index. The thesaurus contains a list of synonyms in Solr format. For an example of adding a thesaurus file to an index, see Adding custom synonyms to an index.
    */
  def createThesaurus(): Request[CreateThesaurusResponse, AWSError] = js.native
  def createThesaurus(callback: js.Function2[/* err */ AWSError, /* data */ CreateThesaurusResponse, Unit]): Request[CreateThesaurusResponse, AWSError] = js.native
  /**
    * Creates a thesaurus for an index. The thesaurus contains a list of synonyms in Solr format. For an example of adding a thesaurus file to an index, see Adding custom synonyms to an index.
    */
  def createThesaurus(params: CreateThesaurusRequest): Request[CreateThesaurusResponse, AWSError] = js.native
  def createThesaurus(
    params: CreateThesaurusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateThesaurusResponse, Unit]
  ): Request[CreateThesaurusResponse, AWSError] = js.native
  
  /**
    * Deletes an access control configuration that you created for your documents in an index. This includes user and group access information for your documents. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents.
    */
  def deleteAccessControlConfiguration(): Request[DeleteAccessControlConfigurationResponse, AWSError] = js.native
  def deleteAccessControlConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessControlConfigurationResponse, Unit]
  ): Request[DeleteAccessControlConfigurationResponse, AWSError] = js.native
  /**
    * Deletes an access control configuration that you created for your documents in an index. This includes user and group access information for your documents. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents.
    */
  def deleteAccessControlConfiguration(params: DeleteAccessControlConfigurationRequest): Request[DeleteAccessControlConfigurationResponse, AWSError] = js.native
  def deleteAccessControlConfiguration(
    params: DeleteAccessControlConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessControlConfigurationResponse, Unit]
  ): Request[DeleteAccessControlConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Kendra data source connector. An exception is not thrown if the data source is already being deleted. While the data source is being deleted, the Status field returned by a call to the DescribeDataSource API is set to DELETING. For more information, see Deleting Data Sources.
    */
  def deleteDataSource(): Request[js.Object, AWSError] = js.native
  def deleteDataSource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon Kendra data source connector. An exception is not thrown if the data source is already being deleted. While the data source is being deleted, the Status field returned by a call to the DescribeDataSource API is set to DELETING. For more information, see Deleting Data Sources.
    */
  def deleteDataSource(params: DeleteDataSourceRequest): Request[js.Object, AWSError] = js.native
  def deleteDataSource(
    params: DeleteDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes your Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def deleteExperience(): Request[DeleteExperienceResponse, AWSError] = js.native
  def deleteExperience(callback: js.Function2[/* err */ AWSError, /* data */ DeleteExperienceResponse, Unit]): Request[DeleteExperienceResponse, AWSError] = js.native
  /**
    * Deletes your Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def deleteExperience(params: DeleteExperienceRequest): Request[DeleteExperienceResponse, AWSError] = js.native
  def deleteExperience(
    params: DeleteExperienceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteExperienceResponse, Unit]
  ): Request[DeleteExperienceResponse, AWSError] = js.native
  
  /**
    * Removes an FAQ from an index.
    */
  def deleteFaq(): Request[js.Object, AWSError] = js.native
  def deleteFaq(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes an FAQ from an index.
    */
  def deleteFaq(params: DeleteFaqRequest): Request[js.Object, AWSError] = js.native
  def deleteFaq(params: DeleteFaqRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an existing Amazon Kendra index. An exception is not thrown if the index is already being deleted. While the index is being deleted, the Status field returned by a call to the DescribeIndex API is set to DELETING.
    */
  def deleteIndex(): Request[js.Object, AWSError] = js.native
  def deleteIndex(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing Amazon Kendra index. An exception is not thrown if the index is already being deleted. While the index is being deleted, the Status field returned by a call to the DescribeIndex API is set to DELETING.
    */
  def deleteIndex(params: DeleteIndexRequest): Request[js.Object, AWSError] = js.native
  def deleteIndex(params: DeleteIndexRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a group so that all users and sub groups that belong to the group can no longer access documents only available to that group. For example, after deleting the group "Summer Interns", all interns who belonged to that group no longer see intern-only documents in their search results. If you want to delete or replace users or sub groups of a group, you need to use the PutPrincipalMapping operation. For example, if a user in the group "Engineering" leaves the engineering team and another user takes their place, you provide an updated list of users or sub groups that belong to the "Engineering" group when calling PutPrincipalMapping. You can update your internal list of users or sub groups and input this list when calling PutPrincipalMapping.  DeletePrincipalMapping is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def deletePrincipalMapping(): Request[js.Object, AWSError] = js.native
  def deletePrincipalMapping(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a group so that all users and sub groups that belong to the group can no longer access documents only available to that group. For example, after deleting the group "Summer Interns", all interns who belonged to that group no longer see intern-only documents in their search results. If you want to delete or replace users or sub groups of a group, you need to use the PutPrincipalMapping operation. For example, if a user in the group "Engineering" leaves the engineering team and another user takes their place, you provide an updated list of users or sub groups that belong to the "Engineering" group when calling PutPrincipalMapping. You can update your internal list of users or sub groups and input this list when calling PutPrincipalMapping.  DeletePrincipalMapping is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def deletePrincipalMapping(params: DeletePrincipalMappingRequest): Request[js.Object, AWSError] = js.native
  def deletePrincipalMapping(
    params: DeletePrincipalMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a block list used for query suggestions for an index. A deleted block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions list to add back the queries that were previously blocked.  DeleteQuerySuggestionsBlockList is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def deleteQuerySuggestionsBlockList(): Request[js.Object, AWSError] = js.native
  def deleteQuerySuggestionsBlockList(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a block list used for query suggestions for an index. A deleted block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions list to add back the queries that were previously blocked.  DeleteQuerySuggestionsBlockList is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def deleteQuerySuggestionsBlockList(params: DeleteQuerySuggestionsBlockListRequest): Request[js.Object, AWSError] = js.native
  def deleteQuerySuggestionsBlockList(
    params: DeleteQuerySuggestionsBlockListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an existing Amazon Kendra thesaurus. 
    */
  def deleteThesaurus(): Request[js.Object, AWSError] = js.native
  def deleteThesaurus(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing Amazon Kendra thesaurus. 
    */
  def deleteThesaurus(params: DeleteThesaurusRequest): Request[js.Object, AWSError] = js.native
  def deleteThesaurus(
    params: DeleteThesaurusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets information about an access control configuration that you created for your documents in an index. This includes user and group access information for your documents. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents.
    */
  def describeAccessControlConfiguration(): Request[DescribeAccessControlConfigurationResponse, AWSError] = js.native
  def describeAccessControlConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccessControlConfigurationResponse, Unit]
  ): Request[DescribeAccessControlConfigurationResponse, AWSError] = js.native
  /**
    * Gets information about an access control configuration that you created for your documents in an index. This includes user and group access information for your documents. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents.
    */
  def describeAccessControlConfiguration(params: DescribeAccessControlConfigurationRequest): Request[DescribeAccessControlConfigurationResponse, AWSError] = js.native
  def describeAccessControlConfiguration(
    params: DescribeAccessControlConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccessControlConfigurationResponse, Unit]
  ): Request[DescribeAccessControlConfigurationResponse, AWSError] = js.native
  
  /**
    * Gets information about an Amazon Kendra data source connector.
    */
  def describeDataSource(): Request[DescribeDataSourceResponse, AWSError] = js.native
  def describeDataSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourceResponse, Unit]): Request[DescribeDataSourceResponse, AWSError] = js.native
  /**
    * Gets information about an Amazon Kendra data source connector.
    */
  def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse, AWSError] = js.native
  def describeDataSource(
    params: DescribeDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourceResponse, Unit]
  ): Request[DescribeDataSourceResponse, AWSError] = js.native
  
  /**
    * Gets information about your Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def describeExperience(): Request[DescribeExperienceResponse, AWSError] = js.native
  def describeExperience(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExperienceResponse, Unit]): Request[DescribeExperienceResponse, AWSError] = js.native
  /**
    * Gets information about your Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def describeExperience(params: DescribeExperienceRequest): Request[DescribeExperienceResponse, AWSError] = js.native
  def describeExperience(
    params: DescribeExperienceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExperienceResponse, Unit]
  ): Request[DescribeExperienceResponse, AWSError] = js.native
  
  /**
    * Gets information about an FAQ list.
    */
  def describeFaq(): Request[DescribeFaqResponse, AWSError] = js.native
  def describeFaq(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFaqResponse, Unit]): Request[DescribeFaqResponse, AWSError] = js.native
  /**
    * Gets information about an FAQ list.
    */
  def describeFaq(params: DescribeFaqRequest): Request[DescribeFaqResponse, AWSError] = js.native
  def describeFaq(
    params: DescribeFaqRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFaqResponse, Unit]
  ): Request[DescribeFaqResponse, AWSError] = js.native
  
  /**
    * Gets information about an existing Amazon Kendra index.
    */
  def describeIndex(): Request[DescribeIndexResponse, AWSError] = js.native
  def describeIndex(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIndexResponse, Unit]): Request[DescribeIndexResponse, AWSError] = js.native
  /**
    * Gets information about an existing Amazon Kendra index.
    */
  def describeIndex(params: DescribeIndexRequest): Request[DescribeIndexResponse, AWSError] = js.native
  def describeIndex(
    params: DescribeIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIndexResponse, Unit]
  ): Request[DescribeIndexResponse, AWSError] = js.native
  
  /**
    * Describes the processing of PUT and DELETE actions for mapping users to their groups. This includes information on the status of actions currently processing or yet to be processed, when actions were last updated, when actions were received by Amazon Kendra, the latest action that should process and apply after other actions, and useful error messages if an action could not be processed.  DescribePrincipalMapping is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def describePrincipalMapping(): Request[DescribePrincipalMappingResponse, AWSError] = js.native
  def describePrincipalMapping(callback: js.Function2[/* err */ AWSError, /* data */ DescribePrincipalMappingResponse, Unit]): Request[DescribePrincipalMappingResponse, AWSError] = js.native
  /**
    * Describes the processing of PUT and DELETE actions for mapping users to their groups. This includes information on the status of actions currently processing or yet to be processed, when actions were last updated, when actions were received by Amazon Kendra, the latest action that should process and apply after other actions, and useful error messages if an action could not be processed.  DescribePrincipalMapping is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def describePrincipalMapping(params: DescribePrincipalMappingRequest): Request[DescribePrincipalMappingResponse, AWSError] = js.native
  def describePrincipalMapping(
    params: DescribePrincipalMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePrincipalMappingResponse, Unit]
  ): Request[DescribePrincipalMappingResponse, AWSError] = js.native
  
  /**
    * Gets information about a block list used for query suggestions for an index. This is used to check the current settings that are applied to a block list.  DescribeQuerySuggestionsBlockList is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def describeQuerySuggestionsBlockList(): Request[DescribeQuerySuggestionsBlockListResponse, AWSError] = js.native
  def describeQuerySuggestionsBlockList(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeQuerySuggestionsBlockListResponse, Unit]
  ): Request[DescribeQuerySuggestionsBlockListResponse, AWSError] = js.native
  /**
    * Gets information about a block list used for query suggestions for an index. This is used to check the current settings that are applied to a block list.  DescribeQuerySuggestionsBlockList is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def describeQuerySuggestionsBlockList(params: DescribeQuerySuggestionsBlockListRequest): Request[DescribeQuerySuggestionsBlockListResponse, AWSError] = js.native
  def describeQuerySuggestionsBlockList(
    params: DescribeQuerySuggestionsBlockListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeQuerySuggestionsBlockListResponse, Unit]
  ): Request[DescribeQuerySuggestionsBlockListResponse, AWSError] = js.native
  
  /**
    * Gets information on the settings of query suggestions for an index. This is used to check the current settings applied to query suggestions.  DescribeQuerySuggestionsConfig is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def describeQuerySuggestionsConfig(): Request[DescribeQuerySuggestionsConfigResponse, AWSError] = js.native
  def describeQuerySuggestionsConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeQuerySuggestionsConfigResponse, Unit]
  ): Request[DescribeQuerySuggestionsConfigResponse, AWSError] = js.native
  /**
    * Gets information on the settings of query suggestions for an index. This is used to check the current settings applied to query suggestions.  DescribeQuerySuggestionsConfig is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def describeQuerySuggestionsConfig(params: DescribeQuerySuggestionsConfigRequest): Request[DescribeQuerySuggestionsConfigResponse, AWSError] = js.native
  def describeQuerySuggestionsConfig(
    params: DescribeQuerySuggestionsConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeQuerySuggestionsConfigResponse, Unit]
  ): Request[DescribeQuerySuggestionsConfigResponse, AWSError] = js.native
  
  /**
    * Gets information about an existing Amazon Kendra thesaurus.
    */
  def describeThesaurus(): Request[DescribeThesaurusResponse, AWSError] = js.native
  def describeThesaurus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThesaurusResponse, Unit]): Request[DescribeThesaurusResponse, AWSError] = js.native
  /**
    * Gets information about an existing Amazon Kendra thesaurus.
    */
  def describeThesaurus(params: DescribeThesaurusRequest): Request[DescribeThesaurusResponse, AWSError] = js.native
  def describeThesaurus(
    params: DescribeThesaurusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThesaurusResponse, Unit]
  ): Request[DescribeThesaurusResponse, AWSError] = js.native
  
  /**
    * Prevents users or groups in your Amazon Web Services SSO identity source from accessing your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def disassociateEntitiesFromExperience(): Request[DisassociateEntitiesFromExperienceResponse, AWSError] = js.native
  def disassociateEntitiesFromExperience(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateEntitiesFromExperienceResponse, Unit]
  ): Request[DisassociateEntitiesFromExperienceResponse, AWSError] = js.native
  /**
    * Prevents users or groups in your Amazon Web Services SSO identity source from accessing your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def disassociateEntitiesFromExperience(params: DisassociateEntitiesFromExperienceRequest): Request[DisassociateEntitiesFromExperienceResponse, AWSError] = js.native
  def disassociateEntitiesFromExperience(
    params: DisassociateEntitiesFromExperienceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateEntitiesFromExperienceResponse, Unit]
  ): Request[DisassociateEntitiesFromExperienceResponse, AWSError] = js.native
  
  /**
    * Removes the specific permissions of users or groups in your Amazon Web Services SSO identity source with access to your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def disassociatePersonasFromEntities(): Request[DisassociatePersonasFromEntitiesResponse, AWSError] = js.native
  def disassociatePersonasFromEntities(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociatePersonasFromEntitiesResponse, Unit]
  ): Request[DisassociatePersonasFromEntitiesResponse, AWSError] = js.native
  /**
    * Removes the specific permissions of users or groups in your Amazon Web Services SSO identity source with access to your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def disassociatePersonasFromEntities(params: DisassociatePersonasFromEntitiesRequest): Request[DisassociatePersonasFromEntitiesResponse, AWSError] = js.native
  def disassociatePersonasFromEntities(
    params: DisassociatePersonasFromEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociatePersonasFromEntitiesResponse, Unit]
  ): Request[DisassociatePersonasFromEntitiesResponse, AWSError] = js.native
  
  /**
    * Fetches the queries that are suggested to your users.  GetQuerySuggestions is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def getQuerySuggestions(): Request[GetQuerySuggestionsResponse, AWSError] = js.native
  def getQuerySuggestions(callback: js.Function2[/* err */ AWSError, /* data */ GetQuerySuggestionsResponse, Unit]): Request[GetQuerySuggestionsResponse, AWSError] = js.native
  /**
    * Fetches the queries that are suggested to your users.  GetQuerySuggestions is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def getQuerySuggestions(params: GetQuerySuggestionsRequest): Request[GetQuerySuggestionsResponse, AWSError] = js.native
  def getQuerySuggestions(
    params: GetQuerySuggestionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQuerySuggestionsResponse, Unit]
  ): Request[GetQuerySuggestionsResponse, AWSError] = js.native
  
  /**
    * Retrieves search metrics data. The data provides a snapshot of how your users interact with your search application and how effective the application is.
    */
  def getSnapshots(): Request[GetSnapshotsResponse, AWSError] = js.native
  def getSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ GetSnapshotsResponse, Unit]): Request[GetSnapshotsResponse, AWSError] = js.native
  /**
    * Retrieves search metrics data. The data provides a snapshot of how your users interact with your search application and how effective the application is.
    */
  def getSnapshots(params: GetSnapshotsRequest): Request[GetSnapshotsResponse, AWSError] = js.native
  def getSnapshots(
    params: GetSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSnapshotsResponse, Unit]
  ): Request[GetSnapshotsResponse, AWSError] = js.native
  
  /**
    * Lists one or more access control configurations for an index. This includes user and group access information for your documents. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents.
    */
  def listAccessControlConfigurations(): Request[ListAccessControlConfigurationsResponse, AWSError] = js.native
  def listAccessControlConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessControlConfigurationsResponse, Unit]
  ): Request[ListAccessControlConfigurationsResponse, AWSError] = js.native
  /**
    * Lists one or more access control configurations for an index. This includes user and group access information for your documents. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents.
    */
  def listAccessControlConfigurations(params: ListAccessControlConfigurationsRequest): Request[ListAccessControlConfigurationsResponse, AWSError] = js.native
  def listAccessControlConfigurations(
    params: ListAccessControlConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessControlConfigurationsResponse, Unit]
  ): Request[ListAccessControlConfigurationsResponse, AWSError] = js.native
  
  /**
    * Gets statistics about synchronizing a data source connector.
    */
  def listDataSourceSyncJobs(): Request[ListDataSourceSyncJobsResponse, AWSError] = js.native
  def listDataSourceSyncJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourceSyncJobsResponse, Unit]): Request[ListDataSourceSyncJobsResponse, AWSError] = js.native
  /**
    * Gets statistics about synchronizing a data source connector.
    */
  def listDataSourceSyncJobs(params: ListDataSourceSyncJobsRequest): Request[ListDataSourceSyncJobsResponse, AWSError] = js.native
  def listDataSourceSyncJobs(
    params: ListDataSourceSyncJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourceSyncJobsResponse, Unit]
  ): Request[ListDataSourceSyncJobsResponse, AWSError] = js.native
  
  /**
    * Lists the data source connectors that you have created.
    */
  def listDataSources(): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]): Request[ListDataSourcesResponse, AWSError] = js.native
  /**
    * Lists the data source connectors that you have created.
    */
  def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(
    params: ListDataSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]
  ): Request[ListDataSourcesResponse, AWSError] = js.native
  
  /**
    * Lists specific permissions of users and groups with access to your Amazon Kendra experience.
    */
  def listEntityPersonas(): Request[ListEntityPersonasResponse, AWSError] = js.native
  def listEntityPersonas(callback: js.Function2[/* err */ AWSError, /* data */ ListEntityPersonasResponse, Unit]): Request[ListEntityPersonasResponse, AWSError] = js.native
  /**
    * Lists specific permissions of users and groups with access to your Amazon Kendra experience.
    */
  def listEntityPersonas(params: ListEntityPersonasRequest): Request[ListEntityPersonasResponse, AWSError] = js.native
  def listEntityPersonas(
    params: ListEntityPersonasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntityPersonasResponse, Unit]
  ): Request[ListEntityPersonasResponse, AWSError] = js.native
  
  /**
    * Lists users or groups in your Amazon Web Services SSO identity source that are granted access to your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def listExperienceEntities(): Request[ListExperienceEntitiesResponse, AWSError] = js.native
  def listExperienceEntities(callback: js.Function2[/* err */ AWSError, /* data */ ListExperienceEntitiesResponse, Unit]): Request[ListExperienceEntitiesResponse, AWSError] = js.native
  /**
    * Lists users or groups in your Amazon Web Services SSO identity source that are granted access to your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def listExperienceEntities(params: ListExperienceEntitiesRequest): Request[ListExperienceEntitiesResponse, AWSError] = js.native
  def listExperienceEntities(
    params: ListExperienceEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExperienceEntitiesResponse, Unit]
  ): Request[ListExperienceEntitiesResponse, AWSError] = js.native
  
  /**
    * Lists one or more Amazon Kendra experiences. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def listExperiences(): Request[ListExperiencesResponse, AWSError] = js.native
  def listExperiences(callback: js.Function2[/* err */ AWSError, /* data */ ListExperiencesResponse, Unit]): Request[ListExperiencesResponse, AWSError] = js.native
  /**
    * Lists one or more Amazon Kendra experiences. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def listExperiences(params: ListExperiencesRequest): Request[ListExperiencesResponse, AWSError] = js.native
  def listExperiences(
    params: ListExperiencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExperiencesResponse, Unit]
  ): Request[ListExperiencesResponse, AWSError] = js.native
  
  /**
    * Gets a list of FAQ lists associated with an index.
    */
  def listFaqs(): Request[ListFaqsResponse, AWSError] = js.native
  def listFaqs(callback: js.Function2[/* err */ AWSError, /* data */ ListFaqsResponse, Unit]): Request[ListFaqsResponse, AWSError] = js.native
  /**
    * Gets a list of FAQ lists associated with an index.
    */
  def listFaqs(params: ListFaqsRequest): Request[ListFaqsResponse, AWSError] = js.native
  def listFaqs(
    params: ListFaqsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFaqsResponse, Unit]
  ): Request[ListFaqsResponse, AWSError] = js.native
  
  /**
    * Provides a list of groups that are mapped to users before a given ordering or timestamp identifier.  ListGroupsOlderThanOrderingId is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def listGroupsOlderThanOrderingId(): Request[ListGroupsOlderThanOrderingIdResponse, AWSError] = js.native
  def listGroupsOlderThanOrderingId(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsOlderThanOrderingIdResponse, Unit]): Request[ListGroupsOlderThanOrderingIdResponse, AWSError] = js.native
  /**
    * Provides a list of groups that are mapped to users before a given ordering or timestamp identifier.  ListGroupsOlderThanOrderingId is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def listGroupsOlderThanOrderingId(params: ListGroupsOlderThanOrderingIdRequest): Request[ListGroupsOlderThanOrderingIdResponse, AWSError] = js.native
  def listGroupsOlderThanOrderingId(
    params: ListGroupsOlderThanOrderingIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsOlderThanOrderingIdResponse, Unit]
  ): Request[ListGroupsOlderThanOrderingIdResponse, AWSError] = js.native
  
  /**
    * Lists the Amazon Kendra indexes that you created.
    */
  def listIndices(): Request[ListIndicesResponse, AWSError] = js.native
  def listIndices(callback: js.Function2[/* err */ AWSError, /* data */ ListIndicesResponse, Unit]): Request[ListIndicesResponse, AWSError] = js.native
  /**
    * Lists the Amazon Kendra indexes that you created.
    */
  def listIndices(params: ListIndicesRequest): Request[ListIndicesResponse, AWSError] = js.native
  def listIndices(
    params: ListIndicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIndicesResponse, Unit]
  ): Request[ListIndicesResponse, AWSError] = js.native
  
  /**
    * Lists the block lists used for query suggestions for an index. For information on the current quota limits for block lists, see Quotas for Amazon Kendra.  ListQuerySuggestionsBlockLists is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def listQuerySuggestionsBlockLists(): Request[ListQuerySuggestionsBlockListsResponse, AWSError] = js.native
  def listQuerySuggestionsBlockLists(
    callback: js.Function2[/* err */ AWSError, /* data */ ListQuerySuggestionsBlockListsResponse, Unit]
  ): Request[ListQuerySuggestionsBlockListsResponse, AWSError] = js.native
  /**
    * Lists the block lists used for query suggestions for an index. For information on the current quota limits for block lists, see Quotas for Amazon Kendra.  ListQuerySuggestionsBlockLists is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def listQuerySuggestionsBlockLists(params: ListQuerySuggestionsBlockListsRequest): Request[ListQuerySuggestionsBlockListsResponse, AWSError] = js.native
  def listQuerySuggestionsBlockLists(
    params: ListQuerySuggestionsBlockListsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQuerySuggestionsBlockListsResponse, Unit]
  ): Request[ListQuerySuggestionsBlockListsResponse, AWSError] = js.native
  
  /**
    * Gets a list of tags associated with a specified resource. Indexes, FAQs, and data sources can have tags associated with them.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Gets a list of tags associated with a specified resource. Indexes, FAQs, and data sources can have tags associated with them.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the thesauri for an index.
    */
  def listThesauri(): Request[ListThesauriResponse, AWSError] = js.native
  def listThesauri(callback: js.Function2[/* err */ AWSError, /* data */ ListThesauriResponse, Unit]): Request[ListThesauriResponse, AWSError] = js.native
  /**
    * Lists the thesauri for an index.
    */
  def listThesauri(params: ListThesauriRequest): Request[ListThesauriResponse, AWSError] = js.native
  def listThesauri(
    params: ListThesauriRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThesauriResponse, Unit]
  ): Request[ListThesauriResponse, AWSError] = js.native
  
  /**
    * Maps users to their groups so that you only need to provide the user ID when you issue the query. You can also map sub groups to groups. For example, the group "Company Intellectual Property Teams" includes sub groups "Research" and "Engineering". These sub groups include their own list of users or people who work in these teams. Only users who work in research and engineering, and therefore belong in the intellectual property group, can see top-secret company documents in their search results. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents. For more information, see Filtering on user context. If more than five PUT actions for a group are currently processing, a validation exception is thrown.  PutPrincipalMapping is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def putPrincipalMapping(): Request[js.Object, AWSError] = js.native
  def putPrincipalMapping(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Maps users to their groups so that you only need to provide the user ID when you issue the query. You can also map sub groups to groups. For example, the group "Company Intellectual Property Teams" includes sub groups "Research" and "Engineering". These sub groups include their own list of users or people who work in these teams. Only users who work in research and engineering, and therefore belong in the intellectual property group, can see top-secret company documents in their search results. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents. For more information, see Filtering on user context. If more than five PUT actions for a group are currently processing, a validation exception is thrown.  PutPrincipalMapping is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def putPrincipalMapping(params: PutPrincipalMappingRequest): Request[js.Object, AWSError] = js.native
  def putPrincipalMapping(
    params: PutPrincipalMappingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Searches an active index. Use this API to search your documents using query. The Query API enables to do faceted search and to filter results based on document attributes. It also enables you to provide user context that Amazon Kendra uses to enforce document access control in the search results. Amazon Kendra searches your index for text content and question and answer (FAQ) content. By default the response contains three types of results.   Relevant passages   Matching FAQs   Relevant documents   You can specify that the query return only one type of result using the QueryResultTypeConfig parameter. Each query returns the 100 most relevant results. 
    */
  def query(): Request[QueryResult, AWSError] = js.native
  def query(callback: js.Function2[/* err */ AWSError, /* data */ QueryResult, Unit]): Request[QueryResult, AWSError] = js.native
  /**
    * Searches an active index. Use this API to search your documents using query. The Query API enables to do faceted search and to filter results based on document attributes. It also enables you to provide user context that Amazon Kendra uses to enforce document access control in the search results. Amazon Kendra searches your index for text content and question and answer (FAQ) content. By default the response contains three types of results.   Relevant passages   Matching FAQs   Relevant documents   You can specify that the query return only one type of result using the QueryResultTypeConfig parameter. Each query returns the 100 most relevant results. 
    */
  def query(params: QueryRequest): Request[QueryResult, AWSError] = js.native
  def query(params: QueryRequest, callback: js.Function2[/* err */ AWSError, /* data */ QueryResult, Unit]): Request[QueryResult, AWSError] = js.native
  
  /**
    * Starts a synchronization job for a data source connector. If a synchronization job is already in progress, Amazon Kendra returns a ResourceInUseException exception.
    */
  def startDataSourceSyncJob(): Request[StartDataSourceSyncJobResponse, AWSError] = js.native
  def startDataSourceSyncJob(callback: js.Function2[/* err */ AWSError, /* data */ StartDataSourceSyncJobResponse, Unit]): Request[StartDataSourceSyncJobResponse, AWSError] = js.native
  /**
    * Starts a synchronization job for a data source connector. If a synchronization job is already in progress, Amazon Kendra returns a ResourceInUseException exception.
    */
  def startDataSourceSyncJob(params: StartDataSourceSyncJobRequest): Request[StartDataSourceSyncJobResponse, AWSError] = js.native
  def startDataSourceSyncJob(
    params: StartDataSourceSyncJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDataSourceSyncJobResponse, Unit]
  ): Request[StartDataSourceSyncJobResponse, AWSError] = js.native
  
  /**
    * Stops a synchronization job that is currently running. You can't stop a scheduled synchronization job.
    */
  def stopDataSourceSyncJob(): Request[js.Object, AWSError] = js.native
  def stopDataSourceSyncJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a synchronization job that is currently running. You can't stop a scheduled synchronization job.
    */
  def stopDataSourceSyncJob(params: StopDataSourceSyncJobRequest): Request[js.Object, AWSError] = js.native
  def stopDataSourceSyncJob(
    params: StopDataSourceSyncJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Enables you to provide feedback to Amazon Kendra to improve the performance of your index.  SubmitFeedback is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def submitFeedback(): Request[js.Object, AWSError] = js.native
  def submitFeedback(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables you to provide feedback to Amazon Kendra to improve the performance of your index.  SubmitFeedback is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def submitFeedback(params: SubmitFeedbackRequest): Request[js.Object, AWSError] = js.native
  def submitFeedback(
    params: SubmitFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds the specified tag to the specified index, FAQ, or data source resource. If the tag already exists, the existing value is replaced with the new value.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tag to the specified index, FAQ, or data source resource. If the tag already exists, the existing value is replaced with the new value.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from an index, FAQ, or a data source.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from an index, FAQ, or a data source.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an access control configuration for your documents in an index. This includes user and group access information for your documents. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents. You can update an access control configuration you created without indexing all of your documents again. For example, your index contains top-secret company documents that only certain employees or users should access. You created an 'allow' access control configuration for one user who recently joined the 'top-secret' team, switching from a team with 'deny' access to top-secret documents. However, the user suddenly returns to their previous team and should no longer have access to top secret documents. You can update the access control configuration to re-configure access control for your documents as circumstances change. You call the BatchPutDocument API to apply the updated access control configuration, with the AccessControlConfigurationId included in the Document object. If you use an S3 bucket as a data source, you synchronize your data source to apply the AccessControlConfigurationId in the .metadata.json file. Amazon Kendra currently only supports access control configuration for S3 data sources and documents indexed using the BatchPutDocument API.
    */
  def updateAccessControlConfiguration(): Request[UpdateAccessControlConfigurationResponse, AWSError] = js.native
  def updateAccessControlConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccessControlConfigurationResponse, Unit]
  ): Request[UpdateAccessControlConfigurationResponse, AWSError] = js.native
  /**
    * Updates an access control configuration for your documents in an index. This includes user and group access information for your documents. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents. You can update an access control configuration you created without indexing all of your documents again. For example, your index contains top-secret company documents that only certain employees or users should access. You created an 'allow' access control configuration for one user who recently joined the 'top-secret' team, switching from a team with 'deny' access to top-secret documents. However, the user suddenly returns to their previous team and should no longer have access to top secret documents. You can update the access control configuration to re-configure access control for your documents as circumstances change. You call the BatchPutDocument API to apply the updated access control configuration, with the AccessControlConfigurationId included in the Document object. If you use an S3 bucket as a data source, you synchronize your data source to apply the AccessControlConfigurationId in the .metadata.json file. Amazon Kendra currently only supports access control configuration for S3 data sources and documents indexed using the BatchPutDocument API.
    */
  def updateAccessControlConfiguration(params: UpdateAccessControlConfigurationRequest): Request[UpdateAccessControlConfigurationResponse, AWSError] = js.native
  def updateAccessControlConfiguration(
    params: UpdateAccessControlConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccessControlConfigurationResponse, Unit]
  ): Request[UpdateAccessControlConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates an existing Amazon Kendra data source connector.
    */
  def updateDataSource(): Request[js.Object, AWSError] = js.native
  def updateDataSource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an existing Amazon Kendra data source connector.
    */
  def updateDataSource(params: UpdateDataSourceRequest): Request[js.Object, AWSError] = js.native
  def updateDataSource(
    params: UpdateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates your Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def updateExperience(): Request[js.Object, AWSError] = js.native
  def updateExperience(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates your Amazon Kendra experience such as a search application. For more information on creating a search application experience, see Building a search experience with no code.
    */
  def updateExperience(params: UpdateExperienceRequest): Request[js.Object, AWSError] = js.native
  def updateExperience(
    params: UpdateExperienceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates an existing Amazon Kendra index.
    */
  def updateIndex(): Request[js.Object, AWSError] = js.native
  def updateIndex(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an existing Amazon Kendra index.
    */
  def updateIndex(params: UpdateIndexRequest): Request[js.Object, AWSError] = js.native
  def updateIndex(params: UpdateIndexRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a block list used for query suggestions for an index. Updates to a block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions list to apply any updates to the block list. Other changes not related to the block list apply immediately. If a block list is updating, then you need to wait for the first update to finish before submitting another update. Amazon Kendra supports partial updates, so you only need to provide the fields you want to update.  UpdateQuerySuggestionsBlockList is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def updateQuerySuggestionsBlockList(): Request[js.Object, AWSError] = js.native
  def updateQuerySuggestionsBlockList(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a block list used for query suggestions for an index. Updates to a block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions list to apply any updates to the block list. Other changes not related to the block list apply immediately. If a block list is updating, then you need to wait for the first update to finish before submitting another update. Amazon Kendra supports partial updates, so you only need to provide the fields you want to update.  UpdateQuerySuggestionsBlockList is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def updateQuerySuggestionsBlockList(params: UpdateQuerySuggestionsBlockListRequest): Request[js.Object, AWSError] = js.native
  def updateQuerySuggestionsBlockList(
    params: UpdateQuerySuggestionsBlockListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the settings of query suggestions for an index. Amazon Kendra supports partial updates, so you only need to provide the fields you want to update. If an update is currently processing (i.e. 'happening'), you need to wait for the update to finish before making another update. Updates to query suggestions settings might not take effect right away. The time for your updated settings to take effect depends on the updates made and the number of search queries in your index. You can still enable/disable query suggestions at any time.  UpdateQuerySuggestionsConfig is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def updateQuerySuggestionsConfig(): Request[js.Object, AWSError] = js.native
  def updateQuerySuggestionsConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the settings of query suggestions for an index. Amazon Kendra supports partial updates, so you only need to provide the fields you want to update. If an update is currently processing (i.e. 'happening'), you need to wait for the update to finish before making another update. Updates to query suggestions settings might not take effect right away. The time for your updated settings to take effect depends on the updates made and the number of search queries in your index. You can still enable/disable query suggestions at any time.  UpdateQuerySuggestionsConfig is currently not supported in the Amazon Web Services GovCloud (US-West) region.
    */
  def updateQuerySuggestionsConfig(params: UpdateQuerySuggestionsConfigRequest): Request[js.Object, AWSError] = js.native
  def updateQuerySuggestionsConfig(
    params: UpdateQuerySuggestionsConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a thesaurus for an index.
    */
  def updateThesaurus(): Request[js.Object, AWSError] = js.native
  def updateThesaurus(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a thesaurus for an index.
    */
  def updateThesaurus(params: UpdateThesaurusRequest): Request[js.Object, AWSError] = js.native
  def updateThesaurus(
    params: UpdateThesaurusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
