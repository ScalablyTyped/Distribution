package typings.cssDeclarationSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Default, order in a simple alphabetical manner from a - z.
    */
  type Alphabetical = typings.cssDeclarationSorter.cssDeclarationSorterStrings.alphabetical
  
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
  type ConcentricCSS = typings.cssDeclarationSorter.cssDeclarationSorterStrings.`concentric-css`
  
  type CssDeclarationSorter = typings.postcss.mod.Plugin_[typings.cssDeclarationSorter.mod.Options]
  
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
  type SMACSS = typings.cssDeclarationSorter.cssDeclarationSorterStrings.smacss
  
  /**
    * This function receives two declaration names and is expected
    * to return -1, 0 or 1 depending on the wanted order.
    */
  type SortFunction = js.Function2[
    /* aProp */ java.lang.String, 
    /* bProp */ java.lang.String, 
    typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`-1` | typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`0` | typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`1`
  ]
  
  type SortOrder = typings.cssDeclarationSorter.mod.Alphabetical | typings.cssDeclarationSorter.mod.SMACSS | typings.cssDeclarationSorter.mod.ConcentricCSS
}
