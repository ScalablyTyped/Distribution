package typings.chartJs.mod

import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.series
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartXAxe extends CommonAxe {
  
  var distribution: js.UndefOr[linear | series] = js.native
}
object ChartXAxe {
  
  @scala.inline
  def apply(): ChartXAxe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartXAxe]
  }
  
  @scala.inline
  implicit class ChartXAxeMutableBuilder[Self <: ChartXAxe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistribution(value: linear | series): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
  }
}
