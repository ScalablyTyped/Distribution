package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCommentResponse extends StObject {
  
  /**
    * The comment that has been created.
    */
  var Comment: js.UndefOr[typings.awsSdk.workdocsMod.Comment] = js.undefined
}
object CreateCommentResponse {
  
  inline def apply(): CreateCommentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCommentResponse]
  }
  
  extension [Self <: CreateCommentResponse](x: Self) {
    
    inline def setComment(value: Comment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
  }
}
