package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterClusterParameterStatus extends StObject {
  
  /**
    * The error that prevented the parameter from being applied to the database.
    */
  var ParameterApplyErrorDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the parameter. Indicates whether the parameter is in sync with the database, waiting for a cluster reboot, or encountered an error when it was applied. Valid values: in-sync | pending-reboot | applying | invalid-parameter | apply-deferred | apply-error | unknown-error 
    */
  var ParameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterClusterParameterStatus {
  
  inline def apply(): AwsRedshiftClusterClusterParameterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterParameterStatus]
  }
  
  extension [Self <: AwsRedshiftClusterClusterParameterStatus](x: Self) {
    
    inline def setParameterApplyErrorDescription(value: NonEmptyString): Self = StObject.set(x, "ParameterApplyErrorDescription", value.asInstanceOf[js.Any])
    
    inline def setParameterApplyErrorDescriptionUndefined: Self = StObject.set(x, "ParameterApplyErrorDescription", js.undefined)
    
    inline def setParameterApplyStatus(value: NonEmptyString): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
    
    inline def setParameterName(value: NonEmptyString): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
  }
}
