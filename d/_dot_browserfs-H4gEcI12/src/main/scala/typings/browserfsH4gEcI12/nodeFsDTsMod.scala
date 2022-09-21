package typings.browserfsH4gEcI12

import org.scalablytyped.runtime.Shortcut
import typings.browserfsH4gEcI12.fsDTsMod.FSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFsDTsMod {
  
  /**
    * @hidden
    */
  object default extends Shortcut {
    
    @JSImport(".browserfs-H4gEcI12/dist/node/core/node_fs.d.ts", JSImport.Default)
    @js.native
    val ^ : FSModule = js.native
    
    /**
      * The FS constructor.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/node_fs.d.ts", "default.FS")
    @js.native
    open class FS ()
      extends StObject
         with typings.browserfsH4gEcI12.fsDTsMod.FS
    
    type _To = FSModule
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: FSModule = ^
  }
}
