package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferencesResponseItem
  extends StObject
     with FileSpanWithContext {
  
  /**
    * Present only if the search was triggered from a declaration.
    * True indicates that the references refers to the same symbol
    * (i.e. has the same meaning) as the declaration that began the
    * search.
    */
  var isDefinition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if reference is a write location, false otherwise.
    */
  var isWriteAccess: Boolean
  
  /** Text of line containing the reference.  Including this
    *  with the response avoids latency of editor loading files
    * to show text of reference line (the server already has
    * loaded the referencing files).
    */
  var lineText: String
}
object ReferencesResponseItem {
  
  inline def apply(end: Location, file: String, isWriteAccess: Boolean, lineText: String, start: Location): ReferencesResponseItem = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencesResponseItem]
  }
  
  extension [Self <: ReferencesResponseItem](x: Self) {
    
    inline def setIsDefinition(value: Boolean): Self = StObject.set(x, "isDefinition", value.asInstanceOf[js.Any])
    
    inline def setIsDefinitionUndefined: Self = StObject.set(x, "isDefinition", js.undefined)
    
    inline def setIsWriteAccess(value: Boolean): Self = StObject.set(x, "isWriteAccess", value.asInstanceOf[js.Any])
    
    inline def setLineText(value: String): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
  }
}
