package typings.colord

import typings.colord.extendMod.Plugin
import typings.colord.typesMod.AnyColor
import typings.colord.typesMod.Format
import typings.colord.typesMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("colord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("colord", "Colord")
  @js.native
  open class Colord_ protected ()
    extends typings.colord.colordMod.Colord_ {
    def this(input: AnyColor) = this()
  }
  
  inline def colord(input: typings.colord.colordMod.Colord_): typings.colord.colordMod.Colord_ = ^.asInstanceOf[js.Dynamic].applyDynamic("colord")(input.asInstanceOf[js.Any]).asInstanceOf[typings.colord.colordMod.Colord_]
  inline def colord(input: AnyColor): typings.colord.colordMod.Colord_ = ^.asInstanceOf[js.Dynamic].applyDynamic("colord")(input.asInstanceOf[js.Any]).asInstanceOf[typings.colord.colordMod.Colord_]
  
  inline def extend(plugins: js.Array[Plugin]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getFormat(input: Input): js.UndefOr[Format] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormat")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Format]]
  
  inline def random(): typings.colord.colordMod.Colord_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.colord.colordMod.Colord_]
}
