package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AmbiguousRoleResolutionType extends StObject
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "AmbiguousRoleResolutionType")
@js.native
object AmbiguousRoleResolutionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AmbiguousRoleResolutionType with String] = js.native
  
  @js.native
  sealed trait AUTHENTICATED_ROLE extends AmbiguousRoleResolutionType
  /* "AuthenticatedRole" */ val AUTHENTICATED_ROLE: typings.awsSdkClientCognitoIdentity.models0Mod.AmbiguousRoleResolutionType.AUTHENTICATED_ROLE with String = js.native
  
  @js.native
  sealed trait DENY extends AmbiguousRoleResolutionType
  /* "Deny" */ val DENY: typings.awsSdkClientCognitoIdentity.models0Mod.AmbiguousRoleResolutionType.DENY with String = js.native
}
