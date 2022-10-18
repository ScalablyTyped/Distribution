package typings.createKeyframeAnimation

import org.scalablytyped.runtime.StringDictionary
import typings.createKeyframeAnimation.anon.FnCall
import typings.createKeyframeAnimation.anon.Name
import typings.createKeyframeAnimation.anon.PartialPresetsConfig
import typings.std.Element
import typings.std.FillMode
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-keyframe-animation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnimationCSS(name: String, positions: AnimationType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnimationCSS")(name.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hasAnimation(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAnimation")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerAnimation(opts: RegisterAnimationConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runAnimation[U](
    els: js.Array[Element],
    opts: OptsType,
    cb: js.Function2[
      /* err */ js.Error | Null, 
      /* result */ js.UndefOr[InferParams[js.Array[Element]]], 
      U
    ]
  ): js.Promise[U] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runAnimation")(els.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U] | Unit]
  inline def runAnimation[T /* <: OptsType */](els: ElsType, opts: T): js.Promise[T] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runAnimation")(els.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T] | Unit]
  inline def runAnimation[U](
    els: Element,
    opts: OptsType,
    cb: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[InferParams[Element]], U]
  ): js.Promise[U] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runAnimation")(els.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U] | Unit]
  inline def runAnimation[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {None (selectors : 'a'): std.NodeListOf<std.HTMLAnchorElement>, None (selectors : 'abbr'): std.NodeListOf<std.HTMLElement>, None (selectors : 'address'): std.NodeListOf<std.HTMLElement>, None (selectors : 'area'): std.NodeListOf<std.HTMLAreaElement>, None (selectors : 'article'): std.NodeListOf<std.HTMLElement>, None (selectors : 'aside'): std.NodeListOf<std.HTMLElement>, None (selectors : 'audio'): std.NodeListOf<std.HTMLAudioElement>, None (selectors : 'b'): std.NodeListOf<std.HTMLElement>, None (selectors : 'base'): std.NodeListOf<std.HTMLBaseElement>, None (selectors : 'bdi'): std.NodeListOf<std.HTMLElement>, None (selectors : 'bdo'): std.NodeListOf<std.HTMLElement>, None (selectors : 'blockquote'): std.NodeListOf<std.HTMLQuoteElement>, None (selectors : 'body'): std.NodeListOf<std.HTMLBodyElement>, None (selectors : 'br'): std.NodeListOf<std.HTMLBRElement>, None (selectors : 'button'): std.NodeListOf<std.HTMLButtonElement>, None (selectors : 'canvas'): std.NodeListOf<std.HTMLCanvasElement>, None (selectors : 'caption'): std.NodeListOf<std.HTMLTableCaptionElement>, None (selectors : 'cite'): std.NodeListOf<std.HTMLElement>, None (selectors : 'code'): std.NodeListOf<std.HTMLElement>, None (selectors : 'col'): std.NodeListOf<std.HTMLTableColElement>, None (selectors : 'colgroup'): std.NodeListOf<std.HTMLTableColElement>, None (selectors : 'data'): std.NodeListOf<std.HTMLDataElement>, None (selectors : 'datalist'): std.NodeListOf<std.HTMLDataListElement>, None (selectors : 'dd'): std.NodeListOf<std.HTMLElement>, None (selectors : 'del'): std.NodeListOf<std.HTMLModElement>, None (selectors : 'details'): std.NodeListOf<std.HTMLDetailsElement>, None (selectors : 'dfn'): std.NodeListOf<std.HTMLElement>, None (selectors : 'dialog'): std.NodeListOf<std.HTMLDialogElement>, None (selectors : 'div'): std.NodeListOf<std.HTMLDivElement>, None (selectors : 'dl'): std.NodeListOf<std.HTMLDListElement>, None (selectors : 'dt'): std.NodeListOf<std.HTMLElement>, None (selectors : 'em'): std.NodeListOf<std.HTMLElement>, None (selectors : 'embed'): std.NodeListOf<std.HTMLEmbedElement>, None (selectors : 'fieldset'): std.NodeListOf<std.HTMLFieldSetElement>, None (selectors : 'figcaption'): std.NodeListOf<std.HTMLElement>, None (selectors : 'figure'): std.NodeListOf<std.HTMLElement>, None (selectors : 'footer'): std.NodeListOf<std.HTMLElement>, None (selectors : 'form'): std.NodeListOf<std.HTMLFormElement>, None (selectors : 'h1'): std.NodeListOf<std.HTMLHeadingElement>, None (selectors : 'h2'): std.NodeListOf<std.HTMLHeadingElement>, None (selectors : 'h3'): std.NodeListOf<std.HTMLHeadingElement>, None (selectors : 'h4'): std.NodeListOf<std.HTMLHeadingElement>, None (selectors : 'h5'): std.NodeListOf<std.HTMLHeadingElement>, None (selectors : 'h6'): std.NodeListOf<std.HTMLHeadingElement>, None (selectors : 'head'): std.NodeListOf<std.HTMLHeadElement>, None (selectors : 'header'): std.NodeListOf<std.HTMLElement>, None (selectors : 'hgroup'): std.NodeListOf<std.HTMLElement>, None (selectors : 'hr'): std.NodeListOf<std.HTMLHRElement>, None (selectors : 'html'): std.NodeListOf<std.HTMLHtmlElement>, None (selectors : 'i'): std.NodeListOf<std.HTMLElement>, None (selectors : 'iframe'): std.NodeListOf<std.HTMLIFrameElement>, None (selectors : 'img'): std.NodeListOf<std.HTMLImageElement>, None (selectors : 'input'): std.NodeListOf<std.HTMLInputElement>, None (selectors : 'ins'): std.NodeListOf<std.HTMLModElement>, None (selectors : 'kbd'): std.NodeListOf<std.HTMLElement>, None (selectors : 'label'): std.NodeListOf<std.HTMLLabelElement>, None (selectors : 'legend'): std.NodeListOf<std.HTMLLegendElement>, None (selectors : 'li'): std.NodeListOf<std.HTMLLIElement>, None (selectors : 'link'): std.NodeListOf<std.HTMLLinkElement>, None (selectors : 'main'): std.NodeListOf<std.HTMLElement>, None (selectors : 'map'): std.NodeListOf<std.HTMLMapElement>, None (selectors : 'mark'): std.NodeListOf<std.HTMLElement>, None (selectors : 'menu'): std.NodeListOf<std.HTMLMenuElement>, None (selectors : 'meta'): std.NodeListOf<std.HTMLMetaElement>, None (selectors : 'meter'): std.NodeListOf<std.HTMLMeterElement>, None (selectors : 'nav'): std.NodeListOf<std.HTMLElement>, None (selectors : 'noscript'): std.NodeListOf<std.HTMLElement>, None (selectors : 'object'): std.NodeListOf<std.HTMLObjectElement>, None (selectors : 'ol'): std.NodeListOf<std.HTMLOListElement>, None (selectors : 'optgroup'): std.NodeListOf<std.HTMLOptGroupElement>, None (selectors : 'option'): std.NodeListOf<std.HTMLOptionElement>, None (selectors : 'output'): std.NodeListOf<std.HTMLOutputElement>, None (selectors : 'p'): std.NodeListOf<std.HTMLParagraphElement>, None (selectors : 'picture'): std.NodeListOf<std.HTMLPictureElement>, None (selectors : 'pre'): std.NodeListOf<std.HTMLPreElement>, None (selectors : 'progress'): std.NodeListOf<std.HTMLProgressElement>, None (selectors : 'q'): std.NodeListOf<std.HTMLQuoteElement>, None (selectors : 'rp'): std.NodeListOf<std.HTMLElement>, None (selectors : 'rt'): std.NodeListOf<std.HTMLElement>, None (selectors : 'ruby'): std.NodeListOf<std.HTMLElement>, None (selectors : 's'): std.NodeListOf<std.HTMLElement>, None (selectors : 'samp'): std.NodeListOf<std.HTMLElement>, None (selectors : 'script'): std.NodeListOf<std.HTMLScriptElement>, None (selectors : 'section'): std.NodeListOf<std.HTMLElement>, None (selectors : 'select'): std.NodeListOf<std.HTMLSelectElement>, None (selectors : 'slot'): std.NodeListOf<std.HTMLSlotElement>, None (selectors : 'small'): std.NodeListOf<std.HTMLElement>, None (selectors : 'source'): std.NodeListOf<std.HTMLSourceElement>, None (selectors : 'span'): std.NodeListOf<std.HTMLSpanElement>, None (selectors : 'strong'): std.NodeListOf<std.HTMLElement>, None (selectors : 'style'): std.NodeListOf<std.HTMLStyleElement>, None (selectors : 'sub'): std.NodeListOf<std.HTMLElement>, None (selectors : 'summary'): std.NodeListOf<std.HTMLElement>, None (selectors : 'sup'): std.NodeListOf<std.HTMLElement>, None (selectors : 'table'): std.NodeListOf<std.HTMLTableElement>, None (selectors : 'tbody'): std.NodeListOf<std.HTMLTableSectionElement>, None (selectors : 'td'): std.NodeListOf<std.HTMLTableCellElement>, None (selectors : 'template'): std.NodeListOf<std.HTMLTemplateElement>, None (selectors : 'textarea'): std.NodeListOf<std.HTMLTextAreaElement>, None (selectors : 'tfoot'): std.NodeListOf<std.HTMLTableSectionElement>, None (selectors : 'th'): std.NodeListOf<std.HTMLTableCellElement>, None (selectors : 'thead'): std.NodeListOf<std.HTMLTableSectionElement>, None (selectors : 'time'): std.NodeListOf<std.HTMLTimeElement>, None (selectors : 'title'): std.NodeListOf<std.HTMLTitleElement>, None (selectors : 'tr'): std.NodeListOf<std.HTMLTableRowElement>, None (selectors : 'track'): std.NodeListOf<std.HTMLTrackElement>, None (selectors : 'u'): std.NodeListOf<std.HTMLElement>, None (selectors : 'ul'): std.NodeListOf<std.HTMLUListElement>, None (selectors : 'var'): std.NodeListOf<std.HTMLElement>, None (selectors : 'video'): std.NodeListOf<std.HTMLVideoElement>, None (selectors : 'wbr'): std.NodeListOf<std.HTMLElement>, None (selectors : 'a'): std.NodeListOf<std.SVGAElement>, None (selectors : 'animate'): std.NodeListOf<std.SVGAnimateElement>, None (selectors : 'animateMotion'): std.NodeListOf<std.SVGAnimateMotionElement>, None (selectors : 'animateTransform'): std.NodeListOf<std.SVGAnimateTransformElement>, None (selectors : 'circle'): std.NodeListOf<std.SVGCircleElement>, None (selectors : 'clipPath'): std.NodeListOf<std.SVGClipPathElement>, None (selectors : 'defs'): std.NodeListOf<std.SVGDefsElement>, None (selectors : 'desc'): std.NodeListOf<std.SVGDescElement>, None (selectors : 'ellipse'): std.NodeListOf<std.SVGEllipseElement>, None (selectors : 'feBlend'): std.NodeListOf<std.SVGFEBlendElement>, None (selectors : 'feColorMatrix'): std.NodeListOf<std.SVGFEColorMatrixElement>, None (selectors : 'feComponentTransfer'): std.NodeListOf<std.SVGFEComponentTransferElement>, None (selectors : 'feComposite'): std.NodeListOf<std.SVGFECompositeElement>, None (selectors : 'feConvolveMatrix'): std.NodeListOf<std.SVGFEConvolveMatrixElement>, None (selectors : 'feDiffuseLighting'): std.NodeListOf<std.SVGFEDiffuseLightingElement>, None (selectors : 'feDisplacementMap'): std.NodeListOf<std.SVGFEDisplacementMapElement>, None (selectors : 'feDistantLight'): std.NodeListOf<std.SVGFEDistantLightElement>, None (selectors : 'feDropShadow'): std.NodeListOf<std.SVGFEDropShadowElement>, None (selectors : 'feFlood'): std.NodeListOf<std.SVGFEFloodElement>, None (selectors : 'feFuncA'): std.NodeListOf<std.SVGFEFuncAElement>, None (selectors : 'feFuncB'): std.NodeListOf<std.SVGFEFuncBElement>, None (selectors : 'feFuncG'): std.NodeListOf<std.SVGFEFuncGElement>, None (selectors : 'feFuncR'): std.NodeListOf<std.SVGFEFuncRElement>, None (selectors : 'feGaussianBlur'): std.NodeListOf<std.SVGFEGaussianBlurElement>, None (selectors : 'feImage'): std.NodeListOf<std.SVGFEImageElement>, None (selectors : 'feMerge'): std.NodeListOf<std.SVGFEMergeElement>, None (selectors : 'feMergeNode'): std.NodeListOf<std.SVGFEMergeNodeElement>, None (selectors : 'feMorphology'): std.NodeListOf<std.SVGFEMorphologyElement>, None (selectors : 'feOffset'): std.NodeListOf<std.SVGFEOffsetElement>, None (selectors : 'fePointLight'): std.NodeListOf<std.SVGFEPointLightElement>, None (selectors : 'feSpecularLighting'): std.NodeListOf<std.SVGFESpecularLightingElement>, None (selectors : 'feSpotLight'): std.NodeListOf<std.SVGFESpotLightElement>, None (selectors : 'feTile'): std.NodeListOf<std.SVGFETileElement>, None (selectors : 'feTurbulence'): std.NodeListOf<std.SVGFETurbulenceElement>, None (selectors : 'filter'): std.NodeListOf<std.SVGFilterElement>, None (selectors : 'foreignObject'): std.NodeListOf<std.SVGForeignObjectElement>, None (selectors : 'g'): std.NodeListOf<std.SVGGElement>, None (selectors : 'image'): std.NodeListOf<std.SVGImageElement>, None (selectors : 'line'): std.NodeListOf<std.SVGLineElement>, None (selectors : 'linearGradient'): std.NodeListOf<std.SVGLinearGradientElement>, None (selectors : 'marker'): std.NodeListOf<std.SVGMarkerElement>, None (selectors : 'mask'): std.NodeListOf<std.SVGMaskElement>, None (selectors : 'metadata'): std.NodeListOf<std.SVGMetadataElement>, None (selectors : 'mpath'): std.NodeListOf<std.SVGMPathElement>, None (selectors : 'path'): std.NodeListOf<std.SVGPathElement>, None (selectors : 'pattern'): std.NodeListOf<std.SVGPatternElement>, None (selectors : 'polygon'): std.NodeListOf<std.SVGPolygonElement>, None (selectors : 'polyline'): std.NodeListOf<std.SVGPolylineElement>, None (selectors : 'radialGradient'): std.NodeListOf<std.SVGRadialGradientElement>, None (selectors : 'rect'): std.NodeListOf<std.SVGRectElement>, None (selectors : 'script'): std.NodeListOf<std.SVGScriptElement>, None (selectors : 'set'): std.NodeListOf<std.SVGSetElement>, None (selectors : 'stop'): std.NodeListOf<std.SVGStopElement>, None (selectors : 'style'): std.NodeListOf<std.SVGStyleElement>, None (selectors : 'svg'): std.NodeListOf<std.SVGSVGElement>, None (selectors : 'switch'): std.NodeListOf<std.SVGSwitchElement>, None (selectors : 'symbol'): std.NodeListOf<std.SVGSymbolElement>, None (selectors : 'text'): std.NodeListOf<std.SVGTextElement>, None (selectors : 'textPath'): std.NodeListOf<std.SVGTextPathElement>, None (selectors : 'title'): std.NodeListOf<std.SVGTitleElement>, None (selectors : 'tspan'): std.NodeListOf<std.SVGTSpanElement>, None (selectors : 'use'): std.NodeListOf<std.SVGUseElement>, None (selectors : 'view'): std.NodeListOf<std.SVGViewElement>, None <E extends std.Element = std.Element>(selectors : string): std.NodeListOf<E>} extends (args : any): infer R ? R : any */ js.Any */, U](
    els: T,
    opts: OptsType,
    cb: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[InferParams[T]], U]
  ): js.Promise[U] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runAnimation")(els.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U] | Unit]
  
  inline def unregisterAnimation(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterAnimation")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AnimationConfigIndex = StringDictionary[js.Array[Double] | (Record[String, String])]
  
  trait AnimationConfigStartAndEnd extends StObject {
    
    var end: js.Array[Double]
    
    var start: js.Array[Double]
  }
  object AnimationConfigStartAndEnd {
    
    inline def apply(end: js.Array[Double], start: js.Array[Double]): AnimationConfigStartAndEnd = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationConfigStartAndEnd]
    }
    
    extension [Self <: AnimationConfigStartAndEnd](x: Self) {
      
      inline def setEnd(value: js.Array[Double]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setStart(value: js.Array[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value*))
    }
  }
  
  type AnimationType = AnimationConfigStartAndEnd | AnimationConfigIndex | (js.Array[js.Array[Double] | (Record[String, Any])])
  
  /* Rewritten from type alias, can be one of: 
    - typings.createKeyframeAnimation.createKeyframeAnimationStrings.normal
    - typings.createKeyframeAnimation.createKeyframeAnimationStrings.alternate
    - typings.createKeyframeAnimation.createKeyframeAnimationStrings.reverse
    - typings.createKeyframeAnimation.createKeyframeAnimationStrings.`alternate-reverse`
  */
  trait Direction extends StObject
  object Direction {
    
    inline def alternate: typings.createKeyframeAnimation.createKeyframeAnimationStrings.alternate = "alternate".asInstanceOf[typings.createKeyframeAnimation.createKeyframeAnimationStrings.alternate]
    
    inline def `alternate-reverse`: typings.createKeyframeAnimation.createKeyframeAnimationStrings.`alternate-reverse` = "alternate-reverse".asInstanceOf[typings.createKeyframeAnimation.createKeyframeAnimationStrings.`alternate-reverse`]
    
    inline def normal: typings.createKeyframeAnimation.createKeyframeAnimationStrings.normal = "normal".asInstanceOf[typings.createKeyframeAnimation.createKeyframeAnimationStrings.normal]
    
    inline def reverse: typings.createKeyframeAnimation.createKeyframeAnimationStrings.reverse = "reverse".asInstanceOf[typings.createKeyframeAnimation.createKeyframeAnimationStrings.reverse]
  }
  
  type ElsType = Element | js.Array[Element] | ReturnType[FnCall]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Element ? [T] : T
    }}}
    */
  @js.native
  trait InferParams[T /* <: ElsType */] extends StObject
  
  type OptsType = String | ((Record[String, Any]) & Name & PartialPresetsConfig)
  
  trait PresetsConfig extends StObject {
    
    var clearTransformsBeforeStart: Boolean
    
    var delay: Double
    
    var direction: Direction
    
    var duration: Double
    
    var easing: String
    
    var fillMode: FillMode
    
    var iterations: Double
    
    var resetWhenDone: Boolean
  }
  object PresetsConfig {
    
    inline def apply(
      clearTransformsBeforeStart: Boolean,
      delay: Double,
      direction: Direction,
      duration: Double,
      easing: String,
      fillMode: FillMode,
      iterations: Double,
      resetWhenDone: Boolean
    ): PresetsConfig = {
      val __obj = js.Dynamic.literal(clearTransformsBeforeStart = clearTransformsBeforeStart.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], resetWhenDone = resetWhenDone.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresetsConfig]
    }
    
    extension [Self <: PresetsConfig](x: Self) {
      
      inline def setClearTransformsBeforeStart(value: Boolean): Self = StObject.set(x, "clearTransformsBeforeStart", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setFillMode(value: FillMode): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setResetWhenDone(value: Boolean): Self = StObject.set(x, "resetWhenDone", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegisterAnimationConfig extends StObject {
    
    var animation: AnimationType
    
    var name: String
    
    var presets: js.UndefOr[PartialPresetsConfig] = js.undefined
  }
  object RegisterAnimationConfig {
    
    inline def apply(animation: AnimationType, name: String): RegisterAnimationConfig = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisterAnimationConfig]
    }
    
    extension [Self <: RegisterAnimationConfig](x: Self) {
      
      inline def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationVarargs(value: (js.Array[Double] | (Record[String, Any]))*): Self = StObject.set(x, "animation", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPresets(value: PartialPresetsConfig): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
    }
  }
}
