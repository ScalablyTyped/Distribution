package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesConcurrencyMod.UnmarshalledConcurrency
import typings.awsSdkClientLambdaNode.typesFunctionCodeLocationMod.UnmarshalledFunctionCodeLocation
import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetFunctionOutputMod {
  
  trait GetFunctionOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The function's code.</p>
      */
    var Code: js.UndefOr[UnmarshalledFunctionCodeLocation] = js.undefined
    
    /**
      * <p>The concurrent execution limit set for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
      */
    var Concurrency: js.UndefOr[UnmarshalledConcurrency] = js.undefined
    
    /**
      * <p>The function's configuration.</p>
      */
    var Configuration: js.UndefOr[UnmarshalledFunctionConfiguration] = js.undefined
    
    /**
      * <p>Returns the list of tags associated with the function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda Developer Guide</b>.</p>
      */
    var Tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetFunctionOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetFunctionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFunctionOutput]
    }
    
    @scala.inline
    implicit class GetFunctionOutputMutableBuilder[Self <: GetFunctionOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: UnmarshalledFunctionCodeLocation): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
      
      @scala.inline
      def setConcurrency(value: UnmarshalledConcurrency): Self = StObject.set(x, "Concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "Concurrency", js.undefined)
      
      @scala.inline
      def setConfiguration(value: UnmarshalledFunctionConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    }
  }
}
