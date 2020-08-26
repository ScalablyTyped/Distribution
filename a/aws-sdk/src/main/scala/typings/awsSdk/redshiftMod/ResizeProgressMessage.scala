package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeProgressMessage extends js.Object {
  /**
    * The average rate of the resize operation over the last few minutes, measured in megabytes per second. After the resize operation completes, this value shows the average rate of the entire resize operation.
    */
  var AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.native
  /**
    * The percent of data transferred from source cluster to target cluster.
    */
  var DataTransferProgressPercent: js.UndefOr[DoubleOptional] = js.native
  /**
    * The amount of seconds that have elapsed since the resize operation began. After the resize operation completes, this value shows the total actual time, in seconds, for the resize operation.
    */
  var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.native
  /**
    * The estimated time remaining, in seconds, until the resize operation is complete. This value is calculated based on the average resize rate and the estimated amount of data remaining to be processed. Once the resize operation is complete, this value will be 0.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.native
  /**
    * The names of tables that have been completely imported . Valid Values: List of table names.
    */
  var ImportTablesCompleted: js.UndefOr[typings.awsSdk.redshiftMod.ImportTablesCompleted] = js.native
  /**
    * The names of tables that are being currently imported. Valid Values: List of table names.
    */
  var ImportTablesInProgress: js.UndefOr[typings.awsSdk.redshiftMod.ImportTablesInProgress] = js.native
  /**
    * The names of tables that have not been yet imported. Valid Values: List of table names
    */
  var ImportTablesNotStarted: js.UndefOr[typings.awsSdk.redshiftMod.ImportTablesNotStarted] = js.native
  /**
    * An optional string to provide additional details about the resize action.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * While the resize operation is in progress, this value shows the current amount of data, in megabytes, that has been processed so far. When the resize operation is complete, this value shows the total amount of data, in megabytes, on the cluster, which may be more or less than TotalResizeDataInMegaBytes (the estimated total amount of data before resize).
    */
  var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.native
  /**
    * An enum with possible values of ClassicResize and ElasticResize. These values describe the type of resize operation being performed. 
    */
  var ResizeType: js.UndefOr[String] = js.native
  /**
    * The status of the resize operation. Valid Values: NONE | IN_PROGRESS | FAILED | SUCCEEDED | CANCELLING 
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The cluster type after the resize operation is complete. Valid Values: multi-node | single-node 
    */
  var TargetClusterType: js.UndefOr[String] = js.native
  /**
    * The type of encryption for the cluster after the resize is complete. Possible values are KMS and None. In the China region possible values are: Legacy and None.
    */
  var TargetEncryptionType: js.UndefOr[String] = js.native
  /**
    * The node type that the cluster will have after the resize operation is complete.
    */
  var TargetNodeType: js.UndefOr[String] = js.native
  /**
    * The number of nodes that the cluster will have after the resize operation is complete.
    */
  var TargetNumberOfNodes: js.UndefOr[IntegerOptional] = js.native
  /**
    * The estimated total amount of data, in megabytes, on the cluster before the resize operation began.
    */
  var TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.native
}

object ResizeProgressMessage {
  @scala.inline
  def apply(): ResizeProgressMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeProgressMessage]
  }
  @scala.inline
  implicit class ResizeProgressMessageOps[Self <: ResizeProgressMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvgResizeRateInMegaBytesPerSecond(value: DoubleOptional): Self = this.set("AvgResizeRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvgResizeRateInMegaBytesPerSecond: Self = this.set("AvgResizeRateInMegaBytesPerSecond", js.undefined)
    @scala.inline
    def setDataTransferProgressPercent(value: DoubleOptional): Self = this.set("DataTransferProgressPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTransferProgressPercent: Self = this.set("DataTransferProgressPercent", js.undefined)
    @scala.inline
    def setElapsedTimeInSeconds(value: LongOptional): Self = this.set("ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElapsedTimeInSeconds: Self = this.set("ElapsedTimeInSeconds", js.undefined)
    @scala.inline
    def setEstimatedTimeToCompletionInSeconds(value: LongOptional): Self = this.set("EstimatedTimeToCompletionInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedTimeToCompletionInSeconds: Self = this.set("EstimatedTimeToCompletionInSeconds", js.undefined)
    @scala.inline
    def setImportTablesCompletedVarargs(value: String*): Self = this.set("ImportTablesCompleted", js.Array(value :_*))
    @scala.inline
    def setImportTablesCompleted(value: ImportTablesCompleted): Self = this.set("ImportTablesCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportTablesCompleted: Self = this.set("ImportTablesCompleted", js.undefined)
    @scala.inline
    def setImportTablesInProgressVarargs(value: String*): Self = this.set("ImportTablesInProgress", js.Array(value :_*))
    @scala.inline
    def setImportTablesInProgress(value: ImportTablesInProgress): Self = this.set("ImportTablesInProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportTablesInProgress: Self = this.set("ImportTablesInProgress", js.undefined)
    @scala.inline
    def setImportTablesNotStartedVarargs(value: String*): Self = this.set("ImportTablesNotStarted", js.Array(value :_*))
    @scala.inline
    def setImportTablesNotStarted(value: ImportTablesNotStarted): Self = this.set("ImportTablesNotStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportTablesNotStarted: Self = this.set("ImportTablesNotStarted", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setProgressInMegaBytes(value: LongOptional): Self = this.set("ProgressInMegaBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressInMegaBytes: Self = this.set("ProgressInMegaBytes", js.undefined)
    @scala.inline
    def setResizeType(value: String): Self = this.set("ResizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeType: Self = this.set("ResizeType", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTargetClusterType(value: String): Self = this.set("TargetClusterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetClusterType: Self = this.set("TargetClusterType", js.undefined)
    @scala.inline
    def setTargetEncryptionType(value: String): Self = this.set("TargetEncryptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetEncryptionType: Self = this.set("TargetEncryptionType", js.undefined)
    @scala.inline
    def setTargetNodeType(value: String): Self = this.set("TargetNodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetNodeType: Self = this.set("TargetNodeType", js.undefined)
    @scala.inline
    def setTargetNumberOfNodes(value: IntegerOptional): Self = this.set("TargetNumberOfNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetNumberOfNodes: Self = this.set("TargetNumberOfNodes", js.undefined)
    @scala.inline
    def setTotalResizeDataInMegaBytes(value: LongOptional): Self = this.set("TotalResizeDataInMegaBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalResizeDataInMegaBytes: Self = this.set("TotalResizeDataInMegaBytes", js.undefined)
  }
  
}

