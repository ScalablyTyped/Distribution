package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesAccountLimitMod.UnmarshalledAccountLimit
import typings.awsSdkClientLambdaNode.typesAccountUsageMod.UnmarshalledAccountUsage
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetAccountSettingsOutputMod {
  
  trait GetAccountSettingsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Limits related to concurrency and code storage.</p>
      */
    var AccountLimit: js.UndefOr[UnmarshalledAccountLimit] = js.undefined
    
    /**
      * <p>The number of functions and amount of storage in use.</p>
      */
    var AccountUsage: js.UndefOr[UnmarshalledAccountUsage] = js.undefined
  }
  object GetAccountSettingsOutput {
    
    inline def apply($metadata: ResponseMetadata): GetAccountSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccountSettingsOutput]
    }
    
    extension [Self <: GetAccountSettingsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setAccountLimit(value: UnmarshalledAccountLimit): Self = StObject.set(x, "AccountLimit", value.asInstanceOf[js.Any])
      
      inline def setAccountLimitUndefined: Self = StObject.set(x, "AccountLimit", js.undefined)
      
      inline def setAccountUsage(value: UnmarshalledAccountUsage): Self = StObject.set(x, "AccountUsage", value.asInstanceOf[js.Any])
      
      inline def setAccountUsageUndefined: Self = StObject.set(x, "AccountUsage", js.undefined)
    }
  }
}
