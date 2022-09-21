package typings.canvg.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "Property")
@js.native
open class Property[T] protected ()
  extends typings.canvg.propertyMod.Property[T] {
  def this(document: typings.canvg.documentMod.Document, name: String, value: T) = this()
}
/* static members */
object Property {
  
  @JSImport("canvg", "Property")
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty(document: typings.canvg.documentMod.Document): typings.canvg.propertyMod.Property[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(document.asInstanceOf[js.Any]).asInstanceOf[typings.canvg.propertyMod.Property[String]]
  
  @JSImport("canvg", "Property.textBaselineMapping")
  @js.native
  val textBaselineMapping: Record[String, String] = js.native
}
