package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.horizontal
import typings.blessed.blessedStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple line which can be line or bg styled.
  */
trait LineOptions
  extends StObject
     with BoxOptions {
  
  /**
    * Can be vertical or horizontal.
    */
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  
  /**
    * Treated the same as a border object. (attributes can be contained in style).
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object LineOptions {
  
  inline def apply(): LineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOptions]
  }
  
  extension [Self <: LineOptions](x: Self) {
    
    inline def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
