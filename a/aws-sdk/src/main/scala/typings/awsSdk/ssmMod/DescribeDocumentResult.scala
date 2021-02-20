package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDocumentResult extends StObject {
  
  /**
    * Information about the Systems Manager document.
    */
  var Document: js.UndefOr[DocumentDescription] = js.native
}
object DescribeDocumentResult {
  
  @scala.inline
  def apply(): DescribeDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentResult]
  }
  
  @scala.inline
  implicit class DescribeDocumentResultMutableBuilder[Self <: DescribeDocumentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: DocumentDescription): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
  }
}
