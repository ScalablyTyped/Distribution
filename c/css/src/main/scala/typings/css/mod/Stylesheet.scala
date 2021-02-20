package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stylesheet extends Node {
  
  var stylesheet: js.UndefOr[StyleRules] = js.native
}
object Stylesheet {
  
  @scala.inline
  def apply(): Stylesheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stylesheet]
  }
  
  @scala.inline
  implicit class StylesheetMutableBuilder[Self <: Stylesheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStylesheet(value: StyleRules): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
  }
}
