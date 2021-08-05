package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesServerSideEncryptionRuleMod.ServerSideEncryptionRule
import typings.awsSdkClientS3Browser.typesServerSideEncryptionRuleMod.UnmarshalledServerSideEncryptionRule
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
    
    inline def apply(Rules: js.Array[ServerSideEncryptionRule] | Iterable[ServerSideEncryptionRule]): ServerSideEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerSideEncryptionConfiguration]
    }
    
    extension [Self <: ServerSideEncryptionConfiguration](x: Self) {
      
      inline def setRules(value: js.Array[ServerSideEncryptionRule] | Iterable[ServerSideEncryptionRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: ServerSideEncryptionRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
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
    
    inline def apply(Rules: js.Array[UnmarshalledServerSideEncryptionRule]): UnmarshalledServerSideEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledServerSideEncryptionConfiguration]
    }
    
    extension [Self <: UnmarshalledServerSideEncryptionConfiguration](x: Self) {
      
      inline def setRules(value: js.Array[UnmarshalledServerSideEncryptionRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: UnmarshalledServerSideEncryptionRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
}
