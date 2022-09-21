package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait FileSystemHandle extends StObject {
  
  def isSameEntry(other: FileSystemHandle): Promise[scala.Boolean]
  
  val kind: FileSystemHandleKind
  
  val name: java.lang.String
}
object FileSystemHandle {
  
  inline def apply(
    isSameEntry: FileSystemHandle => Promise[scala.Boolean],
    kind: FileSystemHandleKind,
    name: java.lang.String
  ): FileSystemHandle = {
    val __obj = js.Dynamic.literal(isSameEntry = js.Any.fromFunction1(isSameEntry), kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemHandle]
  }
  
  extension [Self <: FileSystemHandle](x: Self) {
    
    inline def setIsSameEntry(value: FileSystemHandle => Promise[scala.Boolean]): Self = StObject.set(x, "isSameEntry", js.Any.fromFunction1(value))
    
    inline def setKind(value: FileSystemHandleKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
