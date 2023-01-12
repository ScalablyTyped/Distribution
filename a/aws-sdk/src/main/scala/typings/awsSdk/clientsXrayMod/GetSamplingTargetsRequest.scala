package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSamplingTargetsRequest extends StObject {
  
  /**
    * Information about rules that the service is using to sample requests.
    */
  var SamplingStatisticsDocuments: SamplingStatisticsDocumentList
}
object GetSamplingTargetsRequest {
  
  inline def apply(SamplingStatisticsDocuments: SamplingStatisticsDocumentList): GetSamplingTargetsRequest = {
    val __obj = js.Dynamic.literal(SamplingStatisticsDocuments = SamplingStatisticsDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingTargetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSamplingTargetsRequest] (val x: Self) extends AnyVal {
    
    inline def setSamplingStatisticsDocuments(value: SamplingStatisticsDocumentList): Self = StObject.set(x, "SamplingStatisticsDocuments", value.asInstanceOf[js.Any])
    
    inline def setSamplingStatisticsDocumentsVarargs(value: SamplingStatisticsDocument*): Self = StObject.set(x, "SamplingStatisticsDocuments", js.Array(value*))
  }
}
