package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBar extends StObject {
  
  var progressBar: js.UndefOr[js.Object] = js.native
}
object ProgressBar {
  
  @scala.inline
  def apply(): ProgressBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBar]
  }
  
  @scala.inline
  implicit class ProgressBarMutableBuilder[Self <: ProgressBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgressBar(value: js.Object): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
  }
}
