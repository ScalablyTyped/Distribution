package typings.blueprintjsCore

import typings.blueprintjsCore.abstractButtonMod.IButtonProps
import typings.blueprintjsCore.htmlMod.IElementRefProps
import typings.blueprintjsCore.iconMod.IIconProps
import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.menuItemMod.IMenuItemProps
import typings.blueprintjsCore.mod.MultiSlider.Handle
import typings.blueprintjsCore.mod.Tabs.Expander
import typings.blueprintjsCore.numericInputMod.INumericInputProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ComponentType
import typings.react.mod.DOMAttributes
import typings.react.mod.HTMLProps
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLLabelElement
import typings.std.HTMLOListElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object blueprintjsCoreComponents extends blueprintjsCoreProps {
  @scala.inline
  def Alert: ComponentType[AlertProps] = js.constructorOf[typings.blueprintjsCore.mod.Alert].asInstanceOf[ComponentType[AlertProps]]
  @scala.inline
  def AnchorButton: ComponentType[IButtonProps with AnchorHTMLAttributes[HTMLAnchorElement]] = js.constructorOf[typings.blueprintjsCore.mod.AnchorButton].asInstanceOf[ComponentType[IButtonProps with AnchorHTMLAttributes[HTMLAnchorElement]]]
  @scala.inline
  def Blockquote: ComponentType[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]] = typings.blueprintjsCore.mod.Blockquote.asInstanceOf[ComponentType[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]]]
  @scala.inline
  def Breadcrumb: ComponentType[BreadcrumbProps] = typings.blueprintjsCore.mod.Breadcrumb.asInstanceOf[ComponentType[BreadcrumbProps]]
  @scala.inline
  def Breadcrumbs: ComponentType[BreadcrumbsProps] = js.constructorOf[typings.blueprintjsCore.mod.Breadcrumbs].asInstanceOf[ComponentType[BreadcrumbsProps]]
  @scala.inline
  def Button: ComponentType[IButtonProps with ButtonHTMLAttributes[HTMLButtonElement]] = js.constructorOf[typings.blueprintjsCore.mod.Button].asInstanceOf[ComponentType[IButtonProps with ButtonHTMLAttributes[HTMLButtonElement]]]
  @scala.inline
  def ButtonGroup: ComponentType[ButtonGroupProps] = js.constructorOf[typings.blueprintjsCore.mod.ButtonGroup].asInstanceOf[ComponentType[ButtonGroupProps]]
  @scala.inline
  def Callout: ComponentType[CalloutProps] = js.constructorOf[typings.blueprintjsCore.mod.Callout].asInstanceOf[ComponentType[CalloutProps]]
  @scala.inline
  def Card: ComponentType[CardProps] = js.constructorOf[typings.blueprintjsCore.mod.Card].asInstanceOf[ComponentType[CardProps]]
  @scala.inline
  def Checkbox: ComponentType[CheckboxProps] = js.constructorOf[typings.blueprintjsCore.mod.Checkbox].asInstanceOf[ComponentType[CheckboxProps]]
  @scala.inline
  def Code: ComponentType[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]] = typings.blueprintjsCore.mod.Code.asInstanceOf[ComponentType[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]]]
  @scala.inline
  def Collapse: ComponentType[CollapseProps] = js.constructorOf[typings.blueprintjsCore.mod.Collapse].asInstanceOf[ComponentType[CollapseProps]]
  @scala.inline
  def CollapsibleList: ComponentType[CollapsibleListProps] = js.constructorOf[typings.blueprintjsCore.mod.CollapsibleList].asInstanceOf[ComponentType[CollapsibleListProps]]
  @scala.inline
  def ControlGroup: ComponentType[ControlGroupProps] = js.constructorOf[typings.blueprintjsCore.mod.ControlGroup].asInstanceOf[ComponentType[ControlGroupProps]]
  @scala.inline
  def Dialog: ComponentType[DialogProps] = js.constructorOf[typings.blueprintjsCore.mod.Dialog].asInstanceOf[ComponentType[DialogProps]]
  @scala.inline
  def Divider: ComponentType[DividerProps] = js.constructorOf[typings.blueprintjsCore.mod.Divider].asInstanceOf[ComponentType[DividerProps]]
  @scala.inline
  def Drawer: ComponentType[DrawerProps] = js.constructorOf[typings.blueprintjsCore.mod.Drawer].asInstanceOf[ComponentType[DrawerProps]]
  @scala.inline
  def EditableText: ComponentType[EditableTextProps] = js.constructorOf[typings.blueprintjsCore.mod.EditableText].asInstanceOf[ComponentType[EditableTextProps]]
  @scala.inline
  def Expander: ComponentType[js.Object] = typings.blueprintjsCore.mod.Expander.asInstanceOf[ComponentType[js.Object]]
  @scala.inline
  def FileInput: ComponentType[FileInputProps] = js.constructorOf[typings.blueprintjsCore.mod.FileInput].asInstanceOf[ComponentType[FileInputProps]]
  @scala.inline
  def FormGroup: ComponentType[FormGroupProps] = js.constructorOf[typings.blueprintjsCore.mod.FormGroup].asInstanceOf[ComponentType[FormGroupProps]]
  @scala.inline
  def H1: ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = typings.blueprintjsCore.mod.H1.asInstanceOf[ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]]]
  @scala.inline
  def H2: ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = typings.blueprintjsCore.mod.H2.asInstanceOf[ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]]]
  @scala.inline
  def H3: ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = typings.blueprintjsCore.mod.H3.asInstanceOf[ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]]]
  @scala.inline
  def H4: ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = typings.blueprintjsCore.mod.H4.asInstanceOf[ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]]]
  @scala.inline
  def H5: ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = typings.blueprintjsCore.mod.H5.asInstanceOf[ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]]]
  @scala.inline
  def H6: ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]] = typings.blueprintjsCore.mod.H6.asInstanceOf[ComponentType[HTMLProps[HTMLHeadingElement] with IElementRefProps[HTMLHeadingElement]]]
  @scala.inline
  def HTMLSelect: ComponentType[HTMLSelectProps] = js.constructorOf[typings.blueprintjsCore.mod.HTMLSelect].asInstanceOf[ComponentType[HTMLSelectProps]]
  @scala.inline
  def HTMLTable: ComponentType[HTMLTableProps] = js.constructorOf[typings.blueprintjsCore.mod.HTMLTable].asInstanceOf[ComponentType[HTMLTableProps]]
  @scala.inline
  def Handle: ComponentType[HandleProps] = js.constructorOf[typings.blueprintjsCore.handleMod.Handle].asInstanceOf[ComponentType[HandleProps]]
  @scala.inline
  def Hotkey: ComponentType[HotkeyProps] = js.constructorOf[typings.blueprintjsCore.mod.Hotkey].asInstanceOf[ComponentType[HotkeyProps]]
  @scala.inline
  def Hotkeys: ComponentType[HotkeysProps] = js.constructorOf[typings.blueprintjsCore.mod.Hotkeys].asInstanceOf[ComponentType[HotkeysProps]]
  @scala.inline
  def Icon: ComponentType[IIconProps with DOMAttributes[HTMLElement]] = js.constructorOf[typings.blueprintjsCore.mod.Icon].asInstanceOf[ComponentType[IIconProps with DOMAttributes[HTMLElement]]]
  @scala.inline
  def InputGroup: ComponentType[IInputGroupProps with HTMLInputProps] = js.constructorOf[typings.blueprintjsCore.mod.InputGroup].asInstanceOf[ComponentType[IInputGroupProps with HTMLInputProps]]
  @scala.inline
  def KeyCombo: ComponentType[KeyComboProps] = js.constructorOf[typings.blueprintjsCore.mod.KeyCombo].asInstanceOf[ComponentType[KeyComboProps]]
  @scala.inline
  def Label: ComponentType[HTMLProps[HTMLLabelElement] with IElementRefProps[HTMLLabelElement]] = typings.blueprintjsCore.mod.Label.asInstanceOf[ComponentType[HTMLProps[HTMLLabelElement] with IElementRefProps[HTMLLabelElement]]]
  @scala.inline
  def Menu: ComponentType[MenuProps] = js.constructorOf[typings.blueprintjsCore.mod.Menu].asInstanceOf[ComponentType[MenuProps]]
  @scala.inline
  def MenuDivider: ComponentType[MenuDividerProps] = js.constructorOf[typings.blueprintjsCore.mod.MenuDivider].asInstanceOf[ComponentType[MenuDividerProps]]
  @scala.inline
  def MenuItem: ComponentType[IMenuItemProps with AnchorHTMLAttributes[HTMLAnchorElement]] = js.constructorOf[typings.blueprintjsCore.mod.MenuItem].asInstanceOf[ComponentType[IMenuItemProps with AnchorHTMLAttributes[HTMLAnchorElement]]]
  @scala.inline
  def MultiSlider: ComponentType[MultiSliderProps] = js.constructorOf[typings.blueprintjsCore.mod.MultiSlider].asInstanceOf[ComponentType[MultiSliderProps]]
  @scala.inline
  def MultiSliderHandle: ComponentType[MultiSliderHandleProps] = Handle.asInstanceOf[ComponentType[MultiSliderHandleProps]]
  @scala.inline
  def Navbar: ComponentType[NavbarProps] = js.constructorOf[typings.blueprintjsCore.mod.Navbar].asInstanceOf[ComponentType[NavbarProps]]
  @scala.inline
  def NavbarDivider: ComponentType[NavbarDividerProps] = js.constructorOf[typings.blueprintjsCore.mod.NavbarDivider].asInstanceOf[ComponentType[NavbarDividerProps]]
  @scala.inline
  def NavbarGroup: ComponentType[NavbarGroupProps] = js.constructorOf[typings.blueprintjsCore.mod.NavbarGroup].asInstanceOf[ComponentType[NavbarGroupProps]]
  @scala.inline
  def NavbarHeading: ComponentType[NavbarHeadingProps] = js.constructorOf[typings.blueprintjsCore.mod.NavbarHeading].asInstanceOf[ComponentType[NavbarHeadingProps]]
  @scala.inline
  def NonIdealState: ComponentType[NonIdealStateProps] = js.constructorOf[typings.blueprintjsCore.mod.NonIdealState].asInstanceOf[ComponentType[NonIdealStateProps]]
  @scala.inline
  def NumericInput: ComponentType[HTMLInputProps with INumericInputProps] = js.constructorOf[typings.blueprintjsCore.mod.NumericInput].asInstanceOf[ComponentType[HTMLInputProps with INumericInputProps]]
  @scala.inline
  def OL: ComponentType[HTMLProps[HTMLOListElement] with IElementRefProps[HTMLOListElement]] = typings.blueprintjsCore.mod.OL.asInstanceOf[ComponentType[HTMLProps[HTMLOListElement] with IElementRefProps[HTMLOListElement]]]
  @scala.inline
  def OverflowList[T]: ComponentType[OverflowListProps[T]] = js.constructorOf[typings.blueprintjsCore.mod.OverflowList[T]].asInstanceOf[ComponentType[OverflowListProps[T]]]
  @scala.inline
  def Overlay: ComponentType[OverlayProps] = js.constructorOf[typings.blueprintjsCore.mod.Overlay].asInstanceOf[ComponentType[OverlayProps]]
  @scala.inline
  def PanelStack: ComponentType[PanelStackProps] = js.constructorOf[typings.blueprintjsCore.mod.PanelStack].asInstanceOf[ComponentType[PanelStackProps]]
  @scala.inline
  def PanelView: ComponentType[PanelViewProps] = js.constructorOf[typings.blueprintjsCore.panelViewMod.PanelView].asInstanceOf[ComponentType[PanelViewProps]]
  @scala.inline
  def Popover: ComponentType[PopoverProps] = js.constructorOf[typings.blueprintjsCore.mod.Popover].asInstanceOf[ComponentType[PopoverProps]]
  @scala.inline
  def PopoverArrow: ComponentType[PopoverArrowProps] = typings.blueprintjsCore.popoverArrowMod.PopoverArrow.asInstanceOf[ComponentType[PopoverArrowProps]]
  @scala.inline
  def Portal: ComponentType[PortalProps] = js.constructorOf[typings.blueprintjsCore.mod.Portal].asInstanceOf[ComponentType[PortalProps]]
  @scala.inline
  def Pre: ComponentType[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]] = typings.blueprintjsCore.mod.Pre.asInstanceOf[ComponentType[HTMLProps[HTMLElement] with IElementRefProps[HTMLElement]]]
  @scala.inline
  def ProgressBar: ComponentType[ProgressBarProps] = js.constructorOf[typings.blueprintjsCore.mod.ProgressBar].asInstanceOf[ComponentType[ProgressBarProps]]
  @scala.inline
  def Radio: ComponentType[RadioProps] = js.constructorOf[typings.blueprintjsCore.mod.Radio].asInstanceOf[ComponentType[RadioProps]]
  @scala.inline
  def RadioGroup: ComponentType[RadioGroupProps] = js.constructorOf[typings.blueprintjsCore.mod.RadioGroup].asInstanceOf[ComponentType[RadioGroupProps]]
  @scala.inline
  def RangeSlider: ComponentType[RangeSliderProps] = js.constructorOf[typings.blueprintjsCore.mod.RangeSlider].asInstanceOf[ComponentType[RangeSliderProps]]
  @scala.inline
  def ResizeSensor: ComponentType[ResizeSensorProps] = js.constructorOf[typings.blueprintjsCore.mod.ResizeSensor].asInstanceOf[ComponentType[ResizeSensorProps]]
  @scala.inline
  def Slider: ComponentType[SliderProps] = js.constructorOf[typings.blueprintjsCore.mod.Slider].asInstanceOf[ComponentType[SliderProps]]
  @scala.inline
  def Spinner: ComponentType[SpinnerProps] = js.constructorOf[typings.blueprintjsCore.mod.Spinner].asInstanceOf[ComponentType[SpinnerProps]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = js.constructorOf[typings.blueprintjsCore.mod.Switch].asInstanceOf[ComponentType[SwitchProps]]
  @scala.inline
  def Tab: ComponentType[TabProps] = js.constructorOf[typings.blueprintjsCore.mod.Tab].asInstanceOf[ComponentType[TabProps]]
  @scala.inline
  def TabTitle: ComponentType[TabTitleProps] = js.constructorOf[typings.blueprintjsCore.tabTitleMod.TabTitle].asInstanceOf[ComponentType[TabTitleProps]]
  @scala.inline
  def Tabs: ComponentType[TabsProps] = js.constructorOf[typings.blueprintjsCore.mod.Tabs].asInstanceOf[ComponentType[TabsProps]]
  @scala.inline
  def TabsExpander: ComponentType[js.Object] = Expander.asInstanceOf[ComponentType[js.Object]]
  @scala.inline
  def Tag: ComponentType[TagProps] = js.constructorOf[typings.blueprintjsCore.mod.Tag].asInstanceOf[ComponentType[TagProps]]
  @scala.inline
  def TagInput: ComponentType[TagInputProps] = js.constructorOf[typings.blueprintjsCore.mod.TagInput].asInstanceOf[ComponentType[TagInputProps]]
  @scala.inline
  def Text: ComponentType[TextProps] = js.constructorOf[typings.blueprintjsCore.mod.Text].asInstanceOf[ComponentType[TextProps]]
  @scala.inline
  def TextArea: ComponentType[TextAreaProps] = js.constructorOf[typings.blueprintjsCore.mod.TextArea].asInstanceOf[ComponentType[TextAreaProps]]
  @scala.inline
  def Toast: ComponentType[ToastProps] = js.constructorOf[typings.blueprintjsCore.mod.Toast].asInstanceOf[ComponentType[ToastProps]]
  @scala.inline
  def Toaster: ComponentType[ToasterProps] = js.constructorOf[typings.blueprintjsCore.mod.Toaster].asInstanceOf[ComponentType[ToasterProps]]
  @scala.inline
  def Tooltip: ComponentType[TooltipProps] = js.constructorOf[typings.blueprintjsCore.mod.Tooltip].asInstanceOf[ComponentType[TooltipProps]]
  @scala.inline
  def Tree[T]: ComponentType[TreeProps[T]] = js.constructorOf[typings.blueprintjsCore.mod.Tree[T]].asInstanceOf[ComponentType[TreeProps[T]]]
  @scala.inline
  def TreeNode[T]: ComponentType[TreeNodeProps[T]] = js.constructorOf[typings.blueprintjsCore.mod.TreeNode[T]].asInstanceOf[ComponentType[TreeNodeProps[T]]]
  @scala.inline
  def UL: ComponentType[HTMLProps[HTMLUListElement] with IElementRefProps[HTMLUListElement]] = typings.blueprintjsCore.mod.UL.asInstanceOf[ComponentType[HTMLProps[HTMLUListElement] with IElementRefProps[HTMLUListElement]]]
}

