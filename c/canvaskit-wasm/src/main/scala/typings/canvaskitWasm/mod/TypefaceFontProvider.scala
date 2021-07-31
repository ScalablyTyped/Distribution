package typings.canvaskitWasm.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypefaceFontProvider
  extends StObject
     with EmbindObject[TypefaceFontProvider] {
  
  /**
    * Registers a given typeface with the given family name (ignoring whatever name the
    * typface has for itself).
    * @param bytes - the raw bytes for a typeface.
    * @param family
    */
  def registerFont(bytes: ArrayBuffer, family: String): Unit = js.native
  def registerFont(bytes: Uint8Array, family: String): Unit = js.native
}
