package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsOfResourceOutput extends StObject {
  
  /**
    * <p>If this value is returned, there are additional results to be displayed. To retrieve
    *             them, call ListTagsOfResource again, with NextToken set to this value.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The tags currently associated with the Amazon DynamoDB resource.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object ListTagsOfResourceOutput {
  
  inline def apply(): ListTagsOfResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsOfResourceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsOfResourceOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
