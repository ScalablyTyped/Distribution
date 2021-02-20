package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentMetadata extends StObject {
  
  /**
    * The number of pages that are detected in the document.
    */
  var Pages: js.UndefOr[UInteger] = js.native
}
object DocumentMetadata {
  
  @scala.inline
  def apply(): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMetadata]
  }
  
  @scala.inline
  implicit class DocumentMetadataMutableBuilder[Self <: DocumentMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPages(value: UInteger): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "Pages", js.undefined)
  }
}
