package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Correction extends StObject {
  
  /**
    * The zero-based location in the response string or text where the corrected word starts.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The string or text of a corrected misspelled word in a query.
    */
  var CorrectedTerm: js.UndefOr[String] = js.undefined
  
  /**
    * The zero-based location in the response string or text where the corrected word ends.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The string or text of a misspelled word in a query.
    */
  var Term: js.UndefOr[String] = js.undefined
}
object Correction {
  
  inline def apply(): Correction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Correction]
  }
  
  extension [Self <: Correction](x: Self) {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setCorrectedTerm(value: String): Self = StObject.set(x, "CorrectedTerm", value.asInstanceOf[js.Any])
    
    inline def setCorrectedTermUndefined: Self = StObject.set(x, "CorrectedTerm", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    inline def setTerm(value: String): Self = StObject.set(x, "Term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "Term", js.undefined)
  }
}
