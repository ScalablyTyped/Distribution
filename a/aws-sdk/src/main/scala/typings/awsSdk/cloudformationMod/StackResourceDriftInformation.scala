package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackResourceDriftInformation extends StObject {
  
  /**
    * When CloudFormation last checked if the resource had drifted from its expected configuration.
    */
  var LastCheckTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected configuration in that it has been deleted.    MODIFIED: The resource differs from its expected configuration.    NOT_CHECKED: CloudFormation has not checked if the resource differs from its expected configuration. Any resources that do not currently support drift detection have a status of NOT_CHECKED. For more information, see Resources that Support Drift Detection.    IN_SYNC: The resource's actual configuration matches its expected configuration.  
    */
  var StackResourceDriftStatus: typings.awsSdk.cloudformationMod.StackResourceDriftStatus
}
object StackResourceDriftInformation {
  
  inline def apply(StackResourceDriftStatus: StackResourceDriftStatus): StackResourceDriftInformation = {
    val __obj = js.Dynamic.literal(StackResourceDriftStatus = StackResourceDriftStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDriftInformation]
  }
  
  extension [Self <: StackResourceDriftInformation](x: Self) {
    
    inline def setLastCheckTimestamp(value: js.Date): Self = StObject.set(x, "LastCheckTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastCheckTimestampUndefined: Self = StObject.set(x, "LastCheckTimestamp", js.undefined)
    
    inline def setStackResourceDriftStatus(value: StackResourceDriftStatus): Self = StObject.set(x, "StackResourceDriftStatus", value.asInstanceOf[js.Any])
  }
}
