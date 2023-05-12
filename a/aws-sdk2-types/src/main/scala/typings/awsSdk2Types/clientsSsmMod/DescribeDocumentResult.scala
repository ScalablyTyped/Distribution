package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentResult extends StObject {
  
  /**
    * Information about the SSM document.
    */
  var Document: js.UndefOr[DocumentDescription] = js.undefined
}
object DescribeDocumentResult {
  
  inline def apply(): DescribeDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDocumentResult] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: DocumentDescription): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
  }
}
