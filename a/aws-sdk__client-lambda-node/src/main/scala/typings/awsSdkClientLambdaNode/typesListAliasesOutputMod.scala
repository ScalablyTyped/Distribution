package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesAliasConfigurationMod.UnmarshalledAliasConfiguration
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListAliasesOutputMod {
  
  trait ListAliasesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A list of aliases.</p>
      */
    var Aliases: js.UndefOr[js.Array[UnmarshalledAliasConfiguration]] = js.undefined
    
    /**
      * <p>A string, present if there are more aliases.</p>
      */
    var NextMarker: js.UndefOr[String] = js.undefined
  }
  object ListAliasesOutput {
    
    inline def apply($metadata: ResponseMetadata): ListAliasesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAliasesOutput]
    }
    
    extension [Self <: ListAliasesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setAliases(value: js.Array[UnmarshalledAliasConfiguration]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
      
      inline def setAliasesVarargs(value: UnmarshalledAliasConfiguration*): Self = StObject.set(x, "Aliases", js.Array(value*))
      
      inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    }
  }
}
