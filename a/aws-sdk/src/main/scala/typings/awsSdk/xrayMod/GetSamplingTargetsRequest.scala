package typings.awsSdk.xrayMod

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
  
  @scala.inline
  def apply(SamplingStatisticsDocuments: SamplingStatisticsDocumentList): GetSamplingTargetsRequest = {
    val __obj = js.Dynamic.literal(SamplingStatisticsDocuments = SamplingStatisticsDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingTargetsRequest]
  }
  
  @scala.inline
  implicit class GetSamplingTargetsRequestMutableBuilder[Self <: GetSamplingTargetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSamplingStatisticsDocuments(value: SamplingStatisticsDocumentList): Self = StObject.set(x, "SamplingStatisticsDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingStatisticsDocumentsVarargs(value: SamplingStatisticsDocument*): Self = StObject.set(x, "SamplingStatisticsDocuments", js.Array(value :_*))
  }
}
