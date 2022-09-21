package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeOptions extends StObject {
  
  var includeDeleted: Boolean
  
  var mergeStrategy: MergeStrategySymbol
  
  var noTracking: Boolean
}
object MergeOptions {
  
  inline def apply(includeDeleted: Boolean, mergeStrategy: MergeStrategySymbol, noTracking: Boolean): MergeOptions = {
    val __obj = js.Dynamic.literal(includeDeleted = includeDeleted.asInstanceOf[js.Any], mergeStrategy = mergeStrategy.asInstanceOf[js.Any], noTracking = noTracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeOptions]
  }
  
  extension [Self <: MergeOptions](x: Self) {
    
    inline def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategy(value: MergeStrategySymbol): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setNoTracking(value: Boolean): Self = StObject.set(x, "noTracking", value.asInstanceOf[js.Any])
  }
}
