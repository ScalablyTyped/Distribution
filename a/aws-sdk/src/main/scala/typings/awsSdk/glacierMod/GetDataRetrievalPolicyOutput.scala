package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataRetrievalPolicyOutput extends StObject {
  
  /**
    * Contains the returned data retrieval policy in JSON format.
    */
  var Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
}
object GetDataRetrievalPolicyOutput {
  
  inline def apply(): GetDataRetrievalPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
  }
  
  extension [Self <: GetDataRetrievalPolicyOutput](x: Self) {
    
    inline def setPolicy(value: DataRetrievalPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
