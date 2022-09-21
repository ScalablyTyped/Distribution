package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.days
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hours
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.minutes
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.months
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.quarters
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.weeks
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  /**
    * Specifies the maximum zoom level of tasks in the Gantt chart.
    */
  var max: js.UndefOr[minutes | hours | days | weeks | months | quarters | years] = js.undefined
  
  /**
    * Specifies the minimum zoom level of tasks in the Gantt chart.
    */
  var min: js.UndefOr[minutes | hours | days | weeks | months | quarters | years] = js.undefined
}
object Max {
  
  inline def apply(): Max = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Max]
  }
  
  extension [Self <: Max](x: Self) {
    
    inline def setMax(value: minutes | hours | days | weeks | months | quarters | years): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: minutes | hours | days | weeks | months | quarters | years): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
