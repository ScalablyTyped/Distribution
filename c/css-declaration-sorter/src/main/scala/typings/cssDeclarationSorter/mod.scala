package typings.cssDeclarationSorter

import org.scalablytyped.runtime.Shortcut
import typings.cssDeclarationSorter.anon.KeepOverrides
import typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`-1`
import typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`0`
import typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`1`
import typings.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("css-declaration-sorter", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[KeepOverrides] = js.native
  
  /**
    * This function receives two declaration property names and is expected
    * to return -1, 0 or 1 depending on the wanted order.
    */
  type SortFunction = js.Function2[/* propertyNameA */ String, /* propertyNameB */ String, `-1` | `0` | `1`]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssDeclarationSorter.cssDeclarationSorterStrings.alphabetical
    - typings.cssDeclarationSorter.cssDeclarationSorterStrings.`concentric-css`
    - typings.cssDeclarationSorter.cssDeclarationSorterStrings.smacss
  */
  trait SortOrder extends StObject
  object SortOrder {
    
    inline def alphabetical: typings.cssDeclarationSorter.cssDeclarationSorterStrings.alphabetical = "alphabetical".asInstanceOf[typings.cssDeclarationSorter.cssDeclarationSorterStrings.alphabetical]
    
    inline def `concentric-css`: typings.cssDeclarationSorter.cssDeclarationSorterStrings.`concentric-css` = "concentric-css".asInstanceOf[typings.cssDeclarationSorter.cssDeclarationSorterStrings.`concentric-css`]
    
    inline def smacss: typings.cssDeclarationSorter.cssDeclarationSorterStrings.smacss = "smacss".asInstanceOf[typings.cssDeclarationSorter.cssDeclarationSorterStrings.smacss]
  }
  
  type _To = PluginCreator[KeepOverrides]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[KeepOverrides] = ^
}
