package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoleMappingType extends StObject
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "RoleMappingType")
@js.native
object RoleMappingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoleMappingType & String] = js.native
  
  @js.native
  sealed trait RULES
    extends StObject
       with RoleMappingType
  /* "Rules" */ val RULES: typings.awsSdkClientCognitoIdentity.models0Mod.RoleMappingType.RULES & String = js.native
  
  @js.native
  sealed trait TOKEN
    extends StObject
       with RoleMappingType
  /* "Token" */ val TOKEN: typings.awsSdkClientCognitoIdentity.models0Mod.RoleMappingType.TOKEN & String = js.native
}
