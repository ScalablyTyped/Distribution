package typings.blueprintjsCore

import typings.blueprintjsCore.blueprintjsCoreStrings.end
import typings.blueprintjsCore.blueprintjsCoreStrings.full
import typings.blueprintjsCore.blueprintjsCoreStrings.lock
import typings.blueprintjsCore.blueprintjsCoreStrings.none
import typings.blueprintjsCore.blueprintjsCoreStrings.push
import typings.blueprintjsCore.blueprintjsCoreStrings.start
import typings.blueprintjsCore.libEsmCommonIntentMod.Intent
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsSliderHandlePropsMod {
  
  /* Inlined {  LOCK :'lock',   PUSH :'push',   NONE :'none'}[keyof {  LOCK :'lock',   PUSH :'push',   NONE :'none'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsCore.blueprintjsCoreStrings.lock
    - typings.blueprintjsCore.blueprintjsCoreStrings.push
    - typings.blueprintjsCore.blueprintjsCoreStrings.none
  */
  trait HandleInteractionKind extends StObject
  object HandleInteractionKind {
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/handleProps", "HandleInteractionKind")
    @js.native
    val ^ : js.Any = js.native
    
    /** Locked handles prevent other handles from being dragged past then. */
    @JSImport("@blueprintjs/core/lib/esm/components/slider/handleProps", "HandleInteractionKind.LOCK")
    @js.native
    def LOCK: lock = js.native
    inline def LOCK_=(x: lock): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCK")(x.asInstanceOf[js.Any])
    
    /**
      * Handles marked "none" are not interactive and do not appear in the UI.
      * They serve only to break the track into subsections that can be colored separately.
      */
    @JSImport("@blueprintjs/core/lib/esm/components/slider/handleProps", "HandleInteractionKind.NONE")
    @js.native
    def NONE: none = js.native
    inline def NONE_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    /** Push handles move overlapping handles with them as they are dragged. */
    @JSImport("@blueprintjs/core/lib/esm/components/slider/handleProps", "HandleInteractionKind.PUSH")
    @js.native
    def PUSH: push = js.native
    inline def PUSH_=(x: push): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUSH")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {  FULL :'full',   START :'start',   END :'end'}[keyof {  FULL :'full',   START :'start',   END :'end'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsCore.blueprintjsCoreStrings.full
    - typings.blueprintjsCore.blueprintjsCoreStrings.start
    - typings.blueprintjsCore.blueprintjsCoreStrings.end
  */
  trait HandleType extends StObject
  object HandleType {
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/handleProps", "HandleType")
    @js.native
    val ^ : js.Any = js.native
    
    /** An end handle appears as the right or bottom half of a square. */
    @JSImport("@blueprintjs/core/lib/esm/components/slider/handleProps", "HandleType.END")
    @js.native
    def END: end = js.native
    inline def END_=(x: end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
    
    /** A full handle appears as a small square. */
    @JSImport("@blueprintjs/core/lib/esm/components/slider/handleProps", "HandleType.FULL")
    @js.native
    def FULL: full = js.native
    inline def FULL_=(x: full): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FULL")(x.asInstanceOf[js.Any])
    
    /** A start handle appears as the left or top half of a square. */
    @JSImport("@blueprintjs/core/lib/esm/components/slider/handleProps", "HandleType.START")
    @js.native
    def START: start = js.native
    inline def START_=(x: start): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("START")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Pick<react.react.HTMLProps<std.HTMLSpanElement>, 'aria-label' | 'aria-labelledby'> */
  trait HandleHtmlProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
  }
  object HandleHtmlProps {
    
    inline def apply(): HandleHtmlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleHtmlProps]
    }
    
    extension [Self <: HandleHtmlProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    }
  }
  
  type HandleProps = IHandleProps
  
  trait IHandleProps
    extends StObject
       with IProps {
    
    /**
      * A limited subset of HTML props to apply to the rendered `<span>` element.
      */
    var htmlProps: js.UndefOr[HandleHtmlProps] = js.undefined
    
    /** Intent for the track segment immediately after this handle, taking priority over `intentBefore`. */
    var intentAfter: js.UndefOr[Intent] = js.undefined
    
    /** Intent for the track segment immediately before this handle. */
    var intentBefore: js.UndefOr[Intent] = js.undefined
    
    /**
      * How this handle interacts with other handles.
      *
      * @default "lock"
      */
    var interactionKind: js.UndefOr[HandleInteractionKind] = js.undefined
    
    /**
      * Callback invoked when this handle's value is changed due to a drag
      * interaction. Note that "push" interactions can cause multiple handles to
      * update at the same time.
      */
    var onChange: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
    
    /** Callback invoked when this handle is released (the end of a drag interaction). */
    var onRelease: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
    
    /** Style to use for the track segment immediately after this handle, taking priority over `trackStyleBefore`. */
    var trackStyleAfter: js.UndefOr[CSSProperties] = js.undefined
    
    /** Style to use for the track segment immediately before this handle */
    var trackStyleBefore: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Handle appearance type.
      *
      * @default "full"
      */
    var `type`: js.UndefOr[HandleType] = js.undefined
    
    /** Numeric value of this handle. */
    var value: Double
  }
  object IHandleProps {
    
    inline def apply(value: Double): IHandleProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHandleProps]
    }
    
    extension [Self <: IHandleProps](x: Self) {
      
      inline def setHtmlProps(value: HandleHtmlProps): Self = StObject.set(x, "htmlProps", value.asInstanceOf[js.Any])
      
      inline def setHtmlPropsUndefined: Self = StObject.set(x, "htmlProps", js.undefined)
      
      inline def setIntentAfter(value: Intent): Self = StObject.set(x, "intentAfter", value.asInstanceOf[js.Any])
      
      inline def setIntentAfterUndefined: Self = StObject.set(x, "intentAfter", js.undefined)
      
      inline def setIntentBefore(value: Intent): Self = StObject.set(x, "intentBefore", value.asInstanceOf[js.Any])
      
      inline def setIntentBeforeUndefined: Self = StObject.set(x, "intentBefore", js.undefined)
      
      inline def setInteractionKind(value: HandleInteractionKind): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      inline def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
      
      inline def setOnChange(value: /* newValue */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnRelease(value: /* newValue */ Double => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
      
      inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
      
      inline def setTrackStyleAfter(value: CSSProperties): Self = StObject.set(x, "trackStyleAfter", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleAfterUndefined: Self = StObject.set(x, "trackStyleAfter", js.undefined)
      
      inline def setTrackStyleBefore(value: CSSProperties): Self = StObject.set(x, "trackStyleBefore", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleBeforeUndefined: Self = StObject.set(x, "trackStyleBefore", js.undefined)
      
      inline def setType(value: HandleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
