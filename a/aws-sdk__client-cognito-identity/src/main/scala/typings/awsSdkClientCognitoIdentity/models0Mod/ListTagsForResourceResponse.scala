package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceResponse extends js.Object {
  
  /**
    * <p>The tags that are assigned to the identity pool.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ListTagsForResourceResponse")
@js.native
object ListTagsForResourceResponse extends js.Object {
  
  def filterSensitiveLog(obj: ListTagsForResourceResponse): js.Any = js.native
}
