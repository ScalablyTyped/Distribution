package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * swan节点布局相交状态
  */
trait CreateIntersectionObserverOption extends StObject {
  
  var initialRatio: js.UndefOr[Double] = js.undefined
  
  var selectAll: js.UndefOr[Boolean] = js.undefined
  
  var thresholds: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object CreateIntersectionObserverOption {
  
  @scala.inline
  def apply(): CreateIntersectionObserverOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntersectionObserverOption]
  }
  
  @scala.inline
  implicit class CreateIntersectionObserverOptionMutableBuilder[Self <: CreateIntersectionObserverOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialRatio(value: Double): Self = StObject.set(x, "initialRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRatioUndefined: Self = StObject.set(x, "initialRatio", js.undefined)
    
    @scala.inline
    def setSelectAll(value: Boolean): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    @scala.inline
    def setThresholds(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
  }
}
