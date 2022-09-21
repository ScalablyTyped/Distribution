package typings.baseui

import typings.baseui.baseuiStrings.div
import typings.baseui.blockTypesMod.BlockComponentType
import typings.baseui.headingTypesMod.HeadingLevelProps
import typings.baseui.headingTypesMod.HeadingProps
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingMod {
  
  @JSImport("baseui/heading", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/heading", "Heading")
  @js.native
  val Heading: FC[HeadingProps & ComponentPropsWithoutRef[BlockComponentType[div]]] = js.native
  
  inline def HeadingLevel(hasChildren: HeadingLevelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeadingLevel")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/heading", "LevelContext")
  @js.native
  val LevelContext: Context[Double] = js.native
}
