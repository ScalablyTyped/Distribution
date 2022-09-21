package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.div
import typings.baseui.blockTypesMod.BlockComponentType
import typings.baseui.headingTypesMod.HeadingProps
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingHeadingMod extends Shortcut {
  
  @JSImport("baseui/heading/heading", JSImport.Default)
  @js.native
  val default: FC[HeadingProps & ComponentPropsWithoutRef[BlockComponentType[div]]] = js.native
  
  type _To = FC[HeadingProps & ComponentPropsWithoutRef[BlockComponentType[div]]]
  
  /* This means you don't have to write `default`, but can instead just say `headingHeadingMod.foo` */
  override def _to: FC[HeadingProps & ComponentPropsWithoutRef[BlockComponentType[div]]] = default
}
