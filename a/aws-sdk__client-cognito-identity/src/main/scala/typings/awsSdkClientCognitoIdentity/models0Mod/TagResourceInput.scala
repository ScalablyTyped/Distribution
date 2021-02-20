package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourceInput extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the identity pool to assign the tags to.</p>
    */
  var ResourceArn: js.UndefOr[String] = js.native
  
  /**
    * <p>The tags to assign to the identity pool.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String]] = js.native
}
object TagResourceInput {
  
  @scala.inline
  def apply(): TagResourceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourceInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "TagResourceInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: TagResourceInput): js.Any = js.native
  
  @scala.inline
  implicit class TagResourceInputMutableBuilder[Self <: TagResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
