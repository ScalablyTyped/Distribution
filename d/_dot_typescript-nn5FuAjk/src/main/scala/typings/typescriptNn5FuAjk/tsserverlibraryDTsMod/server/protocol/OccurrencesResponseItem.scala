package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated */
trait OccurrencesResponseItem
  extends StObject
     with FileSpanWithContext {
  
  /**
    * True if the occurrence is in a string, undefined otherwise;
    */
  var isInString: js.UndefOr[`true`] = js.undefined
  
  /**
    * True if the occurrence is a write location, false otherwise.
    */
  var isWriteAccess: Boolean
}
object OccurrencesResponseItem {
  
  inline def apply(end: Location, file: String, isWriteAccess: Boolean, start: Location): OccurrencesResponseItem = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[OccurrencesResponseItem]
  }
  
  extension [Self <: OccurrencesResponseItem](x: Self) {
    
    inline def setIsInString(value: `true`): Self = StObject.set(x, "isInString", value.asInstanceOf[js.Any])
    
    inline def setIsInStringUndefined: Self = StObject.set(x, "isInString", js.undefined)
    
    inline def setIsWriteAccess(value: Boolean): Self = StObject.set(x, "isWriteAccess", value.asInstanceOf[js.Any])
  }
}
