package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MappingRuleMatchType extends js.Object
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "MappingRuleMatchType")
@js.native
object MappingRuleMatchType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MappingRuleMatchType with String] = js.native
  
  @js.native
  sealed trait CONTAINS extends MappingRuleMatchType
  /* "Contains" */ @js.native
  object CONTAINS extends TopLevel[CONTAINS with String]
  
  @js.native
  sealed trait EQUALS extends MappingRuleMatchType
  /* "Equals" */ @js.native
  object EQUALS extends TopLevel[EQUALS with String]
  
  @js.native
  sealed trait NOT_EQUAL extends MappingRuleMatchType
  /* "NotEqual" */ @js.native
  object NOT_EQUAL extends TopLevel[NOT_EQUAL with String]
  
  @js.native
  sealed trait STARTS_WITH extends MappingRuleMatchType
  /* "StartsWith" */ @js.native
  object STARTS_WITH extends TopLevel[STARTS_WITH with String]
}
