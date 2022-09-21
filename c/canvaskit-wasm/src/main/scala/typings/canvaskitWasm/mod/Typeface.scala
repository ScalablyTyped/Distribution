package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeface
  extends StObject
     with EmbindObject[Typeface] {
  
  /**
    * Retrieves the glyph ids for each code point in the provided string. Note that glyph IDs
    * are typeface-dependent; different faces may have different ids for the same code point.
    * @param str
    * @param numCodePoints - the number of code points in the string. Defaults to str.length.
    * @param output - if provided, the results will be copied into this array.
    */
  def getGlyphIDs(str: String): js.typedarray.Uint16Array = js.native
  def getGlyphIDs(str: String, numCodePoints: Double): js.typedarray.Uint16Array = js.native
  def getGlyphIDs(str: String, numCodePoints: Double, output: js.typedarray.Uint16Array): js.typedarray.Uint16Array = js.native
  def getGlyphIDs(str: String, numCodePoints: Unit, output: js.typedarray.Uint16Array): js.typedarray.Uint16Array = js.native
}
