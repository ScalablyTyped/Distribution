package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.avg
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.count
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.max
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.min
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummaryType extends StObject {
  
  var summaryType: js.UndefOr[sum | avg | min | max | count] = js.undefined
}
object SummaryType {
  
  inline def apply(): SummaryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryType]
  }
  
  extension [Self <: SummaryType](x: Self) {
    
    inline def setSummaryType(value: sum | avg | min | max | count): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
    
    inline def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
  }
}
