package typings.bootstrap

import typings.bootstrap.bootstrapBooleans.`false`
import typings.bootstrap.bootstrapStrings.`click focus`
import typings.bootstrap.bootstrapStrings.`click hover focus`
import typings.bootstrap.bootstrapStrings.`click hover`
import typings.bootstrap.bootstrapStrings.`hover focus`
import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.bottom
import typings.bootstrap.bootstrapStrings.carousel
import typings.bootstrap.bootstrapStrings.click
import typings.bootstrap.bootstrapStrings.dynamic
import typings.bootstrap.bootstrapStrings.focus
import typings.bootstrap.bootstrapStrings.hover
import typings.bootstrap.bootstrapStrings.inside
import typings.bootstrap.bootstrapStrings.left
import typings.bootstrap.bootstrapStrings.manual
import typings.bootstrap.bootstrapStrings.offset
import typings.bootstrap.bootstrapStrings.outside
import typings.bootstrap.bootstrapStrings.parent
import typings.bootstrap.bootstrapStrings.position
import typings.bootstrap.bootstrapStrings.right
import typings.bootstrap.bootstrapStrings.static
import typings.bootstrap.bootstrapStrings.toggle
import typings.bootstrap.bootstrapStrings.top
import typings.bootstrap.mod.global.Element
import typings.bootstrap.mod.global.JQuery
import typings.bootstrap.popoverMod.Popover.Options
import typings.bootstrap.popoverMod.Popover.PopperConfigFunction
import typings.bootstrap.tooltipMod.Tooltip.Offset
import typings.bootstrap.tooltipMod.Tooltip.OffsetFunction
import typings.popperjsCore.anon.PartialModifieranyany
import typings.popperjsCore.anon.PartialState
import typings.popperjsCore.enumsMod.Boundary
import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.typesMod.PositioningStrategy
import typings.popperjsCore.typesMod.Rect
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hide extends StObject {
    
    var hide: Double
    
    var show: Double
  }
  object Hide {
    
    inline def apply(hide: Double, show: Double): Hide = {
      val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hide]
    }
    
    extension [Self <: Hide](x: Self) {
      
      inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/carousel.Carousel.Options> */
  trait PartialOptions extends StObject {
    
    var interval: js.UndefOr[Double | `false`] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var pause: js.UndefOr[hover | `false`] = js.undefined
    
    var ride: js.UndefOr[carousel | Boolean] = js.undefined
    
    var touch: js.UndefOr[Boolean] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setInterval(value: Double | `false`): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setPause(value: hover | `false`): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setRide(value: carousel | Boolean): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
      
      inline def setRideUndefined: Self = StObject.set(x, "ride", js.undefined)
      
      inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/popover.Popover.Options> */
  trait PartialOptionsAllowList extends StObject {
    
    var allowList: js.UndefOr[RecordkeyofHTMLElementTag] = js.undefined
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    var container: js.UndefOr[String | Element | `false`] = js.undefined
    
    var content: js.UndefOr[
        String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
      ] = js.undefined
    
    var customClass: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var fallbackPlacement: js.UndefOr[js.Array[String]] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Offset | String | OffsetFunction] = js.undefined
    
    var placement: js.UndefOr[auto | top | bottom | left | right | js.Function0[Unit]] = js.undefined
    
    var popperConfig: js.UndefOr[Partial[Options] | PopperConfigFunction | Null] = js.undefined
    
    var sanitize: js.UndefOr[Boolean] = js.undefined
    
    var sanitizeFn: js.UndefOr[js.Function0[Unit | Null]] = js.undefined
    
    var selector: js.UndefOr[String | `false`] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[
        String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
      ] = js.undefined
    
    var trigger: js.UndefOr[
        click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`)
      ] = js.undefined
  }
  object PartialOptionsAllowList {
    
    inline def apply(): PartialOptionsAllowList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsAllowList]
    }
    
    extension [Self <: PartialOptionsAllowList](x: Self) {
      
      inline def setAllowList(value: RecordkeyofHTMLElementTag): Self = StObject.set(x, "allowList", value.asInstanceOf[js.Any])
      
      inline def setAllowListUndefined: Self = StObject.set(x, "allowList", js.undefined)
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setBoundaryVarargs(value: typings.std.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
      
      inline def setContainer(value: String | Element | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContent(
        value: String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCustomClass(value: String | js.Function0[String]): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
      
      inline def setCustomClassFunction0(value: () => String): Self = StObject.set(x, "customClass", js.Any.fromFunction0(value))
      
      inline def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFallbackPlacement(value: js.Array[String]): Self = StObject.set(x, "fallbackPlacement", value.asInstanceOf[js.Any])
      
      inline def setFallbackPlacementUndefined: Self = StObject.set(x, "fallbackPlacement", js.undefined)
      
      inline def setFallbackPlacementVarargs(value: String*): Self = StObject.set(x, "fallbackPlacement", js.Array(value*))
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setOffset(value: Offset | String | OffsetFunction): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction0(value: () => Offset): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPlacement(value: auto | top | bottom | left | right | js.Function0[Unit]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementFunction0(value: () => Unit): Self = StObject.set(x, "placement", js.Any.fromFunction0(value))
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperConfig(value: Partial[Options] | PopperConfigFunction): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      inline def setPopperConfigFunction1(value: /* defaultBsPopperConfig */ Options => PartialOptionsAllowList): Self = StObject.set(x, "popperConfig", js.Any.fromFunction1(value))
      
      inline def setPopperConfigNull: Self = StObject.set(x, "popperConfig", null)
      
      inline def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      inline def setSanitizeFn(value: () => Unit | Null): Self = StObject.set(x, "sanitizeFn", js.Any.fromFunction0(value))
      
      inline def setSanitizeFnUndefined: Self = StObject.set(x, "sanitizeFn", js.undefined)
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setSelector(value: String | `false`): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTitle(
        value: String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
      ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrigger(
        value: click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`)
      ): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/toast.Toast.Options> */
  trait PartialOptionsAnimation extends StObject {
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var autohide: js.UndefOr[Boolean] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
  }
  object PartialOptionsAnimation {
    
    inline def apply(): PartialOptionsAnimation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsAnimation]
    }
    
    extension [Self <: PartialOptionsAnimation](x: Self) {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
      
      inline def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/dropdown.Dropdown.Options> */
  trait PartialOptionsAutoClose extends StObject {
    
    var autoClose: js.UndefOr[Boolean | inside | outside] = js.undefined
    
    var boundary: js.UndefOr[Boundary | Element] = js.undefined
    
    var display: js.UndefOr[dynamic | static] = js.undefined
    
    var offset: js.UndefOr[
        typings.bootstrap.dropdownMod.Dropdown.Offset | String | typings.bootstrap.dropdownMod.Dropdown.OffsetFunction
      ] = js.undefined
    
    var popperConfig: js.UndefOr[
        Partial[typings.popperjsCore.typesMod.Options] | typings.bootstrap.dropdownMod.Dropdown.PopperConfigFunction | Null
      ] = js.undefined
    
    var reference: js.UndefOr[toggle | parent | Element | Rect] = js.undefined
  }
  object PartialOptionsAutoClose {
    
    inline def apply(): PartialOptionsAutoClose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsAutoClose]
    }
    
    extension [Self <: PartialOptionsAutoClose](x: Self) {
      
      inline def setAutoClose(value: Boolean | inside | outside): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setBoundary(value: Boundary | Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setBoundaryVarargs(value: typings.std.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
      
      inline def setDisplay(value: dynamic | static): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setOffset(
        value: typings.bootstrap.dropdownMod.Dropdown.Offset | String | typings.bootstrap.dropdownMod.Dropdown.OffsetFunction
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction0(value: () => typings.bootstrap.dropdownMod.Dropdown.Offset): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPopperConfig(
        value: Partial[typings.popperjsCore.typesMod.Options] | typings.bootstrap.dropdownMod.Dropdown.PopperConfigFunction
      ): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      inline def setPopperConfigFunction0(value: () => PartialOptionsModifiers): Self = StObject.set(x, "popperConfig", js.Any.fromFunction0(value))
      
      inline def setPopperConfigNull: Self = StObject.set(x, "popperConfig", null)
      
      inline def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      inline def setReference(value: toggle | parent | Element | Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/modal.Modal.Options> */
  trait PartialOptionsBackdrop extends StObject {
    
    var backdrop: js.UndefOr[static | Boolean] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptionsBackdrop {
    
    inline def apply(): PartialOptionsBackdrop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsBackdrop]
    }
    
    extension [Self <: PartialOptionsBackdrop](x: Self) {
      
      inline def setBackdrop(value: static | Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/tooltip.Tooltip.Options> */
  trait PartialOptionsBoundary extends StObject {
    
    var allowList: js.UndefOr[RecordkeyofHTMLElementTag] = js.undefined
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    var container: js.UndefOr[String | Element | `false`] = js.undefined
    
    var customClass: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var fallbackPlacement: js.UndefOr[js.Array[String]] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Offset | String | OffsetFunction] = js.undefined
    
    var placement: js.UndefOr[auto | top | bottom | left | right | js.Function0[Unit]] = js.undefined
    
    var popperConfig: js.UndefOr[
        Partial[typings.popperjsCore.typesMod.Options] | typings.bootstrap.tooltipMod.Tooltip.PopperConfigFunction | Null
      ] = js.undefined
    
    var sanitize: js.UndefOr[Boolean] = js.undefined
    
    var sanitizeFn: js.UndefOr[js.Function0[Unit | Null]] = js.undefined
    
    var selector: js.UndefOr[String | `false`] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[
        String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
      ] = js.undefined
    
    var trigger: js.UndefOr[
        click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`)
      ] = js.undefined
  }
  object PartialOptionsBoundary {
    
    inline def apply(): PartialOptionsBoundary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsBoundary]
    }
    
    extension [Self <: PartialOptionsBoundary](x: Self) {
      
      inline def setAllowList(value: RecordkeyofHTMLElementTag): Self = StObject.set(x, "allowList", value.asInstanceOf[js.Any])
      
      inline def setAllowListUndefined: Self = StObject.set(x, "allowList", js.undefined)
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setBoundaryVarargs(value: typings.std.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
      
      inline def setContainer(value: String | Element | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCustomClass(value: String | js.Function0[String]): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
      
      inline def setCustomClassFunction0(value: () => String): Self = StObject.set(x, "customClass", js.Any.fromFunction0(value))
      
      inline def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFallbackPlacement(value: js.Array[String]): Self = StObject.set(x, "fallbackPlacement", value.asInstanceOf[js.Any])
      
      inline def setFallbackPlacementUndefined: Self = StObject.set(x, "fallbackPlacement", js.undefined)
      
      inline def setFallbackPlacementVarargs(value: String*): Self = StObject.set(x, "fallbackPlacement", js.Array(value*))
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setOffset(value: Offset | String | OffsetFunction): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction0(value: () => Offset): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPlacement(value: auto | top | bottom | left | right | js.Function0[Unit]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementFunction0(value: () => Unit): Self = StObject.set(x, "placement", js.Any.fromFunction0(value))
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperConfig(
        value: Partial[typings.popperjsCore.typesMod.Options] | typings.bootstrap.tooltipMod.Tooltip.PopperConfigFunction
      ): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      inline def setPopperConfigFunction1(
        value: /* defaultBsPopperConfig */ typings.bootstrap.tooltipMod.Tooltip.Options => PartialOptionsModifiers
      ): Self = StObject.set(x, "popperConfig", js.Any.fromFunction1(value))
      
      inline def setPopperConfigNull: Self = StObject.set(x, "popperConfig", null)
      
      inline def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      inline def setSanitizeFn(value: () => Unit | Null): Self = StObject.set(x, "sanitizeFn", js.Any.fromFunction0(value))
      
      inline def setSanitizeFnUndefined: Self = StObject.set(x, "sanitizeFn", js.undefined)
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setSelector(value: String | `false`): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTitle(
        value: String | Element | JQuery | (js.ThisFunction0[/* this */ HTMLElement, String | Element | JQuery])
      ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrigger(
        value: click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`)
      ): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/offcanvas.Offcanvas.Options> */
  trait PartialOptionsKeyboard extends StObject {
    
    var backdrop: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var scroll: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptionsKeyboard {
    
    inline def apply(): PartialOptionsKeyboard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsKeyboard]
    }
    
    extension [Self <: PartialOptionsKeyboard](x: Self) {
      
      inline def setBackdrop(value: Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/scrollspy.ScrollSpy.Options> */
  trait PartialOptionsMethod extends StObject {
    
    var method: js.UndefOr[auto | offset | position] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String | Element | JQuery] = js.undefined
    
    var threshold: js.UndefOr[js.Array[Double] | String] = js.undefined
  }
  object PartialOptionsMethod {
    
    inline def apply(): PartialOptionsMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsMethod]
    }
    
    extension [Self <: PartialOptionsMethod](x: Self) {
      
      inline def setMethod(value: auto | offset | position): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setTarget(value: String | Element | JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setThreshold(value: js.Array[Double] | String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setThresholdVarargs(value: Double*): Self = StObject.set(x, "threshold", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@popperjs/core.@popperjs/core.Options> */
  trait PartialOptionsModifiers extends StObject {
    
    var modifiers: js.UndefOr[js.Array[PartialModifieranyany]] = js.undefined
    
    var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var strategy: js.UndefOr[PositioningStrategy] = js.undefined
  }
  object PartialOptionsModifiers {
    
    inline def apply(): PartialOptionsModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsModifiers]
    }
    
    extension [Self <: PartialOptionsModifiers](x: Self) {
      
      inline def setModifiers(value: js.Array[PartialModifieranyany]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: PartialModifieranyany*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setOnFirstUpdate(value: /* arg0 */ PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
      
      inline def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/collapse.Collapse.Options> */
  trait PartialOptionsParent extends StObject {
    
    var parent: js.UndefOr[String | Element | JQuery] = js.undefined
    
    var toggle: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptionsParent {
    
    inline def apply(): PartialOptionsParent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsParent]
    }
    
    extension [Self <: PartialOptionsParent](x: Self) {
      
      inline def setParent(value: String | Element | JQuery): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  /* Inlined std.Record<keyof std.HTMLElementTagNameMap | '*', std.Array<string | std.RegExp>> */
  trait RecordkeyofHTMLElementTag extends StObject {
    
    @JSName("*")
    var Asterisk: js.Array[String | js.RegExp]
    
    var a: js.Array[String | js.RegExp]
    
    var abbr: js.Array[String | js.RegExp]
    
    var address: js.Array[String | js.RegExp]
    
    var area: js.Array[String | js.RegExp]
    
    var article: js.Array[String | js.RegExp]
    
    var aside: js.Array[String | js.RegExp]
    
    var audio: js.Array[String | js.RegExp]
    
    var b: js.Array[String | js.RegExp]
    
    var base: js.Array[String | js.RegExp]
    
    var bdi: js.Array[String | js.RegExp]
    
    var bdo: js.Array[String | js.RegExp]
    
    var blockquote: js.Array[String | js.RegExp]
    
    var body: js.Array[String | js.RegExp]
    
    var br: js.Array[String | js.RegExp]
    
    var button: js.Array[String | js.RegExp]
    
    var canvas: js.Array[String | js.RegExp]
    
    var caption: js.Array[String | js.RegExp]
    
    var cite: js.Array[String | js.RegExp]
    
    var code: js.Array[String | js.RegExp]
    
    var col: js.Array[String | js.RegExp]
    
    var colgroup: js.Array[String | js.RegExp]
    
    var data: js.Array[String | js.RegExp]
    
    var datalist: js.Array[String | js.RegExp]
    
    var dd: js.Array[String | js.RegExp]
    
    var del: js.Array[String | js.RegExp]
    
    var details: js.Array[String | js.RegExp]
    
    var dfn: js.Array[String | js.RegExp]
    
    var dialog: js.Array[String | js.RegExp]
    
    var div: js.Array[String | js.RegExp]
    
    var dl: js.Array[String | js.RegExp]
    
    var dt: js.Array[String | js.RegExp]
    
    var em: js.Array[String | js.RegExp]
    
    var embed: js.Array[String | js.RegExp]
    
    var fieldset: js.Array[String | js.RegExp]
    
    var figcaption: js.Array[String | js.RegExp]
    
    var figure: js.Array[String | js.RegExp]
    
    var footer: js.Array[String | js.RegExp]
    
    var form: js.Array[String | js.RegExp]
    
    var h1: js.Array[String | js.RegExp]
    
    var h2: js.Array[String | js.RegExp]
    
    var h3: js.Array[String | js.RegExp]
    
    var h4: js.Array[String | js.RegExp]
    
    var h5: js.Array[String | js.RegExp]
    
    var h6: js.Array[String | js.RegExp]
    
    var head: js.Array[String | js.RegExp]
    
    var header: js.Array[String | js.RegExp]
    
    var hgroup: js.Array[String | js.RegExp]
    
    var hr: js.Array[String | js.RegExp]
    
    var html: js.Array[String | js.RegExp]
    
    var i: js.Array[String | js.RegExp]
    
    var iframe: js.Array[String | js.RegExp]
    
    var img: js.Array[String | js.RegExp]
    
    var input: js.Array[String | js.RegExp]
    
    var ins: js.Array[String | js.RegExp]
    
    var kbd: js.Array[String | js.RegExp]
    
    var label: js.Array[String | js.RegExp]
    
    var legend: js.Array[String | js.RegExp]
    
    var li: js.Array[String | js.RegExp]
    
    var link: js.Array[String | js.RegExp]
    
    var main: js.Array[String | js.RegExp]
    
    var map: js.Array[String | js.RegExp]
    
    var mark: js.Array[String | js.RegExp]
    
    var menu: js.Array[String | js.RegExp]
    
    var meta: js.Array[String | js.RegExp]
    
    var meter: js.Array[String | js.RegExp]
    
    var nav: js.Array[String | js.RegExp]
    
    var noscript: js.Array[String | js.RegExp]
    
    var `object`: js.Array[String | js.RegExp]
    
    var ol: js.Array[String | js.RegExp]
    
    var optgroup: js.Array[String | js.RegExp]
    
    var option: js.Array[String | js.RegExp]
    
    var output: js.Array[String | js.RegExp]
    
    var p: js.Array[String | js.RegExp]
    
    var picture: js.Array[String | js.RegExp]
    
    var pre: js.Array[String | js.RegExp]
    
    var progress: js.Array[String | js.RegExp]
    
    var q: js.Array[String | js.RegExp]
    
    var rp: js.Array[String | js.RegExp]
    
    var rt: js.Array[String | js.RegExp]
    
    var ruby: js.Array[String | js.RegExp]
    
    var s: js.Array[String | js.RegExp]
    
    var samp: js.Array[String | js.RegExp]
    
    var script: js.Array[String | js.RegExp]
    
    var section: js.Array[String | js.RegExp]
    
    var select: js.Array[String | js.RegExp]
    
    var slot: js.Array[String | js.RegExp]
    
    var small: js.Array[String | js.RegExp]
    
    var source: js.Array[String | js.RegExp]
    
    var span: js.Array[String | js.RegExp]
    
    var strong: js.Array[String | js.RegExp]
    
    var style: js.Array[String | js.RegExp]
    
    var sub: js.Array[String | js.RegExp]
    
    var summary: js.Array[String | js.RegExp]
    
    var sup: js.Array[String | js.RegExp]
    
    var table: js.Array[String | js.RegExp]
    
    var tbody: js.Array[String | js.RegExp]
    
    var td: js.Array[String | js.RegExp]
    
    var template: js.Array[String | js.RegExp]
    
    var textarea: js.Array[String | js.RegExp]
    
    var tfoot: js.Array[String | js.RegExp]
    
    var th: js.Array[String | js.RegExp]
    
    var thead: js.Array[String | js.RegExp]
    
    var time: js.Array[String | js.RegExp]
    
    var title: js.Array[String | js.RegExp]
    
    var tr: js.Array[String | js.RegExp]
    
    var track: js.Array[String | js.RegExp]
    
    var u: js.Array[String | js.RegExp]
    
    var ul: js.Array[String | js.RegExp]
    
    var `var`: js.Array[String | js.RegExp]
    
    var video: js.Array[String | js.RegExp]
    
    var wbr: js.Array[String | js.RegExp]
  }
  object RecordkeyofHTMLElementTag {
    
    inline def apply(
      Asterisk: js.Array[String | js.RegExp],
      a: js.Array[String | js.RegExp],
      abbr: js.Array[String | js.RegExp],
      address: js.Array[String | js.RegExp],
      area: js.Array[String | js.RegExp],
      article: js.Array[String | js.RegExp],
      aside: js.Array[String | js.RegExp],
      audio: js.Array[String | js.RegExp],
      b: js.Array[String | js.RegExp],
      base: js.Array[String | js.RegExp],
      bdi: js.Array[String | js.RegExp],
      bdo: js.Array[String | js.RegExp],
      blockquote: js.Array[String | js.RegExp],
      body: js.Array[String | js.RegExp],
      br: js.Array[String | js.RegExp],
      button: js.Array[String | js.RegExp],
      canvas: js.Array[String | js.RegExp],
      caption: js.Array[String | js.RegExp],
      cite: js.Array[String | js.RegExp],
      code: js.Array[String | js.RegExp],
      col: js.Array[String | js.RegExp],
      colgroup: js.Array[String | js.RegExp],
      data: js.Array[String | js.RegExp],
      datalist: js.Array[String | js.RegExp],
      dd: js.Array[String | js.RegExp],
      del: js.Array[String | js.RegExp],
      details: js.Array[String | js.RegExp],
      dfn: js.Array[String | js.RegExp],
      dialog: js.Array[String | js.RegExp],
      div: js.Array[String | js.RegExp],
      dl: js.Array[String | js.RegExp],
      dt: js.Array[String | js.RegExp],
      em: js.Array[String | js.RegExp],
      embed: js.Array[String | js.RegExp],
      fieldset: js.Array[String | js.RegExp],
      figcaption: js.Array[String | js.RegExp],
      figure: js.Array[String | js.RegExp],
      footer: js.Array[String | js.RegExp],
      form: js.Array[String | js.RegExp],
      h1: js.Array[String | js.RegExp],
      h2: js.Array[String | js.RegExp],
      h3: js.Array[String | js.RegExp],
      h4: js.Array[String | js.RegExp],
      h5: js.Array[String | js.RegExp],
      h6: js.Array[String | js.RegExp],
      head: js.Array[String | js.RegExp],
      header: js.Array[String | js.RegExp],
      hgroup: js.Array[String | js.RegExp],
      hr: js.Array[String | js.RegExp],
      html: js.Array[String | js.RegExp],
      i: js.Array[String | js.RegExp],
      iframe: js.Array[String | js.RegExp],
      img: js.Array[String | js.RegExp],
      input: js.Array[String | js.RegExp],
      ins: js.Array[String | js.RegExp],
      kbd: js.Array[String | js.RegExp],
      label: js.Array[String | js.RegExp],
      legend: js.Array[String | js.RegExp],
      li: js.Array[String | js.RegExp],
      link: js.Array[String | js.RegExp],
      main: js.Array[String | js.RegExp],
      map: js.Array[String | js.RegExp],
      mark: js.Array[String | js.RegExp],
      menu: js.Array[String | js.RegExp],
      meta: js.Array[String | js.RegExp],
      meter: js.Array[String | js.RegExp],
      nav: js.Array[String | js.RegExp],
      noscript: js.Array[String | js.RegExp],
      `object`: js.Array[String | js.RegExp],
      ol: js.Array[String | js.RegExp],
      optgroup: js.Array[String | js.RegExp],
      option: js.Array[String | js.RegExp],
      output: js.Array[String | js.RegExp],
      p: js.Array[String | js.RegExp],
      picture: js.Array[String | js.RegExp],
      pre: js.Array[String | js.RegExp],
      progress: js.Array[String | js.RegExp],
      q: js.Array[String | js.RegExp],
      rp: js.Array[String | js.RegExp],
      rt: js.Array[String | js.RegExp],
      ruby: js.Array[String | js.RegExp],
      s: js.Array[String | js.RegExp],
      samp: js.Array[String | js.RegExp],
      script: js.Array[String | js.RegExp],
      section: js.Array[String | js.RegExp],
      select: js.Array[String | js.RegExp],
      slot: js.Array[String | js.RegExp],
      small: js.Array[String | js.RegExp],
      source: js.Array[String | js.RegExp],
      span: js.Array[String | js.RegExp],
      strong: js.Array[String | js.RegExp],
      style: js.Array[String | js.RegExp],
      sub: js.Array[String | js.RegExp],
      summary: js.Array[String | js.RegExp],
      sup: js.Array[String | js.RegExp],
      table: js.Array[String | js.RegExp],
      tbody: js.Array[String | js.RegExp],
      td: js.Array[String | js.RegExp],
      template: js.Array[String | js.RegExp],
      textarea: js.Array[String | js.RegExp],
      tfoot: js.Array[String | js.RegExp],
      th: js.Array[String | js.RegExp],
      thead: js.Array[String | js.RegExp],
      time: js.Array[String | js.RegExp],
      title: js.Array[String | js.RegExp],
      tr: js.Array[String | js.RegExp],
      track: js.Array[String | js.RegExp],
      u: js.Array[String | js.RegExp],
      ul: js.Array[String | js.RegExp],
      `var`: js.Array[String | js.RegExp],
      video: js.Array[String | js.RegExp],
      wbr: js.Array[String | js.RegExp]
    ): RecordkeyofHTMLElementTag = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
      __obj.updateDynamic("*")(Asterisk.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordkeyofHTMLElementTag]
    }
    
    extension [Self <: RecordkeyofHTMLElementTag](x: Self) {
      
      inline def setA(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "a", js.Array(value*))
      
      inline def setAbbr(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setAbbrVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "abbr", js.Array(value*))
      
      inline def setAddress(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "address", js.Array(value*))
      
      inline def setArea(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "area", js.Array(value*))
      
      inline def setArticle(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
      
      inline def setArticleVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "article", js.Array(value*))
      
      inline def setAside(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
      
      inline def setAsideVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "aside", js.Array(value*))
      
      inline def setAsterisk(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
      
      inline def setAsteriskVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "*", js.Array(value*))
      
      inline def setAudio(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "audio", js.Array(value*))
      
      inline def setB(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "b", js.Array(value*))
      
      inline def setBase(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "base", js.Array(value*))
      
      inline def setBdi(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
      
      inline def setBdiVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "bdi", js.Array(value*))
      
      inline def setBdo(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
      
      inline def setBdoVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "bdo", js.Array(value*))
      
      inline def setBlockquote(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "blockquote", js.Array(value*))
      
      inline def setBody(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setBr(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setBrVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "br", js.Array(value*))
      
      inline def setButton(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "button", js.Array(value*))
      
      inline def setCanvas(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "canvas", js.Array(value*))
      
      inline def setCaption(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "caption", js.Array(value*))
      
      inline def setCite(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setCiteVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "cite", js.Array(value*))
      
      inline def setCode(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "code", js.Array(value*))
      
      inline def setCol(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "col", js.Array(value*))
      
      inline def setColgroup(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
      
      inline def setColgroupVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "colgroup", js.Array(value*))
      
      inline def setData(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDatalist(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
      
      inline def setDatalistVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "datalist", js.Array(value*))
      
      inline def setDd(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      inline def setDdVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "dd", js.Array(value*))
      
      inline def setDel(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setDelVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "del", js.Array(value*))
      
      inline def setDetails(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setDfn(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
      
      inline def setDfnVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "dfn", js.Array(value*))
      
      inline def setDialog(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "dialog", js.Array(value*))
      
      inline def setDiv(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDivVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "div", js.Array(value*))
      
      inline def setDl(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
      
      inline def setDlVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "dl", js.Array(value*))
      
      inline def setDt(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
      
      inline def setDtVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "dt", js.Array(value*))
      
      inline def setEm(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setEmVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "em", js.Array(value*))
      
      inline def setEmbed(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
      
      inline def setEmbedVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "embed", js.Array(value*))
      
      inline def setFieldset(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
      
      inline def setFieldsetVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "fieldset", js.Array(value*))
      
      inline def setFigcaption(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
      
      inline def setFigcaptionVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "figcaption", js.Array(value*))
      
      inline def setFigure(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
      
      inline def setFigureVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "figure", js.Array(value*))
      
      inline def setFooter(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setForm(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "form", js.Array(value*))
      
      inline def setH1(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH1Varargs(value: (String | js.RegExp)*): Self = StObject.set(x, "h1", js.Array(value*))
      
      inline def setH2(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH2Varargs(value: (String | js.RegExp)*): Self = StObject.set(x, "h2", js.Array(value*))
      
      inline def setH3(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH3Varargs(value: (String | js.RegExp)*): Self = StObject.set(x, "h3", js.Array(value*))
      
      inline def setH4(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH4Varargs(value: (String | js.RegExp)*): Self = StObject.set(x, "h4", js.Array(value*))
      
      inline def setH5(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH5Varargs(value: (String | js.RegExp)*): Self = StObject.set(x, "h5", js.Array(value*))
      
      inline def setH6(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setH6Varargs(value: (String | js.RegExp)*): Self = StObject.set(x, "h6", js.Array(value*))
      
      inline def setHead(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "head", js.Array(value*))
      
      inline def setHeader(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHgroup(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
      
      inline def setHgroupVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "hgroup", js.Array(value*))
      
      inline def setHr(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "hr", js.Array(value*))
      
      inline def setHtml(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "html", js.Array(value*))
      
      inline def setI(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "i", js.Array(value*))
      
      inline def setIframe(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      inline def setIframeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "iframe", js.Array(value*))
      
      inline def setImg(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "img", js.Array(value*))
      
      inline def setInput(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setIns(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
      
      inline def setInsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ins", js.Array(value*))
      
      inline def setKbd(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
      
      inline def setKbdVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "kbd", js.Array(value*))
      
      inline def setLabel(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLegend(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "legend", js.Array(value*))
      
      inline def setLi(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setLiVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "li", js.Array(value*))
      
      inline def setLink(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "link", js.Array(value*))
      
      inline def setMain(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "main", js.Array(value*))
      
      inline def setMap(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "map", js.Array(value*))
      
      inline def setMark(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "mark", js.Array(value*))
      
      inline def setMenu(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "menu", js.Array(value*))
      
      inline def setMeta(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "meta", js.Array(value*))
      
      inline def setMeter(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
      
      inline def setMeterVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "meter", js.Array(value*))
      
      inline def setNav(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNavVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "nav", js.Array(value*))
      
      inline def setNoscript(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setNoscriptVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "noscript", js.Array(value*))
      
      inline def setObject(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "object", js.Array(value*))
      
      inline def setOl(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setOlVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ol", js.Array(value*))
      
      inline def setOptgroup(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
      
      inline def setOptgroupVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "optgroup", js.Array(value*))
      
      inline def setOption(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "option", js.Array(value*))
      
      inline def setOutput(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "output", js.Array(value*))
      
      inline def setP(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "p", js.Array(value*))
      
      inline def setPicture(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "picture", js.Array(value*))
      
      inline def setPre(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "pre", js.Array(value*))
      
      inline def setProgress(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "progress", js.Array(value*))
      
      inline def setQ(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "q", js.Array(value*))
      
      inline def setRp(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
      
      inline def setRpVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "rp", js.Array(value*))
      
      inline def setRt(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
      
      inline def setRtVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "rt", js.Array(value*))
      
      inline def setRuby(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
      
      inline def setRubyVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ruby", js.Array(value*))
      
      inline def setS(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "s", js.Array(value*))
      
      inline def setSamp(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
      
      inline def setSampVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "samp", js.Array(value*))
      
      inline def setScript(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "script", js.Array(value*))
      
      inline def setSection(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "section", js.Array(value*))
      
      inline def setSelect(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "select", js.Array(value*))
      
      inline def setSlot(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "slot", js.Array(value*))
      
      inline def setSmall(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "small", js.Array(value*))
      
      inline def setSource(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setSpan(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "span", js.Array(value*))
      
      inline def setStrong(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "strong", js.Array(value*))
      
      inline def setStyle(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setSub(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "sub", js.Array(value*))
      
      inline def setSummary(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "summary", js.Array(value*))
      
      inline def setSup(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
      
      inline def setSupVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "sup", js.Array(value*))
      
      inline def setTable(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "table", js.Array(value*))
      
      inline def setTbody(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
      
      inline def setTbodyVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "tbody", js.Array(value*))
      
      inline def setTd(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      inline def setTdVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "td", js.Array(value*))
      
      inline def setTemplate(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "template", js.Array(value*))
      
      inline def setTextarea(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      inline def setTextareaVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "textarea", js.Array(value*))
      
      inline def setTfoot(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
      
      inline def setTfootVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "tfoot", js.Array(value*))
      
      inline def setTh(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      inline def setThVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "th", js.Array(value*))
      
      inline def setThead(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
      
      inline def setTheadVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "thead", js.Array(value*))
      
      inline def setTime(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "time", js.Array(value*))
      
      inline def setTitle(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTr(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "tr", js.Array(value*))
      
      inline def setTrack(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "track", js.Array(value*))
      
      inline def setU(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setUVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "u", js.Array(value*))
      
      inline def setUl(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      inline def setUlVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ul", js.Array(value*))
      
      inline def setVar(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
      
      inline def setVarVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "var", js.Array(value*))
      
      inline def setVideo(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "video", js.Array(value*))
      
      inline def setWbr(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
      
      inline def setWbrVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "wbr", js.Array(value*))
    }
  }
}
