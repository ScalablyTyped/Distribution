package typings.c3.mod

import typings.c3.anon.HeightNumber
import typings.c3.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubchartOptions extends StObject {
  
  var axis: js.UndefOr[`2`] = js.native
  
  /**
    * Set callback for brush event.
    * Specified function receives the current zoomed x domain.
    */
  var onbrush: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.native
  
  /**
    * Show sub chart on the bottom of the chart.
    * Defaults to `false`.
    */
  var show: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[HeightNumber] = js.native
}
object SubchartOptions {
  
  @scala.inline
  def apply(): SubchartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubchartOptions]
  }
  
  @scala.inline
  implicit class SubchartOptionsMutableBuilder[Self <: SubchartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: `2`): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setOnbrush(value: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]): Self = StObject.set(x, "onbrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnbrushUndefined: Self = StObject.set(x, "onbrush", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSize(value: HeightNumber): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
