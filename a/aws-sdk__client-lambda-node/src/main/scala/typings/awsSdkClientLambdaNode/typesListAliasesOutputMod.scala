package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesAliasConfigurationMod.UnmarshalledAliasConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListAliasesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAliasesOutput]
    }
    
    @scala.inline
    implicit class ListAliasesOutputMutableBuilder[Self <: ListAliasesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliases(value: js.Array[UnmarshalledAliasConfiguration]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: UnmarshalledAliasConfiguration*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
      
      @scala.inline
      def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    }
  }
}
