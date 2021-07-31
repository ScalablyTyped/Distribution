package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the identity pool to assign the tags to.</p>
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The tags to assign to the identity pool.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String]] = js.undefined
}
object TagResourceInput {
  
  @scala.inline
  def apply(): TagResourceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourceInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "TagResourceInput")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: TagResourceInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
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
