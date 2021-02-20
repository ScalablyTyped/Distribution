package typings.cssDeclarationSorter

import org.scalablytyped.runtime.Shortcut
import typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`-1`
import typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`0`
import typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`1`
import typings.cssDeclarationSorter.cssDeclarationSorterStrings.`concentric-css`
import typings.cssDeclarationSorter.cssDeclarationSorterStrings.alphabetical
import typings.cssDeclarationSorter.cssDeclarationSorterStrings.smacss
import typings.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("css-declaration-sorter", JSImport.Namespace)
  @js.native
  val ^ : CssDeclarationSorter = js.native
  
  /**
    * Default, order in a simple alphabetical manner from a - z.
    */
  type Alphabetical = alphabetical
  
  /**
    * Order properties applying outside the box model, moving inward to intrinsic changes.
    * ```
    * 1. Positioning
    * 2. Visibility
    * 3. Box model
    * 4. Dimensions
    * 5. Text
    * ```
    */
  type ConcentricCSS = `concentric-css`
  
  type CssDeclarationSorter = Plugin_[Options]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * To prevent breaking legacy CSS where shorthand declarations override longhand declarations
      * (also taking into account vendor prefixes) this option can enabled.
      * For example `animation-name: some; animation: greeting;` will be kept in this order when `keepOverrides` is `true`.
      */
    var keepOverrides: js.UndefOr[Boolean] = js.native
    
    /**
      * Provide the name of one of the built-in sort orders or a comparison function that is passed to `Array.sort`.
      * @default 'alphabetical'
      */
    var order: js.UndefOr[SortOrder | SortFunction] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepOverrides(value: Boolean): Self = StObject.set(x, "keepOverrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepOverridesUndefined: Self = StObject.set(x, "keepOverrides", js.undefined)
      
      @scala.inline
      def setOrder(value: SortOrder | SortFunction): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderFunction2(value: (/* aProp */ String, /* bProp */ String) => `-1` | `0` | `1`): Self = StObject.set(x, "order", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /**
    * Order from most important, flow affecting properties, to least important properties.
    * ```
    * 1. Box
    * 2. Border
    * 3. Background
    * 4. Text
    * 5. Other
    * ```
    */
  type SMACSS = smacss
  
  /**
    * This function receives two declaration names and is expected
    * to return -1, 0 or 1 depending on the wanted order.
    */
  type SortFunction = js.Function2[/* aProp */ String, /* bProp */ String, `-1` | `0` | `1`]
  
  type SortOrder = Alphabetical | SMACSS | ConcentricCSS
  
  type _To = CssDeclarationSorter
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CssDeclarationSorter = ^
}
