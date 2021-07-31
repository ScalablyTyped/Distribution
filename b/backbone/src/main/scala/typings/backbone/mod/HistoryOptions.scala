package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryOptions
  extends StObject
     with Silenceable {
  
  var pushState: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object HistoryOptions {
  
  @scala.inline
  def apply(): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryOptions]
  }
  
  @scala.inline
  implicit class HistoryOptionsMutableBuilder[Self <: HistoryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPushState(value: Boolean): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
