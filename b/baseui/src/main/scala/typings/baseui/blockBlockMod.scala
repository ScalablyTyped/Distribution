package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.div
import typings.baseui.blockTypesMod.BlockComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockBlockMod extends Shortcut {
  
  @JSImport("baseui/block/block", JSImport.Default)
  @js.native
  val default: BlockComponentType[div] = js.native
  
  type _To = BlockComponentType[div]
  
  /* This means you don't have to write `default`, but can instead just say `blockBlockMod.foo` */
  override def _to: BlockComponentType[div] = default
}
