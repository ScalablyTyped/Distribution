package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait ClipboardItem extends StObject {
  
  def getType(`type`: java.lang.String): Promise[Blob]
  
  val types: ReadonlyArray[java.lang.String]
}
object ClipboardItem {
  
  inline def apply(getType: java.lang.String => Promise[Blob], types: ReadonlyArray[java.lang.String]): ClipboardItem = {
    val __obj = js.Dynamic.literal(getType = js.Any.fromFunction1(getType), types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardItem]
  }
  
  extension [Self <: ClipboardItem](x: Self) {
    
    inline def setGetType(value: java.lang.String => Promise[Blob]): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    
    inline def setTypes(value: ReadonlyArray[java.lang.String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
