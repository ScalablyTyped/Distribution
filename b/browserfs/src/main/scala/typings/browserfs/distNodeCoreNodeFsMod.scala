package typings.browserfs

import org.scalablytyped.runtime.Shortcut
import typings.browserfs.distNodeCoreFSMod.FSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeCoreNodeFsMod {
  
  /**
    * @hidden
    */
  object default extends Shortcut {
    
    @JSImport("browserfs/dist/node/core/node_fs", JSImport.Default)
    @js.native
    val ^ : FSModule = js.native
    
    /**
      * The FS constructor.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/node_fs", "default.FS")
    @js.native
    open class FS ()
      extends StObject
         with typings.browserfs.distNodeCoreFSMod.FS
    
    type _To = FSModule
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: FSModule = ^
  }
}
