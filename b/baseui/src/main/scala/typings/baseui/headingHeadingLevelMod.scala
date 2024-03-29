package typings.baseui

import typings.baseui.headingTypesMod.HeadingLevelProps
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingHeadingLevelMod {
  
  @JSImport("baseui/heading/heading-level", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: HeadingLevelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def HeadingLevel(param0: HeadingLevelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeadingLevel")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/heading/heading-level", "LevelContext")
  @js.native
  val LevelContext: Context[Double] = js.native
}
