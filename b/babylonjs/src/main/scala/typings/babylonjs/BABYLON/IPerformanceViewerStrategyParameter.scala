package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback strategy and optional category for data collection
  */
trait IPerformanceViewerStrategyParameter extends StObject {
  
  /**
    * Category for displaying this strategy on the viewer. Can be undefined or an empty string, in which case the strategy will be displayed on top
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * Starts hidden
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The strategy for collecting data. Available strategies are located on the PerfCollectionStrategy class
    */
  def strategyCallback(scene: Scene): IPerfViewerCollectionStrategy
  /**
    * The strategy for collecting data. Available strategies are located on the PerfCollectionStrategy class
    */
  @JSName("strategyCallback")
  var strategyCallback_Original: PerfStrategyInitialization
}
object IPerformanceViewerStrategyParameter {
  
  inline def apply(strategyCallback: /* scene */ Scene => IPerfViewerCollectionStrategy): IPerformanceViewerStrategyParameter = {
    val __obj = js.Dynamic.literal(strategyCallback = js.Any.fromFunction1(strategyCallback))
    __obj.asInstanceOf[IPerformanceViewerStrategyParameter]
  }
  
  extension [Self <: IPerformanceViewerStrategyParameter](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setStrategyCallback(value: /* scene */ Scene => IPerfViewerCollectionStrategy): Self = StObject.set(x, "strategyCallback", js.Any.fromFunction1(value))
  }
}
