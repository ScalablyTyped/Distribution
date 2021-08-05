package typings.breeze.anon

import typings.breeze.breeze.MergeStrategySymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeStrategy extends StObject {
  
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.undefined
  
  var metadataVersionFn: js.UndefOr[js.Function1[/* any */ js.Any, Unit]] = js.undefined
}
object MergeStrategy {
  
  inline def apply(): MergeStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeStrategy]
  }
  
  extension [Self <: MergeStrategy](x: Self) {
    
    inline def setMergeStrategy(value: MergeStrategySymbol): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
    
    inline def setMetadataVersionFn(value: /* any */ js.Any => Unit): Self = StObject.set(x, "metadataVersionFn", js.Any.fromFunction1(value))
    
    inline def setMetadataVersionFnUndefined: Self = StObject.set(x, "metadataVersionFn", js.undefined)
  }
}
