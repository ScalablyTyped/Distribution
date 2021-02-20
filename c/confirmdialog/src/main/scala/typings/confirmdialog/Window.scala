package typings.confirmdialog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var setContentAppend: js.Any = js.native
}
object Window {
  
  @scala.inline
  def apply(setContentAppend: js.Any): Window = {
    val __obj = js.Dynamic.literal(setContentAppend = setContentAppend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetContentAppend(value: js.Any): Self = StObject.set(x, "setContentAppend", value.asInstanceOf[js.Any])
  }
}
