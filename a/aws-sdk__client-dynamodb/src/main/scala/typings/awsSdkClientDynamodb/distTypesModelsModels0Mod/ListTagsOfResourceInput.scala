package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsOfResourceInput extends StObject {
  
  /**
    * <p>An optional string that, if supplied, must be copied from the output of a previous
    *             call to ListTagOfResource. When provided in this manner, this API fetches the next page
    *             of results.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource
    *             Name (ARN).</p>
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
}
object ListTagsOfResourceInput {
  
  inline def apply(): ListTagsOfResourceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsOfResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsOfResourceInput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
