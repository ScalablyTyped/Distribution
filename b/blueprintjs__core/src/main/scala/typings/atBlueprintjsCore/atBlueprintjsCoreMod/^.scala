package typings.atBlueprintjsCore.atBlueprintjsCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.atBlueprintjsCore.Anon_Args
import typings.atBlueprintjsCore.Anon_ArgsDisplayName
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.Blueprint3
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.bottom
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.left
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.right
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.top
import typings.atBlueprintjsCore.libEsmCommonConstructorMod.IConstructor
import typings.atBlueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbMod.IBreadcrumbProps
import typings.atBlueprintjsCore.libEsmComponentsContextDashMenuContextMenuTargetMod.IContextMenuTargetComponent
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysDialogMod.IHotkeysDialogProps
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
import typings.atBlueprintjsCore.libEsmComponentsHtmlHtmlMod.IElementRefProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.SFC
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

@JSImport("@blueprintjs/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Blockquote: FunctionComponent[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]] = js.native
  val Breadcrumb: SFC[IBreadcrumbProps] = js.native
  val Code: FunctionComponent[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]] = js.native
  val DISPLAYNAME_PREFIX: Blueprint3 = js.native
  val Expander: SFC[js.Object] = js.native
  val H1: FunctionComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val H2: FunctionComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val H3: FunctionComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val H4: FunctionComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val H5: FunctionComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val H6: FunctionComponent[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = js.native
  val Label: FunctionComponent[HTMLProps[HTMLLabelElement] with IElementRefProps[HTMLLabelElement]] = js.native
  val OL: FunctionComponent[HTMLProps[HTMLOListElement] with IElementRefProps[HTMLOListElement]] = js.native
  val Pre: FunctionComponent[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]] = js.native
  val UL: FunctionComponent[HTMLProps[HTMLUListElement] with IElementRefProps[HTMLUListElement]] = js.native
  def ContextMenuTarget[T /* <: IConstructor[IContextMenuTargetComponent] */](WrappedComponent: T): Anon_Args with T = js.native
  def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): Anon_ArgsDisplayName with T = js.native
  def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = js.native
  def getKeyCombo(e: KeyboardEvent): IKeyCombo = js.native
  def getKeyComboString(e: KeyboardEvent): String = js.native
  def getPositionIgnoreAngles(position: typings.atBlueprintjsCore.libEsmCommonPositionMod.Position): left | right | bottom | top = js.native
  def hideHotkeysDialog(): Unit = js.native
  def isPositionHorizontal(position: typings.atBlueprintjsCore.libEsmCommonPositionMod.Position): Boolean = js.native
  def isPositionVertical(position: typings.atBlueprintjsCore.libEsmCommonPositionMod.Position): Boolean = js.native
  def parseKeyCombo(combo: String): IKeyCombo = js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.Array[String]): StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.Array[String], shouldMerge: Boolean): StringDictionary[js.Any] = js.native
  def setHotkeysDialogProps(props: Partial[IHotkeysDialogProps]): Unit = js.native
}

