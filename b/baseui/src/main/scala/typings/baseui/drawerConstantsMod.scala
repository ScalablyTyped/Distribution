package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.`100Percentsign`
import typings.baseui.baseuiStrings.`500px`
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.escape_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerConstantsMod {
  
  object ANCHOR {
    
    @JSImport("baseui/drawer/constants", "ANCHOR.bottom")
    @js.native
    val bottom: typings.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/drawer/constants", "ANCHOR.left")
    @js.native
    val left: typings.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/drawer/constants", "ANCHOR.right")
    @js.native
    val right: typings.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/drawer/constants", "ANCHOR.top")
    @js.native
    val top: typings.baseui.baseuiStrings.top = js.native
  }
  
  object CLOSE_SOURCE {
    
    @JSImport("baseui/drawer/constants", "CLOSE_SOURCE.backdrop")
    @js.native
    val backdrop: typings.baseui.baseuiStrings.backdrop = js.native
    
    @JSImport("baseui/drawer/constants", "CLOSE_SOURCE.closeButton")
    @js.native
    val closeButton: typings.baseui.baseuiStrings.closeButton = js.native
    
    @JSImport("baseui/drawer/constants", "CLOSE_SOURCE.escape")
    @js.native
    val escape: escape_ = js.native
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/drawer/constants", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/drawer/constants", "SIZE.auto")
    @js.native
    val auto: typings.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/drawer/constants", "SIZE.full")
    @js.native
    val full: typings.baseui.baseuiStrings.full = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  object SIZE_DIMENSION extends Shortcut {
    
    @JSImport("baseui/drawer/constants", "SIZE_DIMENSION.default")
    @js.native
    val default: `500px` = js.native
    
    @JSImport("baseui/drawer/constants", "SIZE_DIMENSION.auto")
    @js.native
    val auto: typings.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/drawer/constants", "SIZE_DIMENSION.full")
    @js.native
    val full: `100Percentsign` = js.native
    
    type _To = `500px`
    
    /* This means you don't have to write `default`, but can instead just say `SIZE_DIMENSION.foo` */
    override def _to: `500px` = default
  }
}
