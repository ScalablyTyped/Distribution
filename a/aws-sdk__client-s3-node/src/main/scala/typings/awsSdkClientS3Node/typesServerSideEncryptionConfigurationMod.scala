package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesServerSideEncryptionRuleMod.ServerSideEncryptionRule
import typings.awsSdkClientS3Node.typesServerSideEncryptionRuleMod.UnmarshalledServerSideEncryptionRule
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServerSideEncryptionConfigurationMod {
  
  trait ServerSideEncryptionConfiguration extends StObject {
    
    /**
      * <p>Container for information about a particular server-side encryption configuration rule.</p>
      */
    var Rules: js.Array[ServerSideEncryptionRule] | Iterable[ServerSideEncryptionRule]
  }
  object ServerSideEncryptionConfiguration {
    
    @scala.inline
    def apply(Rules: js.Array[ServerSideEncryptionRule] | Iterable[ServerSideEncryptionRule]): ServerSideEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerSideEncryptionConfiguration]
    }
    
    @scala.inline
    implicit class ServerSideEncryptionConfigurationMutableBuilder[Self <: ServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[ServerSideEncryptionRule] | Iterable[ServerSideEncryptionRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: ServerSideEncryptionRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
  
  trait UnmarshalledServerSideEncryptionConfiguration
    extends StObject
       with ServerSideEncryptionConfiguration {
    
    /**
      * <p>Container for information about a particular server-side encryption configuration rule.</p>
      */
    @JSName("Rules")
    var Rules_UnmarshalledServerSideEncryptionConfiguration: js.Array[UnmarshalledServerSideEncryptionRule]
  }
  object UnmarshalledServerSideEncryptionConfiguration {
    
    @scala.inline
    def apply(Rules: js.Array[UnmarshalledServerSideEncryptionRule]): UnmarshalledServerSideEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledServerSideEncryptionConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledServerSideEncryptionConfigurationMutableBuilder[Self <: UnmarshalledServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[UnmarshalledServerSideEncryptionRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: UnmarshalledServerSideEncryptionRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
}
