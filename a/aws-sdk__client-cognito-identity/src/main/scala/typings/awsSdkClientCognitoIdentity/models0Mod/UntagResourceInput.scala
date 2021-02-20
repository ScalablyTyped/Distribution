package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceInput extends StObject {
  
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
object UntagResourceInput {
  
  @scala.inline
  def apply(): UntagResourceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "UntagResourceInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: UntagResourceInput): js.Any = js.native
  
  @scala.inline
  implicit class UntagResourceInputMutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setTagKeys(value: js.Array[String]): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
