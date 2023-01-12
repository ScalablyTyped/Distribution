package typings.carbonComponents

import typings.carbonComponents.anon.PartialInlineLoadingOptio
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInlineLoadingInlineLoadingMod {
  
  @JSImport("carbon-components/components/inline-loading/inline-loading", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with InlineLoading {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialInlineLoadingOptio) = this()
    
    /* CompleteClass */
    override def setState(state: String): this.type = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/inline-loading/inline-loading", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/inline-loading/inline-loading", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object states {
      
      @JSImport("carbon-components/components/inline-loading/inline-loading", "default.states")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/inline-loading/inline-loading", "default.states.ACTIVE")
      @js.native
      def ACTIVE: String = js.native
      inline def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/inline-loading/inline-loading", "default.states.ERROR")
      @js.native
      def ERROR: String = js.native
      inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/inline-loading/inline-loading", "default.states.FINISHED")
      @js.native
      def FINISHED: String = js.native
      inline def FINISHED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINISHED")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/inline-loading/inline-loading", "default.states.INACTIVE")
      @js.native
      def INACTIVE: String = js.native
      inline def INACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INACTIVE")(x.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait InlineLoading extends StObject {
    
    def setState(state: String): this.type
  }
  object InlineLoading {
    
    inline def apply(setState: String => InlineLoading): InlineLoading = {
      val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[InlineLoading]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlineLoading] (val x: Self) extends AnyVal {
      
      inline def setSetState(value: String => InlineLoading): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
  
  trait InlineLoadingOptions extends StObject {
    
    var classLoadingStop: String
    
    var selectorError: String
    
    var selectorFinished: String
    
    var selectorInit: String
    
    var selectorSpinner: String
    
    var selectorTextActive: String
    
    var selectorTextError: String
    
    var selectorTextFinished: String
  }
  object InlineLoadingOptions {
    
    inline def apply(
      classLoadingStop: String,
      selectorError: String,
      selectorFinished: String,
      selectorInit: String,
      selectorSpinner: String,
      selectorTextActive: String,
      selectorTextError: String,
      selectorTextFinished: String
    ): InlineLoadingOptions = {
      val __obj = js.Dynamic.literal(classLoadingStop = classLoadingStop.asInstanceOf[js.Any], selectorError = selectorError.asInstanceOf[js.Any], selectorFinished = selectorFinished.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorSpinner = selectorSpinner.asInstanceOf[js.Any], selectorTextActive = selectorTextActive.asInstanceOf[js.Any], selectorTextError = selectorTextError.asInstanceOf[js.Any], selectorTextFinished = selectorTextFinished.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineLoadingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlineLoadingOptions] (val x: Self) extends AnyVal {
      
      inline def setClassLoadingStop(value: String): Self = StObject.set(x, "classLoadingStop", value.asInstanceOf[js.Any])
      
      inline def setSelectorError(value: String): Self = StObject.set(x, "selectorError", value.asInstanceOf[js.Any])
      
      inline def setSelectorFinished(value: String): Self = StObject.set(x, "selectorFinished", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorSpinner(value: String): Self = StObject.set(x, "selectorSpinner", value.asInstanceOf[js.Any])
      
      inline def setSelectorTextActive(value: String): Self = StObject.set(x, "selectorTextActive", value.asInstanceOf[js.Any])
      
      inline def setSelectorTextError(value: String): Self = StObject.set(x, "selectorTextError", value.asInstanceOf[js.Any])
      
      inline def setSelectorTextFinished(value: String): Self = StObject.set(x, "selectorTextFinished", value.asInstanceOf[js.Any])
    }
  }
}
