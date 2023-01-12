package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCommentResponse extends StObject {
  
  /**
    * The comment that has been created.
    */
  var Comment: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.Comment] = js.undefined
}
object CreateCommentResponse {
  
  inline def apply(): CreateCommentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCommentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCommentResponse] (val x: Self) extends AnyVal {
    
    inline def setComment(value: Comment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
  }
}
