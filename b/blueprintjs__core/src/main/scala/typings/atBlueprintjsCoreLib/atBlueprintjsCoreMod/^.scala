package typings
package atBlueprintjsCoreLib.atBlueprintjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Blockquote: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLElement]
  ] = js.native
  val Breadcrumb: reactLib.reactMod.SFC[atBlueprintjsCoreLib.libEsmComponentsBreadcrumbsBreadcrumbMod.IBreadcrumbProps] = js.native
  val Code: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLElement]
  ] = js.native
  val DISPLAYNAME_PREFIX: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.Blueprint3 = js.native
  val Expander: reactLib.reactMod.SFC[js.Object] = js.native
  val H1: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLHeadingElement]
  ] = js.native
  val H2: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLHeadingElement]
  ] = js.native
  val H3: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLHeadingElement]
  ] = js.native
  val H4: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLHeadingElement]
  ] = js.native
  val H5: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLHeadingElement]
  ] = js.native
  val H6: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLHeadingElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLHeadingElement]
  ] = js.native
  val Label: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLLabelElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLLabelElement]
  ] = js.native
  val OL: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLOListElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLOListElement]
  ] = js.native
  val Pre: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLElement]
  ] = js.native
  val UL: reactLib.reactMod.StatelessComponent[
    reactLib.reactMod.HTMLProps[stdLib.HTMLUListElement] with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[stdLib.HTMLUListElement]
  ] = js.native
  def ContextMenuTarget[T /* <: atBlueprintjsCoreLib.libEsmCommonConstructorMod.IConstructor[
    atBlueprintjsCoreLib.libEsmComponentsContextDashMenuContextMenuTargetMod.IContextMenuTargetComponent
  ] */](WrappedComponent: T): atBlueprintjsCoreLib.Anon_Args with T = js.native
  def HotkeysTarget[T /* <: atBlueprintjsCoreLib.libEsmCommonConstructorMod.IConstructor[
    atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
  ] */](WrappedComponent: T): atBlueprintjsCoreLib.Anon_ArgsDisplayName with T = js.native
  def comboMatches(
    a: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo,
    b: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  ): scala.Boolean = js.native
  def getKeyCombo(e: stdLib.KeyboardEvent): atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo = js.native
  def getKeyComboString(e: stdLib.KeyboardEvent): java.lang.String = js.native
  def getPositionIgnoreAngles(position: atBlueprintjsCoreLib.libEsmCommonPositionMod.Position): atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.left | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.right | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.bottom | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.top = js.native
  def hideHotkeysDialog(): scala.Unit = js.native
  def isPositionHorizontal(position: atBlueprintjsCoreLib.libEsmCommonPositionMod.Position): scala.Boolean = js.native
  def isPositionVertical(position: atBlueprintjsCoreLib.libEsmCommonPositionMod.Position): scala.Boolean = js.native
  def parseKeyCombo(combo: java.lang.String): atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo = js.native
  def removeNonHTMLProps(props: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(
    props: org.scalablytyped.runtime.StringDictionary[js.Any],
    invalidProps: js.Array[java.lang.String]
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(
    props: org.scalablytyped.runtime.StringDictionary[js.Any],
    invalidProps: js.Array[java.lang.String],
    shouldMerge: scala.Boolean
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def setHotkeysDialogProps(
    props: stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysDialogMod.IHotkeysDialogProps]
  ): scala.Unit = js.native
}

