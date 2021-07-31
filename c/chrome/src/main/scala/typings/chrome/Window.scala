package typings.chrome

import typings.chrome.anon.Typeofchrome
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Global object
////////////////////
trait Window extends StObject {
  
  var chrome: Typeofchrome
}
object Window {
  
  @scala.inline
  def apply(chrome: Typeofchrome): Window = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChrome(value: Typeofchrome): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
  }
}
