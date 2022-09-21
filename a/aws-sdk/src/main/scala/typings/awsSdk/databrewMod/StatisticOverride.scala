package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatisticOverride extends StObject {
  
  /**
    * A map that includes overrides of an evaluation’s parameters.
    */
  var Parameters: ParameterMap
  
  /**
    * The name of an evaluation
    */
  var Statistic: typings.awsSdk.databrewMod.Statistic
}
object StatisticOverride {
  
  inline def apply(Parameters: ParameterMap, Statistic: Statistic): StatisticOverride = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], Statistic = Statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticOverride]
  }
  
  extension [Self <: StatisticOverride](x: Self) {
    
    inline def setParameters(value: ParameterMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setStatistic(value: Statistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
  }
}
