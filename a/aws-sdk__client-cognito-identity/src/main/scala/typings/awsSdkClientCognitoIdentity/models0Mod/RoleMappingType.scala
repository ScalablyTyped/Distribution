package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoleMappingType extends js.Object
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "RoleMappingType")
@js.native
object RoleMappingType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoleMappingType with String] = js.native
  
  @js.native
  sealed trait RULES extends RoleMappingType
  /* "Rules" */ @js.native
  object RULES extends TopLevel[RULES with String]
  
  @js.native
  sealed trait TOKEN extends RoleMappingType
  /* "Token" */ @js.native
  object TOKEN extends TopLevel[TOKEN with String]
}
