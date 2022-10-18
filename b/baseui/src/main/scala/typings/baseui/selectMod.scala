package typings.baseui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.Disabled
import typings.baseui.anon.DisabledIsFocusVisible
import typings.baseui.anon.InputRef
import typings.baseui.anon.PartialSelectProps
import typings.baseui.anon.PartialdefaultProps
import typings.baseui.anon.PartialfilterOptionoption
import typings.baseui.anon.Readonlyxstringanyidstrin
import typings.baseui.anon.TypeofSelectComponent
import typings.baseui.anon.ValueArray
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.input
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.select
import typings.baseui.baseuiStrings.svg
import typings.baseui.baseuiStrings.ul
import typings.baseui.selectAutosizeInputMod.default
import typings.baseui.selectTypesMod.Optgroups
import typings.baseui.selectTypesMod.Options
import typings.baseui.selectTypesMod.SelectProps
import typings.baseui.selectTypesMod.SharedStylePropsArg
import typings.baseui.selectTypesMod.StateReducer
import typings.baseui.selectTypesMod.StatefulSelectProps
import typings.baseui.selectTypesMod.Value
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("baseui/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/select", "AutosizeInput")
  @js.native
  open class AutosizeInput () extends default
  /* static members */
  object AutosizeInput {
    
    @JSImport("baseui/select", "AutosizeInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/select", "AutosizeInput.defaultProps")
    @js.native
    def defaultProps: InputRef = js.native
    inline def defaultProps_=(x: InputRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def MultiSelect(props: PartialSelectProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiSelect")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MultiValue(props: Any): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValue")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/select", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/select", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/select", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/select", "SIZE.mini")
    @js.native
    val mini: typings.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  /* Inlined std.Readonly<{ readonly select :'select',  readonly remove :'remove',  readonly clear :'clear'}> */
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/select", "STATE_CHANGE_TYPE.clear")
    @js.native
    val clear: typings.baseui.baseuiStrings.clear = js.native
    
    @JSImport("baseui/select", "STATE_CHANGE_TYPE.remove")
    @js.native
    val remove: typings.baseui.baseuiStrings.remove = js.native
    
    @JSImport("baseui/select", "STATE_CHANGE_TYPE.select")
    @js.native
    val select: typings.baseui.baseuiStrings.select = js.native
  }
  
  inline def Select(
    props: ComponentProps[
      (Instantiable1[/* props */ SelectProps, typings.baseui.selectSelectComponentMod.default]) & TypeofSelectComponent
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Select")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/select", "SelectDropdown")
  @js.native
  open class SelectDropdown ()
    extends typings.baseui.selectDropdownMod.default
  
  inline def SingleSelect(props: PartialSelectProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SingleSelect")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SingleValue(props: Any): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SingleValue")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object StatefulSelect {
    
    inline def apply(props: StatefulSelectProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/select", "StatefulSelect")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.aria-describedby")
      @js.native
      def ariaDescribedby: Any = js.native
      
      inline def ariaDescribedby_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.aria-errormessage")
      @js.native
      def ariaErrormessage: Any = js.native
      
      inline def ariaErrormessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.aria-label")
      @js.native
      def ariaLabel: Any = js.native
      
      inline def ariaLabel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.aria-labelledby")
      @js.native
      def ariaLabelledby: Any = js.native
      
      inline def ariaLabelledby_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.backspaceRemoves")
      @js.native
      def backspaceRemoves: Boolean = js.native
      inline def backspaceRemoves_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backspaceRemoves")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.clearable")
      @js.native
      def clearable: Boolean = js.native
      inline def clearable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.closeOnSelect")
      @js.native
      def closeOnSelect: Boolean = js.native
      inline def closeOnSelect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.creatable")
      @js.native
      def creatable: Boolean = js.native
      inline def creatable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("creatable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.deleteRemoves")
      @js.native
      def deleteRemoves: Boolean = js.native
      inline def deleteRemoves_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deleteRemoves")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.escapeClearsValue")
      @js.native
      def escapeClearsValue: Boolean = js.native
      inline def escapeClearsValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeClearsValue")(x.asInstanceOf[js.Any])
      
      inline def filterOptions(options: Value, filterValue: String): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
      inline def filterOptions(options: Value, filterValue: String, excludeOptions: Unit, newProps: PartialfilterOptionoption): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
      inline def filterOptions(options: Value, filterValue: String, excludeOptions: Value): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
      inline def filterOptions(options: Value, filterValue: String, excludeOptions: Value, newProps: PartialfilterOptionoption): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.filterOutSelected")
      @js.native
      def filterOutSelected: Boolean = js.native
      inline def filterOutSelected_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterOutSelected")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.getOptionLabel")
      @js.native
      def getOptionLabel: Any = js.native
      inline def getOptionLabel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOptionLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.getValueLabel")
      @js.native
      def getValueLabel: Any = js.native
      inline def getValueLabel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getValueLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.ignoreCase")
      @js.native
      def ignoreCase: Boolean = js.native
      inline def ignoreCase_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.isLoading")
      @js.native
      def isLoading: Boolean = js.native
      inline def isLoading_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.labelKey")
      @js.native
      def labelKey: String = js.native
      inline def labelKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.maxDropdownHeight")
      @js.native
      def maxDropdownHeight: String = js.native
      inline def maxDropdownHeight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDropdownHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.multi")
      @js.native
      def multi: Boolean = js.native
      inline def multi_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multi")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.onBlurResetsInput")
      @js.native
      def onBlurResetsInput: Boolean = js.native
      inline def onBlurResetsInput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlurResetsInput")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.onClose")
      @js.native
      def onClose: Any = js.native
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.onCloseResetsInput")
      @js.native
      def onCloseResetsInput: Boolean = js.native
      inline def onCloseResetsInput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCloseResetsInput")(x.asInstanceOf[js.Any])
      
      inline def onClose_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      inline def onInputChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onInputChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.onOpen")
      @js.native
      def onOpen: Any = js.native
      inline def onOpen_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.onSelectResetsInput")
      @js.native
      def onSelectResetsInput: Boolean = js.native
      inline def onSelectResetsInput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelectResetsInput")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.openOnClick")
      @js.native
      def openOnClick: Boolean = js.native
      inline def openOnClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openOnClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.options")
      @js.native
      def options: js.Array[Any] = js.native
      inline def options_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.positive")
      @js.native
      def positive: Boolean = js.native
      inline def positive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positive")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.searchable")
      @js.native
      def searchable: Boolean = js.native
      inline def searchable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("searchable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.size")
      @js.native
      def size: default_ = js.native
      inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.startOpen")
      @js.native
      def startOpen: Boolean = js.native
      inline def startOpen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.type")
      @js.native
      val `type`: select = js.native
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.value")
      @js.native
      def value: js.Array[Any] = js.native
      
      @JSImport("baseui/select", "StatefulSelect.defaultProps.valueKey")
      @js.native
      def valueKey: String = js.native
      inline def valueKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(x.asInstanceOf[js.Any])
      
      inline def value_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/select", "StatefulSelectContainer")
  @js.native
  open class StatefulSelectContainer ()
    extends typings.baseui.selectStatefulSelectContainerMod.default
  object StatefulSelectContainer {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/select", "StatefulSelectContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/select", "StatefulSelectContainer.defaultProps.initialState")
      @js.native
      def initialState: ValueArray = js.native
      inline def initialState_=(x: ValueArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/select", "StatefulSelectContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/select", "StyledClearIcon")
  @js.native
  val StyledClearIcon: StyletronComponent[svg, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledControlContainer")
  @js.native
  val StyledControlContainer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledDropdown")
  @js.native
  val StyledDropdown: StyletronComponent[ul, DisabledIsFocusVisible] = js.native
  
  @JSImport("baseui/select", "StyledDropdownContainer")
  @js.native
  val StyledDropdownContainer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledDropdownListItem")
  @js.native
  val StyledDropdownListItem: StyletronComponent[li_, Disabled] = js.native
  
  @JSImport("baseui/select", "StyledIconsContainer")
  @js.native
  val StyledIconsContainer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledInput")
  @js.native
  val StyledInput: StyletronComponent[input, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledInputContainer")
  @js.native
  val StyledInputContainer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledInputSizer")
  @js.native
  val StyledInputSizer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledOptionContent")
  @js.native
  val StyledOptionContent: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledPlaceholder")
  @js.native
  val StyledPlaceholder: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledSearchIconContainer")
  @js.native
  val StyledSearchIconContainer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledSelectArrow")
  @js.native
  val StyledSelectArrow: StyletronComponent[svg, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledSingleValue")
  @js.native
  val StyledSingleValue: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/select", "StyledValueContainer")
  @js.native
  val StyledValueContainer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  object TYPE {
    
    @JSImport("baseui/select", "TYPE.search")
    @js.native
    val search: typings.baseui.baseuiStrings.search = js.native
    
    @JSImport("baseui/select", "TYPE.select")
    @js.native
    val select: typings.baseui.baseuiStrings.select = js.native
  }
  
  inline def filterOptions(options: Value, filterValue: String): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
  inline def filterOptions(options: Value, filterValue: String, excludeOptions: Null, newProps: PartialdefaultProps): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
  inline def filterOptions(options: Value, filterValue: String, excludeOptions: Unit, newProps: PartialdefaultProps): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
  inline def filterOptions(options: Value, filterValue: String, excludeOptions: Value): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
  inline def filterOptions(options: Value, filterValue: String, excludeOptions: Value, newProps: PartialdefaultProps): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
  
  type OptgroupsT = Optgroups
  
  type OptionsT = Options
}
