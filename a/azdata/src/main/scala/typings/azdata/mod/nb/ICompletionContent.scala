package typings.azdata.mod.nb

import typings.azdata.azdataStrings.error
import typings.azdata.azdataStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompletionContent extends StObject {
  
  var cursor_end: Double
  
  var cursor_start: Double
  
  var matches: js.Array[String]
  
  var metadata: js.Any
  
  var status: ok | error
}
object ICompletionContent {
  
  inline def apply(
    cursor_end: Double,
    cursor_start: Double,
    matches: js.Array[String],
    metadata: js.Any,
    status: ok | error
  ): ICompletionContent = {
    val __obj = js.Dynamic.literal(cursor_end = cursor_end.asInstanceOf[js.Any], cursor_start = cursor_start.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletionContent]
  }
  
  extension [Self <: ICompletionContent](x: Self) {
    
    inline def setCursor_end(value: Double): Self = StObject.set(x, "cursor_end", value.asInstanceOf[js.Any])
    
    inline def setCursor_start(value: Double): Self = StObject.set(x, "cursor_start", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ok | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
