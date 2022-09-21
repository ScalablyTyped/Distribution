package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signature help items found in the response of a signature help request.
  */
trait SignatureHelpItems extends StObject {
  
  /**
    * The span for which signature help should appear on a signature
    */
  var applicableSpan: TextSpan
  
  /**
    * The argument count
    */
  var argumentCount: Double
  
  /**
    * The argument selected in the set of parameters.
    */
  var argumentIndex: Double
  
  /**
    * The signature help items.
    */
  var items: Array[SignatureHelpItem]
  
  /**
    * The item selected in the set of available help items.
    */
  var selectedItemIndex: Double
}
object SignatureHelpItems {
  
  inline def apply(
    applicableSpan: TextSpan,
    argumentCount: Double,
    argumentIndex: Double,
    items: Array[SignatureHelpItem],
    selectedItemIndex: Double
  ): SignatureHelpItems = {
    val __obj = js.Dynamic.literal(applicableSpan = applicableSpan.asInstanceOf[js.Any], argumentCount = argumentCount.asInstanceOf[js.Any], argumentIndex = argumentIndex.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpItems]
  }
  
  extension [Self <: SignatureHelpItems](x: Self) {
    
    inline def setApplicableSpan(value: TextSpan): Self = StObject.set(x, "applicableSpan", value.asInstanceOf[js.Any])
    
    inline def setArgumentCount(value: Double): Self = StObject.set(x, "argumentCount", value.asInstanceOf[js.Any])
    
    inline def setArgumentIndex(value: Double): Self = StObject.set(x, "argumentIndex", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Array[SignatureHelpItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
  }
}
