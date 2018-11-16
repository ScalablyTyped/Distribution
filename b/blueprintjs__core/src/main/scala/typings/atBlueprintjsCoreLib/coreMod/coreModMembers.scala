package typings
package atBlueprintjsCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", JSImport.Namespace)
@js.native
object coreModMembers extends js.Object {
  val Alignment: atBlueprintjsCoreLib.Anon_RIGHT = js.native
  val Blockquote: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLElement]
  ] = js.native
  val Boundary: atBlueprintjsCoreLib.Anon_START = js.native
  val Breadcrumb: reactLib.reactMod.ReactNs.SFC[atBlueprintjsCoreLib.libEsmComponentsBreadcrumbsBreadcrumbMod.IBreadcrumbProps] = js.native
  val Code: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLElement]
  ] = js.native
  val Colors: atBlueprintjsCoreLib.Anon_FOREST2 = js.native
  val ContextMenu: js.Any = js.native
  val DISPLAYNAME_PREFIX: /* Blueprint3 */ java.lang.String = js.native
  val Elevation: atBlueprintjsCoreLib.Anon_TWO = js.native
  val Expander: reactLib.reactMod.ReactNs.SFC[js.Object] = js.native
  val FocusStyleManager: atBlueprintjsCoreLib.Anon_AlwaysShowFocus = js.native
  val H1: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement]
  ] = js.native
  val H2: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement]
  ] = js.native
  val H3: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement]
  ] = js.native
  val H4: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement]
  ] = js.native
  val H5: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement]
  ] = js.native
  val H6: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLHeadingElement]
  ] = js.native
  val HandleInteractionKind: atBlueprintjsCoreLib.Anon_PUSH = js.native
  val HandleType: atBlueprintjsCoreLib.Anon_STARTStart = js.native
  val Intent: atBlueprintjsCoreLib.Anon_WARNING = js.native
  val Label: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLLabelElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLLabelElement]
  ] = js.native
  val OL: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLOListElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLOListElement]
  ] = js.native
  val PopoverInteractionKind: atBlueprintjsCoreLib.Anon_HOVERTARGETONLY = js.native
  val Position: atBlueprintjsCoreLib.Anon_TOPRIGHT = js.native
  val Pre: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLElement]
  ] = js.native
  val UL: reactLib.reactMod.ReactNs.StatelessComponent[
    reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLUListElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLUListElement]
  ] = js.native
  val getKeyCombo: js.Function1[
    /* e */ reactLib.KeyboardEvent, 
    atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  ] = js.native
  val getKeyComboString: js.Function1[/* e */ reactLib.KeyboardEvent, java.lang.String] = js.native
  val parseKeyCombo: js.Function1[
    /* combo */ java.lang.String, 
    atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  ] = js.native
  def ContextMenuTarget[T /* <: atBlueprintjsCoreLib.libEsmCommonConstructorMod.IConstructor[
    atBlueprintjsCoreLib.libEsmComponentsContextDashMenuContextMenuTargetMod.IContextMenuTargetComponent
  ] */](WrappedComponent: T): atBlueprintjsCoreLib.Anon_DisplayNameArgs with T = js.native
  def HotkeysTarget[T /* <: atBlueprintjsCoreLib.libEsmCommonConstructorMod.IConstructor[
    atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
  ] */](WrappedComponent: T): atBlueprintjsCoreLib.Anon_DisplayName with T = js.native
  def comboMatches(
    a: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo,
    b: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  ): scala.Boolean = js.native
  def hideHotkeysDialog(): scala.Unit = js.native
  def isPositionHorizontal(position: atBlueprintjsCoreLib.libEsmCommonPositionMod.Position): scala.Boolean = js.native
  def isPositionVertical(position: atBlueprintjsCoreLib.libEsmCommonPositionMod.Position): scala.Boolean = js.native
  def removeNonHTMLProps(props: ScalablyTyped.runtime.StringDictionary[js.Any]): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(props: ScalablyTyped.runtime.StringDictionary[js.Any], invalidProps: js.Array[java.lang.String]): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(
    props: ScalablyTyped.runtime.StringDictionary[js.Any],
    invalidProps: js.Array[java.lang.String],
    shouldMerge: scala.Boolean
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def setHotkeysDialogProps(
    props: stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysDialogMod.IHotkeysDialogProps]
  ): scala.Unit = js.native
}

