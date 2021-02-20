package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceInput extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the identity pool that the tags are assigned
    *          to.</p>
    */
  var ResourceArn: js.UndefOr[String] = js.native
}
object ListTagsForResourceInput {
  
  @scala.inline
  def apply(): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ListTagsForResourceInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: ListTagsForResourceInput): js.Any = js.native
  
  @scala.inline
  implicit class ListTagsForResourceInputMutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
