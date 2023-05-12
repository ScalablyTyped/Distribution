package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * <p>The DynamoDB resource that the tags will be removed from. This value is an Amazon
    *             Resource Name (ARN).</p>
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A list of tag keys. Existing tags of the resource whose keys are members of this list
    *             will be removed from the DynamoDB resource.</p>
    */
  var TagKeys: js.UndefOr[js.Array[String]] = js.undefined
}
object UntagResourceInput {
  
  inline def apply(): UntagResourceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setTagKeys(value: js.Array[String]): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
