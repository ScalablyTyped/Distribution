package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityDocument extends StObject {
  
  /**
    * Individual word recognition, as returned by document detection.
    */
  var Blocks: js.UndefOr[BlockList] = js.undefined
  
  /**
    * Denotes the placement of a document in the IdentityDocument list. The first document is marked 1, the second 2 and so on.
    */
  var DocumentIndex: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The structure used to record information extracted from identity documents. Contains both normalized field and value of the extracted text.
    */
  var IdentityDocumentFields: js.UndefOr[IdentityDocumentFieldList] = js.undefined
}
object IdentityDocument {
  
  inline def apply(): IdentityDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityDocument]
  }
  
  extension [Self <: IdentityDocument](x: Self) {
    
    inline def setBlocks(value: BlockList): Self = StObject.set(x, "Blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksUndefined: Self = StObject.set(x, "Blocks", js.undefined)
    
    inline def setBlocksVarargs(value: Block*): Self = StObject.set(x, "Blocks", js.Array(value*))
    
    inline def setDocumentIndex(value: UInteger): Self = StObject.set(x, "DocumentIndex", value.asInstanceOf[js.Any])
    
    inline def setDocumentIndexUndefined: Self = StObject.set(x, "DocumentIndex", js.undefined)
    
    inline def setIdentityDocumentFields(value: IdentityDocumentFieldList): Self = StObject.set(x, "IdentityDocumentFields", value.asInstanceOf[js.Any])
    
    inline def setIdentityDocumentFieldsUndefined: Self = StObject.set(x, "IdentityDocumentFields", js.undefined)
    
    inline def setIdentityDocumentFieldsVarargs(value: IdentityDocumentField*): Self = StObject.set(x, "IdentityDocumentFields", js.Array(value*))
  }
}
