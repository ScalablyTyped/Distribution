package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityDescription extends js.Object {
  
  /**
    * <p>Date on which the identity was created.</p>
    */
  var CreationDate: js.UndefOr[Date] = js.native
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>Date on which the identity was last modified.</p>
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * <p>The provider names.</p>
    */
  var Logins: js.UndefOr[js.Array[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "IdentityDescription")
@js.native
object IdentityDescription extends js.Object {
  
  def filterSensitiveLog(obj: IdentityDescription): js.Any = js.native
}
