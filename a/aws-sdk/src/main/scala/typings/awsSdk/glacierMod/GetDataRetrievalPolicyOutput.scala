package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataRetrievalPolicyOutput extends StObject {
  
  /**
    * Contains the returned data retrieval policy in JSON format.
    */
  var Policy: js.UndefOr[DataRetrievalPolicy] = js.native
}
object GetDataRetrievalPolicyOutput {
  
  @scala.inline
  def apply(): GetDataRetrievalPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
  }
  
  @scala.inline
  implicit class GetDataRetrievalPolicyOutputMutableBuilder[Self <: GetDataRetrievalPolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: DataRetrievalPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
