package typings.chrome.anon

import typings.chrome.chrome.pageCapture.SaveDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpageCapture extends StObject {
  
  def saveAsMHTML(details: SaveDetails, callback: js.Function1[/* mhtmlData */ js.Any, Unit]): Unit
}
object TypeofpageCapture {
  
  inline def apply(saveAsMHTML: (SaveDetails, js.Function1[/* mhtmlData */ js.Any, Unit]) => Unit): TypeofpageCapture = {
    val __obj = js.Dynamic.literal(saveAsMHTML = js.Any.fromFunction2(saveAsMHTML))
    __obj.asInstanceOf[TypeofpageCapture]
  }
  
  extension [Self <: TypeofpageCapture](x: Self) {
    
    inline def setSaveAsMHTML(value: (SaveDetails, js.Function1[/* mhtmlData */ js.Any, Unit]) => Unit): Self = StObject.set(x, "saveAsMHTML", js.Any.fromFunction2(value))
  }
}
