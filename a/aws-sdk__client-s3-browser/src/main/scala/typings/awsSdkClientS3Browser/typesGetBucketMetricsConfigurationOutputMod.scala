package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesMetricsConfigurationMod.UnmarshalledMetricsConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketMetricsConfigurationOutputMod {
  
  trait GetBucketMetricsConfigurationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Specifies the metrics configuration.</p>
      */
    var MetricsConfiguration: js.UndefOr[UnmarshalledMetricsConfiguration] = js.undefined
  }
  object GetBucketMetricsConfigurationOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
    }
    
    extension [Self <: GetBucketMetricsConfigurationOutput](x: Self) {
      
      inline def setMetricsConfiguration(value: UnmarshalledMetricsConfiguration): Self = StObject.set(x, "MetricsConfiguration", value.asInstanceOf[js.Any])
      
      inline def setMetricsConfigurationUndefined: Self = StObject.set(x, "MetricsConfiguration", js.undefined)
    }
  }
}
