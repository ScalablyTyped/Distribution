package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowHideOptions extends StObject {
  
  /** Controls whether the legend will be shown or hidden along with the data. */
  var withLegend: js.UndefOr[Boolean] = js.native
}
object ShowHideOptions {
  
  @scala.inline
  def apply(): ShowHideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowHideOptions]
  }
  
  @scala.inline
  implicit class ShowHideOptionsMutableBuilder[Self <: ShowHideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithLegend(value: Boolean): Self = StObject.set(x, "withLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithLegendUndefined: Self = StObject.set(x, "withLegend", js.undefined)
  }
}
