package typings.breeze.anon

import typings.breeze.breeze.MergeStrategySymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeAdds extends StObject {
  
  var mergeAdds: js.UndefOr[Boolean] = js.undefined
  
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.undefined
  
  var metadataVersionFn: js.UndefOr[js.Function1[/* any */ Any, Unit]] = js.undefined
}
object MergeAdds {
  
  inline def apply(): MergeAdds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeAdds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeAdds] (val x: Self) extends AnyVal {
    
    inline def setMergeAdds(value: Boolean): Self = StObject.set(x, "mergeAdds", value.asInstanceOf[js.Any])
    
    inline def setMergeAddsUndefined: Self = StObject.set(x, "mergeAdds", js.undefined)
    
    inline def setMergeStrategy(value: MergeStrategySymbol): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
    
    inline def setMetadataVersionFn(value: /* any */ Any => Unit): Self = StObject.set(x, "metadataVersionFn", js.Any.fromFunction1(value))
    
    inline def setMetadataVersionFnUndefined: Self = StObject.set(x, "metadataVersionFn", js.undefined)
  }
}
