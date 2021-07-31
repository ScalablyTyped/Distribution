package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inlineLoadingInlineLoadingMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/InlineLoading/InlineLoading", JSImport.Default)
  @js.native
  val default: FC[InlineLoadingProps] = js.native
  
  trait InlineLoadingProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var iconDescription: js.UndefOr[String] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var status: js.UndefOr[InlineLoadingStatus] = js.undefined
    
    /**
      * @deprecated
      */
    var success: js.UndefOr[Boolean] = js.undefined
    
    var successDelay: js.UndefOr[Double] = js.undefined
  }
  object InlineLoadingProps {
    
    @scala.inline
    def apply(): InlineLoadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineLoadingProps]
    }
    
    @scala.inline
    implicit class InlineLoadingPropsMutableBuilder[Self <: InlineLoadingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIconDescription(value: String): Self = StObject.set(x, "iconDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconDescriptionUndefined: Self = StObject.set(x, "iconDescription", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      @scala.inline
      def setStatus(value: InlineLoadingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessDelay(value: Double): Self = StObject.set(x, "successDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessDelayUndefined: Self = StObject.set(x, "successDelay", js.undefined)
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.active
    - typings.carbonComponentsReact.carbonComponentsReactStrings.error
    - typings.carbonComponentsReact.carbonComponentsReactStrings.finished
    - typings.carbonComponentsReact.carbonComponentsReactStrings.inactive
  */
  trait InlineLoadingStatus extends StObject
  object InlineLoadingStatus {
    
    @scala.inline
    def active: typings.carbonComponentsReact.carbonComponentsReactStrings.active = "active".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.active]
    
    @scala.inline
    def error: typings.carbonComponentsReact.carbonComponentsReactStrings.error = "error".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.error]
    
    @scala.inline
    def finished: typings.carbonComponentsReact.carbonComponentsReactStrings.finished = "finished".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.finished]
    
    @scala.inline
    def inactive: typings.carbonComponentsReact.carbonComponentsReactStrings.inactive = "inactive".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.inactive]
  }
  
  type _To = FC[InlineLoadingProps]
  
  /* This means you don't have to write `default`, but can instead just say `inlineLoadingInlineLoadingMod.foo` */
  override def _to: FC[InlineLoadingProps] = default
}
