package typings.dashjs.anon

import typings.dashjs.dashjsStrings.abrBola
import typings.dashjs.dashjsStrings.abrDynamic
import typings.dashjs.dashjsStrings.abrL2A
import typings.dashjs.dashjsStrings.abrLoLP
import typings.dashjs.dashjsStrings.abrThroughput
import typings.dashjs.dashjsStrings.ewma
import typings.dashjs.dashjsStrings.slidingWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ABRStrategy extends StObject {
  
  var ABRStrategy: js.UndefOr[abrDynamic | abrBola | abrL2A | abrLoLP | abrThroughput] = js.undefined
  
  var additionalAbrRules: js.UndefOr[AbandonRequestsRule] = js.undefined
  
  var autoSwitchBitrate: js.UndefOr[`0`] = js.undefined
  
  var bandwidthSafetyFactor: js.UndefOr[Double] = js.undefined
  
  var fetchThroughputCalculationMode: js.UndefOr[String] = js.undefined
  
  var initialBitrate: js.UndefOr[AudioVideo] = js.undefined
  
  var initialRepresentationRatio: js.UndefOr[AudioVideo] = js.undefined
  
  var limitBitrateByPortal: js.UndefOr[Boolean] = js.undefined
  
  var maxBitrate: js.UndefOr[AudioVideo] = js.undefined
  
  var maxRepresentationRatio: js.UndefOr[AudioVideo] = js.undefined
  
  var minBitrate: js.UndefOr[AudioVideo] = js.undefined
  
  var movingAverageMethod: js.UndefOr[slidingWindow | ewma] = js.undefined
  
  var useDeadTimeLatency: js.UndefOr[Boolean] = js.undefined
  
  var useDefaultABRRules: js.UndefOr[Boolean] = js.undefined
  
  var usePixelRatioInLimitBitrateByPortal: js.UndefOr[Boolean] = js.undefined
}
object ABRStrategy {
  
  inline def apply(): ABRStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ABRStrategy]
  }
  
  extension [Self <: ABRStrategy](x: Self) {
    
    inline def setABRStrategy(value: abrDynamic | abrBola | abrL2A | abrLoLP | abrThroughput): Self = StObject.set(x, "ABRStrategy", value.asInstanceOf[js.Any])
    
    inline def setABRStrategyUndefined: Self = StObject.set(x, "ABRStrategy", js.undefined)
    
    inline def setAdditionalAbrRules(value: AbandonRequestsRule): Self = StObject.set(x, "additionalAbrRules", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAbrRulesUndefined: Self = StObject.set(x, "additionalAbrRules", js.undefined)
    
    inline def setAutoSwitchBitrate(value: `0`): Self = StObject.set(x, "autoSwitchBitrate", value.asInstanceOf[js.Any])
    
    inline def setAutoSwitchBitrateUndefined: Self = StObject.set(x, "autoSwitchBitrate", js.undefined)
    
    inline def setBandwidthSafetyFactor(value: Double): Self = StObject.set(x, "bandwidthSafetyFactor", value.asInstanceOf[js.Any])
    
    inline def setBandwidthSafetyFactorUndefined: Self = StObject.set(x, "bandwidthSafetyFactor", js.undefined)
    
    inline def setFetchThroughputCalculationMode(value: String): Self = StObject.set(x, "fetchThroughputCalculationMode", value.asInstanceOf[js.Any])
    
    inline def setFetchThroughputCalculationModeUndefined: Self = StObject.set(x, "fetchThroughputCalculationMode", js.undefined)
    
    inline def setInitialBitrate(value: AudioVideo): Self = StObject.set(x, "initialBitrate", value.asInstanceOf[js.Any])
    
    inline def setInitialBitrateUndefined: Self = StObject.set(x, "initialBitrate", js.undefined)
    
    inline def setInitialRepresentationRatio(value: AudioVideo): Self = StObject.set(x, "initialRepresentationRatio", value.asInstanceOf[js.Any])
    
    inline def setInitialRepresentationRatioUndefined: Self = StObject.set(x, "initialRepresentationRatio", js.undefined)
    
    inline def setLimitBitrateByPortal(value: Boolean): Self = StObject.set(x, "limitBitrateByPortal", value.asInstanceOf[js.Any])
    
    inline def setLimitBitrateByPortalUndefined: Self = StObject.set(x, "limitBitrateByPortal", js.undefined)
    
    inline def setMaxBitrate(value: AudioVideo): Self = StObject.set(x, "maxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "maxBitrate", js.undefined)
    
    inline def setMaxRepresentationRatio(value: AudioVideo): Self = StObject.set(x, "maxRepresentationRatio", value.asInstanceOf[js.Any])
    
    inline def setMaxRepresentationRatioUndefined: Self = StObject.set(x, "maxRepresentationRatio", js.undefined)
    
    inline def setMinBitrate(value: AudioVideo): Self = StObject.set(x, "minBitrate", value.asInstanceOf[js.Any])
    
    inline def setMinBitrateUndefined: Self = StObject.set(x, "minBitrate", js.undefined)
    
    inline def setMovingAverageMethod(value: slidingWindow | ewma): Self = StObject.set(x, "movingAverageMethod", value.asInstanceOf[js.Any])
    
    inline def setMovingAverageMethodUndefined: Self = StObject.set(x, "movingAverageMethod", js.undefined)
    
    inline def setUseDeadTimeLatency(value: Boolean): Self = StObject.set(x, "useDeadTimeLatency", value.asInstanceOf[js.Any])
    
    inline def setUseDeadTimeLatencyUndefined: Self = StObject.set(x, "useDeadTimeLatency", js.undefined)
    
    inline def setUseDefaultABRRules(value: Boolean): Self = StObject.set(x, "useDefaultABRRules", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultABRRulesUndefined: Self = StObject.set(x, "useDefaultABRRules", js.undefined)
    
    inline def setUsePixelRatioInLimitBitrateByPortal(value: Boolean): Self = StObject.set(x, "usePixelRatioInLimitBitrateByPortal", value.asInstanceOf[js.Any])
    
    inline def setUsePixelRatioInLimitBitrateByPortalUndefined: Self = StObject.set(x, "usePixelRatioInLimitBitrateByPortal", js.undefined)
  }
}
