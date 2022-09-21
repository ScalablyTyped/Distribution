package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object found in response messages defining an editing
  * instruction for a span of text in source code.  The effect of
  * this instruction is to replace the text starting at start and
  * ending one character before end with newText. For an insertion,
  * the text span is empty.  For a deletion, newText is empty.
  */
trait CodeEdit extends StObject {
  
  /**
    * One character past last character of the text span to edit.
    */
  var end: Location
  
  /**
    * Replace the span defined above with this string (may be
    * the empty string).
    */
  var newText: String
  
  /**
    * First character of the text span to edit.
    */
  var start: Location
}
object CodeEdit {
  
  inline def apply(end: Location, newText: String, start: Location): CodeEdit = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeEdit]
  }
  
  extension [Self <: CodeEdit](x: Self) {
    
    inline def setEnd(value: Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
