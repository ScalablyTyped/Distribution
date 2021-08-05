package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inlineLoadingMod {
  
  @JSImport("carbon-components/components/inline-loading/inline-loading", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with InlineLoading {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def setState(state: js.Any): this.type = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/inline-loading/inline-loading", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/inline-loading/inline-loading", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
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
    
    def setState(state: js.Any): this.type
  }
  object InlineLoading {
    
    inline def apply(setState: js.Any => InlineLoading): InlineLoading = {
      val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[InlineLoading]
    }
    
    extension [Self <: InlineLoading](x: Self) {
      
      inline def setSetState(value: js.Any => InlineLoading): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
}
