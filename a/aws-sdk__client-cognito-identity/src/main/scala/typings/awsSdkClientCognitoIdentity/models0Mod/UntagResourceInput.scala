package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the identity pool that the tags are assigned
    *          to.</p>
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The keys of the tags to remove from the user pool.</p>
    */
  var TagKeys: js.UndefOr[js.Array[String]] = js.undefined
}
object UntagResourceInput {
  
  inline def apply(): UntagResourceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "UntagResourceInput")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: UntagResourceInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: UntagResourceInput](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setTagKeys(value: js.Array[String]): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
