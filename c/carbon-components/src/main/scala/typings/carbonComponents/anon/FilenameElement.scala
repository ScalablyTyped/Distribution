package typings.carbonComponents.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilenameElement extends StObject {
  
  var filenameElement: js.UndefOr[HTMLElement] = js.undefined
}
object FilenameElement {
  
  inline def apply(): FilenameElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilenameElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilenameElement] (val x: Self) extends AnyVal {
    
    inline def setFilenameElement(value: HTMLElement): Self = StObject.set(x, "filenameElement", value.asInstanceOf[js.Any])
    
    inline def setFilenameElementUndefined: Self = StObject.set(x, "filenameElement", js.undefined)
  }
}
