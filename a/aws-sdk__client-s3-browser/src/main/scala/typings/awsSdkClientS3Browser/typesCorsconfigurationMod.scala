package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesCorsruleMod.CORSRule
import typings.awsSdkClientS3Browser.typesCorsruleMod.UnmarshalledCORSRule
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCorsconfigurationMod {
  
  @js.native
  trait CORSConfiguration extends StObject {
    
    /**
      * _CORSRules shape
      */
    var CORSRules: js.Array[CORSRule] | Iterable[CORSRule] = js.native
  }
  object CORSConfiguration {
    
    @scala.inline
    def apply(CORSRules: js.Array[CORSRule] | Iterable[CORSRule]): CORSConfiguration = {
      val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[CORSConfiguration]
    }
    
    @scala.inline
    implicit class CORSConfigurationMutableBuilder[Self <: CORSConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCORSRules(value: js.Array[CORSRule] | Iterable[CORSRule]): Self = StObject.set(x, "CORSRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCORSRulesVarargs(value: CORSRule*): Self = StObject.set(x, "CORSRules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledCORSConfiguration extends CORSConfiguration {
    
    /**
      * _CORSRules shape
      */
    @JSName("CORSRules")
    var CORSRules_UnmarshalledCORSConfiguration: js.Array[UnmarshalledCORSRule] = js.native
  }
  object UnmarshalledCORSConfiguration {
    
    @scala.inline
    def apply(CORSRules: js.Array[UnmarshalledCORSRule]): UnmarshalledCORSConfiguration = {
      val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledCORSConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledCORSConfigurationMutableBuilder[Self <: UnmarshalledCORSConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCORSRules(value: js.Array[UnmarshalledCORSRule]): Self = StObject.set(x, "CORSRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCORSRulesVarargs(value: UnmarshalledCORSRule*): Self = StObject.set(x, "CORSRules", js.Array(value :_*))
    }
  }
}
