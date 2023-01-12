package typings.baseui

import typings.baseui.anon.PlacementContainerOverrid
import typings.baseui.anon.SizeNumber
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarTypesMod {
  
  type Duration = Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.topLeft
    - typings.baseui.baseuiStrings.top
    - typings.baseui.baseuiStrings.topRight
    - typings.baseui.baseuiStrings.bottomLeft
    - typings.baseui.baseuiStrings.bottom
    - typings.baseui.baseuiStrings.bottomRight
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typings.baseui.baseuiStrings.bottom = "bottom".asInstanceOf[typings.baseui.baseuiStrings.bottom]
    
    inline def bottomLeft: typings.baseui.baseuiStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.baseui.baseuiStrings.bottomLeft]
    
    inline def bottomRight: typings.baseui.baseuiStrings.bottomRight = "bottomRight".asInstanceOf[typings.baseui.baseuiStrings.bottomRight]
    
    inline def top: typings.baseui.baseuiStrings.top = "top".asInstanceOf[typings.baseui.baseuiStrings.top]
    
    inline def topLeft: typings.baseui.baseuiStrings.topLeft = "topLeft".asInstanceOf[typings.baseui.baseuiStrings.topLeft]
    
    inline def topRight: typings.baseui.baseuiStrings.topRight = "topRight".asInstanceOf[typings.baseui.baseuiStrings.topRight]
  }
  
  trait SnackbarElementOverrides extends StObject {
    
    var ActionButtonContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Content: js.UndefOr[Override[Any]] = js.undefined
    
    var Message: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Spinner: js.UndefOr[Override[Any]] = js.undefined
    
    var StartEnhancerContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var WrapActionButtonContainer: js.UndefOr[Override[Any]] = js.undefined
  }
  object SnackbarElementOverrides {
    
    inline def apply(): SnackbarElementOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackbarElementOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnackbarElementOverrides] (val x: Self) extends AnyVal {
      
      inline def setActionButtonContainer(value: Override[Any]): Self = StObject.set(x, "ActionButtonContainer", value.asInstanceOf[js.Any])
      
      inline def setActionButtonContainerUndefined: Self = StObject.set(x, "ActionButtonContainer", js.undefined)
      
      inline def setContent(value: Override[Any]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setMessage(value: Override[Any]): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setSpinner(value: Override[Any]): Self = StObject.set(x, "Spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "Spinner", js.undefined)
      
      inline def setStartEnhancerContainer(value: Override[Any]): Self = StObject.set(x, "StartEnhancerContainer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerContainerUndefined: Self = StObject.set(x, "StartEnhancerContainer", js.undefined)
      
      inline def setWrapActionButtonContainer(value: Override[Any]): Self = StObject.set(x, "WrapActionButtonContainer", value.asInstanceOf[js.Any])
      
      inline def setWrapActionButtonContainerUndefined: Self = StObject.set(x, "WrapActionButtonContainer", js.undefined)
    }
  }
  
  trait SnackbarElementProps extends StObject {
    
    var actionMessage: js.UndefOr[String] = js.undefined
    
    var actionOnClick: js.UndefOr[js.Function1[/* a */ SyntheticEvent[HTMLButtonElement, Event], Any]] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var message: ReactNode
    
    var overrides: js.UndefOr[SnackbarElementOverrides] = js.undefined
    
    var progress: js.UndefOr[Boolean] = js.undefined
    
    var startEnhancer: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
  }
  object SnackbarElementProps {
    
    inline def apply(): SnackbarElementProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackbarElementProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnackbarElementProps] (val x: Self) extends AnyVal {
      
      inline def setActionMessage(value: String): Self = StObject.set(x, "actionMessage", value.asInstanceOf[js.Any])
      
      inline def setActionMessageUndefined: Self = StObject.set(x, "actionMessage", js.undefined)
      
      inline def setActionOnClick(value: /* a */ SyntheticEvent[HTMLButtonElement, Event] => Any): Self = StObject.set(x, "actionOnClick", js.Any.fromFunction1(value))
      
      inline def setActionOnClickUndefined: Self = StObject.set(x, "actionOnClick", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOverrides(value: SnackbarElementOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setStartEnhancer(value: ComponentType[SizeNumber]): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
    }
  }
  
  trait SnackbarProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var defaultDuration: js.UndefOr[Duration] = js.undefined
    
    var overrides: js.UndefOr[PlacementContainerOverrid] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
  }
  object SnackbarProviderProps {
    
    inline def apply(): SnackbarProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackbarProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnackbarProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultDuration(value: Duration): Self = StObject.set(x, "defaultDuration", value.asInstanceOf[js.Any])
      
      inline def setDefaultDurationUndefined: Self = StObject.set(x, "defaultDuration", js.undefined)
      
      inline def setOverrides(value: PlacementContainerOverrid): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
}
