package typings.carbonComponents

import typings.carbonComponents.anon.PartialCheckboxOptions
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCheckboxCheckboxMod {
  
  @JSImport("carbon-components/components/checkbox/checkbox", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Checkbox {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialCheckboxOptions) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/checkbox/checkbox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/checkbox/checkbox", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object stateChangeTypes {
      
      @JSImport("carbon-components/components/checkbox/checkbox", "default.stateChangeTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/checkbox/checkbox", "default.stateChangeTypes.false")
      @js.native
      val `false`: String = js.native
      
      @JSImport("carbon-components/components/checkbox/checkbox", "default.stateChangeTypes.mixed")
      @js.native
      def mixed: String = js.native
      inline def mixed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mixed")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/checkbox/checkbox", "default.stateChangeTypes.true")
      @js.native
      val `true`: String = js.native
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait Checkbox extends StObject {
    
    def _handleBlur(): Unit = js.native
    
    def _handleClick(): Unit = js.native
    
    def _handleFocus(): Unit = js.native
    
    def _indeterminateCheckbox(): Unit = js.native
    
    def _initCheckbox(): Unit = js.native
    
    def setDisabled(): Unit = js.native
    def setDisabled(value: String): Unit = js.native
    def setDisabled(value: Boolean): Unit = js.native
    
    def setState(): Unit = js.native
    def setState(state: String): Unit = js.native
    def setState(state: Boolean): Unit = js.native
  }
  
  trait CheckboxOptions extends StObject {
    
    var attribContainedCheckboxDisabled: String
    
    var attribContainedCheckboxState: String
    
    var classLabel: String
    
    var classLabelFocused: String
    
    var selectorContainedCheckboxDisabled: String
    
    var selectorContainedCheckboxState: String
    
    var selectorInit: String
  }
  object CheckboxOptions {
    
    inline def apply(
      attribContainedCheckboxDisabled: String,
      attribContainedCheckboxState: String,
      classLabel: String,
      classLabelFocused: String,
      selectorContainedCheckboxDisabled: String,
      selectorContainedCheckboxState: String,
      selectorInit: String
    ): CheckboxOptions = {
      val __obj = js.Dynamic.literal(attribContainedCheckboxDisabled = attribContainedCheckboxDisabled.asInstanceOf[js.Any], attribContainedCheckboxState = attribContainedCheckboxState.asInstanceOf[js.Any], classLabel = classLabel.asInstanceOf[js.Any], classLabelFocused = classLabelFocused.asInstanceOf[js.Any], selectorContainedCheckboxDisabled = selectorContainedCheckboxDisabled.asInstanceOf[js.Any], selectorContainedCheckboxState = selectorContainedCheckboxState.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxOptions] (val x: Self) extends AnyVal {
      
      inline def setAttribContainedCheckboxDisabled(value: String): Self = StObject.set(x, "attribContainedCheckboxDisabled", value.asInstanceOf[js.Any])
      
      inline def setAttribContainedCheckboxState(value: String): Self = StObject.set(x, "attribContainedCheckboxState", value.asInstanceOf[js.Any])
      
      inline def setClassLabel(value: String): Self = StObject.set(x, "classLabel", value.asInstanceOf[js.Any])
      
      inline def setClassLabelFocused(value: String): Self = StObject.set(x, "classLabelFocused", value.asInstanceOf[js.Any])
      
      inline def setSelectorContainedCheckboxDisabled(value: String): Self = StObject.set(x, "selectorContainedCheckboxDisabled", value.asInstanceOf[js.Any])
      
      inline def setSelectorContainedCheckboxState(value: String): Self = StObject.set(x, "selectorContainedCheckboxState", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    }
  }
}
