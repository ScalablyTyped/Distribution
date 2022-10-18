package typings.baseui

import typings.baseui.anon.PartialfilterOptionoption
import typings.baseui.anon.Readonlyxstringanyidstrin
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.select
import typings.baseui.selectTypesMod.StatefulSelectProps
import typings.baseui.selectTypesMod.Value
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectStatefulSelectMod {
  
  object default {
    
    inline def apply(props: StatefulSelectProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/select/stateful-select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.aria-describedby")
      @js.native
      def ariaDescribedby: Any = js.native
      
      inline def ariaDescribedby_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.aria-errormessage")
      @js.native
      def ariaErrormessage: Any = js.native
      
      inline def ariaErrormessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.aria-label")
      @js.native
      def ariaLabel: Any = js.native
      
      inline def ariaLabel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.aria-labelledby")
      @js.native
      def ariaLabelledby: Any = js.native
      
      inline def ariaLabelledby_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.backspaceRemoves")
      @js.native
      def backspaceRemoves: Boolean = js.native
      inline def backspaceRemoves_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backspaceRemoves")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.clearable")
      @js.native
      def clearable: Boolean = js.native
      inline def clearable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.closeOnSelect")
      @js.native
      def closeOnSelect: Boolean = js.native
      inline def closeOnSelect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.creatable")
      @js.native
      def creatable: Boolean = js.native
      inline def creatable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("creatable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.deleteRemoves")
      @js.native
      def deleteRemoves: Boolean = js.native
      inline def deleteRemoves_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deleteRemoves")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.escapeClearsValue")
      @js.native
      def escapeClearsValue: Boolean = js.native
      inline def escapeClearsValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeClearsValue")(x.asInstanceOf[js.Any])
      
      inline def filterOptions(options: Value, filterValue: String): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
      inline def filterOptions(options: Value, filterValue: String, excludeOptions: Unit, newProps: PartialfilterOptionoption): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
      inline def filterOptions(options: Value, filterValue: String, excludeOptions: Value): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
      inline def filterOptions(options: Value, filterValue: String, excludeOptions: Value, newProps: PartialfilterOptionoption): js.Array[Readonlyxstringanyidstrin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(options.asInstanceOf[js.Any], filterValue.asInstanceOf[js.Any], excludeOptions.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Readonlyxstringanyidstrin]]
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.filterOutSelected")
      @js.native
      def filterOutSelected: Boolean = js.native
      inline def filterOutSelected_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterOutSelected")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.getOptionLabel")
      @js.native
      def getOptionLabel: Any = js.native
      inline def getOptionLabel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOptionLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.getValueLabel")
      @js.native
      def getValueLabel: Any = js.native
      inline def getValueLabel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getValueLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.ignoreCase")
      @js.native
      def ignoreCase: Boolean = js.native
      inline def ignoreCase_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.isLoading")
      @js.native
      def isLoading: Boolean = js.native
      inline def isLoading_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.labelKey")
      @js.native
      def labelKey: String = js.native
      inline def labelKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.maxDropdownHeight")
      @js.native
      def maxDropdownHeight: String = js.native
      inline def maxDropdownHeight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDropdownHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.multi")
      @js.native
      def multi: Boolean = js.native
      inline def multi_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multi")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.onBlurResetsInput")
      @js.native
      def onBlurResetsInput: Boolean = js.native
      inline def onBlurResetsInput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlurResetsInput")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.onClose")
      @js.native
      def onClose: Any = js.native
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.onCloseResetsInput")
      @js.native
      def onCloseResetsInput: Boolean = js.native
      inline def onCloseResetsInput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCloseResetsInput")(x.asInstanceOf[js.Any])
      
      inline def onClose_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      inline def onInputChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onInputChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.onOpen")
      @js.native
      def onOpen: Any = js.native
      inline def onOpen_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.onSelectResetsInput")
      @js.native
      def onSelectResetsInput: Boolean = js.native
      inline def onSelectResetsInput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelectResetsInput")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.openOnClick")
      @js.native
      def openOnClick: Boolean = js.native
      inline def openOnClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openOnClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.options")
      @js.native
      def options: js.Array[Any] = js.native
      inline def options_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.positive")
      @js.native
      def positive: Boolean = js.native
      inline def positive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positive")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.searchable")
      @js.native
      def searchable: Boolean = js.native
      inline def searchable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("searchable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.size")
      @js.native
      def size: default_ = js.native
      inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.startOpen")
      @js.native
      def startOpen: Boolean = js.native
      inline def startOpen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.type")
      @js.native
      val `type`: select = js.native
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.value")
      @js.native
      def value: js.Array[Any] = js.native
      
      @JSImport("baseui/select/stateful-select", "default.defaultProps.valueKey")
      @js.native
      def valueKey: String = js.native
      inline def valueKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(x.asInstanceOf[js.Any])
      
      inline def value_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
}
