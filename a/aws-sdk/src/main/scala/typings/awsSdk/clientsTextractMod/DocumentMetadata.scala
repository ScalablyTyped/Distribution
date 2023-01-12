package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentMetadata extends StObject {
  
  /**
    * The number of pages that are detected in the document.
    */
  var Pages: js.UndefOr[UInteger] = js.undefined
}
object DocumentMetadata {
  
  inline def apply(): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentMetadata] (val x: Self) extends AnyVal {
    
    inline def setPages(value: UInteger): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "Pages", js.undefined)
  }
}
