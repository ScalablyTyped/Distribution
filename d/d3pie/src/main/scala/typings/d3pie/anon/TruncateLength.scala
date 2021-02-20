package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TruncateLength extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var truncateLength: js.UndefOr[Double] = js.native
}
object TruncateLength {
  
  @scala.inline
  def apply(): TruncateLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateLength]
  }
  
  @scala.inline
  implicit class TruncateLengthMutableBuilder[Self <: TruncateLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setTruncateLength(value: Double): Self = StObject.set(x, "truncateLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncateLengthUndefined: Self = StObject.set(x, "truncateLength", js.undefined)
  }
}
