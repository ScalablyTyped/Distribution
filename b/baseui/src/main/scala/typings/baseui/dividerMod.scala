package typings.baseui

import typings.baseui.baseuiStrings.hr_
import typings.baseui.dividerTypesMod.DividerProps
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod {
  
  object SIZE {
    
    @JSImport("baseui/divider", "SIZE.cell")
    @js.native
    val cell: typings.baseui.baseuiStrings.cell = js.native
    
    @JSImport("baseui/divider", "SIZE.module")
    @js.native
    val module: typings.baseui.baseuiStrings.module = js.native
    
    @JSImport("baseui/divider", "SIZE.section")
    @js.native
    val section: typings.baseui.baseuiStrings.section = js.native
  }
  
  @JSImport("baseui/divider", "StyledDivider")
  @js.native
  val StyledDivider: StyletronComponent[hr_, DividerProps] = js.native
}
