package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryOptions
  extends StObject
     with Silenceable {
  
  var hashChange: js.UndefOr[Boolean] = js.undefined
  
  var pushState: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object HistoryOptions {
  
  inline def apply(): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryOptions]
  }
  
  extension [Self <: HistoryOptions](x: Self) {
    
    inline def setHashChange(value: Boolean): Self = StObject.set(x, "hashChange", value.asInstanceOf[js.Any])
    
    inline def setHashChangeUndefined: Self = StObject.set(x, "hashChange", js.undefined)
    
    inline def setPushState(value: Boolean): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
    
    inline def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
