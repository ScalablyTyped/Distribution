package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PercentPair extends StObject {
  
  /**
    * The percentile.
    */
  var percent: js.UndefOr[Percent] = js.native
  
  /**
    * The value of the percentile.
    */
  var value: js.UndefOr[PercentValue] = js.native
}
object PercentPair {
  
  @scala.inline
  def apply(): PercentPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PercentPair]
  }
  
  @scala.inline
  implicit class PercentPairMutableBuilder[Self <: PercentPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercent(value: Percent): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setValue(value: PercentValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
