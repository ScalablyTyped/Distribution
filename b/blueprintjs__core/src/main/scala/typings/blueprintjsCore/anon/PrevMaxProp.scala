package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrevMaxProp extends StObject {
  
  var prevMaxProp: js.UndefOr[Double] = js.native
  
  var prevMinProp: js.UndefOr[Double] = js.native
  
  var stepMaxPrecision: Double = js.native
  
  var value: String = js.native
}
object PrevMaxProp {
  
  @scala.inline
  def apply(stepMaxPrecision: Double, value: String): PrevMaxProp = {
    val __obj = js.Dynamic.literal(stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevMaxProp]
  }
  
  @scala.inline
  implicit class PrevMaxPropMutableBuilder[Self <: PrevMaxProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrevMaxProp(value: Double): Self = StObject.set(x, "prevMaxProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevMaxPropUndefined: Self = StObject.set(x, "prevMaxProp", js.undefined)
    
    @scala.inline
    def setPrevMinProp(value: Double): Self = StObject.set(x, "prevMinProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevMinPropUndefined: Self = StObject.set(x, "prevMinProp", js.undefined)
    
    @scala.inline
    def setStepMaxPrecision(value: Double): Self = StObject.set(x, "stepMaxPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
