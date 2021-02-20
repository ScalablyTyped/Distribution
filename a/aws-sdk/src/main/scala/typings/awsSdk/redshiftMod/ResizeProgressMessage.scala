package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeProgressMessage extends StObject {
  
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
    * The type of encryption for the cluster after the resize is complete. Possible values are KMS and None. 
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
  implicit class ResizeProgressMessageMutableBuilder[Self <: ResizeProgressMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvgResizeRateInMegaBytesPerSecond(value: DoubleOptional): Self = StObject.set(x, "AvgResizeRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvgResizeRateInMegaBytesPerSecondUndefined: Self = StObject.set(x, "AvgResizeRateInMegaBytesPerSecond", js.undefined)
    
    @scala.inline
    def setDataTransferProgressPercent(value: DoubleOptional): Self = StObject.set(x, "DataTransferProgressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferProgressPercentUndefined: Self = StObject.set(x, "DataTransferProgressPercent", js.undefined)
    
    @scala.inline
    def setElapsedTimeInSeconds(value: LongOptional): Self = StObject.set(x, "ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeInSecondsUndefined: Self = StObject.set(x, "ElapsedTimeInSeconds", js.undefined)
    
    @scala.inline
    def setEstimatedTimeToCompletionInSeconds(value: LongOptional): Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedTimeToCompletionInSecondsUndefined: Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", js.undefined)
    
    @scala.inline
    def setImportTablesCompleted(value: ImportTablesCompleted): Self = StObject.set(x, "ImportTablesCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTablesCompletedUndefined: Self = StObject.set(x, "ImportTablesCompleted", js.undefined)
    
    @scala.inline
    def setImportTablesCompletedVarargs(value: String*): Self = StObject.set(x, "ImportTablesCompleted", js.Array(value :_*))
    
    @scala.inline
    def setImportTablesInProgress(value: ImportTablesInProgress): Self = StObject.set(x, "ImportTablesInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTablesInProgressUndefined: Self = StObject.set(x, "ImportTablesInProgress", js.undefined)
    
    @scala.inline
    def setImportTablesInProgressVarargs(value: String*): Self = StObject.set(x, "ImportTablesInProgress", js.Array(value :_*))
    
    @scala.inline
    def setImportTablesNotStarted(value: ImportTablesNotStarted): Self = StObject.set(x, "ImportTablesNotStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTablesNotStartedUndefined: Self = StObject.set(x, "ImportTablesNotStarted", js.undefined)
    
    @scala.inline
    def setImportTablesNotStartedVarargs(value: String*): Self = StObject.set(x, "ImportTablesNotStarted", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setProgressInMegaBytes(value: LongOptional): Self = StObject.set(x, "ProgressInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressInMegaBytesUndefined: Self = StObject.set(x, "ProgressInMegaBytes", js.undefined)
    
    @scala.inline
    def setResizeType(value: String): Self = StObject.set(x, "ResizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeTypeUndefined: Self = StObject.set(x, "ResizeType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTargetClusterType(value: String): Self = StObject.set(x, "TargetClusterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetClusterTypeUndefined: Self = StObject.set(x, "TargetClusterType", js.undefined)
    
    @scala.inline
    def setTargetEncryptionType(value: String): Self = StObject.set(x, "TargetEncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEncryptionTypeUndefined: Self = StObject.set(x, "TargetEncryptionType", js.undefined)
    
    @scala.inline
    def setTargetNodeType(value: String): Self = StObject.set(x, "TargetNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNodeTypeUndefined: Self = StObject.set(x, "TargetNodeType", js.undefined)
    
    @scala.inline
    def setTargetNumberOfNodes(value: IntegerOptional): Self = StObject.set(x, "TargetNumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNumberOfNodesUndefined: Self = StObject.set(x, "TargetNumberOfNodes", js.undefined)
    
    @scala.inline
    def setTotalResizeDataInMegaBytes(value: LongOptional): Self = StObject.set(x, "TotalResizeDataInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResizeDataInMegaBytesUndefined: Self = StObject.set(x, "TotalResizeDataInMegaBytes", js.undefined)
  }
}
