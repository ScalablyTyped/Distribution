package typings.csvGenerate

import typings.csvGenerate.mod.Callback
import typings.csvGenerate.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object browserEsmMod {
  
  @JSImport("csv-generate/browser/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("csv-generate/browser/esm", "Generator")
  @js.native
  open class Generator ()
    extends typings.csvGenerate.mod.Generator {
    def this(options: Options) = this()
  }
  
  inline def generate(): typings.csvGenerate.mod.Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[typings.csvGenerate.mod.Generator]
  inline def generate(callback: Callback): typings.csvGenerate.mod.Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(callback.asInstanceOf[js.Any]).asInstanceOf[typings.csvGenerate.mod.Generator]
  inline def generate(options: Unit, callback: Callback): typings.csvGenerate.mod.Generator = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvGenerate.mod.Generator]
  inline def generate(options: Options): typings.csvGenerate.mod.Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[typings.csvGenerate.mod.Generator]
  inline def generate(options: Options, callback: Callback): typings.csvGenerate.mod.Generator = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvGenerate.mod.Generator]
}
