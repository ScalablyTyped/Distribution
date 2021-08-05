package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the identity pool that the tags are assigned
    *          to.</p>
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
}
object ListTagsForResourceInput {
  
  inline def apply(): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ListTagsForResourceInput")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: ListTagsForResourceInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: ListTagsForResourceInput](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
