package typings.cssDeclarationSorter

import typings.cssDeclarationSorter.cssDeclarationSorterInts.`-1`
import typings.cssDeclarationSorter.cssDeclarationSorterInts.`0`
import typings.cssDeclarationSorter.cssDeclarationSorterInts.`1`
import typings.cssDeclarationSorter.mod.SortFunction
import typings.cssDeclarationSorter.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait KeepOverrides extends StObject {
    
    /**
      To prevent breaking legacy CSS where shorthand declarations override longhand declarations. For example `animation-name: some; animation: greeting;` will be kept in this order.
      @default false
      */
    var keepOverrides: js.UndefOr[Boolean] = js.undefined
    
    /**
      Provide the name of one of the built-in sort orders or a comparison function that is passed to `Array.sort`.
      @default 'alphabetical'
      */
    var order: js.UndefOr[SortOrder | SortFunction] = js.undefined
  }
  object KeepOverrides {
    
    inline def apply(): KeepOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeepOverrides]
    }
    
    extension [Self <: KeepOverrides](x: Self) {
      
      inline def setKeepOverrides(value: Boolean): Self = StObject.set(x, "keepOverrides", value.asInstanceOf[js.Any])
      
      inline def setKeepOverridesUndefined: Self = StObject.set(x, "keepOverrides", js.undefined)
      
      inline def setOrder(value: SortOrder | SortFunction): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderFunction2(value: (/* propertyNameA */ String, /* propertyNameB */ String) => `-1` | `0` | `1`): Self = StObject.set(x, "order", js.Any.fromFunction2(value))
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
}
