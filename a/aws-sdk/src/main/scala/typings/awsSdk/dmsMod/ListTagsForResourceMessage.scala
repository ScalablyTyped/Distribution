package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the AWS DMS resource.
    */
  var ResourceArn: String
}
object ListTagsForResourceMessage {
  
  inline def apply(ResourceArn: String): ListTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceMessage]
  }
  
  extension [Self <: ListTagsForResourceMessage](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
