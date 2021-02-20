package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindByUrlNameTitle extends StObject {
  
  var title: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var windowName: js.UndefOr[String] = js.native
}
object FindByUrlNameTitle {
  
  @scala.inline
  def apply(): FindByUrlNameTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindByUrlNameTitle]
  }
  
  @scala.inline
  implicit class FindByUrlNameTitleMutableBuilder[Self <: FindByUrlNameTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowNameUndefined: Self = StObject.set(x, "windowName", js.undefined)
  }
}
