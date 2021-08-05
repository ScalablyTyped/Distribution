package typings.bootstrap

import typings.bootstrap.bootstrapBooleans.`false`
import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.bottom
import typings.bootstrap.bootstrapStrings.click
import typings.bootstrap.bootstrapStrings.dynamic
import typings.bootstrap.bootstrapStrings.focus
import typings.bootstrap.bootstrapStrings.hover
import typings.bootstrap.bootstrapStrings.left
import typings.bootstrap.bootstrapStrings.manual
import typings.bootstrap.bootstrapStrings.offset
import typings.bootstrap.bootstrapStrings.parent
import typings.bootstrap.bootstrapStrings.position
import typings.bootstrap.bootstrapStrings.right
import typings.bootstrap.bootstrapStrings.scrollParent
import typings.bootstrap.bootstrapStrings.static
import typings.bootstrap.bootstrapStrings.toggle
import typings.bootstrap.bootstrapStrings.top
import typings.bootstrap.bootstrapStrings.viewport
import typings.bootstrap.bootstrapStrings.window
import typings.jquery.JQuery
import typings.popperJs.mod.Behavior
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.PopperOptions
import typings.popperJs.mod.Position
import typings.std.Element
import typings.std.HTMLElement
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
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var pause: js.UndefOr[String | Boolean] = js.undefined
    
    var slide: js.UndefOr[String | Boolean] = js.undefined
    
    var touch: js.UndefOr[Boolean] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setPause(value: String | Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setSlide(value: String | Boolean): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/popover.Popover.Options> */
  trait PartialOptionsAnimation extends StObject {
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var boundary: js.UndefOr[viewport | window | scrollParent | Element] = js.undefined
    
    var container: js.UndefOr[String | Element | `false`] = js.undefined
    
    var content: js.UndefOr[String | Element | js.Function0[Unit]] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var fallbackPlacement: js.UndefOr[Behavior | js.Array[Position]] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Double | String] = js.undefined
    
    var placement: js.UndefOr[auto | top | bottom | left | right | js.Function0[Unit]] = js.undefined
    
    var popperConfig: js.UndefOr[PopperOptions | Null] = js.undefined
    
    var sanitize: js.UndefOr[Boolean] = js.undefined
    
    var sanitizeFn: js.UndefOr[js.Function0[Unit | Null]] = js.undefined
    
    var selector: js.UndefOr[String | `false`] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String | Element | js.Function0[Unit]] = js.undefined
    
    var trigger: js.UndefOr[click | hover | focus | manual] = js.undefined
    
    var whiteList: js.UndefOr[RecordkeyofHTMLElementTag] = js.undefined
  }
  object PartialOptionsAnimation {
    
    inline def apply(): PartialOptionsAnimation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsAnimation]
    }
    
    extension [Self <: PartialOptionsAnimation](x: Self) {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBoundary(value: viewport | window | scrollParent | Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setContainer(value: String | Element | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContent(value: String | Element | js.Function0[Unit]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction0(value: () => Unit): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFallbackPlacement(value: Behavior | js.Array[Position]): Self = StObject.set(x, "fallbackPlacement", value.asInstanceOf[js.Any])
      
      inline def setFallbackPlacementUndefined: Self = StObject.set(x, "fallbackPlacement", js.undefined)
      
      inline def setFallbackPlacementVarargs(value: Position*): Self = StObject.set(x, "fallbackPlacement", js.Array(value :_*))
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPlacement(value: auto | top | bottom | left | right | js.Function0[Unit]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementFunction0(value: () => Unit): Self = StObject.set(x, "placement", js.Any.fromFunction0(value))
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperConfig(value: PopperOptions): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
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
      
      inline def setTitle(value: String | Element | js.Function0[Unit]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => Unit): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrigger(value: click | hover | focus | manual): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setWhiteList(value: RecordkeyofHTMLElementTag): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
      
      inline def setWhiteListUndefined: Self = StObject.set(x, "whiteList", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/modal.Modal.Options> */
  trait PartialOptionsBackdrop extends StObject {
    
    var backdrop: js.UndefOr[static | Boolean] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
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
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/dropdown.Dropdown.Options> */
  trait PartialOptionsBoundary extends StObject {
    
    var boundary: js.UndefOr[Boundary | Element] = js.undefined
    
    var display: js.UndefOr[dynamic | static] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var popperConfig: js.UndefOr[PopperOptions | Null] = js.undefined
    
    var reference: js.UndefOr[toggle | parent | Element] = js.undefined
  }
  object PartialOptionsBoundary {
    
    inline def apply(): PartialOptionsBoundary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsBoundary]
    }
    
    extension [Self <: PartialOptionsBoundary](x: Self) {
      
      inline def setBoundary(value: Boundary | Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setDisplay(value: dynamic | static): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPopperConfig(value: PopperOptions): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      inline def setPopperConfigNull: Self = StObject.set(x, "popperConfig", null)
      
      inline def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      inline def setReference(value: toggle | parent | Element): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/scrollspy.ScrollSpy.Options> */
  trait PartialOptionsMethod extends StObject {
    
    var method: js.UndefOr[auto | offset | position] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String | Element | JQuery[HTMLElement]] = js.undefined
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
      
      inline def setTarget(value: String | Element | JQuery[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  /* Inlined std.Partial<bootstrap.bootstrap/js/dist/collapse.Collapse.Options> */
  trait PartialOptionsParent extends StObject {
    
    var parent: js.UndefOr[String | Element | JQuery[HTMLElement]] = js.undefined
    
    var toggle: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptionsParent {
    
    inline def apply(): PartialOptionsParent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsParent]
    }
    
    extension [Self <: PartialOptionsParent](x: Self) {
      
      inline def setParent(value: String | Element | JQuery[HTMLElement]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  /* Inlined std.Record<keyof std.HTMLElementTagNameMap, std.Array<string>> */
  trait RecordkeyofHTMLElementTag extends StObject {
    
    var a: js.Array[String]
    
    var abbr: js.Array[String]
    
    var address: js.Array[String]
    
    var applet: js.Array[String]
    
    var area: js.Array[String]
    
    var article: js.Array[String]
    
    var aside: js.Array[String]
    
    var audio: js.Array[String]
    
    var b: js.Array[String]
    
    var base: js.Array[String]
    
    var basefont: js.Array[String]
    
    var bdi: js.Array[String]
    
    var bdo: js.Array[String]
    
    var blockquote: js.Array[String]
    
    var body: js.Array[String]
    
    var br: js.Array[String]
    
    var button: js.Array[String]
    
    var canvas: js.Array[String]
    
    var caption: js.Array[String]
    
    var cite: js.Array[String]
    
    var code: js.Array[String]
    
    var col: js.Array[String]
    
    var colgroup: js.Array[String]
    
    var data: js.Array[String]
    
    var datalist: js.Array[String]
    
    var dd: js.Array[String]
    
    var del: js.Array[String]
    
    var details: js.Array[String]
    
    var dfn: js.Array[String]
    
    var dialog: js.Array[String]
    
    var dir: js.Array[String]
    
    var div: js.Array[String]
    
    var dl: js.Array[String]
    
    var dt: js.Array[String]
    
    var em: js.Array[String]
    
    var embed: js.Array[String]
    
    var fieldset: js.Array[String]
    
    var figcaption: js.Array[String]
    
    var figure: js.Array[String]
    
    var font: js.Array[String]
    
    var footer: js.Array[String]
    
    var form: js.Array[String]
    
    var frame: js.Array[String]
    
    var frameset: js.Array[String]
    
    var h1: js.Array[String]
    
    var h2: js.Array[String]
    
    var h3: js.Array[String]
    
    var h4: js.Array[String]
    
    var h5: js.Array[String]
    
    var h6: js.Array[String]
    
    var head: js.Array[String]
    
    var header: js.Array[String]
    
    var hgroup: js.Array[String]
    
    var hr: js.Array[String]
    
    var html: js.Array[String]
    
    var i: js.Array[String]
    
    var iframe: js.Array[String]
    
    var img: js.Array[String]
    
    var input: js.Array[String]
    
    var ins: js.Array[String]
    
    var kbd: js.Array[String]
    
    var label: js.Array[String]
    
    var legend: js.Array[String]
    
    var li: js.Array[String]
    
    var link: js.Array[String]
    
    var main: js.Array[String]
    
    var map: js.Array[String]
    
    var mark: js.Array[String]
    
    var marquee: js.Array[String]
    
    var menu: js.Array[String]
    
    var meta: js.Array[String]
    
    var meter: js.Array[String]
    
    var nav: js.Array[String]
    
    var noscript: js.Array[String]
    
    var `object`: js.Array[String]
    
    var ol: js.Array[String]
    
    var optgroup: js.Array[String]
    
    var option: js.Array[String]
    
    var output: js.Array[String]
    
    var p: js.Array[String]
    
    var param: js.Array[String]
    
    var picture: js.Array[String]
    
    var pre: js.Array[String]
    
    var progress: js.Array[String]
    
    var q: js.Array[String]
    
    var rp: js.Array[String]
    
    var rt: js.Array[String]
    
    var ruby: js.Array[String]
    
    var s: js.Array[String]
    
    var samp: js.Array[String]
    
    var script: js.Array[String]
    
    var section: js.Array[String]
    
    var select: js.Array[String]
    
    var slot: js.Array[String]
    
    var small: js.Array[String]
    
    var source: js.Array[String]
    
    var span: js.Array[String]
    
    var strong: js.Array[String]
    
    var style: js.Array[String]
    
    var sub: js.Array[String]
    
    var summary: js.Array[String]
    
    var sup: js.Array[String]
    
    var table: js.Array[String]
    
    var tbody: js.Array[String]
    
    var td: js.Array[String]
    
    var template: js.Array[String]
    
    var textarea: js.Array[String]
    
    var tfoot: js.Array[String]
    
    var th: js.Array[String]
    
    var thead: js.Array[String]
    
    var time: js.Array[String]
    
    var title: js.Array[String]
    
    var tr: js.Array[String]
    
    var track: js.Array[String]
    
    var u: js.Array[String]
    
    var ul: js.Array[String]
    
    var `var`: js.Array[String]
    
    var video: js.Array[String]
    
    var wbr: js.Array[String]
  }
  object RecordkeyofHTMLElementTag {
    
    inline def apply(
      a: js.Array[String],
      abbr: js.Array[String],
      address: js.Array[String],
      applet: js.Array[String],
      area: js.Array[String],
      article: js.Array[String],
      aside: js.Array[String],
      audio: js.Array[String],
      b: js.Array[String],
      base: js.Array[String],
      basefont: js.Array[String],
      bdi: js.Array[String],
      bdo: js.Array[String],
      blockquote: js.Array[String],
      body: js.Array[String],
      br: js.Array[String],
      button: js.Array[String],
      canvas: js.Array[String],
      caption: js.Array[String],
      cite: js.Array[String],
      code: js.Array[String],
      col: js.Array[String],
      colgroup: js.Array[String],
      data: js.Array[String],
      datalist: js.Array[String],
      dd: js.Array[String],
      del: js.Array[String],
      details: js.Array[String],
      dfn: js.Array[String],
      dialog: js.Array[String],
      dir: js.Array[String],
      div: js.Array[String],
      dl: js.Array[String],
      dt: js.Array[String],
      em: js.Array[String],
      embed: js.Array[String],
      fieldset: js.Array[String],
      figcaption: js.Array[String],
      figure: js.Array[String],
      font: js.Array[String],
      footer: js.Array[String],
      form: js.Array[String],
      frame: js.Array[String],
      frameset: js.Array[String],
      h1: js.Array[String],
      h2: js.Array[String],
      h3: js.Array[String],
      h4: js.Array[String],
      h5: js.Array[String],
      h6: js.Array[String],
      head: js.Array[String],
      header: js.Array[String],
      hgroup: js.Array[String],
      hr: js.Array[String],
      html: js.Array[String],
      i: js.Array[String],
      iframe: js.Array[String],
      img: js.Array[String],
      input: js.Array[String],
      ins: js.Array[String],
      kbd: js.Array[String],
      label: js.Array[String],
      legend: js.Array[String],
      li: js.Array[String],
      link: js.Array[String],
      main: js.Array[String],
      map: js.Array[String],
      mark: js.Array[String],
      marquee: js.Array[String],
      menu: js.Array[String],
      meta: js.Array[String],
      meter: js.Array[String],
      nav: js.Array[String],
      noscript: js.Array[String],
      `object`: js.Array[String],
      ol: js.Array[String],
      optgroup: js.Array[String],
      option: js.Array[String],
      output: js.Array[String],
      p: js.Array[String],
      param: js.Array[String],
      picture: js.Array[String],
      pre: js.Array[String],
      progress: js.Array[String],
      q: js.Array[String],
      rp: js.Array[String],
      rt: js.Array[String],
      ruby: js.Array[String],
      s: js.Array[String],
      samp: js.Array[String],
      script: js.Array[String],
      section: js.Array[String],
      select: js.Array[String],
      slot: js.Array[String],
      small: js.Array[String],
      source: js.Array[String],
      span: js.Array[String],
      strong: js.Array[String],
      style: js.Array[String],
      sub: js.Array[String],
      summary: js.Array[String],
      sup: js.Array[String],
      table: js.Array[String],
      tbody: js.Array[String],
      td: js.Array[String],
      template: js.Array[String],
      textarea: js.Array[String],
      tfoot: js.Array[String],
      th: js.Array[String],
      thead: js.Array[String],
      time: js.Array[String],
      title: js.Array[String],
      tr: js.Array[String],
      track: js.Array[String],
      u: js.Array[String],
      ul: js.Array[String],
      `var`: js.Array[String],
      video: js.Array[String],
      wbr: js.Array[String]
    ): RecordkeyofHTMLElementTag = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], applet = applet.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], basefont = basefont.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], frameset = frameset.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marquee = marquee.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordkeyofHTMLElementTag]
    }
    
    extension [Self <: RecordkeyofHTMLElementTag](x: Self) {
      
      inline def setA(value: js.Array[String]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAVarargs(value: String*): Self = StObject.set(x, "a", js.Array(value :_*))
      
      inline def setAbbr(value: js.Array[String]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setAbbrVarargs(value: String*): Self = StObject.set(x, "abbr", js.Array(value :_*))
      
      inline def setAddress(value: js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value :_*))
      
      inline def setApplet(value: js.Array[String]): Self = StObject.set(x, "applet", value.asInstanceOf[js.Any])
      
      inline def setAppletVarargs(value: String*): Self = StObject.set(x, "applet", js.Array(value :_*))
      
      inline def setArea(value: js.Array[String]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaVarargs(value: String*): Self = StObject.set(x, "area", js.Array(value :_*))
      
      inline def setArticle(value: js.Array[String]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
      
      inline def setArticleVarargs(value: String*): Self = StObject.set(x, "article", js.Array(value :_*))
      
      inline def setAside(value: js.Array[String]): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
      
      inline def setAsideVarargs(value: String*): Self = StObject.set(x, "aside", js.Array(value :_*))
      
      inline def setAudio(value: js.Array[String]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioVarargs(value: String*): Self = StObject.set(x, "audio", js.Array(value :_*))
      
      inline def setB(value: js.Array[String]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBVarargs(value: String*): Self = StObject.set(x, "b", js.Array(value :_*))
      
      inline def setBase(value: js.Array[String]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseVarargs(value: String*): Self = StObject.set(x, "base", js.Array(value :_*))
      
      inline def setBasefont(value: js.Array[String]): Self = StObject.set(x, "basefont", value.asInstanceOf[js.Any])
      
      inline def setBasefontVarargs(value: String*): Self = StObject.set(x, "basefont", js.Array(value :_*))
      
      inline def setBdi(value: js.Array[String]): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
      
      inline def setBdiVarargs(value: String*): Self = StObject.set(x, "bdi", js.Array(value :_*))
      
      inline def setBdo(value: js.Array[String]): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
      
      inline def setBdoVarargs(value: String*): Self = StObject.set(x, "bdo", js.Array(value :_*))
      
      inline def setBlockquote(value: js.Array[String]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteVarargs(value: String*): Self = StObject.set(x, "blockquote", js.Array(value :_*))
      
      inline def setBody(value: js.Array[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: String*): Self = StObject.set(x, "body", js.Array(value :_*))
      
      inline def setBr(value: js.Array[String]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setBrVarargs(value: String*): Self = StObject.set(x, "br", js.Array(value :_*))
      
      inline def setButton(value: js.Array[String]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonVarargs(value: String*): Self = StObject.set(x, "button", js.Array(value :_*))
      
      inline def setCanvas(value: js.Array[String]): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasVarargs(value: String*): Self = StObject.set(x, "canvas", js.Array(value :_*))
      
      inline def setCaption(value: js.Array[String]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionVarargs(value: String*): Self = StObject.set(x, "caption", js.Array(value :_*))
      
      inline def setCite(value: js.Array[String]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setCiteVarargs(value: String*): Self = StObject.set(x, "cite", js.Array(value :_*))
      
      inline def setCode(value: js.Array[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeVarargs(value: String*): Self = StObject.set(x, "code", js.Array(value :_*))
      
      inline def setCol(value: js.Array[String]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColVarargs(value: String*): Self = StObject.set(x, "col", js.Array(value :_*))
      
      inline def setColgroup(value: js.Array[String]): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
      
      inline def setColgroupVarargs(value: String*): Self = StObject.set(x, "colgroup", js.Array(value :_*))
      
      inline def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setDatalist(value: js.Array[String]): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
      
      inline def setDatalistVarargs(value: String*): Self = StObject.set(x, "datalist", js.Array(value :_*))
      
      inline def setDd(value: js.Array[String]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      inline def setDdVarargs(value: String*): Self = StObject.set(x, "dd", js.Array(value :_*))
      
      inline def setDel(value: js.Array[String]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setDelVarargs(value: String*): Self = StObject.set(x, "del", js.Array(value :_*))
      
      inline def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
      
      inline def setDfn(value: js.Array[String]): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
      
      inline def setDfnVarargs(value: String*): Self = StObject.set(x, "dfn", js.Array(value :_*))
      
      inline def setDialog(value: js.Array[String]): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogVarargs(value: String*): Self = StObject.set(x, "dialog", js.Array(value :_*))
      
      inline def setDir(value: js.Array[String]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirVarargs(value: String*): Self = StObject.set(x, "dir", js.Array(value :_*))
      
      inline def setDiv(value: js.Array[String]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDivVarargs(value: String*): Self = StObject.set(x, "div", js.Array(value :_*))
      
      inline def setDl(value: js.Array[String]): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
      
      inline def setDlVarargs(value: String*): Self = StObject.set(x, "dl", js.Array(value :_*))
      
      inline def setDt(value: js.Array[String]): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
      
      inline def setDtVarargs(value: String*): Self = StObject.set(x, "dt", js.Array(value :_*))
      
      inline def setEm(value: js.Array[String]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setEmVarargs(value: String*): Self = StObject.set(x, "em", js.Array(value :_*))
      
      inline def setEmbed(value: js.Array[String]): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
      
      inline def setEmbedVarargs(value: String*): Self = StObject.set(x, "embed", js.Array(value :_*))
      
      inline def setFieldset(value: js.Array[String]): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
      
      inline def setFieldsetVarargs(value: String*): Self = StObject.set(x, "fieldset", js.Array(value :_*))
      
      inline def setFigcaption(value: js.Array[String]): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
      
      inline def setFigcaptionVarargs(value: String*): Self = StObject.set(x, "figcaption", js.Array(value :_*))
      
      inline def setFigure(value: js.Array[String]): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
      
      inline def setFigureVarargs(value: String*): Self = StObject.set(x, "figure", js.Array(value :_*))
      
      inline def setFont(value: js.Array[String]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontVarargs(value: String*): Self = StObject.set(x, "font", js.Array(value :_*))
      
      inline def setFooter(value: js.Array[String]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterVarargs(value: String*): Self = StObject.set(x, "footer", js.Array(value :_*))
      
      inline def setForm(value: js.Array[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormVarargs(value: String*): Self = StObject.set(x, "form", js.Array(value :_*))
      
      inline def setFrame(value: js.Array[String]): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameVarargs(value: String*): Self = StObject.set(x, "frame", js.Array(value :_*))
      
      inline def setFrameset(value: js.Array[String]): Self = StObject.set(x, "frameset", value.asInstanceOf[js.Any])
      
      inline def setFramesetVarargs(value: String*): Self = StObject.set(x, "frameset", js.Array(value :_*))
      
      inline def setH1(value: js.Array[String]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH1Varargs(value: String*): Self = StObject.set(x, "h1", js.Array(value :_*))
      
      inline def setH2(value: js.Array[String]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH2Varargs(value: String*): Self = StObject.set(x, "h2", js.Array(value :_*))
      
      inline def setH3(value: js.Array[String]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH3Varargs(value: String*): Self = StObject.set(x, "h3", js.Array(value :_*))
      
      inline def setH4(value: js.Array[String]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH4Varargs(value: String*): Self = StObject.set(x, "h4", js.Array(value :_*))
      
      inline def setH5(value: js.Array[String]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH5Varargs(value: String*): Self = StObject.set(x, "h5", js.Array(value :_*))
      
      inline def setH6(value: js.Array[String]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setH6Varargs(value: String*): Self = StObject.set(x, "h6", js.Array(value :_*))
      
      inline def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      inline def setHgroup(value: js.Array[String]): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
      
      inline def setHgroupVarargs(value: String*): Self = StObject.set(x, "hgroup", js.Array(value :_*))
      
      inline def setHr(value: js.Array[String]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrVarargs(value: String*): Self = StObject.set(x, "hr", js.Array(value :_*))
      
      inline def setHtml(value: js.Array[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlVarargs(value: String*): Self = StObject.set(x, "html", js.Array(value :_*))
      
      inline def setI(value: js.Array[String]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIVarargs(value: String*): Self = StObject.set(x, "i", js.Array(value :_*))
      
      inline def setIframe(value: js.Array[String]): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      inline def setIframeVarargs(value: String*): Self = StObject.set(x, "iframe", js.Array(value :_*))
      
      inline def setImg(value: js.Array[String]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgVarargs(value: String*): Self = StObject.set(x, "img", js.Array(value :_*))
      
      inline def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value :_*))
      
      inline def setIns(value: js.Array[String]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
      
      inline def setInsVarargs(value: String*): Self = StObject.set(x, "ins", js.Array(value :_*))
      
      inline def setKbd(value: js.Array[String]): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
      
      inline def setKbdVarargs(value: String*): Self = StObject.set(x, "kbd", js.Array(value :_*))
      
      inline def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value :_*))
      
      inline def setLegend(value: js.Array[String]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendVarargs(value: String*): Self = StObject.set(x, "legend", js.Array(value :_*))
      
      inline def setLi(value: js.Array[String]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setLiVarargs(value: String*): Self = StObject.set(x, "li", js.Array(value :_*))
      
      inline def setLink(value: js.Array[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkVarargs(value: String*): Self = StObject.set(x, "link", js.Array(value :_*))
      
      inline def setMain(value: js.Array[String]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainVarargs(value: String*): Self = StObject.set(x, "main", js.Array(value :_*))
      
      inline def setMap(value: js.Array[String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapVarargs(value: String*): Self = StObject.set(x, "map", js.Array(value :_*))
      
      inline def setMark(value: js.Array[String]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkVarargs(value: String*): Self = StObject.set(x, "mark", js.Array(value :_*))
      
      inline def setMarquee(value: js.Array[String]): Self = StObject.set(x, "marquee", value.asInstanceOf[js.Any])
      
      inline def setMarqueeVarargs(value: String*): Self = StObject.set(x, "marquee", js.Array(value :_*))
      
      inline def setMenu(value: js.Array[String]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuVarargs(value: String*): Self = StObject.set(x, "menu", js.Array(value :_*))
      
      inline def setMeta(value: js.Array[String]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaVarargs(value: String*): Self = StObject.set(x, "meta", js.Array(value :_*))
      
      inline def setMeter(value: js.Array[String]): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
      
      inline def setMeterVarargs(value: String*): Self = StObject.set(x, "meter", js.Array(value :_*))
      
      inline def setNav(value: js.Array[String]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNavVarargs(value: String*): Self = StObject.set(x, "nav", js.Array(value :_*))
      
      inline def setNoscript(value: js.Array[String]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setNoscriptVarargs(value: String*): Self = StObject.set(x, "noscript", js.Array(value :_*))
      
      inline def setObject(value: js.Array[String]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectVarargs(value: String*): Self = StObject.set(x, "object", js.Array(value :_*))
      
      inline def setOl(value: js.Array[String]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setOlVarargs(value: String*): Self = StObject.set(x, "ol", js.Array(value :_*))
      
      inline def setOptgroup(value: js.Array[String]): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
      
      inline def setOptgroupVarargs(value: String*): Self = StObject.set(x, "optgroup", js.Array(value :_*))
      
      inline def setOption(value: js.Array[String]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionVarargs(value: String*): Self = StObject.set(x, "option", js.Array(value :_*))
      
      inline def setOutput(value: js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value :_*))
      
      inline def setP(value: js.Array[String]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPVarargs(value: String*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setParam(value: js.Array[String]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamVarargs(value: String*): Self = StObject.set(x, "param", js.Array(value :_*))
      
      inline def setPicture(value: js.Array[String]): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureVarargs(value: String*): Self = StObject.set(x, "picture", js.Array(value :_*))
      
      inline def setPre(value: js.Array[String]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreVarargs(value: String*): Self = StObject.set(x, "pre", js.Array(value :_*))
      
      inline def setProgress(value: js.Array[String]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressVarargs(value: String*): Self = StObject.set(x, "progress", js.Array(value :_*))
      
      inline def setQ(value: js.Array[String]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQVarargs(value: String*): Self = StObject.set(x, "q", js.Array(value :_*))
      
      inline def setRp(value: js.Array[String]): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
      
      inline def setRpVarargs(value: String*): Self = StObject.set(x, "rp", js.Array(value :_*))
      
      inline def setRt(value: js.Array[String]): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
      
      inline def setRtVarargs(value: String*): Self = StObject.set(x, "rt", js.Array(value :_*))
      
      inline def setRuby(value: js.Array[String]): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
      
      inline def setRubyVarargs(value: String*): Self = StObject.set(x, "ruby", js.Array(value :_*))
      
      inline def setS(value: js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
      
      inline def setSamp(value: js.Array[String]): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
      
      inline def setSampVarargs(value: String*): Self = StObject.set(x, "samp", js.Array(value :_*))
      
      inline def setScript(value: js.Array[String]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptVarargs(value: String*): Self = StObject.set(x, "script", js.Array(value :_*))
      
      inline def setSection(value: js.Array[String]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionVarargs(value: String*): Self = StObject.set(x, "section", js.Array(value :_*))
      
      inline def setSelect(value: js.Array[String]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectVarargs(value: String*): Self = StObject.set(x, "select", js.Array(value :_*))
      
      inline def setSlot(value: js.Array[String]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotVarargs(value: String*): Self = StObject.set(x, "slot", js.Array(value :_*))
      
      inline def setSmall(value: js.Array[String]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallVarargs(value: String*): Self = StObject.set(x, "small", js.Array(value :_*))
      
      inline def setSource(value: js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
      
      inline def setSpan(value: js.Array[String]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanVarargs(value: String*): Self = StObject.set(x, "span", js.Array(value :_*))
      
      inline def setStrong(value: js.Array[String]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongVarargs(value: String*): Self = StObject.set(x, "strong", js.Array(value :_*))
      
      inline def setStyle(value: js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setSub(value: js.Array[String]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubVarargs(value: String*): Self = StObject.set(x, "sub", js.Array(value :_*))
      
      inline def setSummary(value: js.Array[String]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryVarargs(value: String*): Self = StObject.set(x, "summary", js.Array(value :_*))
      
      inline def setSup(value: js.Array[String]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
      
      inline def setSupVarargs(value: String*): Self = StObject.set(x, "sup", js.Array(value :_*))
      
      inline def setTable(value: js.Array[String]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableVarargs(value: String*): Self = StObject.set(x, "table", js.Array(value :_*))
      
      inline def setTbody(value: js.Array[String]): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
      
      inline def setTbodyVarargs(value: String*): Self = StObject.set(x, "tbody", js.Array(value :_*))
      
      inline def setTd(value: js.Array[String]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      inline def setTdVarargs(value: String*): Self = StObject.set(x, "td", js.Array(value :_*))
      
      inline def setTemplate(value: js.Array[String]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateVarargs(value: String*): Self = StObject.set(x, "template", js.Array(value :_*))
      
      inline def setTextarea(value: js.Array[String]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      inline def setTextareaVarargs(value: String*): Self = StObject.set(x, "textarea", js.Array(value :_*))
      
      inline def setTfoot(value: js.Array[String]): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
      
      inline def setTfootVarargs(value: String*): Self = StObject.set(x, "tfoot", js.Array(value :_*))
      
      inline def setTh(value: js.Array[String]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      inline def setThVarargs(value: String*): Self = StObject.set(x, "th", js.Array(value :_*))
      
      inline def setThead(value: js.Array[String]): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
      
      inline def setTheadVarargs(value: String*): Self = StObject.set(x, "thead", js.Array(value :_*))
      
      inline def setTime(value: js.Array[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeVarargs(value: String*): Self = StObject.set(x, "time", js.Array(value :_*))
      
      inline def setTitle(value: js.Array[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
      
      inline def setTr(value: js.Array[String]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrVarargs(value: String*): Self = StObject.set(x, "tr", js.Array(value :_*))
      
      inline def setTrack(value: js.Array[String]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackVarargs(value: String*): Self = StObject.set(x, "track", js.Array(value :_*))
      
      inline def setU(value: js.Array[String]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setUVarargs(value: String*): Self = StObject.set(x, "u", js.Array(value :_*))
      
      inline def setUl(value: js.Array[String]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      inline def setUlVarargs(value: String*): Self = StObject.set(x, "ul", js.Array(value :_*))
      
      inline def setVar(value: js.Array[String]): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
      
      inline def setVarVarargs(value: String*): Self = StObject.set(x, "var", js.Array(value :_*))
      
      inline def setVideo(value: js.Array[String]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoVarargs(value: String*): Self = StObject.set(x, "video", js.Array(value :_*))
      
      inline def setWbr(value: js.Array[String]): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
      
      inline def setWbrVarargs(value: String*): Self = StObject.set(x, "wbr", js.Array(value :_*))
    }
  }
}
