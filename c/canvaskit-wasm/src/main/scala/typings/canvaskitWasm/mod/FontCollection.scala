package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontCollection
  extends StObject
     with EmbindObject[FontCollection] {
  
  /**
    * Enable fallback to dynamically discovered fonts for characters that are not handled
    * by the text style's fonts.
    */
  def enableFontFallback(): Unit = js.native
  
  /**
    * Set the default provider used to locate fonts.
    */
  def setDefaultFontManager(): Unit = js.native
  def setDefaultFontManager(fontManager: TypefaceFontProvider): Unit = js.native
}
