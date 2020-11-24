package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentityPoolsInput extends js.Object {
  
  /**
    * <p>The maximum number of identities to return.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.native
  
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ListIdentityPoolsInput")
@js.native
object ListIdentityPoolsInput extends js.Object {
  
  def filterSensitiveLog(obj: ListIdentityPoolsInput): js.Any = js.native
}
