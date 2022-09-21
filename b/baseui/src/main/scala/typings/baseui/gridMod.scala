package typings.baseui

import typings.baseui.layoutGridTypesMod.GridProps
import typings.baseui.layoutGridTypesMod.SharedGridProps
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("baseui/layout-grid/grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasAlignBehaviorChildrenGridColumnsGridGapsGridGuttersGridMarginsGridMaxWidthGridStyleGridUnitOverrides: GridProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasAlignBehaviorChildrenGridColumnsGridGapsGridGuttersGridMarginsGridMaxWidthGridStyleGridUnitOverrides.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/layout-grid/grid", "GridContext")
  @js.native
  val GridContext: Context[SharedGridProps] = js.native
}
