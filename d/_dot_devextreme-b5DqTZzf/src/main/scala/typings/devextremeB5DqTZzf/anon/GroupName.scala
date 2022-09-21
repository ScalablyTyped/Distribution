package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.smallValueThreshold
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.topN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupName extends StObject {
  
  /**
    * Specifies the name of the grouped chart segment. This name represents the segment in the chart legend.
    */
  var groupName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the segment grouping mode.
    */
  var mode: js.UndefOr[none | smallValueThreshold | topN] = js.undefined
  
  /**
    * Specifies a threshold for segment values.
    */
  var threshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how many segments must not be grouped.
    */
  var topCount: js.UndefOr[Double] = js.undefined
}
object GroupName {
  
  inline def apply(): GroupName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupName]
  }
  
  extension [Self <: GroupName](x: Self) {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setMode(value: none | smallValueThreshold | topN): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setTopCount(value: Double): Self = StObject.set(x, "topCount", value.asInstanceOf[js.Any])
    
    inline def setTopCountUndefined: Self = StObject.set(x, "topCount", js.undefined)
  }
}
