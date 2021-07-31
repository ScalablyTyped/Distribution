package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod.UnmarshalledAliasRoutingConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateAliasOutputMod {
  
  trait CreateAliasOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias called <code>BETA</code> that points to a helloworld function version, the ARN is <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.</p>
      */
    var AliasArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Alias description.</p>
      */
    var Description: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Function version to which the alias points.</p>
      */
    var FunctionVersion: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Alias name.</p>
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Represents the latest updated revision of the function or alias.</p>
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
      */
    var RoutingConfig: js.UndefOr[UnmarshalledAliasRoutingConfiguration] = js.undefined
  }
  object CreateAliasOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): CreateAliasOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAliasOutput]
    }
    
    @scala.inline
    implicit class CreateAliasOutputMutableBuilder[Self <: CreateAliasOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasArn(value: String): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      @scala.inline
      def setFunctionVersion(value: String): Self = StObject.set(x, "FunctionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionVersionUndefined: Self = StObject.set(x, "FunctionVersion", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
      
      @scala.inline
      def setRoutingConfig(value: UnmarshalledAliasRoutingConfiguration): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
    }
  }
}
