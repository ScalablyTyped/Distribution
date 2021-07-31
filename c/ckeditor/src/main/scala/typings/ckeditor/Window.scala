package typings.ckeditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var CKEDITOR_BASEPATH: js.UndefOr[String] = js.undefined
}
object Window {
  
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCKEDITOR_BASEPATH(value: String): Self = StObject.set(x, "CKEDITOR_BASEPATH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCKEDITOR_BASEPATHUndefined: Self = StObject.set(x, "CKEDITOR_BASEPATH", js.undefined)
  }
}
