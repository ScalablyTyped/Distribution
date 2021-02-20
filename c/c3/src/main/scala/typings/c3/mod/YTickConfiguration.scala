package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YTickConfiguration extends TickConfiguration {
  
  /**
    * A function to format y-axis tick values.
    */
  var format: js.UndefOr[js.Function1[/* x */ Double, String | Double]] = js.native
}
object YTickConfiguration {
  
  @scala.inline
  def apply(): YTickConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YTickConfiguration]
  }
  
  @scala.inline
  implicit class YTickConfigurationMutableBuilder[Self <: YTickConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: /* x */ Double => String | Double): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
