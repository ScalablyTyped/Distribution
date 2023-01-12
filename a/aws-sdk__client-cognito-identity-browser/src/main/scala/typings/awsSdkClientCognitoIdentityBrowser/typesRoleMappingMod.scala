package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.AuthenticatedRole
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Deny
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Rules
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Token
import typings.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod.RulesConfigurationType
import typings.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod.UnmarshalledRulesConfigurationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRoleMappingMod {
  
  trait RoleMapping extends StObject {
    
    /**
      * <p>If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is required.</p> <p>Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type, or there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code> matches for the <code>Token</code> type.</p>
      */
    var AmbiguousRoleResolution: js.UndefOr[AuthenticatedRole | Deny | String] = js.undefined
    
    /**
      * <p>The rules to be used for mapping users to roles.</p> <p>If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.</p>
      */
    var RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.undefined
    
    /**
      * <p>The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the token to map to a role.</p>
      */
    var Type: Token | Rules | String
  }
  object RoleMapping {
    
    inline def apply(Type: Token | Rules | String): RoleMapping = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoleMapping] (val x: Self) extends AnyVal {
      
      inline def setAmbiguousRoleResolution(value: AuthenticatedRole | Deny | String): Self = StObject.set(x, "AmbiguousRoleResolution", value.asInstanceOf[js.Any])
      
      inline def setAmbiguousRoleResolutionUndefined: Self = StObject.set(x, "AmbiguousRoleResolution", js.undefined)
      
      inline def setRulesConfiguration(value: RulesConfigurationType): Self = StObject.set(x, "RulesConfiguration", value.asInstanceOf[js.Any])
      
      inline def setRulesConfigurationUndefined: Self = StObject.set(x, "RulesConfiguration", js.undefined)
      
      inline def setType(value: Token | Rules | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledRoleMapping
    extends StObject
       with RoleMapping {
    
    /**
      * <p>The rules to be used for mapping users to roles.</p> <p>If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.</p>
      */
    @JSName("RulesConfiguration")
    var RulesConfiguration_UnmarshalledRoleMapping: js.UndefOr[UnmarshalledRulesConfigurationType] = js.undefined
  }
  object UnmarshalledRoleMapping {
    
    inline def apply(Type: Token | Rules | String): UnmarshalledRoleMapping = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledRoleMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledRoleMapping] (val x: Self) extends AnyVal {
      
      inline def setRulesConfiguration(value: UnmarshalledRulesConfigurationType): Self = StObject.set(x, "RulesConfiguration", value.asInstanceOf[js.Any])
      
      inline def setRulesConfigurationUndefined: Self = StObject.set(x, "RulesConfiguration", js.undefined)
    }
  }
}
