package typings.cldrjs

import org.scalablytyped.runtime.Shortcut
import typings.cldrjs.mod.CldrFactory
import typings.cldrjs.mod.CldrStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object supplementalMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("cldr/supplemental", JSImport.Namespace)
  @js.native
  class ^ protected () extends CldrStatic {
    /**
      * @name constructor
      * @memberof cldr.CldrFactory
      * @kind function
      * @access public
      *
      * @description
      * The constructor function for {@link cldr.CldrStatic} class.
      *
      * @param {string} locale The locale name that was previously loaded.
      *
      * @returns {cldr.CldrStatic} The instance of {@link cldr.CldrStatic} class.
      */
    def this(locale: String) = this()
  }
  @JSImport("cldr/supplemental", JSImport.Namespace)
  @js.native
  val ^ : CldrFactory = js.native
  
  type _To = CldrFactory
  
  /* This means you don't have to write `^`, but can instead just say `supplementalMod.foo` */
  override def _to: CldrFactory = ^
}
