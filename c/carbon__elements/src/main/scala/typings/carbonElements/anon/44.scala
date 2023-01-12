package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.07`
import typings.carbonElements.carbonElementsStrings.`-0Dot64px`
import typings.carbonElements.carbonElementsStrings.`7Dot625rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  var fontSize: `7Dot625rem`
  
  var letterSpacing: `-0Dot64px`
  
  var lineHeight: `1.07`
}
object `44` {
  
  inline def apply(): `44` = {
    val __obj = js.Dynamic.literal(fontSize = "7.625rem", letterSpacing = "-0.64px", lineHeight = 1.07d)
    __obj.asInstanceOf[`44`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `44`] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: `7Dot625rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `-0Dot64px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.07`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
