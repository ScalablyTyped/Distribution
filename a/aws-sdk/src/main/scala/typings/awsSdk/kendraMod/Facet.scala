package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Facet extends StObject {
  
  /**
    * The unique key for the document attribute.
    */
  var DocumentAttributeKey: js.UndefOr[typings.awsSdk.kendraMod.DocumentAttributeKey] = js.undefined
}
object Facet {
  
  inline def apply(): Facet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facet]
  }
  
  extension [Self <: Facet](x: Self) {
    
    inline def setDocumentAttributeKey(value: DocumentAttributeKey): Self = StObject.set(x, "DocumentAttributeKey", value.asInstanceOf[js.Any])
    
    inline def setDocumentAttributeKeyUndefined: Self = StObject.set(x, "DocumentAttributeKey", js.undefined)
  }
}
