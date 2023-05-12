package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitDocument extends StObject {
  
  /**
    * The index for a given document in a DocumentGroup of a specific Type.
    */
  var Index: js.UndefOr[UInteger] = js.undefined
  
  /**
    * An array of page numbers for a for a given document, ordered by logical boundary.
    */
  var Pages: js.UndefOr[PageList] = js.undefined
}
object SplitDocument {
  
  inline def apply(): SplitDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitDocument] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: UInteger): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
    
    inline def setPages(value: PageList): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "Pages", js.undefined)
    
    inline def setPagesVarargs(value: UInteger*): Self = StObject.set(x, "Pages", js.Array(value*))
  }
}
