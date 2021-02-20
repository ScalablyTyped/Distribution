package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  var context: js.UndefOr[String] = js.native
  
  var enterMode: js.UndefOr[Double] = js.native
  
  var filter: js.UndefOr[typings.ckeditor.CKEDITOR.filter] = js.native
}
object Context {
  
  @scala.inline
  def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setEnterMode(value: Double): Self = StObject.set(x, "enterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterModeUndefined: Self = StObject.set(x, "enterMode", js.undefined)
    
    @scala.inline
    def setFilter(value: filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
