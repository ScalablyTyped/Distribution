package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackResourceDriftInformationSummary extends StObject {
  
  /**
    * When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
    */
  var LastCheckTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected configuration in that it has been deleted.    MODIFIED: The resource differs from its expected configuration.    NOT_CHECKED: AWS CloudFormation has not checked if the resource differs from its expected configuration. Any resources that do not currently support drift detection have a status of NOT_CHECKED. For more information, see Resources that Support Drift Detection. If you performed an ContinueUpdateRollback operation on a stack, any resources included in ResourcesToSkip will also have a status of NOT_CHECKED. For more information on skipping resources during rollback operations, see Continue Rolling Back an Update in the AWS CloudFormation User Guide.    IN_SYNC: The resources's actual configuration matches its expected configuration.  
    */
  var StackResourceDriftStatus: typings.awsSdk.cloudformationMod.StackResourceDriftStatus = js.native
}
object StackResourceDriftInformationSummary {
  
  @scala.inline
  def apply(StackResourceDriftStatus: StackResourceDriftStatus): StackResourceDriftInformationSummary = {
    val __obj = js.Dynamic.literal(StackResourceDriftStatus = StackResourceDriftStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDriftInformationSummary]
  }
  
  @scala.inline
  implicit class StackResourceDriftInformationSummaryMutableBuilder[Self <: StackResourceDriftInformationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastCheckTimestamp(value: Timestamp): Self = StObject.set(x, "LastCheckTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCheckTimestampUndefined: Self = StObject.set(x, "LastCheckTimestamp", js.undefined)
    
    @scala.inline
    def setStackResourceDriftStatus(value: StackResourceDriftStatus): Self = StObject.set(x, "StackResourceDriftStatus", value.asInstanceOf[js.Any])
  }
}
