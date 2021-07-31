package typings.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource for which you want to get information about tags, if any.
    */
  var ResourceArn: AmazonResourceName
}
object ListTagsForResourceInput {
  
  @scala.inline
  def apply(ResourceArn: AmazonResourceName): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit class ListTagsForResourceInputMutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
