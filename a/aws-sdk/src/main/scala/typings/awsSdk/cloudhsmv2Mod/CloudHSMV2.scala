package typings.awsSdk.cloudhsmv2Mod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudHSMV2 extends Service {
  
  @JSName("config")
  var config_CloudHSMV2: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Copy an AWS CloudHSM cluster backup to a different region.
    */
  def copyBackupToRegion(): Request[CopyBackupToRegionResponse, AWSError] = js.native
  def copyBackupToRegion(callback: js.Function2[/* err */ AWSError, /* data */ CopyBackupToRegionResponse, Unit]): Request[CopyBackupToRegionResponse, AWSError] = js.native
  /**
    * Copy an AWS CloudHSM cluster backup to a different region.
    */
  def copyBackupToRegion(params: CopyBackupToRegionRequest): Request[CopyBackupToRegionResponse, AWSError] = js.native
  def copyBackupToRegion(
    params: CopyBackupToRegionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyBackupToRegionResponse, Unit]
  ): Request[CopyBackupToRegionResponse, AWSError] = js.native
  
  /**
    * Creates a new AWS CloudHSM cluster.
    */
  def createCluster(): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * Creates a new AWS CloudHSM cluster.
    */
  def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]
  ): Request[CreateClusterResponse, AWSError] = js.native
  
  /**
    * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
    */
  def createHsm(): Request[CreateHsmResponse, AWSError] = js.native
  def createHsm(callback: js.Function2[/* err */ AWSError, /* data */ CreateHsmResponse, Unit]): Request[CreateHsmResponse, AWSError] = js.native
  /**
    * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
    */
  def createHsm(params: CreateHsmRequest): Request[CreateHsmResponse, AWSError] = js.native
  def createHsm(
    params: CreateHsmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHsmResponse, Unit]
  ): Request[CreateHsmResponse, AWSError] = js.native
  
  /**
    * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request is made. For more information on restoring a backup, see RestoreBackup.
    */
  def deleteBackup(): Request[DeleteBackupResponse, AWSError] = js.native
  def deleteBackup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackupResponse, Unit]): Request[DeleteBackupResponse, AWSError] = js.native
  /**
    * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request is made. For more information on restoring a backup, see RestoreBackup.
    */
  def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse, AWSError] = js.native
  def deleteBackup(
    params: DeleteBackupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackupResponse, Unit]
  ): Request[DeleteBackupResponse, AWSError] = js.native
  
  /**
    * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the cluster. To see if the cluster contains any HSMs, use DescribeClusters. To delete an HSM, use DeleteHsm.
    */
  def deleteCluster(): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the cluster. To see if the cluster contains any HSMs, use DescribeClusters. To delete an HSM, use DeleteHsm.
    */
  def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]
  ): Request[DeleteClusterResponse, AWSError] = js.native
  
  /**
    * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To find these values, use DescribeClusters.
    */
  def deleteHsm(): Request[DeleteHsmResponse, AWSError] = js.native
  def deleteHsm(callback: js.Function2[/* err */ AWSError, /* data */ DeleteHsmResponse, Unit]): Request[DeleteHsmResponse, AWSError] = js.native
  /**
    * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To find these values, use DescribeClusters.
    */
  def deleteHsm(params: DeleteHsmRequest): Request[DeleteHsmResponse, AWSError] = js.native
  def deleteHsm(
    params: DeleteHsmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteHsmResponse, Unit]
  ): Request[DeleteHsmResponse, AWSError] = js.native
  
  /**
    * Gets information about backups of AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the backups. When the response contains only a subset of backups, it includes a NextToken value. Use this value in a subsequent DescribeBackups request to get more backups. When you receive a response with no NextToken (or an empty or null value), that means there are no more backups to get.
    */
  def describeBackups(): Request[DescribeBackupsResponse, AWSError] = js.native
  def describeBackups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBackupsResponse, Unit]): Request[DescribeBackupsResponse, AWSError] = js.native
  /**
    * Gets information about backups of AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the backups. When the response contains only a subset of backups, it includes a NextToken value. Use this value in a subsequent DescribeBackups request to get more backups. When you receive a response with no NextToken (or an empty or null value), that means there are no more backups to get.
    */
  def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse, AWSError] = js.native
  def describeBackups(
    params: DescribeBackupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBackupsResponse, Unit]
  ): Request[DescribeBackupsResponse, AWSError] = js.native
  
  /**
    * Gets information about AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the clusters. When the response contains only a subset of clusters, it includes a NextToken value. Use this value in a subsequent DescribeClusters request to get more clusters. When you receive a response with no NextToken (or an empty or null value), that means there are no more clusters to get.
    */
  def describeClusters(): Request[DescribeClustersResponse, AWSError] = js.native
  def describeClusters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClustersResponse, Unit]): Request[DescribeClustersResponse, AWSError] = js.native
  /**
    * Gets information about AWS CloudHSM clusters. This is a paginated operation, which means that each response might contain only a subset of all the clusters. When the response contains only a subset of clusters, it includes a NextToken value. Use this value in a subsequent DescribeClusters request to get more clusters. When you receive a response with no NextToken (or an empty or null value), that means there are no more clusters to get.
    */
  def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse, AWSError] = js.native
  def describeClusters(
    params: DescribeClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClustersResponse, Unit]
  ): Request[DescribeClustersResponse, AWSError] = js.native
  
  /**
    * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate signing request (CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters.
    */
  def initializeCluster(): Request[InitializeClusterResponse, AWSError] = js.native
  def initializeCluster(callback: js.Function2[/* err */ AWSError, /* data */ InitializeClusterResponse, Unit]): Request[InitializeClusterResponse, AWSError] = js.native
  /**
    * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate signing request (CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters.
    */
  def initializeCluster(params: InitializeClusterRequest): Request[InitializeClusterResponse, AWSError] = js.native
  def initializeCluster(
    params: InitializeClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InitializeClusterResponse, Unit]
  ): Request[InitializeClusterResponse, AWSError] = js.native
  
  /**
    * Gets a list of tags for the specified AWS CloudHSM cluster. This is a paginated operation, which means that each response might contain only a subset of all the tags. When the response contains only a subset of tags, it includes a NextToken value. Use this value in a subsequent ListTags request to get more tags. When you receive a response with no NextToken (or an empty or null value), that means there are no more tags to get.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Gets a list of tags for the specified AWS CloudHSM cluster. This is a paginated operation, which means that each response might contain only a subset of all the tags. When the response contains only a subset of tags, it includes a NextToken value. Use this value in a subsequent ListTags request to get more tags. When you receive a response with no NextToken (or an empty or null value), that means there are no more tags to get.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  
  /**
    * Modifies attributes for AWS CloudHSM backup.
    */
  def modifyBackupAttributes(): Request[ModifyBackupAttributesResponse, AWSError] = js.native
  def modifyBackupAttributes(callback: js.Function2[/* err */ AWSError, /* data */ ModifyBackupAttributesResponse, Unit]): Request[ModifyBackupAttributesResponse, AWSError] = js.native
  /**
    * Modifies attributes for AWS CloudHSM backup.
    */
  def modifyBackupAttributes(params: ModifyBackupAttributesRequest): Request[ModifyBackupAttributesResponse, AWSError] = js.native
  def modifyBackupAttributes(
    params: ModifyBackupAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyBackupAttributesResponse, Unit]
  ): Request[ModifyBackupAttributesResponse, AWSError] = js.native
  
  /**
    * Modifies AWS CloudHSM cluster.
    */
  def modifyCluster(): Request[ModifyClusterResponse, AWSError] = js.native
  def modifyCluster(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterResponse, Unit]): Request[ModifyClusterResponse, AWSError] = js.native
  /**
    * Modifies AWS CloudHSM cluster.
    */
  def modifyCluster(params: ModifyClusterRequest): Request[ModifyClusterResponse, AWSError] = js.native
  def modifyCluster(
    params: ModifyClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterResponse, Unit]
  ): Request[ModifyClusterResponse, AWSError] = js.native
  
  /**
    * Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state. For mor information on deleting a backup, see DeleteBackup.
    */
  def restoreBackup(): Request[RestoreBackupResponse, AWSError] = js.native
  def restoreBackup(callback: js.Function2[/* err */ AWSError, /* data */ RestoreBackupResponse, Unit]): Request[RestoreBackupResponse, AWSError] = js.native
  /**
    * Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state. For mor information on deleting a backup, see DeleteBackup.
    */
  def restoreBackup(params: RestoreBackupRequest): Request[RestoreBackupResponse, AWSError] = js.native
  def restoreBackup(
    params: RestoreBackupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreBackupResponse, Unit]
  ): Request[RestoreBackupResponse, AWSError] = js.native
  
  /**
    * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
