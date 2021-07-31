package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Contains
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Equals
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.NotEqual
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.StartsWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMappingRuleMod {
  
  trait MappingRule extends StObject {
    
    /**
      * <p>The claim name that must be present in the token, for example, "isAdmin" or "paid".</p>
      */
    var Claim: String
    
    /**
      * <p>The match condition that specifies how closely the claim value in the IdP token must match <code>Value</code>.</p>
      */
    var MatchType: Equals | Contains | StartsWith | NotEqual | String
    
    /**
      * <p>The role ARN.</p>
      */
    var RoleARN: String
    
    /**
      * <p>A brief string that the claim must match, for example, "paid" or "yes".</p>
      */
    var Value: String
  }
  object MappingRule {
    
    @scala.inline
    def apply(
      Claim: String,
      MatchType: Equals | Contains | StartsWith | NotEqual | String,
      RoleARN: String,
      Value: String
    ): MappingRule = {
      val __obj = js.Dynamic.literal(Claim = Claim.asInstanceOf[js.Any], MatchType = MatchType.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappingRule]
    }
    
    @scala.inline
    implicit class MappingRuleMutableBuilder[Self <: MappingRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClaim(value: String): Self = StObject.set(x, "Claim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchType(value: Equals | Contains | StartsWith | NotEqual | String): Self = StObject.set(x, "MatchType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleARN(value: String): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledMappingRule = MappingRule
}
