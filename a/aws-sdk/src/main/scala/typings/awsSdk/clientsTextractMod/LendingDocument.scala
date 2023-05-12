package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LendingDocument extends StObject {
  
  /**
    * An array of LendingField objects.
    */
  var LendingFields: js.UndefOr[LendingFieldList] = js.undefined
  
  /**
    * A list of signatures detected in a lending document.
    */
  var SignatureDetections: js.UndefOr[SignatureDetectionList] = js.undefined
}
object LendingDocument {
  
  inline def apply(): LendingDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LendingDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LendingDocument] (val x: Self) extends AnyVal {
    
    inline def setLendingFields(value: LendingFieldList): Self = StObject.set(x, "LendingFields", value.asInstanceOf[js.Any])
    
    inline def setLendingFieldsUndefined: Self = StObject.set(x, "LendingFields", js.undefined)
    
    inline def setLendingFieldsVarargs(value: LendingField*): Self = StObject.set(x, "LendingFields", js.Array(value*))
    
    inline def setSignatureDetections(value: SignatureDetectionList): Self = StObject.set(x, "SignatureDetections", value.asInstanceOf[js.Any])
    
    inline def setSignatureDetectionsUndefined: Self = StObject.set(x, "SignatureDetections", js.undefined)
    
    inline def setSignatureDetectionsVarargs(value: SignatureDetection*): Self = StObject.set(x, "SignatureDetections", js.Array(value*))
  }
}
