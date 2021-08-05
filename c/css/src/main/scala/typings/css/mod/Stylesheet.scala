package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stylesheet
  extends StObject
     with Node {
  
  var stylesheet: js.UndefOr[StyleRules] = js.undefined
}
object Stylesheet {
  
  inline def apply(): Stylesheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stylesheet]
  }
  
  extension [Self <: Stylesheet](x: Self) {
    
    inline def setStylesheet(value: StyleRules): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    inline def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
  }
}
