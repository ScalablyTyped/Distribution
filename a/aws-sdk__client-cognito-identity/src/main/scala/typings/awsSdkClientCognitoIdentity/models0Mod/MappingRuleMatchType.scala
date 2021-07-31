package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MappingRuleMatchType extends StObject
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "MappingRuleMatchType")
@js.native
object MappingRuleMatchType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MappingRuleMatchType & String] = js.native
  
  @js.native
  sealed trait CONTAINS
    extends StObject
       with MappingRuleMatchType
  /* "Contains" */ val CONTAINS: typings.awsSdkClientCognitoIdentity.models0Mod.MappingRuleMatchType.CONTAINS & String = js.native
  
  @js.native
  sealed trait EQUALS
    extends StObject
       with MappingRuleMatchType
  /* "Equals" */ val EQUALS: typings.awsSdkClientCognitoIdentity.models0Mod.MappingRuleMatchType.EQUALS & String = js.native
  
  @js.native
  sealed trait NOT_EQUAL
    extends StObject
       with MappingRuleMatchType
  /* "NotEqual" */ val NOT_EQUAL: typings.awsSdkClientCognitoIdentity.models0Mod.MappingRuleMatchType.NOT_EQUAL & String = js.native
  
  @js.native
  sealed trait STARTS_WITH
    extends StObject
       with MappingRuleMatchType
  /* "StartsWith" */ val STARTS_WITH: typings.awsSdkClientCognitoIdentity.models0Mod.MappingRuleMatchType.STARTS_WITH & String = js.native
}
