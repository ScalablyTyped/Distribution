package typings.baseui

import typings.baseui.anon.Dequeue
import typings.baseui.anon.Size
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarMod {
  
  @JSImport("baseui/snackbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/snackbar", "DURATION")
  @js.native
  val DURATION: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof DURATION */ js.Any = js.native
  
  @JSImport("baseui/snackbar", "PLACEMENT")
  @js.native
  val PLACEMENT: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof PLACEMENT */ js.Any = js.native
  
  @JSImport("baseui/snackbar", "SnackbarElement")
  @js.native
  val SnackbarElement: FC[SnackbarElementPropsT] = js.native
  
  @JSImport("baseui/snackbar", "SnackbarProvider")
  @js.native
  val SnackbarProvider: FC[SnackbarProviderPropsT] = js.native
  
  @scala.inline
  def useSnackbar(): Dequeue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSnackbar")().asInstanceOf[Dequeue]
  
  type DurationT = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DURATION.infinite */ js.Any
  
  type PlacementT = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PLACEMENT.topLeft */ js.Any
  
  trait SnackbarElementOverridesT extends StObject {
    
    var ActionButtonContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Content: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Message: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Spinner: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var StartEnhancerContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var WrapActionButtonContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object SnackbarElementOverridesT {
    
    @scala.inline
    def apply(): SnackbarElementOverridesT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackbarElementOverridesT]
    }
    
    @scala.inline
    implicit class SnackbarElementOverridesTMutableBuilder[Self <: SnackbarElementOverridesT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionButtonContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ActionButtonContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionButtonContainerUndefined: Self = StObject.set(x, "ActionButtonContainer", js.undefined)
      
      @scala.inline
      def setContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      @scala.inline
      def setMessage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setSpinner(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Spinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerUndefined: Self = StObject.set(x, "Spinner", js.undefined)
      
      @scala.inline
      def setStartEnhancerContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "StartEnhancerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnhancerContainerUndefined: Self = StObject.set(x, "StartEnhancerContainer", js.undefined)
      
      @scala.inline
      def setWrapActionButtonContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "WrapActionButtonContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapActionButtonContainerUndefined: Self = StObject.set(x, "WrapActionButtonContainer", js.undefined)
    }
  }
  
  trait SnackbarElementPropsT extends StObject {
    
    var actionMessage: js.UndefOr[String] = js.undefined
    
    var actionOnClick: js.UndefOr[
        js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], js.Any]
      ] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var message: String
    
    var overrides: js.UndefOr[SnackbarElementOverridesT] = js.undefined
    
    var progress: js.UndefOr[Boolean] = js.undefined
    
    var startEnhancer: js.UndefOr[FC[Size]] = js.undefined
  }
  object SnackbarElementPropsT {
    
    @scala.inline
    def apply(message: String): SnackbarElementPropsT = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnackbarElementPropsT]
    }
    
    @scala.inline
    implicit class SnackbarElementPropsTMutableBuilder[Self <: SnackbarElementPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionMessage(value: String): Self = StObject.set(x, "actionMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionMessageUndefined: Self = StObject.set(x, "actionMessage", js.undefined)
      
      @scala.inline
      def setActionOnClick(value: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => js.Any): Self = StObject.set(x, "actionOnClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionOnClickUndefined: Self = StObject.set(x, "actionOnClick", js.undefined)
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrides(value: SnackbarElementOverridesT): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setStartEnhancer(value: FC[Size]): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
    }
  }
  
  trait SnackbarProviderPropsT extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var defaultDuration: js.UndefOr[DurationT] = js.undefined
    
    var overrides: js.UndefOr[typings.baseui.anon.SnackbarElementOverridesT] = js.undefined
    
    var placement: js.UndefOr[PlacementT] = js.undefined
  }
  object SnackbarProviderPropsT {
    
    @scala.inline
    def apply(): SnackbarProviderPropsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackbarProviderPropsT]
    }
    
    @scala.inline
    implicit class SnackbarProviderPropsTMutableBuilder[Self <: SnackbarProviderPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultDuration(value: DurationT): Self = StObject.set(x, "defaultDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDurationUndefined: Self = StObject.set(x, "defaultDuration", js.undefined)
      
      @scala.inline
      def setOverrides(value: typings.baseui.anon.SnackbarElementOverridesT): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPlacement(value: PlacementT): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
}
