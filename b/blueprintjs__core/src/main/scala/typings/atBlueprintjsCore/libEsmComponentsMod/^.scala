package typings.atBlueprintjsCore.libEsmComponentsMod

import typings.atBlueprintjsCore.Anon_Args
import typings.atBlueprintjsCore.Anon_ArgsDisplayName
import typings.atBlueprintjsCore.libEsmCommonConstructorMod.IConstructor
import typings.atBlueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbMod.IBreadcrumbProps
import typings.atBlueprintjsCore.libEsmComponentsContextDashMenuContextMenuTargetMod.IContextMenuTargetComponent
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysDialogMod.IHotkeysDialogProps
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
import typings.atBlueprintjsCore.libEsmComponentsHtmlHtmlMod.IElementRefProps
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.SFC
import typings.react.reactMod.StatelessComponent
import typings.std.HTMLElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLLabelElement
import typings.std.HTMLOListElement
import typings.std.HTMLUListElement
import typings.std.KeyboardEvent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Blockquote: StatelessComponent[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]] = js.native
  val Breadcrumb: SFC[IBreadcrumbProps] = js.native
  val Code: StatelessComponent[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]] = js.native
  val Expander: SFC[js.Object] = js.native
  val H1: StatelessComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val H2: StatelessComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val H3: StatelessComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val H4: StatelessComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val H5: StatelessComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val H6: StatelessComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val Label: StatelessComponent[HTMLProps[HTMLLabelElement] with IElementRefProps[HTMLLabelElement]] = js.native
  val OL: StatelessComponent[HTMLProps[HTMLOListElement] with IElementRefProps[HTMLOListElement]] = js.native
  val Pre: StatelessComponent[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]] = js.native
  val UL: StatelessComponent[HTMLProps[HTMLUListElement] with IElementRefProps[HTMLUListElement]] = js.native
  def ContextMenuTarget[T /* <: IConstructor[IContextMenuTargetComponent] */](WrappedComponent: T): Anon_Args with T = js.native
  def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): Anon_ArgsDisplayName with T = js.native
  def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = js.native
  def getKeyCombo(e: KeyboardEvent): IKeyCombo = js.native
  def getKeyComboString(e: KeyboardEvent): String = js.native
  def hideHotkeysDialog(): Unit = js.native
  def parseKeyCombo(combo: String): IKeyCombo = js.native
  def setHotkeysDialogProps(props: Partial[IHotkeysDialogProps]): Unit = js.native
}

