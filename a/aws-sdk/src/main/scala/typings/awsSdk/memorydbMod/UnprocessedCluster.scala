package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedCluster extends StObject {
  
  /**
    * The name of the cluster
    */
  var ClusterName: js.UndefOr[String] = js.undefined
  
  /**
    * The error message associated with the update failure
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The error type associated with the update failure
    */
  var ErrorType: js.UndefOr[String] = js.undefined
}
object UnprocessedCluster {
  
  inline def apply(): UnprocessedCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedCluster]
  }
  
  extension [Self <: UnprocessedCluster](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setErrorType(value: String): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "ErrorType", js.undefined)
  }
}
