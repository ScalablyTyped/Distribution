package typings.breeze.anon

import typings.breeze.breeze.MergeStrategySymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeStrategy extends StObject {
  
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.native
  
  var metadataVersionFn: js.UndefOr[js.Function1[/* any */ js.Any, Unit]] = js.native
}
object MergeStrategy {
  
  @scala.inline
  def apply(): MergeStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeStrategy]
  }
  
  @scala.inline
  implicit class MergeStrategyMutableBuilder[Self <: MergeStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeStrategy(value: MergeStrategySymbol): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
    
    @scala.inline
    def setMetadataVersionFn(value: /* any */ js.Any => Unit): Self = StObject.set(x, "metadataVersionFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMetadataVersionFnUndefined: Self = StObject.set(x, "metadataVersionFn", js.undefined)
  }
}
