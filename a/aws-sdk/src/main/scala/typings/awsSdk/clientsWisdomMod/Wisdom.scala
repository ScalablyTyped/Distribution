package typings.awsSdk.clientsWisdomMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wisdom extends Service {
  
  @JSName("config")
  var config_Wisdom: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Amazon Connect Wisdom assistant.
    */
  def createAssistant(): Request[CreateAssistantResponse, AWSError] = js.native
  def createAssistant(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssistantResponse, Unit]): Request[CreateAssistantResponse, AWSError] = js.native
  /**
    * Creates an Amazon Connect Wisdom assistant.
    */
  def createAssistant(params: CreateAssistantRequest): Request[CreateAssistantResponse, AWSError] = js.native
  def createAssistant(
    params: CreateAssistantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssistantResponse, Unit]
  ): Request[CreateAssistantResponse, AWSError] = js.native
  
  /**
    * Creates an association between an Amazon Connect Wisdom assistant and another resource. Currently, the only supported association is with a knowledge base. An assistant can have only a single association.
    */
  def createAssistantAssociation(): Request[CreateAssistantAssociationResponse, AWSError] = js.native
  def createAssistantAssociation(callback: js.Function2[/* err */ AWSError, /* data */ CreateAssistantAssociationResponse, Unit]): Request[CreateAssistantAssociationResponse, AWSError] = js.native
  /**
    * Creates an association between an Amazon Connect Wisdom assistant and another resource. Currently, the only supported association is with a knowledge base. An assistant can have only a single association.
    */
  def createAssistantAssociation(params: CreateAssistantAssociationRequest): Request[CreateAssistantAssociationResponse, AWSError] = js.native
  def createAssistantAssociation(
    params: CreateAssistantAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAssistantAssociationResponse, Unit]
  ): Request[CreateAssistantAssociationResponse, AWSError] = js.native
  
  /**
    * Creates Wisdom content. Before to calling this API, use StartContentUpload to upload an asset.
    */
  def createContent(): Request[CreateContentResponse, AWSError] = js.native
  def createContent(callback: js.Function2[/* err */ AWSError, /* data */ CreateContentResponse, Unit]): Request[CreateContentResponse, AWSError] = js.native
  /**
    * Creates Wisdom content. Before to calling this API, use StartContentUpload to upload an asset.
    */
  def createContent(params: CreateContentRequest): Request[CreateContentResponse, AWSError] = js.native
  def createContent(
    params: CreateContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContentResponse, Unit]
  ): Request[CreateContentResponse, AWSError] = js.native
  
  /**
    * Creates a knowledge base.  When using this API, you cannot reuse Amazon AppIntegrations DataIntegrations with external knowledge bases such as Salesforce and ServiceNow. If you do, you'll get an InvalidRequestException error.   &lt;p&gt;For example, you're programmatically managing your external knowledge base, and you want to add or remove one of the fields that is being ingested from Salesforce. Do the following:&lt;/p&gt; &lt;ol&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_DeleteKnowledgeBase.html&quot;&gt;DeleteKnowledgeBase&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_DeleteDataIntegration.html&quot;&gt;DeleteDataIntegration&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html&quot;&gt;CreateDataIntegration&lt;/a&gt; to recreate the DataIntegration or a create different one.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call CreateKnowledgeBase.&lt;/p&gt; &lt;/li&gt; &lt;/ol&gt; &lt;/note&gt; 
    */
  def createKnowledgeBase(): Request[CreateKnowledgeBaseResponse, AWSError] = js.native
  def createKnowledgeBase(callback: js.Function2[/* err */ AWSError, /* data */ CreateKnowledgeBaseResponse, Unit]): Request[CreateKnowledgeBaseResponse, AWSError] = js.native
  /**
    * Creates a knowledge base.  When using this API, you cannot reuse Amazon AppIntegrations DataIntegrations with external knowledge bases such as Salesforce and ServiceNow. If you do, you'll get an InvalidRequestException error.   &lt;p&gt;For example, you're programmatically managing your external knowledge base, and you want to add or remove one of the fields that is being ingested from Salesforce. Do the following:&lt;/p&gt; &lt;ol&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_DeleteKnowledgeBase.html&quot;&gt;DeleteKnowledgeBase&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_DeleteDataIntegration.html&quot;&gt;DeleteDataIntegration&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html&quot;&gt;CreateDataIntegration&lt;/a&gt; to recreate the DataIntegration or a create different one.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call CreateKnowledgeBase.&lt;/p&gt; &lt;/li&gt; &lt;/ol&gt; &lt;/note&gt; 
    */
  def createKnowledgeBase(params: CreateKnowledgeBaseRequest): Request[CreateKnowledgeBaseResponse, AWSError] = js.native
  def createKnowledgeBase(
    params: CreateKnowledgeBaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateKnowledgeBaseResponse, Unit]
  ): Request[CreateKnowledgeBaseResponse, AWSError] = js.native
  
  /**
    * Creates a session. A session is a contextual container used for generating recommendations. Amazon Connect creates a new Wisdom session for each contact on which Wisdom is enabled.
    */
  def createSession(): Request[CreateSessionResponse, AWSError] = js.native
  def createSession(callback: js.Function2[/* err */ AWSError, /* data */ CreateSessionResponse, Unit]): Request[CreateSessionResponse, AWSError] = js.native
  /**
    * Creates a session. A session is a contextual container used for generating recommendations. Amazon Connect creates a new Wisdom session for each contact on which Wisdom is enabled.
    */
  def createSession(params: CreateSessionRequest): Request[CreateSessionResponse, AWSError] = js.native
  def createSession(
    params: CreateSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSessionResponse, Unit]
  ): Request[CreateSessionResponse, AWSError] = js.native
  
  /**
    * Deletes an assistant.
    */
  def deleteAssistant(): Request[DeleteAssistantResponse, AWSError] = js.native
  def deleteAssistant(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssistantResponse, Unit]): Request[DeleteAssistantResponse, AWSError] = js.native
  /**
    * Deletes an assistant.
    */
  def deleteAssistant(params: DeleteAssistantRequest): Request[DeleteAssistantResponse, AWSError] = js.native
  def deleteAssistant(
    params: DeleteAssistantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssistantResponse, Unit]
  ): Request[DeleteAssistantResponse, AWSError] = js.native
  
  /**
    * Deletes an assistant association.
    */
  def deleteAssistantAssociation(): Request[DeleteAssistantAssociationResponse, AWSError] = js.native
  def deleteAssistantAssociation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssistantAssociationResponse, Unit]): Request[DeleteAssistantAssociationResponse, AWSError] = js.native
  /**
    * Deletes an assistant association.
    */
  def deleteAssistantAssociation(params: DeleteAssistantAssociationRequest): Request[DeleteAssistantAssociationResponse, AWSError] = js.native
  def deleteAssistantAssociation(
    params: DeleteAssistantAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAssistantAssociationResponse, Unit]
  ): Request[DeleteAssistantAssociationResponse, AWSError] = js.native
  
  /**
    * Deletes the content.
    */
  def deleteContent(): Request[DeleteContentResponse, AWSError] = js.native
  def deleteContent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContentResponse, Unit]): Request[DeleteContentResponse, AWSError] = js.native
  /**
    * Deletes the content.
    */
  def deleteContent(params: DeleteContentRequest): Request[DeleteContentResponse, AWSError] = js.native
  def deleteContent(
    params: DeleteContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContentResponse, Unit]
  ): Request[DeleteContentResponse, AWSError] = js.native
  
  /**
    * Deletes the knowledge base.  When you use this API to delete an external knowledge base such as Salesforce or ServiceNow, you must also delete the Amazon AppIntegrations DataIntegration. This is because you can't reuse the DataIntegration after it's been associated with an external knowledge base. However, you can delete and recreate it. See DeleteDataIntegration and CreateDataIntegration in the Amazon AppIntegrations API Reference. 
    */
  def deleteKnowledgeBase(): Request[DeleteKnowledgeBaseResponse, AWSError] = js.native
  def deleteKnowledgeBase(callback: js.Function2[/* err */ AWSError, /* data */ DeleteKnowledgeBaseResponse, Unit]): Request[DeleteKnowledgeBaseResponse, AWSError] = js.native
  /**
    * Deletes the knowledge base.  When you use this API to delete an external knowledge base such as Salesforce or ServiceNow, you must also delete the Amazon AppIntegrations DataIntegration. This is because you can't reuse the DataIntegration after it's been associated with an external knowledge base. However, you can delete and recreate it. See DeleteDataIntegration and CreateDataIntegration in the Amazon AppIntegrations API Reference. 
    */
  def deleteKnowledgeBase(params: DeleteKnowledgeBaseRequest): Request[DeleteKnowledgeBaseResponse, AWSError] = js.native
  def deleteKnowledgeBase(
    params: DeleteKnowledgeBaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteKnowledgeBaseResponse, Unit]
  ): Request[DeleteKnowledgeBaseResponse, AWSError] = js.native
  
  /**
    * Retrieves information about an assistant.
    */
  def getAssistant(): Request[GetAssistantResponse, AWSError] = js.native
  def getAssistant(callback: js.Function2[/* err */ AWSError, /* data */ GetAssistantResponse, Unit]): Request[GetAssistantResponse, AWSError] = js.native
  /**
    * Retrieves information about an assistant.
    */
  def getAssistant(params: GetAssistantRequest): Request[GetAssistantResponse, AWSError] = js.native
  def getAssistant(
    params: GetAssistantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssistantResponse, Unit]
  ): Request[GetAssistantResponse, AWSError] = js.native
  
  /**
    * Retrieves information about an assistant association.
    */
  def getAssistantAssociation(): Request[GetAssistantAssociationResponse, AWSError] = js.native
  def getAssistantAssociation(callback: js.Function2[/* err */ AWSError, /* data */ GetAssistantAssociationResponse, Unit]): Request[GetAssistantAssociationResponse, AWSError] = js.native
  /**
    * Retrieves information about an assistant association.
    */
  def getAssistantAssociation(params: GetAssistantAssociationRequest): Request[GetAssistantAssociationResponse, AWSError] = js.native
  def getAssistantAssociation(
    params: GetAssistantAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssistantAssociationResponse, Unit]
  ): Request[GetAssistantAssociationResponse, AWSError] = js.native
  
  /**
    * Retrieves content, including a pre-signed URL to download the content.
    */
  def getContent(): Request[GetContentResponse, AWSError] = js.native
  def getContent(callback: js.Function2[/* err */ AWSError, /* data */ GetContentResponse, Unit]): Request[GetContentResponse, AWSError] = js.native
  /**
    * Retrieves content, including a pre-signed URL to download the content.
    */
  def getContent(params: GetContentRequest): Request[GetContentResponse, AWSError] = js.native
  def getContent(
    params: GetContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContentResponse, Unit]
  ): Request[GetContentResponse, AWSError] = js.native
  
  /**
    * Retrieves summary information about the content.
    */
  def getContentSummary(): Request[GetContentSummaryResponse, AWSError] = js.native
  def getContentSummary(callback: js.Function2[/* err */ AWSError, /* data */ GetContentSummaryResponse, Unit]): Request[GetContentSummaryResponse, AWSError] = js.native
  /**
    * Retrieves summary information about the content.
    */
  def getContentSummary(params: GetContentSummaryRequest): Request[GetContentSummaryResponse, AWSError] = js.native
  def getContentSummary(
    params: GetContentSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContentSummaryResponse, Unit]
  ): Request[GetContentSummaryResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the knowledge base.
    */
  def getKnowledgeBase(): Request[GetKnowledgeBaseResponse, AWSError] = js.native
  def getKnowledgeBase(callback: js.Function2[/* err */ AWSError, /* data */ GetKnowledgeBaseResponse, Unit]): Request[GetKnowledgeBaseResponse, AWSError] = js.native
  /**
    * Retrieves information about the knowledge base.
    */
  def getKnowledgeBase(params: GetKnowledgeBaseRequest): Request[GetKnowledgeBaseResponse, AWSError] = js.native
  def getKnowledgeBase(
    params: GetKnowledgeBaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetKnowledgeBaseResponse, Unit]
  ): Request[GetKnowledgeBaseResponse, AWSError] = js.native
  
  /**
    * Retrieves recommendations for the specified session. To avoid retrieving the same recommendations in subsequent calls, use NotifyRecommendationsReceived. This API supports long-polling behavior with the waitTimeSeconds parameter. Short poll is the default behavior and only returns recommendations already available. To perform a manual query against an assistant, use QueryAssistant.
    */
  def getRecommendations(): Request[GetRecommendationsResponse, AWSError] = js.native
  def getRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationsResponse, Unit]): Request[GetRecommendationsResponse, AWSError] = js.native
  /**
    * Retrieves recommendations for the specified session. To avoid retrieving the same recommendations in subsequent calls, use NotifyRecommendationsReceived. This API supports long-polling behavior with the waitTimeSeconds parameter. Short poll is the default behavior and only returns recommendations already available. To perform a manual query against an assistant, use QueryAssistant.
    */
  def getRecommendations(params: GetRecommendationsRequest): Request[GetRecommendationsResponse, AWSError] = js.native
  def getRecommendations(
    params: GetRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationsResponse, Unit]
  ): Request[GetRecommendationsResponse, AWSError] = js.native
  
  /**
    * Retrieves information for a specified session.
    */
  def getSession(): Request[GetSessionResponse, AWSError] = js.native
  def getSession(callback: js.Function2[/* err */ AWSError, /* data */ GetSessionResponse, Unit]): Request[GetSessionResponse, AWSError] = js.native
  /**
    * Retrieves information for a specified session.
    */
  def getSession(params: GetSessionRequest): Request[GetSessionResponse, AWSError] = js.native
  def getSession(
    params: GetSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSessionResponse, Unit]
  ): Request[GetSessionResponse, AWSError] = js.native
  
  /**
    * Lists information about assistant associations.
    */
  def listAssistantAssociations(): Request[ListAssistantAssociationsResponse, AWSError] = js.native
  def listAssistantAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListAssistantAssociationsResponse, Unit]): Request[ListAssistantAssociationsResponse, AWSError] = js.native
  /**
    * Lists information about assistant associations.
    */
  def listAssistantAssociations(params: ListAssistantAssociationsRequest): Request[ListAssistantAssociationsResponse, AWSError] = js.native
  def listAssistantAssociations(
    params: ListAssistantAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssistantAssociationsResponse, Unit]
  ): Request[ListAssistantAssociationsResponse, AWSError] = js.native
  
  /**
    * Lists information about assistants.
    */
  def listAssistants(): Request[ListAssistantsResponse, AWSError] = js.native
  def listAssistants(callback: js.Function2[/* err */ AWSError, /* data */ ListAssistantsResponse, Unit]): Request[ListAssistantsResponse, AWSError] = js.native
  /**
    * Lists information about assistants.
    */
  def listAssistants(params: ListAssistantsRequest): Request[ListAssistantsResponse, AWSError] = js.native
  def listAssistants(
    params: ListAssistantsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssistantsResponse, Unit]
  ): Request[ListAssistantsResponse, AWSError] = js.native
  
  /**
    * Lists the content.
    */
  def listContents(): Request[ListContentsResponse, AWSError] = js.native
  def listContents(callback: js.Function2[/* err */ AWSError, /* data */ ListContentsResponse, Unit]): Request[ListContentsResponse, AWSError] = js.native
  /**
    * Lists the content.
    */
  def listContents(params: ListContentsRequest): Request[ListContentsResponse, AWSError] = js.native
  def listContents(
    params: ListContentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContentsResponse, Unit]
  ): Request[ListContentsResponse, AWSError] = js.native
  
  /**
    * Lists the knowledge bases.
    */
  def listKnowledgeBases(): Request[ListKnowledgeBasesResponse, AWSError] = js.native
  def listKnowledgeBases(callback: js.Function2[/* err */ AWSError, /* data */ ListKnowledgeBasesResponse, Unit]): Request[ListKnowledgeBasesResponse, AWSError] = js.native
  /**
    * Lists the knowledge bases.
    */
  def listKnowledgeBases(params: ListKnowledgeBasesRequest): Request[ListKnowledgeBasesResponse, AWSError] = js.native
  def listKnowledgeBases(
    params: ListKnowledgeBasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListKnowledgeBasesResponse, Unit]
  ): Request[ListKnowledgeBasesResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified recommendations from the specified assistant's queue of newly available recommendations. You can use this API in conjunction with GetRecommendations and a waitTimeSeconds input for long-polling behavior and avoiding duplicate recommendations.
    */
  def notifyRecommendationsReceived(): Request[NotifyRecommendationsReceivedResponse, AWSError] = js.native
  def notifyRecommendationsReceived(callback: js.Function2[/* err */ AWSError, /* data */ NotifyRecommendationsReceivedResponse, Unit]): Request[NotifyRecommendationsReceivedResponse, AWSError] = js.native
  /**
    * Removes the specified recommendations from the specified assistant's queue of newly available recommendations. You can use this API in conjunction with GetRecommendations and a waitTimeSeconds input for long-polling behavior and avoiding duplicate recommendations.
    */
  def notifyRecommendationsReceived(params: NotifyRecommendationsReceivedRequest): Request[NotifyRecommendationsReceivedResponse, AWSError] = js.native
  def notifyRecommendationsReceived(
    params: NotifyRecommendationsReceivedRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ NotifyRecommendationsReceivedResponse, Unit]
  ): Request[NotifyRecommendationsReceivedResponse, AWSError] = js.native
  
  /**
    * Performs a manual search against the specified assistant. To retrieve recommendations for an assistant, use GetRecommendations. 
    */
  def queryAssistant(): Request[QueryAssistantResponse, AWSError] = js.native
  def queryAssistant(callback: js.Function2[/* err */ AWSError, /* data */ QueryAssistantResponse, Unit]): Request[QueryAssistantResponse, AWSError] = js.native
  /**
    * Performs a manual search against the specified assistant. To retrieve recommendations for an assistant, use GetRecommendations. 
    */
  def queryAssistant(params: QueryAssistantRequest): Request[QueryAssistantResponse, AWSError] = js.native
  def queryAssistant(
    params: QueryAssistantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ QueryAssistantResponse, Unit]
  ): Request[QueryAssistantResponse, AWSError] = js.native
  
  /**
    * Removes a URI template from a knowledge base.
    */
  def removeKnowledgeBaseTemplateUri(): Request[RemoveKnowledgeBaseTemplateUriResponse, AWSError] = js.native
  def removeKnowledgeBaseTemplateUri(
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveKnowledgeBaseTemplateUriResponse, Unit]
  ): Request[RemoveKnowledgeBaseTemplateUriResponse, AWSError] = js.native
  /**
    * Removes a URI template from a knowledge base.
    */
  def removeKnowledgeBaseTemplateUri(params: RemoveKnowledgeBaseTemplateUriRequest): Request[RemoveKnowledgeBaseTemplateUriResponse, AWSError] = js.native
  def removeKnowledgeBaseTemplateUri(
    params: RemoveKnowledgeBaseTemplateUriRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveKnowledgeBaseTemplateUriResponse, Unit]
  ): Request[RemoveKnowledgeBaseTemplateUriResponse, AWSError] = js.native
  
  /**
    * Searches for content in a specified knowledge base. Can be used to get a specific content resource by its name.
    */
  def searchContent(): Request[SearchContentResponse, AWSError] = js.native
  def searchContent(callback: js.Function2[/* err */ AWSError, /* data */ SearchContentResponse, Unit]): Request[SearchContentResponse, AWSError] = js.native
  /**
    * Searches for content in a specified knowledge base. Can be used to get a specific content resource by its name.
    */
  def searchContent(params: SearchContentRequest): Request[SearchContentResponse, AWSError] = js.native
  def searchContent(
    params: SearchContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchContentResponse, Unit]
  ): Request[SearchContentResponse, AWSError] = js.native
  
  /**
    * Searches for sessions.
    */
  def searchSessions(): Request[SearchSessionsResponse, AWSError] = js.native
  def searchSessions(callback: js.Function2[/* err */ AWSError, /* data */ SearchSessionsResponse, Unit]): Request[SearchSessionsResponse, AWSError] = js.native
  /**
    * Searches for sessions.
    */
  def searchSessions(params: SearchSessionsRequest): Request[SearchSessionsResponse, AWSError] = js.native
  def searchSessions(
    params: SearchSessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchSessionsResponse, Unit]
  ): Request[SearchSessionsResponse, AWSError] = js.native
  
  /**
    * Get a URL to upload content to a knowledge base. To upload content, first make a PUT request to the returned URL with your file, making sure to include the required headers. Then use CreateContent to finalize the content creation process or UpdateContent to modify an existing resource. You can only upload content to a knowledge base of type CUSTOM.
    */
  def startContentUpload(): Request[StartContentUploadResponse, AWSError] = js.native
  def startContentUpload(callback: js.Function2[/* err */ AWSError, /* data */ StartContentUploadResponse, Unit]): Request[StartContentUploadResponse, AWSError] = js.native
  /**
    * Get a URL to upload content to a knowledge base. To upload content, first make a PUT request to the returned URL with your file, making sure to include the required headers. Then use CreateContent to finalize the content creation process or UpdateContent to modify an existing resource. You can only upload content to a knowledge base of type CUSTOM.
    */
  def startContentUpload(params: StartContentUploadRequest): Request[StartContentUploadResponse, AWSError] = js.native
  def startContentUpload(
    params: StartContentUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartContentUploadResponse, Unit]
  ): Request[StartContentUploadResponse, AWSError] = js.native
  
  /**
    * Adds the specified tags to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates information about the content.
    */
  def updateContent(): Request[UpdateContentResponse, AWSError] = js.native
  def updateContent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContentResponse, Unit]): Request[UpdateContentResponse, AWSError] = js.native
  /**
    * Updates information about the content.
    */
  def updateContent(params: UpdateContentRequest): Request[UpdateContentResponse, AWSError] = js.native
  def updateContent(
    params: UpdateContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContentResponse, Unit]
  ): Request[UpdateContentResponse, AWSError] = js.native
  
  /**
    * Updates the template URI of a knowledge base. This is only supported for knowledge bases of type EXTERNAL. Include a single variable in ${variable} format; this interpolated by Wisdom using ingested content. For example, if you ingest a Salesforce article, it has an Id value, and you can set the template URI to https://myInstanceName.lightning.force.com/lightning/r/Knowledge__kav/ *${Id}*view. 
    */
  def updateKnowledgeBaseTemplateUri(): Request[UpdateKnowledgeBaseTemplateUriResponse, AWSError] = js.native
  def updateKnowledgeBaseTemplateUri(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateKnowledgeBaseTemplateUriResponse, Unit]
  ): Request[UpdateKnowledgeBaseTemplateUriResponse, AWSError] = js.native
  /**
    * Updates the template URI of a knowledge base. This is only supported for knowledge bases of type EXTERNAL. Include a single variable in ${variable} format; this interpolated by Wisdom using ingested content. For example, if you ingest a Salesforce article, it has an Id value, and you can set the template URI to https://myInstanceName.lightning.force.com/lightning/r/Knowledge__kav/ *${Id}*view. 
    */
  def updateKnowledgeBaseTemplateUri(params: UpdateKnowledgeBaseTemplateUriRequest): Request[UpdateKnowledgeBaseTemplateUriResponse, AWSError] = js.native
  def updateKnowledgeBaseTemplateUri(
    params: UpdateKnowledgeBaseTemplateUriRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateKnowledgeBaseTemplateUriResponse, Unit]
  ): Request[UpdateKnowledgeBaseTemplateUriResponse, AWSError] = js.native
}
