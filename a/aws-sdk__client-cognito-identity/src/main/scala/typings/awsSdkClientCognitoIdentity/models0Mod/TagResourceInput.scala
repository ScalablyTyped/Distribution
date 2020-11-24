package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourceInput extends js.Object {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the identity pool to assign the tags to.</p>
    */
  var ResourceArn: js.UndefOr[String] = js.native
  
  /**
    * <p>The tags to assign to the identity pool.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "TagResourceInput")
@js.native
object TagResourceInput extends js.Object {
  
  def filterSensitiveLog(obj: TagResourceInput): js.Any = js.native
}
