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
  
  inline def apply(): TagResourceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourceInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "TagResourceInput")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: TagResourceInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: TagResourceInput](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
