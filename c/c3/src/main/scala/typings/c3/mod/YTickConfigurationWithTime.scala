package typings.c3.mod

import typings.c3.anon.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YTickConfigurationWithTime extends YTickConfiguration {
  
  var time: js.UndefOr[Interval] = js.native
}
object YTickConfigurationWithTime {
  
  @scala.inline
  def apply(): YTickConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YTickConfigurationWithTime]
  }
  
  @scala.inline
  implicit class YTickConfigurationWithTimeMutableBuilder[Self <: YTickConfigurationWithTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTime(value: Interval): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
