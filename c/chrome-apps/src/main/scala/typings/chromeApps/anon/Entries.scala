package typings.chromeApps.anon

import typings.filesystem.FileEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entries extends StObject {
  
  var entries: js.Array[FileEntry]
}
object Entries {
  
  inline def apply(entries: js.Array[FileEntry]): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
  
  extension [Self <: Entries](x: Self) {
    
    inline def setEntries(value: js.Array[FileEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: FileEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
