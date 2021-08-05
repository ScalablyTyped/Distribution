package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entry extends StObject {
  
  var entry: Author
}
object Entry {
  
  inline def apply(entry: Author): Entry = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  extension [Self <: Entry](x: Self) {
    
    inline def setEntry(value: Author): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
  }
}
