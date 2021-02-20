package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod.AliasRoutingConfiguration
import typings.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod.UnmarshalledAliasRoutingConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAliasConfigurationMod {
  
  @js.native
  trait AliasConfiguration extends StObject {
    
    /**
      * <p>Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias called <code>BETA</code> that points to a helloworld function version, the ARN is <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.</p>
      */
    var AliasArn: js.UndefOr[String] = js.native
    
    /**
      * <p>Alias description.</p>
      */
    var Description: js.UndefOr[String] = js.native
    
    /**
      * <p>Function version to which the alias points.</p>
      */
    var FunctionVersion: js.UndefOr[String] = js.native
    
    /**
      * <p>Alias name.</p>
      */
    var Name: js.UndefOr[String] = js.native
    
    /**
      * <p>Represents the latest updated revision of the function or alias.</p>
      */
    var RevisionId: js.UndefOr[String] = js.native
    
    /**
      * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
      */
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.native
  }
  object AliasConfiguration {
    
    @scala.inline
    def apply(): AliasConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AliasConfiguration]
    }
    
    @scala.inline
    implicit class AliasConfigurationMutableBuilder[Self <: AliasConfiguration] (val x: Self) extends AnyVal {
      
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
      def setRoutingConfig(value: AliasRoutingConfiguration): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledAliasConfiguration extends AliasConfiguration {
    
    /**
      * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
      */
    @JSName("RoutingConfig")
    var RoutingConfig_UnmarshalledAliasConfiguration: js.UndefOr[UnmarshalledAliasRoutingConfiguration] = js.native
  }
  object UnmarshalledAliasConfiguration {
    
    @scala.inline
    def apply(): UnmarshalledAliasConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAliasConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledAliasConfigurationMutableBuilder[Self <: UnmarshalledAliasConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoutingConfig(value: UnmarshalledAliasRoutingConfiguration): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
    }
  }
}
