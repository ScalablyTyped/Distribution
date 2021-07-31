package typings.awsSdk.mediastoreMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStore extends Service {
  
  @JSName("config")
  var config_MediaStore: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
    */
  def createContainer(): Request[CreateContainerOutput, AWSError] = js.native
  def createContainer(callback: js.Function2[/* err */ AWSError, /* data */ CreateContainerOutput, Unit]): Request[CreateContainerOutput, AWSError] = js.native
  /**
    * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
    */
  def createContainer(params: CreateContainerInput): Request[CreateContainerOutput, AWSError] = js.native
  def createContainer(
    params: CreateContainerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContainerOutput, Unit]
  ): Request[CreateContainerOutput, AWSError] = js.native
  
  /**
    * Deletes the specified container. Before you make a DeleteContainer request, delete any objects in the container or in any folders in the container. You can delete only empty containers. 
    */
  def deleteContainer(): Request[DeleteContainerOutput, AWSError] = js.native
  def deleteContainer(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContainerOutput, Unit]): Request[DeleteContainerOutput, AWSError] = js.native
  /**
    * Deletes the specified container. Before you make a DeleteContainer request, delete any objects in the container or in any folders in the container. You can delete only empty containers. 
    */
  def deleteContainer(params: DeleteContainerInput): Request[DeleteContainerOutput, AWSError] = js.native
  def deleteContainer(
    params: DeleteContainerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContainerOutput, Unit]
  ): Request[DeleteContainerOutput, AWSError] = js.native
  
  /**
    * Deletes the access policy that is associated with the specified container.
    */
  def deleteContainerPolicy(): Request[DeleteContainerPolicyOutput, AWSError] = js.native
  def deleteContainerPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContainerPolicyOutput, Unit]): Request[DeleteContainerPolicyOutput, AWSError] = js.native
  /**
    * Deletes the access policy that is associated with the specified container.
    */
  def deleteContainerPolicy(params: DeleteContainerPolicyInput): Request[DeleteContainerPolicyOutput, AWSError] = js.native
  def deleteContainerPolicy(
    params: DeleteContainerPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContainerPolicyOutput, Unit]
  ): Request[DeleteContainerPolicyOutput, AWSError] = js.native
  
  /**
    * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:DeleteCorsPolicy action. The container owner has this permission by default and can grant this permission to others.
    */
  def deleteCorsPolicy(): Request[DeleteCorsPolicyOutput, AWSError] = js.native
  def deleteCorsPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCorsPolicyOutput, Unit]): Request[DeleteCorsPolicyOutput, AWSError] = js.native
  /**
    * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:DeleteCorsPolicy action. The container owner has this permission by default and can grant this permission to others.
    */
  def deleteCorsPolicy(params: DeleteCorsPolicyInput): Request[DeleteCorsPolicyOutput, AWSError] = js.native
  def deleteCorsPolicy(
    params: DeleteCorsPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCorsPolicyOutput, Unit]
  ): Request[DeleteCorsPolicyOutput, AWSError] = js.native
  
  /**
    * Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.
    */
  def deleteLifecyclePolicy(): Request[DeleteLifecyclePolicyOutput, AWSError] = js.native
  def deleteLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLifecyclePolicyOutput, Unit]): Request[DeleteLifecyclePolicyOutput, AWSError] = js.native
  /**
    * Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.
    */
  def deleteLifecyclePolicy(params: DeleteLifecyclePolicyInput): Request[DeleteLifecyclePolicyOutput, AWSError] = js.native
  def deleteLifecyclePolicy(
    params: DeleteLifecyclePolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLifecyclePolicyOutput, Unit]
  ): Request[DeleteLifecyclePolicyOutput, AWSError] = js.native
  
  /**
    * Deletes the metric policy that is associated with the specified container. If there is no metric policy associated with the container, MediaStore doesn't send metrics to CloudWatch.
    */
  def deleteMetricPolicy(): Request[DeleteMetricPolicyOutput, AWSError] = js.native
  def deleteMetricPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMetricPolicyOutput, Unit]): Request[DeleteMetricPolicyOutput, AWSError] = js.native
  /**
    * Deletes the metric policy that is associated with the specified container. If there is no metric policy associated with the container, MediaStore doesn't send metrics to CloudWatch.
    */
  def deleteMetricPolicy(params: DeleteMetricPolicyInput): Request[DeleteMetricPolicyOutput, AWSError] = js.native
  def deleteMetricPolicy(
    params: DeleteMetricPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMetricPolicyOutput, Unit]
  ): Request[DeleteMetricPolicyOutput, AWSError] = js.native
  
  /**
    * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint does not change after it has been assigned. The DescribeContainer request returns a single Container object based on ContainerName. To return all Container objects that are associated with a specified AWS account, use ListContainers.
    */
  def describeContainer(): Request[DescribeContainerOutput, AWSError] = js.native
  def describeContainer(callback: js.Function2[/* err */ AWSError, /* data */ DescribeContainerOutput, Unit]): Request[DescribeContainerOutput, AWSError] = js.native
  /**
    * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint does not change after it has been assigned. The DescribeContainer request returns a single Container object based on ContainerName. To return all Container objects that are associated with a specified AWS account, use ListContainers.
    */
  def describeContainer(params: DescribeContainerInput): Request[DescribeContainerOutput, AWSError] = js.native
  def describeContainer(
    params: DescribeContainerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContainerOutput, Unit]
  ): Request[DescribeContainerOutput, AWSError] = js.native
  
  /**
    * Retrieves the access policy for the specified container. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide.
    */
  def getContainerPolicy(): Request[GetContainerPolicyOutput, AWSError] = js.native
  def getContainerPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetContainerPolicyOutput, Unit]): Request[GetContainerPolicyOutput, AWSError] = js.native
  /**
    * Retrieves the access policy for the specified container. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide.
    */
  def getContainerPolicy(params: GetContainerPolicyInput): Request[GetContainerPolicyOutput, AWSError] = js.native
  def getContainerPolicy(
    params: GetContainerPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContainerPolicyOutput, Unit]
  ): Request[GetContainerPolicyOutput, AWSError] = js.native
  
  /**
    * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:GetCorsPolicy action. By default, the container owner has this permission and can grant it to others.
    */
  def getCorsPolicy(): Request[GetCorsPolicyOutput, AWSError] = js.native
  def getCorsPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetCorsPolicyOutput, Unit]): Request[GetCorsPolicyOutput, AWSError] = js.native
  /**
    * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:GetCorsPolicy action. By default, the container owner has this permission and can grant it to others.
    */
  def getCorsPolicy(params: GetCorsPolicyInput): Request[GetCorsPolicyOutput, AWSError] = js.native
  def getCorsPolicy(
    params: GetCorsPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCorsPolicyOutput, Unit]
  ): Request[GetCorsPolicyOutput, AWSError] = js.native
  
  /**
    * Retrieves the object lifecycle policy that is assigned to a container.
    */
  def getLifecyclePolicy(): Request[GetLifecyclePolicyOutput, AWSError] = js.native
  def getLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyOutput, Unit]): Request[GetLifecyclePolicyOutput, AWSError] = js.native
  /**
    * Retrieves the object lifecycle policy that is assigned to a container.
    */
  def getLifecyclePolicy(params: GetLifecyclePolicyInput): Request[GetLifecyclePolicyOutput, AWSError] = js.native
  def getLifecyclePolicy(
    params: GetLifecyclePolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyOutput, Unit]
  ): Request[GetLifecyclePolicyOutput, AWSError] = js.native
  
  /**
    * Returns the metric policy for the specified container. 
    */
  def getMetricPolicy(): Request[GetMetricPolicyOutput, AWSError] = js.native
  def getMetricPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetMetricPolicyOutput, Unit]): Request[GetMetricPolicyOutput, AWSError] = js.native
  /**
    * Returns the metric policy for the specified container. 
    */
  def getMetricPolicy(params: GetMetricPolicyInput): Request[GetMetricPolicyOutput, AWSError] = js.native
  def getMetricPolicy(
    params: GetMetricPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMetricPolicyOutput, Unit]
  ): Request[GetMetricPolicyOutput, AWSError] = js.native
  
  /**
    * Lists the properties of all containers in AWS Elemental MediaStore.  You can query to receive all the containers in one response. Or you can include the MaxResults parameter to receive a limited number of containers in each response. In this case, the response includes a token. To get the next set of containers, send the command again, this time with the NextToken parameter (with the returned token as its value). The next set of responses appears, with a token if there are still more containers to receive.  See also DescribeContainer, which gets the properties of one container. 
    */
  def listContainers(): Request[ListContainersOutput, AWSError] = js.native
  def listContainers(callback: js.Function2[/* err */ AWSError, /* data */ ListContainersOutput, Unit]): Request[ListContainersOutput, AWSError] = js.native
  /**
    * Lists the properties of all containers in AWS Elemental MediaStore.  You can query to receive all the containers in one response. Or you can include the MaxResults parameter to receive a limited number of containers in each response. In this case, the response includes a token. To get the next set of containers, send the command again, this time with the NextToken parameter (with the returned token as its value). The next set of responses appears, with a token if there are still more containers to receive.  See also DescribeContainer, which gets the properties of one container. 
    */
  def listContainers(params: ListContainersInput): Request[ListContainersOutput, AWSError] = js.native
  def listContainers(
    params: ListContainersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContainersOutput, Unit]
  ): Request[ListContainersOutput, AWSError] = js.native
  
  /**
    * Returns a list of the tags assigned to the specified container. 
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified container. 
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Creates an access policy for the specified container to restrict the users and clients that can access it. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide. For this release of the REST API, you can create only one policy for a container. If you enter PutContainerPolicy twice, the second command modifies the existing policy. 
    */
  def putContainerPolicy(): Request[PutContainerPolicyOutput, AWSError] = js.native
  def putContainerPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutContainerPolicyOutput, Unit]): Request[PutContainerPolicyOutput, AWSError] = js.native
  /**
    * Creates an access policy for the specified container to restrict the users and clients that can access it. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide. For this release of the REST API, you can create only one policy for a container. If you enter PutContainerPolicy twice, the second command modifies the existing policy. 
    */
  def putContainerPolicy(params: PutContainerPolicyInput): Request[PutContainerPolicyOutput, AWSError] = js.native
  def putContainerPolicy(
    params: PutContainerPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutContainerPolicyOutput, Unit]
  ): Request[PutContainerPolicyOutput, AWSError] = js.native
  
  /**
    * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest capability. To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed. To learn more about CORS, see Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore.
    */
  def putCorsPolicy(): Request[PutCorsPolicyOutput, AWSError] = js.native
  def putCorsPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutCorsPolicyOutput, Unit]): Request[PutCorsPolicyOutput, AWSError] = js.native
  /**
    * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest capability. To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed. To learn more about CORS, see Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore.
    */
  def putCorsPolicy(params: PutCorsPolicyInput): Request[PutCorsPolicyOutput, AWSError] = js.native
  def putCorsPolicy(
    params: PutCorsPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutCorsPolicyOutput, Unit]
  ): Request[PutCorsPolicyOutput, AWSError] = js.native
  
  /**
    * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take effect. For information about how to construct an object lifecycle policy, see Components of an Object Lifecycle Policy.
    */
  def putLifecyclePolicy(): Request[PutLifecyclePolicyOutput, AWSError] = js.native
  def putLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutLifecyclePolicyOutput, Unit]): Request[PutLifecyclePolicyOutput, AWSError] = js.native
  /**
    * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take effect. For information about how to construct an object lifecycle policy, see Components of an Object Lifecycle Policy.
    */
  def putLifecyclePolicy(params: PutLifecyclePolicyInput): Request[PutLifecyclePolicyOutput, AWSError] = js.native
  def putLifecyclePolicy(
    params: PutLifecyclePolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLifecyclePolicyOutput, Unit]
  ): Request[PutLifecyclePolicyOutput, AWSError] = js.native
  
  /**
    * The metric policy that you want to add to the container. A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. It takes up to 20 minutes for the new policy to take effect.
    */
  def putMetricPolicy(): Request[PutMetricPolicyOutput, AWSError] = js.native
  def putMetricPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutMetricPolicyOutput, Unit]): Request[PutMetricPolicyOutput, AWSError] = js.native
  /**
    * The metric policy that you want to add to the container. A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. It takes up to 20 minutes for the new policy to take effect.
    */
  def putMetricPolicy(params: PutMetricPolicyInput): Request[PutMetricPolicyOutput, AWSError] = js.native
  def putMetricPolicy(
    params: PutMetricPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutMetricPolicyOutput, Unit]
  ): Request[PutMetricPolicyOutput, AWSError] = js.native
  
  /**
    * Starts access logging on the specified container. When you enable access logging on a container, MediaStore delivers access logs for objects stored in that container to Amazon CloudWatch Logs.
    */
  def startAccessLogging(): Request[StartAccessLoggingOutput, AWSError] = js.native
  def startAccessLogging(callback: js.Function2[/* err */ AWSError, /* data */ StartAccessLoggingOutput, Unit]): Request[StartAccessLoggingOutput, AWSError] = js.native
  /**
    * Starts access logging on the specified container. When you enable access logging on a container, MediaStore delivers access logs for objects stored in that container to Amazon CloudWatch Logs.
    */
  def startAccessLogging(params: StartAccessLoggingInput): Request[StartAccessLoggingOutput, AWSError] = js.native
  def startAccessLogging(
    params: StartAccessLoggingInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAccessLoggingOutput, Unit]
  ): Request[StartAccessLoggingOutput, AWSError] = js.native
  
  /**
    * Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.
    */
  def stopAccessLogging(): Request[StopAccessLoggingOutput, AWSError] = js.native
  def stopAccessLogging(callback: js.Function2[/* err */ AWSError, /* data */ StopAccessLoggingOutput, Unit]): Request[StopAccessLoggingOutput, AWSError] = js.native
  /**
    * Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.
    */
  def stopAccessLogging(params: StopAccessLoggingInput): Request[StopAccessLoggingOutput, AWSError] = js.native
  def stopAccessLogging(
    params: StopAccessLoggingInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopAccessLoggingOutput, Unit]
  ): Request[StopAccessLoggingOutput, AWSError] = js.native
  
  /**
    * Adds tags to the specified AWS Elemental MediaStore container. Tags are key:value pairs that you can associate with AWS resources. For example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each container. For more information about tagging, including naming and usage conventions, see Tagging Resources in MediaStore.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds tags to the specified AWS Elemental MediaStore container. Tags are key:value pairs that you can associate with AWS resources. For example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each container. For more information about tagging, including naming and usage conventions, see Tagging Resources in MediaStore.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Removes tags from the specified container. You can specify one or more tags to remove. 
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes tags from the specified container. You can specify one or more tags to remove. 
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
}
