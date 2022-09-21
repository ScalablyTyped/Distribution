package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the DMS resource to list tags for. This returns a list of keys (names of tags) created for the resource and their associated tag values.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * List of ARNs that identify multiple DMS resources that you want to list tags for. This returns a list of keys (tag names) and their associated tag values. It also returns each tag's associated ResourceArn value, which is the ARN of the resource for which each listed tag is created. 
    */
  var ResourceArnList: js.UndefOr[ArnList] = js.undefined
}
object ListTagsForResourceMessage {
  
  inline def apply(): ListTagsForResourceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceMessage]
  }
  
  extension [Self <: ListTagsForResourceMessage](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnList(value: ArnList): Self = StObject.set(x, "ResourceArnList", value.asInstanceOf[js.Any])
    
    inline def setResourceArnListUndefined: Self = StObject.set(x, "ResourceArnList", js.undefined)
    
    inline def setResourceArnListVarargs(value: String*): Self = StObject.set(x, "ResourceArnList", js.Array(value*))
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
