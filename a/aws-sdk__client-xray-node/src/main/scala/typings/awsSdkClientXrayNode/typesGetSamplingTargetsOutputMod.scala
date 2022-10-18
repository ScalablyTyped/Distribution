package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingTargetDocumentMod.UnmarshalledSamplingTargetDocument
import typings.awsSdkClientXrayNode.typesUnprocessedStatisticsMod.UnmarshalledUnprocessedStatistics
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSamplingTargetsOutputMod {
  
  trait GetSamplingTargetsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest version.</p>
      */
    var LastRuleModification: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>Updated rules that the service should use to sample requests.</p>
      */
    var SamplingTargetDocuments: js.UndefOr[js.Array[UnmarshalledSamplingTargetDocument]] = js.undefined
    
    /**
      * <p>Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.</p>
      */
    var UnprocessedStatistics: js.UndefOr[js.Array[UnmarshalledUnprocessedStatistics]] = js.undefined
  }
  object GetSamplingTargetsOutput {
    
    inline def apply($metadata: ResponseMetadata): GetSamplingTargetsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSamplingTargetsOutput]
    }
    
    extension [Self <: GetSamplingTargetsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setLastRuleModification(value: js.Date): Self = StObject.set(x, "LastRuleModification", value.asInstanceOf[js.Any])
      
      inline def setLastRuleModificationUndefined: Self = StObject.set(x, "LastRuleModification", js.undefined)
      
      inline def setSamplingTargetDocuments(value: js.Array[UnmarshalledSamplingTargetDocument]): Self = StObject.set(x, "SamplingTargetDocuments", value.asInstanceOf[js.Any])
      
      inline def setSamplingTargetDocumentsUndefined: Self = StObject.set(x, "SamplingTargetDocuments", js.undefined)
      
      inline def setSamplingTargetDocumentsVarargs(value: UnmarshalledSamplingTargetDocument*): Self = StObject.set(x, "SamplingTargetDocuments", js.Array(value*))
      
      inline def setUnprocessedStatistics(value: js.Array[UnmarshalledUnprocessedStatistics]): Self = StObject.set(x, "UnprocessedStatistics", value.asInstanceOf[js.Any])
      
      inline def setUnprocessedStatisticsUndefined: Self = StObject.set(x, "UnprocessedStatistics", js.undefined)
      
      inline def setUnprocessedStatisticsVarargs(value: UnmarshalledUnprocessedStatistics*): Self = StObject.set(x, "UnprocessedStatistics", js.Array(value*))
    }
  }
}
