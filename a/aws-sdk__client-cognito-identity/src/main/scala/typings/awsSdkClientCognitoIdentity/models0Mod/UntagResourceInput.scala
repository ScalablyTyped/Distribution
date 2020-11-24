package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceInput extends js.Object {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the identity pool that the tags are assigned
    *          to.</p>
    */
  var ResourceArn: js.UndefOr[String] = js.native
  
  /**
    * <p>The keys of the tags to remove from the user pool.</p>
    */
  var TagKeys: js.UndefOr[js.Array[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "UntagResourceInput")
@js.native
object UntagResourceInput extends js.Object {
  
  def filterSensitiveLog(obj: UntagResourceInput): js.Any = js.native
}
