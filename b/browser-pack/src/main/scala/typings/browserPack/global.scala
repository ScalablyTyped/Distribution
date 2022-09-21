package typings.browserPack

import typings.browserPack.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Pack node-style source files from a json stream into a browser bundle.
    * Source objects are written to browser-pack using 'write(row)'. browser-pack uses these properties of each row:
    *  - 'id' - A unique ID for this module.
    *  - 'deps' - An object mapping 'require()' argument strings to dependency row IDs, used for resolution at runtime.
    *  - 'entry' - When true, this module will be executed when the bundle loads. Otherwise, it will only be executed once some other module 'require()'s it.
    *  - 'order' - When 'row.entry' is true, this number indicates the order in which different entry modules are executed.
    *  - 'source' - The contents of the module.
    *  - 'nomap' - When true, a source map is not generated for this module.
    *  - 'sourceFile' - The file name to use for this module in the source map.
    */
  inline def browserPack(): Any = js.Dynamic.global.applyDynamic("browserPack")().asInstanceOf[Any]
  inline def browserPack(opts: Options): Any = js.Dynamic.global.applyDynamic("browserPack")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
}
