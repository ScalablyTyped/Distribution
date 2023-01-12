package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBar extends StObject {
  
  var progressBar: js.UndefOr[js.Object] = js.undefined
}
object ProgressBar {
  
  inline def apply(): ProgressBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressBar] (val x: Self) extends AnyVal {
    
    inline def setProgressBar(value: js.Object): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
    
    inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
  }
}
