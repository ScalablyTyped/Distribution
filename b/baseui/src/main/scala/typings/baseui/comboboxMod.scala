package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.IsSelected
import typings.baseui.anon.Width
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.ul
import typings.baseui.comboboxTypesMod.ComboboxProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboboxMod {
  
  @JSImport("baseui/combobox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Combobox[Option](props: ComboboxProps[Option]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Combobox")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/combobox", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/combobox", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/combobox", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/combobox", "SIZE.mini")
    @js.native
    val mini: typings.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  @JSImport("baseui/combobox", "StyledInputContainer")
  @js.native
  val StyledInputContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/combobox", "StyledListBox")
  @js.native
  val StyledListBox: StyletronComponent[ul, Width] = js.native
  
  @JSImport("baseui/combobox", "StyledListItem")
  @js.native
  val StyledListItem: StyletronComponent[li_, IsSelected] = js.native
  
  @JSImport("baseui/combobox", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, js.Object] = js.native
  
  type PropsT = ComboboxProps[Any]
}
