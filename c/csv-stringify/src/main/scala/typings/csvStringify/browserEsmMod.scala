package typings.csvStringify

import typings.csvStringify.mod.Callback
import typings.csvStringify.mod.Input
import typings.csvStringify.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object browserEsmMod {
  
  @JSImport("csv-stringify/browser/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("csv-stringify/browser/esm", "Stringifier")
  @js.native
  open class Stringifier protected ()
    extends typings.csvStringify.mod.Stringifier {
    def this(options: Options) = this()
  }
  
  inline def stringify(): typings.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[typings.csvStringify.mod.Stringifier]
  inline def stringify(callback: Callback): typings.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(callback.asInstanceOf[js.Any]).asInstanceOf[typings.csvStringify.mod.Stringifier]
  inline def stringify(input: Input): typings.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any]).asInstanceOf[typings.csvStringify.mod.Stringifier]
  inline def stringify(input: Input, callback: Callback): typings.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvStringify.mod.Stringifier]
  inline def stringify(input: Input, options: Unit, callback: Callback): typings.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvStringify.mod.Stringifier]
  inline def stringify(input: Input, options: Options): typings.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.csvStringify.mod.Stringifier]
  inline def stringify(input: Input, options: Options, callback: Callback): typings.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvStringify.mod.Stringifier]
  inline def stringify(options: Options): typings.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any]).asInstanceOf[typings.csvStringify.mod.Stringifier]
  inline def stringify(options: Options, callback: Callback): typings.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvStringify.mod.Stringifier]
}
