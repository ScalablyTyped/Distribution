package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AmbiguousRoleResolutionType extends js.Object
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "AmbiguousRoleResolutionType")
@js.native
object AmbiguousRoleResolutionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AmbiguousRoleResolutionType with String] = js.native
  
  @js.native
  sealed trait AUTHENTICATED_ROLE extends AmbiguousRoleResolutionType
  /* "AuthenticatedRole" */ @js.native
  object AUTHENTICATED_ROLE extends TopLevel[AUTHENTICATED_ROLE with String]
  
  @js.native
  sealed trait DENY extends AmbiguousRoleResolutionType
  /* "Deny" */ @js.native
  object DENY extends TopLevel[DENY with String]
}
