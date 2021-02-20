package typings.awsSdk.redshiftMod

import typings.awsSdk.anon.DescribeClusterSnapshotsM
import typings.awsSdk.anon.DescribeClustersMessagewa
import typings.awsSdk.awsSdkStrings.clusterAvailable
import typings.awsSdk.awsSdkStrings.clusterDeleted
import typings.awsSdk.awsSdkStrings.clusterRestored
import typings.awsSdk.awsSdkStrings.snapshotAvailable
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redshift extends Service {
  
  /**
    * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type, or number of nodes) and no additional costs. 
    */
  def acceptReservedNodeExchange(): Request[AcceptReservedNodeExchangeOutputMessage, AWSError] = js.native
  def acceptReservedNodeExchange(
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptReservedNodeExchangeOutputMessage, Unit]
  ): Request[AcceptReservedNodeExchangeOutputMessage, AWSError] = js.native
  /**
    * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type, or number of nodes) and no additional costs. 
    */
  def acceptReservedNodeExchange(params: AcceptReservedNodeExchangeInputMessage): Request[AcceptReservedNodeExchangeOutputMessage, AWSError] = js.native
  def acceptReservedNodeExchange(
    params: AcceptReservedNodeExchangeInputMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptReservedNodeExchangeOutputMessage, Unit]
  ): Request[AcceptReservedNodeExchangeOutputMessage, AWSError] = js.native
  
  /**
    * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group. You can add as many as 20 ingress rules to an Amazon Redshift security group. If you authorize access to an Amazon EC2 security group, specify EC2SecurityGroupName and EC2SecurityGroupOwnerId. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS Region.  If you authorize access to a CIDR/IP address range, specify CIDRIP. For an overview of CIDR blocks, see the Wikipedia article on Classless Inter-Domain Routing.  You must also associate the security group with a cluster so that clients running on these IP addresses or the EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to Working with Security Groups in the Amazon Redshift Cluster Management Guide.
    */
  def authorizeClusterSecurityGroupIngress(): Request[AuthorizeClusterSecurityGroupIngressResult, AWSError] = js.native
  def authorizeClusterSecurityGroupIngress(
    callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeClusterSecurityGroupIngressResult, Unit]
  ): Request[AuthorizeClusterSecurityGroupIngressResult, AWSError] = js.native
  /**
    * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group. You can add as many as 20 ingress rules to an Amazon Redshift security group. If you authorize access to an Amazon EC2 security group, specify EC2SecurityGroupName and EC2SecurityGroupOwnerId. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS Region.  If you authorize access to a CIDR/IP address range, specify CIDRIP. For an overview of CIDR blocks, see the Wikipedia article on Classless Inter-Domain Routing.  You must also associate the security group with a cluster so that clients running on these IP addresses or the EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to Working with Security Groups in the Amazon Redshift Cluster Management Guide.
    */
  def authorizeClusterSecurityGroupIngress(params: AuthorizeClusterSecurityGroupIngressMessage): Request[AuthorizeClusterSecurityGroupIngressResult, AWSError] = js.native
  def authorizeClusterSecurityGroupIngress(
    params: AuthorizeClusterSecurityGroupIngressMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeClusterSecurityGroupIngressResult, Unit]
  ): Request[AuthorizeClusterSecurityGroupIngressResult, AWSError] = js.native
  
  /**
    * Authorizes the specified AWS customer account to restore the specified snapshot.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
    */
  def authorizeSnapshotAccess(): Request[AuthorizeSnapshotAccessResult, AWSError] = js.native
  def authorizeSnapshotAccess(callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeSnapshotAccessResult, Unit]): Request[AuthorizeSnapshotAccessResult, AWSError] = js.native
  /**
    * Authorizes the specified AWS customer account to restore the specified snapshot.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
    */
  def authorizeSnapshotAccess(params: AuthorizeSnapshotAccessMessage): Request[AuthorizeSnapshotAccessResult, AWSError] = js.native
  def authorizeSnapshotAccess(
    params: AuthorizeSnapshotAccessMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeSnapshotAccessResult, Unit]
  ): Request[AuthorizeSnapshotAccessResult, AWSError] = js.native
  
  /**
    * Deletes a set of cluster snapshots.
    */
  def batchDeleteClusterSnapshots(): Request[BatchDeleteClusterSnapshotsResult, AWSError] = js.native
  def batchDeleteClusterSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteClusterSnapshotsResult, Unit]): Request[BatchDeleteClusterSnapshotsResult, AWSError] = js.native
  /**
    * Deletes a set of cluster snapshots.
    */
  def batchDeleteClusterSnapshots(params: BatchDeleteClusterSnapshotsRequest): Request[BatchDeleteClusterSnapshotsResult, AWSError] = js.native
  def batchDeleteClusterSnapshots(
    params: BatchDeleteClusterSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteClusterSnapshotsResult, Unit]
  ): Request[BatchDeleteClusterSnapshotsResult, AWSError] = js.native
  
  /**
    * Modifies the settings for a set of cluster snapshots.
    */
  def batchModifyClusterSnapshots(): Request[BatchModifyClusterSnapshotsOutputMessage, AWSError] = js.native
  def batchModifyClusterSnapshots(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchModifyClusterSnapshotsOutputMessage, Unit]
  ): Request[BatchModifyClusterSnapshotsOutputMessage, AWSError] = js.native
  /**
    * Modifies the settings for a set of cluster snapshots.
    */
  def batchModifyClusterSnapshots(params: BatchModifyClusterSnapshotsMessage): Request[BatchModifyClusterSnapshotsOutputMessage, AWSError] = js.native
  def batchModifyClusterSnapshots(
    params: BatchModifyClusterSnapshotsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchModifyClusterSnapshotsOutputMessage, Unit]
  ): Request[BatchModifyClusterSnapshotsOutputMessage, AWSError] = js.native
  
  /**
    * Cancels a resize operation for a cluster.
    */
  def cancelResize(): Request[ResizeProgressMessage, AWSError] = js.native
  def cancelResize(callback: js.Function2[/* err */ AWSError, /* data */ ResizeProgressMessage, Unit]): Request[ResizeProgressMessage, AWSError] = js.native
  /**
    * Cancels a resize operation for a cluster.
    */
  def cancelResize(params: CancelResizeMessage): Request[ResizeProgressMessage, AWSError] = js.native
  def cancelResize(
    params: CancelResizeMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ResizeProgressMessage, Unit]
  ): Request[ResizeProgressMessage, AWSError] = js.native
  
  @JSName("config")
  var config_Redshift: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated snapshot and it must be in the available state. When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained until you delete them.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
    */
  def copyClusterSnapshot(): Request[CopyClusterSnapshotResult, AWSError] = js.native
  def copyClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CopyClusterSnapshotResult, Unit]): Request[CopyClusterSnapshotResult, AWSError] = js.native
  /**
    * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated snapshot and it must be in the available state. When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained until you delete them.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
    */
  def copyClusterSnapshot(params: CopyClusterSnapshotMessage): Request[CopyClusterSnapshotResult, AWSError] = js.native
  def copyClusterSnapshot(
    params: CopyClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyClusterSnapshotResult, Unit]
  ): Request[CopyClusterSnapshotResult, AWSError] = js.native
  
  /**
    * Creates a new cluster with the specified parameters. To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
    */
  def createCluster(): Request[CreateClusterResult, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResult, Unit]): Request[CreateClusterResult, AWSError] = js.native
  /**
    * Creates a new cluster with the specified parameters. To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
    */
  def createCluster(params: CreateClusterMessage): Request[CreateClusterResult, AWSError] = js.native
  def createCluster(
    params: CreateClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResult, Unit]
  ): Request[CreateClusterResult, AWSError] = js.native
  
  /**
    * Creates an Amazon Redshift parameter group. Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster is created by using ModifyCluster.  Parameters in the parameter group define specific behavior that applies to the databases you create on the cluster. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  def createClusterParameterGroup(): Request[CreateClusterParameterGroupResult, AWSError] = js.native
  def createClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterParameterGroupResult, Unit]): Request[CreateClusterParameterGroupResult, AWSError] = js.native
  /**
    * Creates an Amazon Redshift parameter group. Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster is created by using ModifyCluster.  Parameters in the parameter group define specific behavior that applies to the databases you create on the cluster. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  def createClusterParameterGroup(params: CreateClusterParameterGroupMessage): Request[CreateClusterParameterGroupResult, AWSError] = js.native
  def createClusterParameterGroup(
    params: CreateClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterParameterGroupResult, Unit]
  ): Request[CreateClusterParameterGroupResult, AWSError] = js.native
  
  /**
    * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
    */
  def createClusterSecurityGroup(): Request[CreateClusterSecurityGroupResult, AWSError] = js.native
  def createClusterSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterSecurityGroupResult, Unit]): Request[CreateClusterSecurityGroupResult, AWSError] = js.native
  /**
    * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
    */
  def createClusterSecurityGroup(params: CreateClusterSecurityGroupMessage): Request[CreateClusterSecurityGroupResult, AWSError] = js.native
  def createClusterSecurityGroup(
    params: CreateClusterSecurityGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterSecurityGroupResult, Unit]
  ): Request[CreateClusterSecurityGroupResult, AWSError] = js.native
  
  /**
    * Creates a manual snapshot of the specified cluster. The cluster must be in the available state.   For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
    */
  def createClusterSnapshot(): Request[CreateClusterSnapshotResult, AWSError] = js.native
  def createClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterSnapshotResult, Unit]): Request[CreateClusterSnapshotResult, AWSError] = js.native
  /**
    * Creates a manual snapshot of the specified cluster. The cluster must be in the available state.   For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
    */
  def createClusterSnapshot(params: CreateClusterSnapshotMessage): Request[CreateClusterSnapshotResult, AWSError] = js.native
  def createClusterSnapshot(
    params: CreateClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterSnapshotResult, Unit]
  ): Request[CreateClusterSnapshotResult, AWSError] = js.native
  
  /**
    * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.  For information about subnet groups, go to Amazon Redshift Cluster Subnet Groups in the Amazon Redshift Cluster Management Guide.
    */
  def createClusterSubnetGroup(): Request[CreateClusterSubnetGroupResult, AWSError] = js.native
  def createClusterSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterSubnetGroupResult, Unit]): Request[CreateClusterSubnetGroupResult, AWSError] = js.native
  /**
    * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.  For information about subnet groups, go to Amazon Redshift Cluster Subnet Groups in the Amazon Redshift Cluster Management Guide.
    */
  def createClusterSubnetGroup(params: CreateClusterSubnetGroupMessage): Request[CreateClusterSubnetGroupResult, AWSError] = js.native
  def createClusterSubnetGroup(
    params: CreateClusterSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterSubnetGroupResult, Unit]
  ): Request[CreateClusterSubnetGroupResult, AWSError] = js.native
  
  /**
    * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities. Notifications will be sent for all events you want that match those criteria. For example, you can specify source type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity = ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup categories for the specified clusters. If you specify both the source type and source IDs, such as source type = cluster and source identifier = my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source type but do not specify a source identifier, you will receive notice of the events for the objects of that type in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source type if you specify a source ID.
    */
  def createEventSubscription(): Request[CreateEventSubscriptionResult, AWSError] = js.native
  def createEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateEventSubscriptionResult, Unit]): Request[CreateEventSubscriptionResult, AWSError] = js.native
  /**
    * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities. Notifications will be sent for all events you want that match those criteria. For example, you can specify source type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity = ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup categories for the specified clusters. If you specify both the source type and source IDs, such as source type = cluster and source identifier = my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source type but do not specify a source identifier, you will receive notice of the events for the objects of that type in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source type if you specify a source ID.
    */
  def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult, AWSError] = js.native
  def createEventSubscription(
    params: CreateEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEventSubscriptionResult, Unit]
  ): Request[CreateEventSubscriptionResult, AWSError] = js.native
  
  /**
    * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in order to store and retrieve the keys used to encrypt the cluster databases. The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate, you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and use encryption keys in the HSM. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
    */
  def createHsmClientCertificate(): Request[CreateHsmClientCertificateResult, AWSError] = js.native
  def createHsmClientCertificate(callback: js.Function2[/* err */ AWSError, /* data */ CreateHsmClientCertificateResult, Unit]): Request[CreateHsmClientCertificateResult, AWSError] = js.native
  /**
    * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in order to store and retrieve the keys used to encrypt the cluster databases. The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate, you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and use encryption keys in the HSM. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
    */
  def createHsmClientCertificate(params: CreateHsmClientCertificateMessage): Request[CreateHsmClientCertificateResult, AWSError] = js.native
  def createHsmClientCertificate(
    params: CreateHsmClientCertificateMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHsmClientCertificateResult, Unit]
  ): Request[CreateHsmClientCertificateResult, AWSError] = js.native
  
  /**
    * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM. In addition to creating an HSM configuration, you must also create an HSM client certificate. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
    */
  def createHsmConfiguration(): Request[CreateHsmConfigurationResult, AWSError] = js.native
  def createHsmConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateHsmConfigurationResult, Unit]): Request[CreateHsmConfigurationResult, AWSError] = js.native
  /**
    * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM. In addition to creating an HSM configuration, you must also create an HSM client certificate. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
    */
  def createHsmConfiguration(params: CreateHsmConfigurationMessage): Request[CreateHsmConfigurationResult, AWSError] = js.native
  def createHsmConfiguration(
    params: CreateHsmConfigurationMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHsmConfigurationResult, Unit]
  ): Request[CreateHsmConfigurationResult, AWSError] = js.native
  
  /**
    * Creates a scheduled action. A scheduled action contains a schedule and an Amazon Redshift API action. For example, you can create a schedule of when to run the ResizeCluster API operation. 
    */
  def createScheduledAction(): Request[ScheduledAction, AWSError] = js.native
  def createScheduledAction(callback: js.Function2[/* err */ AWSError, /* data */ ScheduledAction, Unit]): Request[ScheduledAction, AWSError] = js.native
  /**
    * Creates a scheduled action. A scheduled action contains a schedule and an Amazon Redshift API action. For example, you can create a schedule of when to run the ResizeCluster API operation. 
    */
  def createScheduledAction(params: CreateScheduledActionMessage): Request[ScheduledAction, AWSError] = js.native
  def createScheduledAction(
    params: CreateScheduledActionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ScheduledAction, Unit]
  ): Request[ScheduledAction, AWSError] = js.native
  
  /**
    * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key Management Service (AWS KMS) to encrypt copied snapshots in a destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
    */
  def createSnapshotCopyGrant(): Request[CreateSnapshotCopyGrantResult, AWSError] = js.native
  def createSnapshotCopyGrant(callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotCopyGrantResult, Unit]): Request[CreateSnapshotCopyGrantResult, AWSError] = js.native
  /**
    * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key Management Service (AWS KMS) to encrypt copied snapshots in a destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
    */
  def createSnapshotCopyGrant(params: CreateSnapshotCopyGrantMessage): Request[CreateSnapshotCopyGrantResult, AWSError] = js.native
  def createSnapshotCopyGrant(
    params: CreateSnapshotCopyGrantMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotCopyGrantResult, Unit]
  ): Request[CreateSnapshotCopyGrantResult, AWSError] = js.native
  
  /**
    * Create a snapshot schedule that can be associated to a cluster and which overrides the default system backup schedule. 
    */
  def createSnapshotSchedule(): Request[SnapshotSchedule, AWSError] = js.native
  def createSnapshotSchedule(callback: js.Function2[/* err */ AWSError, /* data */ SnapshotSchedule, Unit]): Request[SnapshotSchedule, AWSError] = js.native
  /**
    * Create a snapshot schedule that can be associated to a cluster and which overrides the default system backup schedule. 
    */
  def createSnapshotSchedule(params: CreateSnapshotScheduleMessage): Request[SnapshotSchedule, AWSError] = js.native
  def createSnapshotSchedule(
    params: CreateSnapshotScheduleMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ SnapshotSchedule, Unit]
  ): Request[SnapshotSchedule, AWSError] = js.native
  
  /**
    * Adds tags to a cluster. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an error and the attempt will fail. If you specify a key that already exists for the resource, the value for that key will be updated with the new value.
    */
  def createTags(): Request[js.Object, AWSError] = js.native
  def createTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds tags to a cluster. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an error and the attempt will fail. If you specify a key that already exists for the resource, the value for that key will be updated with the new value.
    */
  def createTags(params: CreateTagsMessage): Request[js.Object, AWSError] = js.native
  def createTags(params: CreateTagsMessage, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates a usage limit for a specified Amazon Redshift feature on a cluster. The usage limit is identified by the returned usage limit identifier.
    */
  def createUsageLimit(): Request[UsageLimit, AWSError] = js.native
  def createUsageLimit(callback: js.Function2[/* err */ AWSError, /* data */ UsageLimit, Unit]): Request[UsageLimit, AWSError] = js.native
  /**
    * Creates a usage limit for a specified Amazon Redshift feature on a cluster. The usage limit is identified by the returned usage limit identifier.
    */
  def createUsageLimit(params: CreateUsageLimitMessage): Request[UsageLimit, AWSError] = js.native
  def createUsageLimit(
    params: CreateUsageLimitMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ UsageLimit, Unit]
  ): Request[UsageLimit, AWSError] = js.native
  
  /**
    * Deletes a previously provisioned cluster without its final snapshot being created. A successful response from the web service indicates that the request was received correctly. Use DescribeClusters to monitor the status of the deletion. The delete operation cannot be canceled or reverted once submitted. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you want to shut down the cluster and retain it for future use, set SkipFinalClusterSnapshot to false and specify a name for FinalClusterSnapshotIdentifier. You can later restore this snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the cluster.   For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
    */
  def deleteCluster(): Request[DeleteClusterResult, AWSError] = js.native
  def deleteCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResult, Unit]): Request[DeleteClusterResult, AWSError] = js.native
  /**
    * Deletes a previously provisioned cluster without its final snapshot being created. A successful response from the web service indicates that the request was received correctly. Use DescribeClusters to monitor the status of the deletion. The delete operation cannot be canceled or reverted once submitted. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you want to shut down the cluster and retain it for future use, set SkipFinalClusterSnapshot to false and specify a name for FinalClusterSnapshotIdentifier. You can later restore this snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the cluster.   For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
    */
  def deleteCluster(params: DeleteClusterMessage): Request[DeleteClusterResult, AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResult, Unit]
  ): Request[DeleteClusterResult, AWSError] = js.native
  
  /**
    * Deletes a specified Amazon Redshift parameter group.  You cannot delete a parameter group if it is associated with a cluster. 
    */
  def deleteClusterParameterGroup(): Request[js.Object, AWSError] = js.native
  def deleteClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified Amazon Redshift parameter group.  You cannot delete a parameter group if it is associated with a cluster. 
    */
  def deleteClusterParameterGroup(params: DeleteClusterParameterGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteClusterParameterGroup(
    params: DeleteClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an Amazon Redshift security group.  You cannot delete a security group that is associated with any clusters. You cannot delete the default security group.   For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
    */
  def deleteClusterSecurityGroup(): Request[js.Object, AWSError] = js.native
  def deleteClusterSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon Redshift security group.  You cannot delete a security group that is associated with any clusters. You cannot delete the default security group.   For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
    */
  def deleteClusterSecurityGroup(params: DeleteClusterSecurityGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteClusterSecurityGroup(
    params: DeleteClusterSecurityGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified manual snapshot. The snapshot must be in the available state, with no other users authorized to access the snapshot.  Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can delete the snapshot.
    */
  def deleteClusterSnapshot(): Request[DeleteClusterSnapshotResult, AWSError] = js.native
  def deleteClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterSnapshotResult, Unit]): Request[DeleteClusterSnapshotResult, AWSError] = js.native
  /**
    * Deletes the specified manual snapshot. The snapshot must be in the available state, with no other users authorized to access the snapshot.  Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can delete the snapshot.
    */
  def deleteClusterSnapshot(params: DeleteClusterSnapshotMessage): Request[DeleteClusterSnapshotResult, AWSError] = js.native
  def deleteClusterSnapshot(
    params: DeleteClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterSnapshotResult, Unit]
  ): Request[DeleteClusterSnapshotResult, AWSError] = js.native
  
  /**
    * Deletes the specified cluster subnet group.
    */
  def deleteClusterSubnetGroup(): Request[js.Object, AWSError] = js.native
  def deleteClusterSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified cluster subnet group.
    */
  def deleteClusterSubnetGroup(params: DeleteClusterSubnetGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteClusterSubnetGroup(
    params: DeleteClusterSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an Amazon Redshift event notification subscription.
    */
  def deleteEventSubscription(): Request[js.Object, AWSError] = js.native
  def deleteEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon Redshift event notification subscription.
    */
  def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[js.Object, AWSError] = js.native
  def deleteEventSubscription(
    params: DeleteEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified HSM client certificate.
    */
  def deleteHsmClientCertificate(): Request[js.Object, AWSError] = js.native
  def deleteHsmClientCertificate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified HSM client certificate.
    */
  def deleteHsmClientCertificate(params: DeleteHsmClientCertificateMessage): Request[js.Object, AWSError] = js.native
  def deleteHsmClientCertificate(
    params: DeleteHsmClientCertificateMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified Amazon Redshift HSM configuration.
    */
  def deleteHsmConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteHsmConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Amazon Redshift HSM configuration.
    */
  def deleteHsmConfiguration(params: DeleteHsmConfigurationMessage): Request[js.Object, AWSError] = js.native
  def deleteHsmConfiguration(
    params: DeleteHsmConfigurationMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a scheduled action. 
    */
  def deleteScheduledAction(): Request[js.Object, AWSError] = js.native
  def deleteScheduledAction(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a scheduled action. 
    */
  def deleteScheduledAction(params: DeleteScheduledActionMessage): Request[js.Object, AWSError] = js.native
  def deleteScheduledAction(
    params: DeleteScheduledActionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified snapshot copy grant.
    */
  def deleteSnapshotCopyGrant(): Request[js.Object, AWSError] = js.native
  def deleteSnapshotCopyGrant(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified snapshot copy grant.
    */
  def deleteSnapshotCopyGrant(params: DeleteSnapshotCopyGrantMessage): Request[js.Object, AWSError] = js.native
  def deleteSnapshotCopyGrant(
    params: DeleteSnapshotCopyGrantMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a snapshot schedule.
    */
  def deleteSnapshotSchedule(): Request[js.Object, AWSError] = js.native
  def deleteSnapshotSchedule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a snapshot schedule.
    */
  def deleteSnapshotSchedule(params: DeleteSnapshotScheduleMessage): Request[js.Object, AWSError] = js.native
  def deleteSnapshotSchedule(
    params: DeleteSnapshotScheduleMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes tags from a resource. You must provide the ARN of the resource from which you want to delete the tag or tags.
    */
  def deleteTags(): Request[js.Object, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes tags from a resource. You must provide the ARN of the resource from which you want to delete the tag or tags.
    */
  def deleteTags(params: DeleteTagsMessage): Request[js.Object, AWSError] = js.native
  def deleteTags(params: DeleteTagsMessage, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a usage limit from a cluster.
    */
  def deleteUsageLimit(): Request[js.Object, AWSError] = js.native
  def deleteUsageLimit(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a usage limit from a cluster.
    */
  def deleteUsageLimit(params: DeleteUsageLimitMessage): Request[js.Object, AWSError] = js.native
  def deleteUsageLimit(
    params: DeleteUsageLimitMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns a list of attributes attached to an account
    */
  def describeAccountAttributes(): Request[AccountAttributeList, AWSError] = js.native
  def describeAccountAttributes(callback: js.Function2[/* err */ AWSError, /* data */ AccountAttributeList, Unit]): Request[AccountAttributeList, AWSError] = js.native
  /**
    * Returns a list of attributes attached to an account
    */
  def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[AccountAttributeList, AWSError] = js.native
  def describeAccountAttributes(
    params: DescribeAccountAttributesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AccountAttributeList, Unit]
  ): Request[AccountAttributeList, AWSError] = js.native
  
  /**
    * Returns an array of ClusterDbRevision objects.
    */
  def describeClusterDbRevisions(): Request[ClusterDbRevisionsMessage, AWSError] = js.native
  def describeClusterDbRevisions(callback: js.Function2[/* err */ AWSError, /* data */ ClusterDbRevisionsMessage, Unit]): Request[ClusterDbRevisionsMessage, AWSError] = js.native
  /**
    * Returns an array of ClusterDbRevision objects.
    */
  def describeClusterDbRevisions(params: DescribeClusterDbRevisionsMessage): Request[ClusterDbRevisionsMessage, AWSError] = js.native
  def describeClusterDbRevisions(
    params: DescribeClusterDbRevisionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ClusterDbRevisionsMessage, Unit]
  ): Request[ClusterDbRevisionsMessage, AWSError] = js.native
  
  /**
    * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default parameter group. For each parameter group, the response includes the parameter group name, description, and parameter group family name. You can optionally specify a name to retrieve the description of a specific parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all parameter groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeClusterParameterGroups(): Request[ClusterParameterGroupsMessage, AWSError] = js.native
  def describeClusterParameterGroups(callback: js.Function2[/* err */ AWSError, /* data */ ClusterParameterGroupsMessage, Unit]): Request[ClusterParameterGroupsMessage, AWSError] = js.native
  /**
    * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default parameter group. For each parameter group, the response includes the parameter group name, description, and parameter group family name. You can optionally specify a name to retrieve the description of a specific parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all parameter groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeClusterParameterGroups(params: DescribeClusterParameterGroupsMessage): Request[ClusterParameterGroupsMessage, AWSError] = js.native
  def describeClusterParameterGroups(
    params: DescribeClusterParameterGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ClusterParameterGroupsMessage, Unit]
  ): Request[ClusterParameterGroupsMessage, AWSError] = js.native
  
  /**
    * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each parameter the response includes information such as parameter name, description, data type, value, whether the parameter value is modifiable, and so on. You can specify source filter to retrieve parameters of only specific type. For example, to retrieve parameters that were modified by a user action such as from ModifyClusterParameterGroup, you can specify source equal to user.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  def describeClusterParameters(): Request[ClusterParameterGroupDetails, AWSError] = js.native
  def describeClusterParameters(callback: js.Function2[/* err */ AWSError, /* data */ ClusterParameterGroupDetails, Unit]): Request[ClusterParameterGroupDetails, AWSError] = js.native
  /**
    * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each parameter the response includes information such as parameter name, description, data type, value, whether the parameter value is modifiable, and so on. You can specify source filter to retrieve parameters of only specific type. For example, to retrieve parameters that were modified by a user action such as from ModifyClusterParameterGroup, you can specify source equal to user.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  def describeClusterParameters(params: DescribeClusterParametersMessage): Request[ClusterParameterGroupDetails, AWSError] = js.native
  def describeClusterParameters(
    params: DescribeClusterParametersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ClusterParameterGroupDetails, Unit]
  ): Request[ClusterParameterGroupDetails, AWSError] = js.native
  
  /**
    * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the response will contain only information about only that security group.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all security groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, security groups are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeClusterSecurityGroups(): Request[ClusterSecurityGroupMessage, AWSError] = js.native
  def describeClusterSecurityGroups(callback: js.Function2[/* err */ AWSError, /* data */ ClusterSecurityGroupMessage, Unit]): Request[ClusterSecurityGroupMessage, AWSError] = js.native
  /**
    * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the response will contain only information about only that security group.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all security groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, security groups are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeClusterSecurityGroups(params: DescribeClusterSecurityGroupsMessage): Request[ClusterSecurityGroupMessage, AWSError] = js.native
  def describeClusterSecurityGroups(
    params: DescribeClusterSecurityGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ClusterSecurityGroupMessage, Unit]
  ): Request[ClusterSecurityGroupMessage, AWSError] = js.native
  
  /**
    * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No information is returned for snapshots owned by inactive AWS customer accounts. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all snapshots that have any combination of those values are returned. Only snapshots that you own are returned in the response; shared snapshots are not returned with the tag key and tag value request parameters. If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeClusterSnapshots(): Request[SnapshotMessage, AWSError] = js.native
  def describeClusterSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ SnapshotMessage, Unit]): Request[SnapshotMessage, AWSError] = js.native
  /**
    * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No information is returned for snapshots owned by inactive AWS customer accounts. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all snapshots that have any combination of those values are returned. Only snapshots that you own are returned in the response; shared snapshots are not returned with the tag key and tag value request parameters. If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeClusterSnapshots(params: DescribeClusterSnapshotsMessage): Request[SnapshotMessage, AWSError] = js.native
  def describeClusterSnapshots(
    params: DescribeClusterSnapshotsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ SnapshotMessage, Unit]
  ): Request[SnapshotMessage, AWSError] = js.native
  
  /**
    * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By default, this operation returns information about all cluster subnet groups that are defined in you AWS account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subnet groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeClusterSubnetGroups(): Request[ClusterSubnetGroupMessage, AWSError] = js.native
  def describeClusterSubnetGroups(callback: js.Function2[/* err */ AWSError, /* data */ ClusterSubnetGroupMessage, Unit]): Request[ClusterSubnetGroupMessage, AWSError] = js.native
  /**
    * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By default, this operation returns information about all cluster subnet groups that are defined in you AWS account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subnet groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeClusterSubnetGroups(params: DescribeClusterSubnetGroupsMessage): Request[ClusterSubnetGroupMessage, AWSError] = js.native
  def describeClusterSubnetGroups(
    params: DescribeClusterSubnetGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ClusterSubnetGroupMessage, Unit]
  ): Request[ClusterSubnetGroupMessage, AWSError] = js.native
  
  /**
    * Returns a list of all the available maintenance tracks.
    */
  def describeClusterTracks(): Request[TrackListMessage, AWSError] = js.native
  def describeClusterTracks(callback: js.Function2[/* err */ AWSError, /* data */ TrackListMessage, Unit]): Request[TrackListMessage, AWSError] = js.native
  /**
    * Returns a list of all the available maintenance tracks.
    */
  def describeClusterTracks(params: DescribeClusterTracksMessage): Request[TrackListMessage, AWSError] = js.native
  def describeClusterTracks(
    params: DescribeClusterTracksMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TrackListMessage, Unit]
  ): Request[TrackListMessage, AWSError] = js.native
  
  /**
    * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before creating any clusters to learn more about the Amazon Redshift versions. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
    */
  def describeClusterVersions(): Request[ClusterVersionsMessage, AWSError] = js.native
  def describeClusterVersions(callback: js.Function2[/* err */ AWSError, /* data */ ClusterVersionsMessage, Unit]): Request[ClusterVersionsMessage, AWSError] = js.native
  /**
    * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before creating any clusters to learn more about the Amazon Redshift versions. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
    */
  def describeClusterVersions(params: DescribeClusterVersionsMessage): Request[ClusterVersionsMessage, AWSError] = js.native
  def describeClusterVersions(
    params: DescribeClusterVersionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ClusterVersionsMessage, Unit]
  ): Request[ClusterVersionsMessage, AWSError] = js.native
  
  /**
    * Returns properties of provisioned clusters including general cluster properties, cluster database properties, maintenance and backup properties, and security and access properties. This operation supports pagination. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all clusters that have any combination of those values are returned. If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeClusters(): Request[ClustersMessage, AWSError] = js.native
  def describeClusters(callback: js.Function2[/* err */ AWSError, /* data */ ClustersMessage, Unit]): Request[ClustersMessage, AWSError] = js.native
  /**
    * Returns properties of provisioned clusters including general cluster properties, cluster database properties, maintenance and backup properties, and security and access properties. This operation supports pagination. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all clusters that have any combination of those values are returned. If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeClusters(params: DescribeClustersMessage): Request[ClustersMessage, AWSError] = js.native
  def describeClusters(
    params: DescribeClustersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ClustersMessage, Unit]
  ): Request[ClustersMessage, AWSError] = js.native
  
  /**
    * Returns a list of parameter settings for the specified parameter group family.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  def describeDefaultClusterParameters(): Request[DescribeDefaultClusterParametersResult, AWSError] = js.native
  def describeDefaultClusterParameters(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDefaultClusterParametersResult, Unit]
  ): Request[DescribeDefaultClusterParametersResult, AWSError] = js.native
  /**
    * Returns a list of parameter settings for the specified parameter group family.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  def describeDefaultClusterParameters(params: DescribeDefaultClusterParametersMessage): Request[DescribeDefaultClusterParametersResult, AWSError] = js.native
  def describeDefaultClusterParameters(
    params: DescribeDefaultClusterParametersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDefaultClusterParametersResult, Unit]
  ): Request[DescribeDefaultClusterParametersResult, AWSError] = js.native
  
  /**
    * Displays a list of event categories for all event source types, or for a specified source type. For a list of the event categories and source types, go to Amazon Redshift Event Notifications.
    */
  def describeEventCategories(): Request[EventCategoriesMessage, AWSError] = js.native
  def describeEventCategories(callback: js.Function2[/* err */ AWSError, /* data */ EventCategoriesMessage, Unit]): Request[EventCategoriesMessage, AWSError] = js.native
  /**
    * Displays a list of event categories for all event source types, or for a specified source type. For a list of the event categories and source types, go to Amazon Redshift Event Notifications.
    */
  def describeEventCategories(params: DescribeEventCategoriesMessage): Request[EventCategoriesMessage, AWSError] = js.native
  def describeEventCategories(
    params: DescribeEventCategoriesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EventCategoriesMessage, Unit]
  ): Request[EventCategoriesMessage, AWSError] = js.native
  
  /**
    * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you specify a subscription name, lists the description for that subscription. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification subscriptions that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subscriptions that have any combination of those values are returned. If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeEventSubscriptions(): Request[EventSubscriptionsMessage, AWSError] = js.native
  def describeEventSubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ EventSubscriptionsMessage, Unit]): Request[EventSubscriptionsMessage, AWSError] = js.native
  /**
    * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you specify a subscription name, lists the description for that subscription. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification subscriptions that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subscriptions that have any combination of those values are returned. If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[EventSubscriptionsMessage, AWSError] = js.native
  def describeEventSubscriptions(
    params: DescribeEventSubscriptionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EventSubscriptionsMessage, Unit]
  ): Request[EventSubscriptionsMessage, AWSError] = js.native
  
  /**
    * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
    */
  def describeEvents(): Request[EventsMessage, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ EventsMessage, Unit]): Request[EventsMessage, AWSError] = js.native
  /**
    * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
    */
  def describeEvents(params: DescribeEventsMessage): Request[EventsMessage, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EventsMessage, Unit]
  ): Request[EventsMessage, AWSError] = js.native
  
  /**
    * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns information about all the HSM certificates owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client certificates that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM client certificates that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeHsmClientCertificates(): Request[HsmClientCertificateMessage, AWSError] = js.native
  def describeHsmClientCertificates(callback: js.Function2[/* err */ AWSError, /* data */ HsmClientCertificateMessage, Unit]): Request[HsmClientCertificateMessage, AWSError] = js.native
  /**
    * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns information about all the HSM certificates owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client certificates that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM client certificates that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeHsmClientCertificates(params: DescribeHsmClientCertificatesMessage): Request[HsmClientCertificateMessage, AWSError] = js.native
  def describeHsmClientCertificates(
    params: DescribeHsmClientCertificatesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ HsmClientCertificateMessage, Unit]
  ): Request[HsmClientCertificateMessage, AWSError] = js.native
  
  /**
    * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified, returns information about all the HSM configurations owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM connections that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeHsmConfigurations(): Request[HsmConfigurationMessage, AWSError] = js.native
  def describeHsmConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ HsmConfigurationMessage, Unit]): Request[HsmConfigurationMessage, AWSError] = js.native
  /**
    * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified, returns information about all the HSM configurations owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM connections that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeHsmConfigurations(params: DescribeHsmConfigurationsMessage): Request[HsmConfigurationMessage, AWSError] = js.native
  def describeHsmConfigurations(
    params: DescribeHsmConfigurationsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ HsmConfigurationMessage, Unit]
  ): Request[HsmConfigurationMessage, AWSError] = js.native
  
  /**
    * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon Redshift cluster.
    */
  def describeLoggingStatus(): Request[LoggingStatus, AWSError] = js.native
  def describeLoggingStatus(callback: js.Function2[/* err */ AWSError, /* data */ LoggingStatus, Unit]): Request[LoggingStatus, AWSError] = js.native
  /**
    * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon Redshift cluster.
    */
  def describeLoggingStatus(params: DescribeLoggingStatusMessage): Request[LoggingStatus, AWSError] = js.native
  def describeLoggingStatus(
    params: DescribeLoggingStatusMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ LoggingStatus, Unit]
  ): Request[LoggingStatus, AWSError] = js.native
  
  /**
    * Returns properties of possible node configurations such as node type, number of nodes, and disk usage for the specified action type.
    */
  def describeNodeConfigurationOptions(): Request[NodeConfigurationOptionsMessage, AWSError] = js.native
  def describeNodeConfigurationOptions(callback: js.Function2[/* err */ AWSError, /* data */ NodeConfigurationOptionsMessage, Unit]): Request[NodeConfigurationOptionsMessage, AWSError] = js.native
  /**
    * Returns properties of possible node configurations such as node type, number of nodes, and disk usage for the specified action type.
    */
  def describeNodeConfigurationOptions(params: DescribeNodeConfigurationOptionsMessage): Request[NodeConfigurationOptionsMessage, AWSError] = js.native
  def describeNodeConfigurationOptions(
    params: DescribeNodeConfigurationOptionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ NodeConfigurationOptionsMessage, Unit]
  ): Request[NodeConfigurationOptionsMessage, AWSError] = js.native
  
  /**
    * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS Region that you can specify, and the node types you can request. The node types differ by available storage, memory, CPU and price. With the cost involved you might want to obtain a list of cluster options in the specific region and specify values when creating a cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
    */
  def describeOrderableClusterOptions(): Request[OrderableClusterOptionsMessage, AWSError] = js.native
  def describeOrderableClusterOptions(callback: js.Function2[/* err */ AWSError, /* data */ OrderableClusterOptionsMessage, Unit]): Request[OrderableClusterOptionsMessage, AWSError] = js.native
  /**
    * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS Region that you can specify, and the node types you can request. The node types differ by available storage, memory, CPU and price. With the cost involved you might want to obtain a list of cluster options in the specific region and specify values when creating a cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
    */
  def describeOrderableClusterOptions(params: DescribeOrderableClusterOptionsMessage): Request[OrderableClusterOptionsMessage, AWSError] = js.native
  def describeOrderableClusterOptions(
    params: DescribeOrderableClusterOptionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ OrderableClusterOptionsMessage, Unit]
  ): Request[OrderableClusterOptionsMessage, AWSError] = js.native
  
  /**
    * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you. These descriptions help you determine which reserve node offering you want to purchase. You then use the unique offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon Redshift cluster.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
    */
  def describeReservedNodeOfferings(): Request[ReservedNodeOfferingsMessage, AWSError] = js.native
  def describeReservedNodeOfferings(callback: js.Function2[/* err */ AWSError, /* data */ ReservedNodeOfferingsMessage, Unit]): Request[ReservedNodeOfferingsMessage, AWSError] = js.native
  /**
    * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you. These descriptions help you determine which reserve node offering you want to purchase. You then use the unique offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon Redshift cluster.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
    */
  def describeReservedNodeOfferings(params: DescribeReservedNodeOfferingsMessage): Request[ReservedNodeOfferingsMessage, AWSError] = js.native
  def describeReservedNodeOfferings(
    params: DescribeReservedNodeOfferingsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ReservedNodeOfferingsMessage, Unit]
  ): Request[ReservedNodeOfferingsMessage, AWSError] = js.native
  
  /**
    * Returns the descriptions of the reserved nodes.
    */
  def describeReservedNodes(): Request[ReservedNodesMessage, AWSError] = js.native
  def describeReservedNodes(callback: js.Function2[/* err */ AWSError, /* data */ ReservedNodesMessage, Unit]): Request[ReservedNodesMessage, AWSError] = js.native
  /**
    * Returns the descriptions of the reserved nodes.
    */
  def describeReservedNodes(params: DescribeReservedNodesMessage): Request[ReservedNodesMessage, AWSError] = js.native
  def describeReservedNodes(
    params: DescribeReservedNodesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ReservedNodesMessage, Unit]
  ): Request[ReservedNodesMessage, AWSError] = js.native
  
  /**
    * Returns information about the last resize operation for the specified cluster. If no resize operation has ever been initiated for the specified cluster, a HTTP 404 error is returned. If a resize operation was initiated and completed, the status of the resize remains as SUCCEEDED until the next resize.  A resize operation can be requested using ModifyCluster and specifying a different number or type of nodes for the cluster. 
    */
  def describeResize(): Request[ResizeProgressMessage, AWSError] = js.native
  def describeResize(callback: js.Function2[/* err */ AWSError, /* data */ ResizeProgressMessage, Unit]): Request[ResizeProgressMessage, AWSError] = js.native
  /**
    * Returns information about the last resize operation for the specified cluster. If no resize operation has ever been initiated for the specified cluster, a HTTP 404 error is returned. If a resize operation was initiated and completed, the status of the resize remains as SUCCEEDED until the next resize.  A resize operation can be requested using ModifyCluster and specifying a different number or type of nodes for the cluster. 
    */
  def describeResize(params: DescribeResizeMessage): Request[ResizeProgressMessage, AWSError] = js.native
  def describeResize(
    params: DescribeResizeMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ResizeProgressMessage, Unit]
  ): Request[ResizeProgressMessage, AWSError] = js.native
  
  /**
    * Describes properties of scheduled actions. 
    */
  def describeScheduledActions(): Request[ScheduledActionsMessage, AWSError] = js.native
  def describeScheduledActions(callback: js.Function2[/* err */ AWSError, /* data */ ScheduledActionsMessage, Unit]): Request[ScheduledActionsMessage, AWSError] = js.native
  /**
    * Describes properties of scheduled actions. 
    */
  def describeScheduledActions(params: DescribeScheduledActionsMessage): Request[ScheduledActionsMessage, AWSError] = js.native
  def describeScheduledActions(
    params: DescribeScheduledActionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ScheduledActionsMessage, Unit]
  ): Request[ScheduledActionsMessage, AWSError] = js.native
  
  /**
    * Returns a list of snapshot copy grants owned by the AWS account in the destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
    */
  def describeSnapshotCopyGrants(): Request[SnapshotCopyGrantMessage, AWSError] = js.native
  def describeSnapshotCopyGrants(callback: js.Function2[/* err */ AWSError, /* data */ SnapshotCopyGrantMessage, Unit]): Request[SnapshotCopyGrantMessage, AWSError] = js.native
  /**
    * Returns a list of snapshot copy grants owned by the AWS account in the destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
    */
  def describeSnapshotCopyGrants(params: DescribeSnapshotCopyGrantsMessage): Request[SnapshotCopyGrantMessage, AWSError] = js.native
  def describeSnapshotCopyGrants(
    params: DescribeSnapshotCopyGrantsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ SnapshotCopyGrantMessage, Unit]
  ): Request[SnapshotCopyGrantMessage, AWSError] = js.native
  
  /**
    * Returns a list of snapshot schedules. 
    */
  def describeSnapshotSchedules(): Request[DescribeSnapshotSchedulesOutputMessage, AWSError] = js.native
  def describeSnapshotSchedules(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotSchedulesOutputMessage, Unit]
  ): Request[DescribeSnapshotSchedulesOutputMessage, AWSError] = js.native
  /**
    * Returns a list of snapshot schedules. 
    */
  def describeSnapshotSchedules(params: DescribeSnapshotSchedulesMessage): Request[DescribeSnapshotSchedulesOutputMessage, AWSError] = js.native
  def describeSnapshotSchedules(
    params: DescribeSnapshotSchedulesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotSchedulesOutputMessage, Unit]
  ): Request[DescribeSnapshotSchedulesOutputMessage, AWSError] = js.native
  
  /**
    * Returns account level backups storage size and provisional storage.
    */
  def describeStorage(): Request[CustomerStorageMessage, AWSError] = js.native
  def describeStorage(callback: js.Function2[/* err */ AWSError, /* data */ CustomerStorageMessage, Unit]): Request[CustomerStorageMessage, AWSError] = js.native
  
  /**
    * Lists the status of one or more table restore requests made using the RestoreTableFromClusterSnapshot API action. If you don't specify a value for the TableRestoreRequestId parameter, then DescribeTableRestoreStatus returns the status of all table restore requests ordered by the date and time of the request in ascending order. Otherwise DescribeTableRestoreStatus returns the status of the table specified by TableRestoreRequestId.
    */
  def describeTableRestoreStatus(): Request[TableRestoreStatusMessage, AWSError] = js.native
  def describeTableRestoreStatus(callback: js.Function2[/* err */ AWSError, /* data */ TableRestoreStatusMessage, Unit]): Request[TableRestoreStatusMessage, AWSError] = js.native
  /**
    * Lists the status of one or more table restore requests made using the RestoreTableFromClusterSnapshot API action. If you don't specify a value for the TableRestoreRequestId parameter, then DescribeTableRestoreStatus returns the status of all table restore requests ordered by the date and time of the request in ascending order. Otherwise DescribeTableRestoreStatus returns the status of the table specified by TableRestoreRequestId.
    */
  def describeTableRestoreStatus(params: DescribeTableRestoreStatusMessage): Request[TableRestoreStatusMessage, AWSError] = js.native
  def describeTableRestoreStatus(
    params: DescribeTableRestoreStatusMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TableRestoreStatusMessage, Unit]
  ): Request[TableRestoreStatusMessage, AWSError] = js.native
  
  /**
    * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all tags for a given type of resource, such as clusters, snapshots, and so on. The following are limitations for DescribeTags:    You cannot specify an ARN and a resource-type value together in the same request.   You cannot use the MaxRecords and Marker parameters together with the ARN parameter.   The MaxRecords parameter can be a range from 10 to 50 results to return in a request.   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all resources that have any combination of those values are returned. If both tag keys and values are omitted from the request, resources are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeTags(): Request[TaggedResourceListMessage, AWSError] = js.native
  def describeTags(callback: js.Function2[/* err */ AWSError, /* data */ TaggedResourceListMessage, Unit]): Request[TaggedResourceListMessage, AWSError] = js.native
  /**
    * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all tags for a given type of resource, such as clusters, snapshots, and so on. The following are limitations for DescribeTags:    You cannot specify an ARN and a resource-type value together in the same request.   You cannot use the MaxRecords and Marker parameters together with the ARN parameter.   The MaxRecords parameter can be a range from 10 to 50 results to return in a request.   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all resources that have any combination of those values are returned. If both tag keys and values are omitted from the request, resources are returned regardless of whether they have tag keys or values associated with them.
    */
  def describeTags(params: DescribeTagsMessage): Request[TaggedResourceListMessage, AWSError] = js.native
  def describeTags(
    params: DescribeTagsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TaggedResourceListMessage, Unit]
  ): Request[TaggedResourceListMessage, AWSError] = js.native
  
  /**
    * Shows usage limits on a cluster. Results are filtered based on the combination of input usage limit identifier, cluster identifier, and feature type parameters:   If usage limit identifier, cluster identifier, and feature type are not provided, then all usage limit objects for the current account in the current region are returned.   If usage limit identifier is provided, then the corresponding usage limit object is returned.   If cluster identifier is provided, then all usage limit objects for the specified cluster are returned.   If cluster identifier and feature type are provided, then all usage limit objects for the combination of cluster and feature are returned.  
    */
  def describeUsageLimits(): Request[UsageLimitList, AWSError] = js.native
  def describeUsageLimits(callback: js.Function2[/* err */ AWSError, /* data */ UsageLimitList, Unit]): Request[UsageLimitList, AWSError] = js.native
  /**
    * Shows usage limits on a cluster. Results are filtered based on the combination of input usage limit identifier, cluster identifier, and feature type parameters:   If usage limit identifier, cluster identifier, and feature type are not provided, then all usage limit objects for the current account in the current region are returned.   If usage limit identifier is provided, then the corresponding usage limit object is returned.   If cluster identifier is provided, then all usage limit objects for the specified cluster are returned.   If cluster identifier and feature type are provided, then all usage limit objects for the combination of cluster and feature are returned.  
    */
  def describeUsageLimits(params: DescribeUsageLimitsMessage): Request[UsageLimitList, AWSError] = js.native
  def describeUsageLimits(
    params: DescribeUsageLimitsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ UsageLimitList, Unit]
  ): Request[UsageLimitList, AWSError] = js.native
  
  /**
    * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
    */
  def disableLogging(): Request[LoggingStatus, AWSError] = js.native
  def disableLogging(callback: js.Function2[/* err */ AWSError, /* data */ LoggingStatus, Unit]): Request[LoggingStatus, AWSError] = js.native
  /**
    * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
    */
  def disableLogging(params: DisableLoggingMessage): Request[LoggingStatus, AWSError] = js.native
  def disableLogging(
    params: DisableLoggingMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ LoggingStatus, Unit]
  ): Request[LoggingStatus, AWSError] = js.native
  
  /**
    * Disables the automatic copying of snapshots from one region to another region for a specified cluster. If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use DeleteSnapshotCopyGrant to delete the grant that grants Amazon Redshift permission to the CMK in the destination region. 
    */
  def disableSnapshotCopy(): Request[DisableSnapshotCopyResult, AWSError] = js.native
  def disableSnapshotCopy(callback: js.Function2[/* err */ AWSError, /* data */ DisableSnapshotCopyResult, Unit]): Request[DisableSnapshotCopyResult, AWSError] = js.native
  /**
    * Disables the automatic copying of snapshots from one region to another region for a specified cluster. If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use DeleteSnapshotCopyGrant to delete the grant that grants Amazon Redshift permission to the CMK in the destination region. 
    */
  def disableSnapshotCopy(params: DisableSnapshotCopyMessage): Request[DisableSnapshotCopyResult, AWSError] = js.native
  def disableSnapshotCopy(
    params: DisableSnapshotCopyMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableSnapshotCopyResult, Unit]
  ): Request[DisableSnapshotCopyResult, AWSError] = js.native
  
  /**
    * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
    */
  def enableLogging(): Request[LoggingStatus, AWSError] = js.native
  def enableLogging(callback: js.Function2[/* err */ AWSError, /* data */ LoggingStatus, Unit]): Request[LoggingStatus, AWSError] = js.native
  /**
    * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
    */
  def enableLogging(params: EnableLoggingMessage): Request[LoggingStatus, AWSError] = js.native
  def enableLogging(
    params: EnableLoggingMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ LoggingStatus, Unit]
  ): Request[LoggingStatus, AWSError] = js.native
  
  /**
    * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
    */
  def enableSnapshotCopy(): Request[EnableSnapshotCopyResult, AWSError] = js.native
  def enableSnapshotCopy(callback: js.Function2[/* err */ AWSError, /* data */ EnableSnapshotCopyResult, Unit]): Request[EnableSnapshotCopyResult, AWSError] = js.native
  /**
    * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
    */
  def enableSnapshotCopy(params: EnableSnapshotCopyMessage): Request[EnableSnapshotCopyResult, AWSError] = js.native
  def enableSnapshotCopy(
    params: EnableSnapshotCopyMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSnapshotCopyResult, Unit]
  ): Request[EnableSnapshotCopyResult, AWSError] = js.native
  
  /**
    * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift database. The action returns the database user name prefixed with IAM: if AutoCreate is False or IAMA: if AutoCreate is True. You can optionally specify one or more database user groups that the user will join at log on. By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes). For more information, see Using IAM Authentication to Generate Database User Credentials in the Amazon Redshift Cluster Management Guide. The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM policy attached that allows access to all necessary actions and resources. For more information about permissions, see Resource Policies for GetClusterCredentials in the Amazon Redshift Cluster Management Guide. If the DbGroups parameter is specified, the IAM policy must allow the redshift:JoinGroup action with access to the listed dbgroups.  In addition, if the AutoCreate parameter is set to True, then the policy must include the redshift:CreateClusterUser privilege. If the DbName parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name. 
    */
  def getClusterCredentials(): Request[ClusterCredentials, AWSError] = js.native
  def getClusterCredentials(callback: js.Function2[/* err */ AWSError, /* data */ ClusterCredentials, Unit]): Request[ClusterCredentials, AWSError] = js.native
  /**
    * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift database. The action returns the database user name prefixed with IAM: if AutoCreate is False or IAMA: if AutoCreate is True. You can optionally specify one or more database user groups that the user will join at log on. By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes). For more information, see Using IAM Authentication to Generate Database User Credentials in the Amazon Redshift Cluster Management Guide. The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM policy attached that allows access to all necessary actions and resources. For more information about permissions, see Resource Policies for GetClusterCredentials in the Amazon Redshift Cluster Management Guide. If the DbGroups parameter is specified, the IAM policy must allow the redshift:JoinGroup action with access to the listed dbgroups.  In addition, if the AutoCreate parameter is set to True, then the policy must include the redshift:CreateClusterUser privilege. If the DbName parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name. 
    */
  def getClusterCredentials(params: GetClusterCredentialsMessage): Request[ClusterCredentials, AWSError] = js.native
  def getClusterCredentials(
    params: GetClusterCredentialsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ClusterCredentials, Unit]
  ): Request[ClusterCredentials, AWSError] = js.native
  
  /**
    * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given DC1 reserved node.
    */
  def getReservedNodeExchangeOfferings(): Request[GetReservedNodeExchangeOfferingsOutputMessage, AWSError] = js.native
  def getReservedNodeExchangeOfferings(
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservedNodeExchangeOfferingsOutputMessage, Unit]
  ): Request[GetReservedNodeExchangeOfferingsOutputMessage, AWSError] = js.native
  /**
    * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given DC1 reserved node.
    */
  def getReservedNodeExchangeOfferings(params: GetReservedNodeExchangeOfferingsInputMessage): Request[GetReservedNodeExchangeOfferingsOutputMessage, AWSError] = js.native
  def getReservedNodeExchangeOfferings(
    params: GetReservedNodeExchangeOfferingsInputMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservedNodeExchangeOfferingsOutputMessage, Unit]
  ): Request[GetReservedNodeExchangeOfferingsOutputMessage, AWSError] = js.native
  
  /**
    * Modifies the settings for a cluster. You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster, you must specify both the number of nodes and the node type even if one of the parameters does not change. You can add another security or parameter group, or change the master user password. Resetting a cluster password or modifying the security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a reboot for parameters to take effect. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
    */
  def modifyCluster(): Request[ModifyClusterResult, AWSError] = js.native
  def modifyCluster(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterResult, Unit]): Request[ModifyClusterResult, AWSError] = js.native
  /**
    * Modifies the settings for a cluster. You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster, you must specify both the number of nodes and the node type even if one of the parameters does not change. You can add another security or parameter group, or change the master user password. Resetting a cluster password or modifying the security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a reboot for parameters to take effect. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
    */
  def modifyCluster(params: ModifyClusterMessage): Request[ModifyClusterResult, AWSError] = js.native
  def modifyCluster(
    params: ModifyClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterResult, Unit]
  ): Request[ModifyClusterResult, AWSError] = js.native
  
  /**
    * Modifies the database revision of a cluster. The database revision is a unique revision of the database running in a cluster.
    */
  def modifyClusterDbRevision(): Request[ModifyClusterDbRevisionResult, AWSError] = js.native
  def modifyClusterDbRevision(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterDbRevisionResult, Unit]): Request[ModifyClusterDbRevisionResult, AWSError] = js.native
  /**
    * Modifies the database revision of a cluster. The database revision is a unique revision of the database running in a cluster.
    */
  def modifyClusterDbRevision(params: ModifyClusterDbRevisionMessage): Request[ModifyClusterDbRevisionResult, AWSError] = js.native
  def modifyClusterDbRevision(
    params: ModifyClusterDbRevisionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterDbRevisionResult, Unit]
  ): Request[ModifyClusterDbRevisionResult, AWSError] = js.native
  
  /**
    * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. A cluster can have up to 10 IAM roles associated at any time.
    */
  def modifyClusterIamRoles(): Request[ModifyClusterIamRolesResult, AWSError] = js.native
  def modifyClusterIamRoles(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterIamRolesResult, Unit]): Request[ModifyClusterIamRolesResult, AWSError] = js.native
  /**
    * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. A cluster can have up to 10 IAM roles associated at any time.
    */
  def modifyClusterIamRoles(params: ModifyClusterIamRolesMessage): Request[ModifyClusterIamRolesResult, AWSError] = js.native
  def modifyClusterIamRoles(
    params: ModifyClusterIamRolesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterIamRolesResult, Unit]
  ): Request[ModifyClusterIamRolesResult, AWSError] = js.native
  
  /**
    * Modifies the maintenance settings of a cluster.
    */
  def modifyClusterMaintenance(): Request[ModifyClusterMaintenanceResult, AWSError] = js.native
  def modifyClusterMaintenance(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterMaintenanceResult, Unit]): Request[ModifyClusterMaintenanceResult, AWSError] = js.native
  /**
    * Modifies the maintenance settings of a cluster.
    */
  def modifyClusterMaintenance(params: ModifyClusterMaintenanceMessage): Request[ModifyClusterMaintenanceResult, AWSError] = js.native
  def modifyClusterMaintenance(
    params: ModifyClusterMaintenanceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterMaintenanceResult, Unit]
  ): Request[ModifyClusterMaintenanceResult, AWSError] = js.native
  
  /**
    * Modifies the parameters of a parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  def modifyClusterParameterGroup(): Request[ClusterParameterGroupNameMessage, AWSError] = js.native
  def modifyClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ ClusterParameterGroupNameMessage, Unit]): Request[ClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    * Modifies the parameters of a parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  def modifyClusterParameterGroup(params: ModifyClusterParameterGroupMessage): Request[ClusterParameterGroupNameMessage, AWSError] = js.native
  def modifyClusterParameterGroup(
    params: ModifyClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ClusterParameterGroupNameMessage, Unit]
  ): Request[ClusterParameterGroupNameMessage, AWSError] = js.native
  
  /**
    * Modifies the settings for a snapshot. This exanmple modifies the manual retention period setting for a cluster snapshot.
    */
  def modifyClusterSnapshot(): Request[ModifyClusterSnapshotResult, AWSError] = js.native
  def modifyClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterSnapshotResult, Unit]): Request[ModifyClusterSnapshotResult, AWSError] = js.native
  /**
    * Modifies the settings for a snapshot. This exanmple modifies the manual retention period setting for a cluster snapshot.
    */
  def modifyClusterSnapshot(params: ModifyClusterSnapshotMessage): Request[ModifyClusterSnapshotResult, AWSError] = js.native
  def modifyClusterSnapshot(
    params: ModifyClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterSnapshotResult, Unit]
  ): Request[ModifyClusterSnapshotResult, AWSError] = js.native
  
  /**
    * Modifies a snapshot schedule for a cluster.
    */
  def modifyClusterSnapshotSchedule(): Request[js.Object, AWSError] = js.native
  def modifyClusterSnapshotSchedule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies a snapshot schedule for a cluster.
    */
  def modifyClusterSnapshotSchedule(params: ModifyClusterSnapshotScheduleMessage): Request[js.Object, AWSError] = js.native
  def modifyClusterSnapshotSchedule(
    params: ModifyClusterSnapshotScheduleMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing list of subnets with the new list of subnets.
    */
  def modifyClusterSubnetGroup(): Request[ModifyClusterSubnetGroupResult, AWSError] = js.native
  def modifyClusterSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterSubnetGroupResult, Unit]): Request[ModifyClusterSubnetGroupResult, AWSError] = js.native
  /**
    * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing list of subnets with the new list of subnets.
    */
  def modifyClusterSubnetGroup(params: ModifyClusterSubnetGroupMessage): Request[ModifyClusterSubnetGroupResult, AWSError] = js.native
  def modifyClusterSubnetGroup(
    params: ModifyClusterSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterSubnetGroupResult, Unit]
  ): Request[ModifyClusterSubnetGroupResult, AWSError] = js.native
  
  /**
    * Modifies an existing Amazon Redshift event notification subscription.
    */
  def modifyEventSubscription(): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  def modifyEventSubscription(callback: js.Function2[/* err */ AWSError, /* data */ ModifyEventSubscriptionResult, Unit]): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  /**
    * Modifies an existing Amazon Redshift event notification subscription.
    */
  def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  def modifyEventSubscription(
    params: ModifyEventSubscriptionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyEventSubscriptionResult, Unit]
  ): Request[ModifyEventSubscriptionResult, AWSError] = js.native
  
  /**
    * Modifies a scheduled action. 
    */
  def modifyScheduledAction(): Request[ScheduledAction, AWSError] = js.native
  def modifyScheduledAction(callback: js.Function2[/* err */ AWSError, /* data */ ScheduledAction, Unit]): Request[ScheduledAction, AWSError] = js.native
  /**
    * Modifies a scheduled action. 
    */
  def modifyScheduledAction(params: ModifyScheduledActionMessage): Request[ScheduledAction, AWSError] = js.native
  def modifyScheduledAction(
    params: ModifyScheduledActionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ScheduledAction, Unit]
  ): Request[ScheduledAction, AWSError] = js.native
  
  /**
    * Modifies the number of days to retain snapshots in the destination AWS Region after they are copied from the source AWS Region. By default, this operation only changes the retention period of copied automated snapshots. The retention periods for both new and existing copied automated snapshots are updated with the new retention period. You can set the manual option to change only the retention periods of copied manual snapshots. If you set this option, only newly copied manual snapshots have the new retention period. 
    */
  def modifySnapshotCopyRetentionPeriod(): Request[ModifySnapshotCopyRetentionPeriodResult, AWSError] = js.native
  def modifySnapshotCopyRetentionPeriod(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifySnapshotCopyRetentionPeriodResult, Unit]
  ): Request[ModifySnapshotCopyRetentionPeriodResult, AWSError] = js.native
  /**
    * Modifies the number of days to retain snapshots in the destination AWS Region after they are copied from the source AWS Region. By default, this operation only changes the retention period of copied automated snapshots. The retention periods for both new and existing copied automated snapshots are updated with the new retention period. You can set the manual option to change only the retention periods of copied manual snapshots. If you set this option, only newly copied manual snapshots have the new retention period. 
    */
  def modifySnapshotCopyRetentionPeriod(params: ModifySnapshotCopyRetentionPeriodMessage): Request[ModifySnapshotCopyRetentionPeriodResult, AWSError] = js.native
  def modifySnapshotCopyRetentionPeriod(
    params: ModifySnapshotCopyRetentionPeriodMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifySnapshotCopyRetentionPeriodResult, Unit]
  ): Request[ModifySnapshotCopyRetentionPeriodResult, AWSError] = js.native
  
  /**
    * Modifies a snapshot schedule. Any schedule associated with a cluster is modified asynchronously.
    */
  def modifySnapshotSchedule(): Request[SnapshotSchedule, AWSError] = js.native
  def modifySnapshotSchedule(callback: js.Function2[/* err */ AWSError, /* data */ SnapshotSchedule, Unit]): Request[SnapshotSchedule, AWSError] = js.native
  /**
    * Modifies a snapshot schedule. Any schedule associated with a cluster is modified asynchronously.
    */
  def modifySnapshotSchedule(params: ModifySnapshotScheduleMessage): Request[SnapshotSchedule, AWSError] = js.native
  def modifySnapshotSchedule(
    params: ModifySnapshotScheduleMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ SnapshotSchedule, Unit]
  ): Request[SnapshotSchedule, AWSError] = js.native
  
  /**
    * Modifies a usage limit in a cluster. You can't modify the feature type or period of a usage limit.
    */
  def modifyUsageLimit(): Request[UsageLimit, AWSError] = js.native
  def modifyUsageLimit(callback: js.Function2[/* err */ AWSError, /* data */ UsageLimit, Unit]): Request[UsageLimit, AWSError] = js.native
  /**
    * Modifies a usage limit in a cluster. You can't modify the feature type or period of a usage limit.
    */
  def modifyUsageLimit(params: ModifyUsageLimitMessage): Request[UsageLimit, AWSError] = js.native
  def modifyUsageLimit(
    params: ModifyUsageLimitMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ UsageLimit, Unit]
  ): Request[UsageLimit, AWSError] = js.native
  
  /**
    * Pauses a cluster.
    */
  def pauseCluster(): Request[PauseClusterResult, AWSError] = js.native
  def pauseCluster(callback: js.Function2[/* err */ AWSError, /* data */ PauseClusterResult, Unit]): Request[PauseClusterResult, AWSError] = js.native
  /**
    * Pauses a cluster.
    */
  def pauseCluster(params: PauseClusterMessage): Request[PauseClusterResult, AWSError] = js.native
  def pauseCluster(
    params: PauseClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ PauseClusterResult, Unit]
  ): Request[PauseClusterResult, AWSError] = js.native
  
  /**
    * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You can purchase one or more of the offerings. You can call the DescribeReservedNodeOfferings API to obtain the available reserved node offerings. You can call this API by providing a specific reserved node offering and the number of nodes you want to reserve.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
    */
  def purchaseReservedNodeOffering(): Request[PurchaseReservedNodeOfferingResult, AWSError] = js.native
  def purchaseReservedNodeOffering(callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedNodeOfferingResult, Unit]): Request[PurchaseReservedNodeOfferingResult, AWSError] = js.native
  /**
    * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You can purchase one or more of the offerings. You can call the DescribeReservedNodeOfferings API to obtain the available reserved node offerings. You can call this API by providing a specific reserved node offering and the number of nodes you want to reserve.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
    */
  def purchaseReservedNodeOffering(params: PurchaseReservedNodeOfferingMessage): Request[PurchaseReservedNodeOfferingResult, AWSError] = js.native
  def purchaseReservedNodeOffering(
    params: PurchaseReservedNodeOfferingMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedNodeOfferingResult, Unit]
  ): Request[PurchaseReservedNodeOfferingResult, AWSError] = js.native
  
  /**
    * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster, during which the cluster status is set to rebooting. A cluster event is created when the reboot is completed. Any pending cluster modifications (see ModifyCluster) are applied at this reboot. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. 
    */
  def rebootCluster(): Request[RebootClusterResult, AWSError] = js.native
  def rebootCluster(callback: js.Function2[/* err */ AWSError, /* data */ RebootClusterResult, Unit]): Request[RebootClusterResult, AWSError] = js.native
  /**
    * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster, during which the cluster status is set to rebooting. A cluster event is created when the reboot is completed. Any pending cluster modifications (see ModifyCluster) are applied at this reboot. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. 
    */
  def rebootCluster(params: RebootClusterMessage): Request[RebootClusterResult, AWSError] = js.native
  def rebootCluster(
    params: RebootClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootClusterResult, Unit]
  ): Request[RebootClusterResult, AWSError] = js.native
  
  /**
    * Sets one or more parameters of the specified parameter group to their default values and sets the source values of the parameters to "engine-default". To reset the entire parameter group specify the ResetAllParameters parameter. For parameter changes to take effect you must reboot any associated clusters. 
    */
  def resetClusterParameterGroup(): Request[ClusterParameterGroupNameMessage, AWSError] = js.native
  def resetClusterParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ ClusterParameterGroupNameMessage, Unit]): Request[ClusterParameterGroupNameMessage, AWSError] = js.native
  /**
    * Sets one or more parameters of the specified parameter group to their default values and sets the source values of the parameters to "engine-default". To reset the entire parameter group specify the ResetAllParameters parameter. For parameter changes to take effect you must reboot any associated clusters. 
    */
  def resetClusterParameterGroup(params: ResetClusterParameterGroupMessage): Request[ClusterParameterGroupNameMessage, AWSError] = js.native
  def resetClusterParameterGroup(
    params: ResetClusterParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ClusterParameterGroupNameMessage, Unit]
  ): Request[ClusterParameterGroupNameMessage, AWSError] = js.native
  
  /**
    * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The default behavior is to use the elastic resize method. With an elastic resize, your cluster is available for read and write operations more quickly than with the classic resize method.  Elastic resize operations have the following restrictions:   You can only resize clusters of the following types:   dc1.large (if your cluster is in a VPC)   dc1.8xlarge (if your cluster is in a VPC)   dc2.large   dc2.8xlarge   ds2.xlarge   ds2.8xlarge   ra3.4xlarge   ra3.16xlarge     The type of nodes that you add must match the node type for the cluster.  
    */
  def resizeCluster(): Request[ResizeClusterResult, AWSError] = js.native
  def resizeCluster(callback: js.Function2[/* err */ AWSError, /* data */ ResizeClusterResult, Unit]): Request[ResizeClusterResult, AWSError] = js.native
  /**
    * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The default behavior is to use the elastic resize method. With an elastic resize, your cluster is available for read and write operations more quickly than with the classic resize method.  Elastic resize operations have the following restrictions:   You can only resize clusters of the following types:   dc1.large (if your cluster is in a VPC)   dc1.8xlarge (if your cluster is in a VPC)   dc2.large   dc2.8xlarge   ds2.xlarge   ds2.8xlarge   ra3.4xlarge   ra3.16xlarge     The type of nodes that you add must match the node type for the cluster.  
    */
  def resizeCluster(params: ResizeClusterMessage): Request[ResizeClusterResult, AWSError] = js.native
  def resizeCluster(
    params: ResizeClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ResizeClusterResult, Unit]
  ): Request[ResizeClusterResult, AWSError] = js.native
  
  /**
    * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same configuration as the original cluster from which the snapshot was created, except that the new cluster is created with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use the ModifyCluster API to associate a different security group and different parameter group with the restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the same size during restore. If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
    */
  def restoreFromClusterSnapshot(): Request[RestoreFromClusterSnapshotResult, AWSError] = js.native
  def restoreFromClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ RestoreFromClusterSnapshotResult, Unit]): Request[RestoreFromClusterSnapshotResult, AWSError] = js.native
  /**
    * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same configuration as the original cluster from which the snapshot was created, except that the new cluster is created with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use the ModifyCluster API to associate a different security group and different parameter group with the restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the same size during restore. If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
    */
  def restoreFromClusterSnapshot(params: RestoreFromClusterSnapshotMessage): Request[RestoreFromClusterSnapshotResult, AWSError] = js.native
  def restoreFromClusterSnapshot(
    params: RestoreFromClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreFromClusterSnapshotResult, Unit]
  ): Request[RestoreFromClusterSnapshotResult, AWSError] = js.native
  
  /**
    * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the Amazon Redshift cluster that the snapshot was taken from. You cannot use RestoreTableFromClusterSnapshot to restore a table with the same name as an existing table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored table. If you want to replace your original table with a new, restored table, then rename or drop your original table before you call RestoreTableFromClusterSnapshot. When you have renamed your original table, then you can pass the original name of the table as the NewTableName parameter value in the call to RestoreTableFromClusterSnapshot. This way, you can replace the original table with the table created from the snapshot.
    */
  def restoreTableFromClusterSnapshot(): Request[RestoreTableFromClusterSnapshotResult, AWSError] = js.native
  def restoreTableFromClusterSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ RestoreTableFromClusterSnapshotResult, Unit]): Request[RestoreTableFromClusterSnapshotResult, AWSError] = js.native
  /**
    * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the Amazon Redshift cluster that the snapshot was taken from. You cannot use RestoreTableFromClusterSnapshot to restore a table with the same name as an existing table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored table. If you want to replace your original table with a new, restored table, then rename or drop your original table before you call RestoreTableFromClusterSnapshot. When you have renamed your original table, then you can pass the original name of the table as the NewTableName parameter value in the call to RestoreTableFromClusterSnapshot. This way, you can replace the original table with the table created from the snapshot.
    */
  def restoreTableFromClusterSnapshot(params: RestoreTableFromClusterSnapshotMessage): Request[RestoreTableFromClusterSnapshotResult, AWSError] = js.native
  def restoreTableFromClusterSnapshot(
    params: RestoreTableFromClusterSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreTableFromClusterSnapshotResult, Unit]
  ): Request[RestoreTableFromClusterSnapshotResult, AWSError] = js.native
  
  /**
    * Resumes a paused cluster.
    */
  def resumeCluster(): Request[ResumeClusterResult, AWSError] = js.native
  def resumeCluster(callback: js.Function2[/* err */ AWSError, /* data */ ResumeClusterResult, Unit]): Request[ResumeClusterResult, AWSError] = js.native
  /**
    * Resumes a paused cluster.
    */
  def resumeCluster(params: ResumeClusterMessage): Request[ResumeClusterResult, AWSError] = js.native
  def resumeCluster(
    params: ResumeClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ResumeClusterResult, Unit]
  ): Request[ResumeClusterResult, AWSError] = js.native
  
  /**
    * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2 security group. To add an ingress rule, see AuthorizeClusterSecurityGroupIngress. For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. 
    */
  def revokeClusterSecurityGroupIngress(): Request[RevokeClusterSecurityGroupIngressResult, AWSError] = js.native
  def revokeClusterSecurityGroupIngress(
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeClusterSecurityGroupIngressResult, Unit]
  ): Request[RevokeClusterSecurityGroupIngressResult, AWSError] = js.native
  /**
    * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2 security group. To add an ingress rule, see AuthorizeClusterSecurityGroupIngress. For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. 
    */
  def revokeClusterSecurityGroupIngress(params: RevokeClusterSecurityGroupIngressMessage): Request[RevokeClusterSecurityGroupIngressResult, AWSError] = js.native
  def revokeClusterSecurityGroupIngress(
    params: RevokeClusterSecurityGroupIngressMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeClusterSecurityGroupIngressResult, Unit]
  ): Request[RevokeClusterSecurityGroupIngressResult, AWSError] = js.native
  
  /**
    * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is currently restoring the snapshot, the restore will run to completion.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
    */
  def revokeSnapshotAccess(): Request[RevokeSnapshotAccessResult, AWSError] = js.native
  def revokeSnapshotAccess(callback: js.Function2[/* err */ AWSError, /* data */ RevokeSnapshotAccessResult, Unit]): Request[RevokeSnapshotAccessResult, AWSError] = js.native
  /**
    * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is currently restoring the snapshot, the restore will run to completion.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
    */
  def revokeSnapshotAccess(params: RevokeSnapshotAccessMessage): Request[RevokeSnapshotAccessResult, AWSError] = js.native
  def revokeSnapshotAccess(
    params: RevokeSnapshotAccessMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeSnapshotAccessResult, Unit]
  ): Request[RevokeSnapshotAccessResult, AWSError] = js.native
  
  /**
    * Rotates the encryption keys for a cluster.
    */
  def rotateEncryptionKey(): Request[RotateEncryptionKeyResult, AWSError] = js.native
  def rotateEncryptionKey(callback: js.Function2[/* err */ AWSError, /* data */ RotateEncryptionKeyResult, Unit]): Request[RotateEncryptionKeyResult, AWSError] = js.native
  /**
    * Rotates the encryption keys for a cluster.
    */
  def rotateEncryptionKey(params: RotateEncryptionKeyMessage): Request[RotateEncryptionKeyResult, AWSError] = js.native
  def rotateEncryptionKey(
    params: RotateEncryptionKeyMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RotateEncryptionKeyResult, Unit]
  ): Request[RotateEncryptionKeyResult, AWSError] = js.native
  
  /**
    * Waits for the clusterAvailable state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
    */
  @JSName("waitFor")
  def waitFor_clusterAvailable(state: clusterAvailable): Request[ClustersMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterAvailable(
    state: clusterAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ ClustersMessage, Unit]
  ): Request[ClustersMessage, AWSError] = js.native
  /**
    * Waits for the clusterAvailable state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
    */
  @JSName("waitFor")
  def waitFor_clusterAvailable(state: clusterAvailable, params: DescribeClustersMessagewa): Request[ClustersMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterAvailable(
    state: clusterAvailable,
    params: DescribeClustersMessagewa,
    callback: js.Function2[/* err */ AWSError, /* data */ ClustersMessage, Unit]
  ): Request[ClustersMessage, AWSError] = js.native
  /**
    * Waits for the clusterDeleted state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
    */
  @JSName("waitFor")
  def waitFor_clusterDeleted(state: clusterDeleted): Request[ClustersMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: clusterDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ ClustersMessage, Unit]
  ): Request[ClustersMessage, AWSError] = js.native
  /**
    * Waits for the clusterDeleted state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
    */
  @JSName("waitFor")
  def waitFor_clusterDeleted(state: clusterDeleted, params: DescribeClustersMessagewa): Request[ClustersMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: clusterDeleted,
    params: DescribeClustersMessagewa,
    callback: js.Function2[/* err */ AWSError, /* data */ ClustersMessage, Unit]
  ): Request[ClustersMessage, AWSError] = js.native
  /**
    * Waits for the clusterRestored state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
    */
  @JSName("waitFor")
  def waitFor_clusterRestored(state: clusterRestored): Request[ClustersMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterRestored(
    state: clusterRestored,
    callback: js.Function2[/* err */ AWSError, /* data */ ClustersMessage, Unit]
  ): Request[ClustersMessage, AWSError] = js.native
  /**
    * Waits for the clusterRestored state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
    */
  @JSName("waitFor")
  def waitFor_clusterRestored(state: clusterRestored, params: DescribeClustersMessagewa): Request[ClustersMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterRestored(
    state: clusterRestored,
    params: DescribeClustersMessagewa,
    callback: js.Function2[/* err */ AWSError, /* data */ ClustersMessage, Unit]
  ): Request[ClustersMessage, AWSError] = js.native
  /**
    * Waits for the snapshotAvailable state by periodically calling the underlying Redshift.describeClusterSnapshotsoperation every 15 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_snapshotAvailable(state: snapshotAvailable): Request[SnapshotMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_snapshotAvailable(
    state: snapshotAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ SnapshotMessage, Unit]
  ): Request[SnapshotMessage, AWSError] = js.native
  /**
    * Waits for the snapshotAvailable state by periodically calling the underlying Redshift.describeClusterSnapshotsoperation every 15 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_snapshotAvailable(state: snapshotAvailable, params: DescribeClusterSnapshotsM): Request[SnapshotMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_snapshotAvailable(
    state: snapshotAvailable,
    params: DescribeClusterSnapshotsM,
    callback: js.Function2[/* err */ AWSError, /* data */ SnapshotMessage, Unit]
  ): Request[SnapshotMessage, AWSError] = js.native
}
