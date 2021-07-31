package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.HTMLWebViewElement
import typings.std.HTMLAnchorElement
import typings.std.HTMLAreaElement
import typings.std.HTMLAudioElement
import typings.std.HTMLBRElement
import typings.std.HTMLBaseElement
import typings.std.HTMLBodyElement
import typings.std.HTMLButtonElement
import typings.std.HTMLCanvasElement
import typings.std.HTMLDListElement
import typings.std.HTMLDataElement
import typings.std.HTMLDataListElement
import typings.std.HTMLDialogElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLEmbedElement
import typings.std.HTMLFieldSetElement
import typings.std.HTMLFormElement
import typings.std.HTMLHRElement
import typings.std.HTMLHeadElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLHtmlElement
import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import typings.std.HTMLLabelElement
import typings.std.HTMLLegendElement
import typings.std.HTMLLinkElement
import typings.std.HTMLMapElement
import typings.std.HTMLMetaElement
import typings.std.HTMLModElement
import typings.std.HTMLOListElement
import typings.std.HTMLObjectElement
import typings.std.HTMLOptGroupElement
import typings.std.HTMLOptionElement
import typings.std.HTMLParagraphElement
import typings.std.HTMLParamElement
import typings.std.HTMLPreElement
import typings.std.HTMLProgressElement
import typings.std.HTMLQuoteElement
import typings.std.HTMLScriptElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSlotElement
import typings.std.HTMLSourceElement
import typings.std.HTMLSpanElement
import typings.std.HTMLStyleElement
import typings.std.HTMLTableColElement
import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.HTMLTemplateElement
import typings.std.HTMLTextAreaElement
import typings.std.HTMLTitleElement
import typings.std.HTMLTrackElement
import typings.std.HTMLUListElement
import typings.std.HTMLVideoElement
import typings.std.SVGCircleElement
import typings.std.SVGClipPathElement
import typings.std.SVGDefsElement
import typings.std.SVGDescElement
import typings.std.SVGElement
import typings.std.SVGEllipseElement
import typings.std.SVGFEBlendElement
import typings.std.SVGFEColorMatrixElement
import typings.std.SVGFEComponentTransferElement
import typings.std.SVGFECompositeElement
import typings.std.SVGFEConvolveMatrixElement
import typings.std.SVGFEDiffuseLightingElement
import typings.std.SVGFEDisplacementMapElement
import typings.std.SVGFEDistantLightElement
import typings.std.SVGFEDropShadowElement
import typings.std.SVGFEFloodElement
import typings.std.SVGFEFuncAElement
import typings.std.SVGFEFuncBElement
import typings.std.SVGFEFuncGElement
import typings.std.SVGFEFuncRElement
import typings.std.SVGFEGaussianBlurElement
import typings.std.SVGFEImageElement
import typings.std.SVGFEMergeElement
import typings.std.SVGFEMergeNodeElement
import typings.std.SVGFEMorphologyElement
import typings.std.SVGFEOffsetElement
import typings.std.SVGFEPointLightElement
import typings.std.SVGFESpecularLightingElement
import typings.std.SVGFESpotLightElement
import typings.std.SVGFETileElement
import typings.std.SVGFETurbulenceElement
import typings.std.SVGFilterElement
import typings.std.SVGForeignObjectElement
import typings.std.SVGGElement
import typings.std.SVGImageElement
import typings.std.SVGLineElement
import typings.std.SVGLinearGradientElement
import typings.std.SVGMarkerElement
import typings.std.SVGMaskElement
import typings.std.SVGMetadataElement
import typings.std.SVGPathElement
import typings.std.SVGPatternElement
import typings.std.SVGPolygonElement
import typings.std.SVGPolylineElement
import typings.std.SVGRadialGradientElement
import typings.std.SVGRectElement
import typings.std.SVGSVGElement
import typings.std.SVGStopElement
import typings.std.SVGSwitchElement
import typings.std.SVGSymbolElement
import typings.std.SVGTSpanElement
import typings.std.SVGTextElement
import typings.std.SVGTextPathElement
import typings.std.SVGUseElement
import typings.std.SVGViewElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JSX {
    
    type Element = typings.react.mod.ReactElement
    
    trait ElementAttributesProperty extends StObject
    
    trait ElementChildrenAttribute extends StObject
    
    @js.native
    trait ElementClass
      extends typings.react.mod.Component[js.Any, js.Object, js.Any]
    
    type IntrinsicAttributes = typings.react.mod.Attributes
    
    type IntrinsicClassAttributes[T] = typings.react.mod.ClassAttributes[T]
    
    trait IntrinsicElements extends StObject {
      
      // HTML
      var a: typings.react.mod.DetailedHTMLProps[typings.react.mod.AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]
      
      var abbr: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var address: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var animate: typings.react.mod.SVGProps[SVGElement]
      
      // TODO: It is SVGAnimateElement but is not in TypeScript's lib.dom.d.ts for now.
      var animateMotion: typings.react.mod.SVGProps[SVGElement]
      
      var animateTransform: typings.react.mod.SVGProps[SVGElement]
      
      var area: typings.react.mod.DetailedHTMLProps[typings.react.mod.AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement]
      
      var article: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var aside: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var audio: typings.react.mod.DetailedHTMLProps[typings.react.mod.AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement]
      
      var b: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var base: typings.react.mod.DetailedHTMLProps[typings.react.mod.BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement]
      
      var bdi: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var bdo: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var big: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var blockquote: typings.react.mod.DetailedHTMLProps[typings.react.mod.BlockquoteHTMLAttributes[HTMLElement], HTMLElement]
      
      var body: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLBodyElement], HTMLBodyElement]
      
      var br: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLBRElement], HTMLBRElement]
      
      var button: typings.react.mod.DetailedHTMLProps[typings.react.mod.ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]
      
      var canvas: typings.react.mod.DetailedHTMLProps[typings.react.mod.CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement]
      
      var caption: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      // TODO: It is SVGAnimateTransformElement but is not in TypeScript's lib.dom.d.ts for now.
      var circle: typings.react.mod.SVGProps[SVGCircleElement]
      
      var cite: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var clipPath: typings.react.mod.SVGProps[SVGClipPathElement]
      
      var code: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var col: typings.react.mod.DetailedHTMLProps[typings.react.mod.ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement]
      
      var colgroup: typings.react.mod.DetailedHTMLProps[typings.react.mod.ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement]
      
      var data: typings.react.mod.DetailedHTMLProps[typings.react.mod.DataHTMLAttributes[HTMLDataElement], HTMLDataElement]
      
      var datalist: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLDataListElement], HTMLDataListElement]
      
      var dd: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var defs: typings.react.mod.SVGProps[SVGDefsElement]
      
      var del: typings.react.mod.DetailedHTMLProps[typings.react.mod.DelHTMLAttributes[HTMLElement], HTMLElement]
      
      var desc: typings.react.mod.SVGProps[SVGDescElement]
      
      var details: typings.react.mod.DetailedHTMLProps[typings.react.mod.DetailsHTMLAttributes[HTMLElement], HTMLElement]
      
      var dfn: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var dialog: typings.react.mod.DetailedHTMLProps[typings.react.mod.DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement]
      
      var div: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLDivElement], HTMLDivElement]
      
      var dl: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLDListElement], HTMLDListElement]
      
      var dt: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var ellipse: typings.react.mod.SVGProps[SVGEllipseElement]
      
      var em: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var embed: typings.react.mod.DetailedHTMLProps[typings.react.mod.EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement]
      
      var feBlend: typings.react.mod.SVGProps[SVGFEBlendElement]
      
      var feColorMatrix: typings.react.mod.SVGProps[SVGFEColorMatrixElement]
      
      var feComponentTransfer: typings.react.mod.SVGProps[SVGFEComponentTransferElement]
      
      var feComposite: typings.react.mod.SVGProps[SVGFECompositeElement]
      
      var feConvolveMatrix: typings.react.mod.SVGProps[SVGFEConvolveMatrixElement]
      
      var feDiffuseLighting: typings.react.mod.SVGProps[SVGFEDiffuseLightingElement]
      
      var feDisplacementMap: typings.react.mod.SVGProps[SVGFEDisplacementMapElement]
      
      var feDistantLight: typings.react.mod.SVGProps[SVGFEDistantLightElement]
      
      var feDropShadow: typings.react.mod.SVGProps[SVGFEDropShadowElement]
      
      var feFlood: typings.react.mod.SVGProps[SVGFEFloodElement]
      
      var feFuncA: typings.react.mod.SVGProps[SVGFEFuncAElement]
      
      var feFuncB: typings.react.mod.SVGProps[SVGFEFuncBElement]
      
      var feFuncG: typings.react.mod.SVGProps[SVGFEFuncGElement]
      
      var feFuncR: typings.react.mod.SVGProps[SVGFEFuncRElement]
      
      var feGaussianBlur: typings.react.mod.SVGProps[SVGFEGaussianBlurElement]
      
      var feImage: typings.react.mod.SVGProps[SVGFEImageElement]
      
      var feMerge: typings.react.mod.SVGProps[SVGFEMergeElement]
      
      var feMergeNode: typings.react.mod.SVGProps[SVGFEMergeNodeElement]
      
      var feMorphology: typings.react.mod.SVGProps[SVGFEMorphologyElement]
      
      var feOffset: typings.react.mod.SVGProps[SVGFEOffsetElement]
      
      var fePointLight: typings.react.mod.SVGProps[SVGFEPointLightElement]
      
      var feSpecularLighting: typings.react.mod.SVGProps[SVGFESpecularLightingElement]
      
      var feSpotLight: typings.react.mod.SVGProps[SVGFESpotLightElement]
      
      var feTile: typings.react.mod.SVGProps[SVGFETileElement]
      
      var feTurbulence: typings.react.mod.SVGProps[SVGFETurbulenceElement]
      
      var fieldset: typings.react.mod.DetailedHTMLProps[typings.react.mod.FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement]
      
      var figcaption: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var figure: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var filter: typings.react.mod.SVGProps[SVGFilterElement]
      
      var footer: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var foreignObject: typings.react.mod.SVGProps[SVGForeignObjectElement]
      
      var form: typings.react.mod.DetailedHTMLProps[typings.react.mod.FormHTMLAttributes[HTMLFormElement], HTMLFormElement]
      
      var g: typings.react.mod.SVGProps[SVGGElement]
      
      var h1: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var h2: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var h3: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var h4: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var h5: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var h6: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var head: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadElement], HTMLHeadElement]
      
      var header: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var hgroup: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var hr: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHRElement], HTMLHRElement]
      
      var html: typings.react.mod.DetailedHTMLProps[typings.react.mod.HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]
      
      var i: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var iframe: typings.react.mod.DetailedHTMLProps[typings.react.mod.IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement]
      
      var image: typings.react.mod.SVGProps[SVGImageElement]
      
      var img: typings.react.mod.DetailedHTMLProps[typings.react.mod.ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]
      
      var input: typings.react.mod.DetailedHTMLProps[typings.react.mod.InputHTMLAttributes[HTMLInputElement], HTMLInputElement]
      
      var ins: typings.react.mod.DetailedHTMLProps[typings.react.mod.InsHTMLAttributes[HTMLModElement], HTMLModElement]
      
      var kbd: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var keygen: typings.react.mod.DetailedHTMLProps[typings.react.mod.KeygenHTMLAttributes[HTMLElement], HTMLElement]
      
      var label: typings.react.mod.DetailedHTMLProps[typings.react.mod.LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement]
      
      var legend: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLLegendElement], HTMLLegendElement]
      
      var li: typings.react.mod.DetailedHTMLProps[typings.react.mod.LiHTMLAttributes[HTMLLIElement], HTMLLIElement]
      
      var line: typings.react.mod.SVGProps[SVGLineElement]
      
      var linearGradient: typings.react.mod.SVGProps[SVGLinearGradientElement]
      
      var link: typings.react.mod.DetailedHTMLProps[typings.react.mod.LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]
      
      var main: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var map: typings.react.mod.DetailedHTMLProps[typings.react.mod.MapHTMLAttributes[HTMLMapElement], HTMLMapElement]
      
      var mark: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var marker: typings.react.mod.SVGProps[SVGMarkerElement]
      
      var mask: typings.react.mod.SVGProps[SVGMaskElement]
      
      var menu: typings.react.mod.DetailedHTMLProps[typings.react.mod.MenuHTMLAttributes[HTMLElement], HTMLElement]
      
      var menuitem: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var meta: typings.react.mod.DetailedHTMLProps[typings.react.mod.MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]
      
      var metadata: typings.react.mod.SVGProps[SVGMetadataElement]
      
      var meter: typings.react.mod.DetailedHTMLProps[typings.react.mod.MeterHTMLAttributes[HTMLElement], HTMLElement]
      
      var mpath: typings.react.mod.SVGProps[SVGElement]
      
      var nav: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var noindex: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var noscript: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var `object`: typings.react.mod.DetailedHTMLProps[typings.react.mod.ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement]
      
      var ol: typings.react.mod.DetailedHTMLProps[typings.react.mod.OlHTMLAttributes[HTMLOListElement], HTMLOListElement]
      
      var optgroup: typings.react.mod.DetailedHTMLProps[typings.react.mod.OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement]
      
      var option: typings.react.mod.DetailedHTMLProps[typings.react.mod.OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement]
      
      var output: typings.react.mod.DetailedHTMLProps[typings.react.mod.OutputHTMLAttributes[HTMLElement], HTMLElement]
      
      var p: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement]
      
      var param: typings.react.mod.DetailedHTMLProps[typings.react.mod.ParamHTMLAttributes[HTMLParamElement], HTMLParamElement]
      
      var path: typings.react.mod.SVGProps[SVGPathElement]
      
      var pattern: typings.react.mod.SVGProps[SVGPatternElement]
      
      var picture: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var polygon: typings.react.mod.SVGProps[SVGPolygonElement]
      
      var polyline: typings.react.mod.SVGProps[SVGPolylineElement]
      
      var pre: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLPreElement], HTMLPreElement]
      
      var progress: typings.react.mod.DetailedHTMLProps[typings.react.mod.ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement]
      
      var q: typings.react.mod.DetailedHTMLProps[typings.react.mod.QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]
      
      var radialGradient: typings.react.mod.SVGProps[SVGRadialGradientElement]
      
      var rect: typings.react.mod.SVGProps[SVGRectElement]
      
      var rp: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var rt: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var ruby: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var s: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var samp: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var script: typings.react.mod.DetailedHTMLProps[typings.react.mod.ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement]
      
      var section: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var select: typings.react.mod.DetailedHTMLProps[typings.react.mod.SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement]
      
      var slot: typings.react.mod.DetailedHTMLProps[typings.react.mod.SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement]
      
      var small: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var source: typings.react.mod.DetailedHTMLProps[typings.react.mod.SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement]
      
      var span: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLSpanElement], HTMLSpanElement]
      
      var stop: typings.react.mod.SVGProps[SVGStopElement]
      
      var strong: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var style: typings.react.mod.DetailedHTMLProps[typings.react.mod.StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement]
      
      var sub: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var summary: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var sup: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      // SVG
      var svg: typings.react.mod.SVGProps[SVGSVGElement]
      
      var switch: typings.react.mod.SVGProps[SVGSwitchElement]
      
      var symbol: typings.react.mod.SVGProps[SVGSymbolElement]
      
      var table: typings.react.mod.DetailedHTMLProps[typings.react.mod.TableHTMLAttributes[HTMLTableElement], HTMLTableElement]
      
      var tbody: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
      
      var td: typings.react.mod.DetailedHTMLProps[
            typings.react.mod.TdHTMLAttributes[HTMLTableDataCellElement], 
            HTMLTableDataCellElement
          ]
      
      var template: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement]
      
      var text: typings.react.mod.SVGProps[SVGTextElement]
      
      var textPath: typings.react.mod.SVGProps[SVGTextPathElement]
      
      var textarea: typings.react.mod.DetailedHTMLProps[typings.react.mod.TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]
      
      var tfoot: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
      
      var th: typings.react.mod.DetailedHTMLProps[
            typings.react.mod.ThHTMLAttributes[HTMLTableHeaderCellElement], 
            HTMLTableHeaderCellElement
          ]
      
      var thead: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
      
      var time: typings.react.mod.DetailedHTMLProps[typings.react.mod.TimeHTMLAttributes[HTMLElement], HTMLElement]
      
      var title: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTitleElement], HTMLTitleElement]
      
      var tr: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement]
      
      var track: typings.react.mod.DetailedHTMLProps[typings.react.mod.TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement]
      
      var tspan: typings.react.mod.SVGProps[SVGTSpanElement]
      
      var u: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var ul: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLUListElement], HTMLUListElement]
      
      var use: typings.react.mod.SVGProps[SVGUseElement]
      
      var `var`: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var video: typings.react.mod.DetailedHTMLProps[typings.react.mod.VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]
      
      var view: typings.react.mod.SVGProps[SVGViewElement]
      
      var wbr: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
      
      var webview: typings.react.mod.DetailedHTMLProps[typings.react.mod.WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]
    }
    object IntrinsicElements {
      
      @scala.inline
      def apply(
        a: typings.react.mod.DetailedHTMLProps[typings.react.mod.AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement],
        abbr: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        address: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        animate: typings.react.mod.SVGProps[SVGElement],
        animateMotion: typings.react.mod.SVGProps[SVGElement],
        animateTransform: typings.react.mod.SVGProps[SVGElement],
        area: typings.react.mod.DetailedHTMLProps[typings.react.mod.AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement],
        article: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        aside: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        audio: typings.react.mod.DetailedHTMLProps[typings.react.mod.AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement],
        b: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        base: typings.react.mod.DetailedHTMLProps[typings.react.mod.BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement],
        bdi: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        bdo: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        big: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        blockquote: typings.react.mod.DetailedHTMLProps[typings.react.mod.BlockquoteHTMLAttributes[HTMLElement], HTMLElement],
        body: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLBodyElement], HTMLBodyElement],
        br: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLBRElement], HTMLBRElement],
        button: typings.react.mod.DetailedHTMLProps[typings.react.mod.ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement],
        canvas: typings.react.mod.DetailedHTMLProps[typings.react.mod.CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement],
        caption: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        circle: typings.react.mod.SVGProps[SVGCircleElement],
        cite: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        clipPath: typings.react.mod.SVGProps[SVGClipPathElement],
        code: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        col: typings.react.mod.DetailedHTMLProps[typings.react.mod.ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement],
        colgroup: typings.react.mod.DetailedHTMLProps[typings.react.mod.ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement],
        data: typings.react.mod.DetailedHTMLProps[typings.react.mod.DataHTMLAttributes[HTMLDataElement], HTMLDataElement],
        datalist: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLDataListElement], HTMLDataListElement],
        dd: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        defs: typings.react.mod.SVGProps[SVGDefsElement],
        del: typings.react.mod.DetailedHTMLProps[typings.react.mod.DelHTMLAttributes[HTMLElement], HTMLElement],
        desc: typings.react.mod.SVGProps[SVGDescElement],
        details: typings.react.mod.DetailedHTMLProps[typings.react.mod.DetailsHTMLAttributes[HTMLElement], HTMLElement],
        dfn: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        dialog: typings.react.mod.DetailedHTMLProps[typings.react.mod.DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement],
        div: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLDivElement], HTMLDivElement],
        dl: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLDListElement], HTMLDListElement],
        dt: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        ellipse: typings.react.mod.SVGProps[SVGEllipseElement],
        em: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        embed: typings.react.mod.DetailedHTMLProps[typings.react.mod.EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement],
        feBlend: typings.react.mod.SVGProps[SVGFEBlendElement],
        feColorMatrix: typings.react.mod.SVGProps[SVGFEColorMatrixElement],
        feComponentTransfer: typings.react.mod.SVGProps[SVGFEComponentTransferElement],
        feComposite: typings.react.mod.SVGProps[SVGFECompositeElement],
        feConvolveMatrix: typings.react.mod.SVGProps[SVGFEConvolveMatrixElement],
        feDiffuseLighting: typings.react.mod.SVGProps[SVGFEDiffuseLightingElement],
        feDisplacementMap: typings.react.mod.SVGProps[SVGFEDisplacementMapElement],
        feDistantLight: typings.react.mod.SVGProps[SVGFEDistantLightElement],
        feDropShadow: typings.react.mod.SVGProps[SVGFEDropShadowElement],
        feFlood: typings.react.mod.SVGProps[SVGFEFloodElement],
        feFuncA: typings.react.mod.SVGProps[SVGFEFuncAElement],
        feFuncB: typings.react.mod.SVGProps[SVGFEFuncBElement],
        feFuncG: typings.react.mod.SVGProps[SVGFEFuncGElement],
        feFuncR: typings.react.mod.SVGProps[SVGFEFuncRElement],
        feGaussianBlur: typings.react.mod.SVGProps[SVGFEGaussianBlurElement],
        feImage: typings.react.mod.SVGProps[SVGFEImageElement],
        feMerge: typings.react.mod.SVGProps[SVGFEMergeElement],
        feMergeNode: typings.react.mod.SVGProps[SVGFEMergeNodeElement],
        feMorphology: typings.react.mod.SVGProps[SVGFEMorphologyElement],
        feOffset: typings.react.mod.SVGProps[SVGFEOffsetElement],
        fePointLight: typings.react.mod.SVGProps[SVGFEPointLightElement],
        feSpecularLighting: typings.react.mod.SVGProps[SVGFESpecularLightingElement],
        feSpotLight: typings.react.mod.SVGProps[SVGFESpotLightElement],
        feTile: typings.react.mod.SVGProps[SVGFETileElement],
        feTurbulence: typings.react.mod.SVGProps[SVGFETurbulenceElement],
        fieldset: typings.react.mod.DetailedHTMLProps[typings.react.mod.FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement],
        figcaption: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        figure: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        filter: typings.react.mod.SVGProps[SVGFilterElement],
        footer: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        foreignObject: typings.react.mod.SVGProps[SVGForeignObjectElement],
        form: typings.react.mod.DetailedHTMLProps[typings.react.mod.FormHTMLAttributes[HTMLFormElement], HTMLFormElement],
        g: typings.react.mod.SVGProps[SVGGElement],
        h1: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        h2: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        h3: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        h4: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        h5: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        h6: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        head: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadElement], HTMLHeadElement],
        header: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        hgroup: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        hr: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHRElement], HTMLHRElement],
        html: typings.react.mod.DetailedHTMLProps[typings.react.mod.HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement],
        i: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        iframe: typings.react.mod.DetailedHTMLProps[typings.react.mod.IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement],
        image: typings.react.mod.SVGProps[SVGImageElement],
        img: typings.react.mod.DetailedHTMLProps[typings.react.mod.ImgHTMLAttributes[HTMLImageElement], HTMLImageElement],
        input: typings.react.mod.DetailedHTMLProps[typings.react.mod.InputHTMLAttributes[HTMLInputElement], HTMLInputElement],
        ins: typings.react.mod.DetailedHTMLProps[typings.react.mod.InsHTMLAttributes[HTMLModElement], HTMLModElement],
        kbd: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        keygen: typings.react.mod.DetailedHTMLProps[typings.react.mod.KeygenHTMLAttributes[HTMLElement], HTMLElement],
        label: typings.react.mod.DetailedHTMLProps[typings.react.mod.LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement],
        legend: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLLegendElement], HTMLLegendElement],
        li: typings.react.mod.DetailedHTMLProps[typings.react.mod.LiHTMLAttributes[HTMLLIElement], HTMLLIElement],
        line: typings.react.mod.SVGProps[SVGLineElement],
        linearGradient: typings.react.mod.SVGProps[SVGLinearGradientElement],
        link: typings.react.mod.DetailedHTMLProps[typings.react.mod.LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement],
        main: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        map: typings.react.mod.DetailedHTMLProps[typings.react.mod.MapHTMLAttributes[HTMLMapElement], HTMLMapElement],
        mark: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        marker: typings.react.mod.SVGProps[SVGMarkerElement],
        mask: typings.react.mod.SVGProps[SVGMaskElement],
        menu: typings.react.mod.DetailedHTMLProps[typings.react.mod.MenuHTMLAttributes[HTMLElement], HTMLElement],
        menuitem: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        meta: typings.react.mod.DetailedHTMLProps[typings.react.mod.MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement],
        metadata: typings.react.mod.SVGProps[SVGMetadataElement],
        meter: typings.react.mod.DetailedHTMLProps[typings.react.mod.MeterHTMLAttributes[HTMLElement], HTMLElement],
        mpath: typings.react.mod.SVGProps[SVGElement],
        nav: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        noindex: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        noscript: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        `object`: typings.react.mod.DetailedHTMLProps[typings.react.mod.ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement],
        ol: typings.react.mod.DetailedHTMLProps[typings.react.mod.OlHTMLAttributes[HTMLOListElement], HTMLOListElement],
        optgroup: typings.react.mod.DetailedHTMLProps[typings.react.mod.OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement],
        option: typings.react.mod.DetailedHTMLProps[typings.react.mod.OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement],
        output: typings.react.mod.DetailedHTMLProps[typings.react.mod.OutputHTMLAttributes[HTMLElement], HTMLElement],
        p: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement],
        param: typings.react.mod.DetailedHTMLProps[typings.react.mod.ParamHTMLAttributes[HTMLParamElement], HTMLParamElement],
        path: typings.react.mod.SVGProps[SVGPathElement],
        pattern: typings.react.mod.SVGProps[SVGPatternElement],
        picture: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        polygon: typings.react.mod.SVGProps[SVGPolygonElement],
        polyline: typings.react.mod.SVGProps[SVGPolylineElement],
        pre: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLPreElement], HTMLPreElement],
        progress: typings.react.mod.DetailedHTMLProps[typings.react.mod.ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement],
        q: typings.react.mod.DetailedHTMLProps[typings.react.mod.QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement],
        radialGradient: typings.react.mod.SVGProps[SVGRadialGradientElement],
        rect: typings.react.mod.SVGProps[SVGRectElement],
        rp: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        rt: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        ruby: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        s: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        samp: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        script: typings.react.mod.DetailedHTMLProps[typings.react.mod.ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement],
        section: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        select: typings.react.mod.DetailedHTMLProps[typings.react.mod.SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement],
        slot: typings.react.mod.DetailedHTMLProps[typings.react.mod.SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement],
        small: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        source: typings.react.mod.DetailedHTMLProps[typings.react.mod.SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement],
        span: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLSpanElement], HTMLSpanElement],
        stop: typings.react.mod.SVGProps[SVGStopElement],
        strong: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        style: typings.react.mod.DetailedHTMLProps[typings.react.mod.StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement],
        sub: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        summary: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        sup: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        svg: typings.react.mod.SVGProps[SVGSVGElement],
        switch: typings.react.mod.SVGProps[SVGSwitchElement],
        symbol: typings.react.mod.SVGProps[SVGSymbolElement],
        table: typings.react.mod.DetailedHTMLProps[typings.react.mod.TableHTMLAttributes[HTMLTableElement], HTMLTableElement],
        tbody: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement],
        td: typings.react.mod.DetailedHTMLProps[
              typings.react.mod.TdHTMLAttributes[HTMLTableDataCellElement], 
              HTMLTableDataCellElement
            ],
        template: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement],
        text: typings.react.mod.SVGProps[SVGTextElement],
        textPath: typings.react.mod.SVGProps[SVGTextPathElement],
        textarea: typings.react.mod.DetailedHTMLProps[typings.react.mod.TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement],
        tfoot: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement],
        th: typings.react.mod.DetailedHTMLProps[
              typings.react.mod.ThHTMLAttributes[HTMLTableHeaderCellElement], 
              HTMLTableHeaderCellElement
            ],
        thead: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement],
        time: typings.react.mod.DetailedHTMLProps[typings.react.mod.TimeHTMLAttributes[HTMLElement], HTMLElement],
        title: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTitleElement], HTMLTitleElement],
        tr: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement],
        track: typings.react.mod.DetailedHTMLProps[typings.react.mod.TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement],
        tspan: typings.react.mod.SVGProps[SVGTSpanElement],
        u: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        ul: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLUListElement], HTMLUListElement],
        use: typings.react.mod.SVGProps[SVGUseElement],
        `var`: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        video: typings.react.mod.DetailedHTMLProps[typings.react.mod.VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement],
        view: typings.react.mod.SVGProps[SVGViewElement],
        wbr: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement],
        webview: typings.react.mod.DetailedHTMLProps[typings.react.mod.WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]
      ): IntrinsicElements = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateMotion = animateMotion.asInstanceOf[js.Any], animateTransform = animateTransform.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], feBlend = feBlend.asInstanceOf[js.Any], feColorMatrix = feColorMatrix.asInstanceOf[js.Any], feComponentTransfer = feComponentTransfer.asInstanceOf[js.Any], feComposite = feComposite.asInstanceOf[js.Any], feConvolveMatrix = feConvolveMatrix.asInstanceOf[js.Any], feDiffuseLighting = feDiffuseLighting.asInstanceOf[js.Any], feDisplacementMap = feDisplacementMap.asInstanceOf[js.Any], feDistantLight = feDistantLight.asInstanceOf[js.Any], feDropShadow = feDropShadow.asInstanceOf[js.Any], feFlood = feFlood.asInstanceOf[js.Any], feFuncA = feFuncA.asInstanceOf[js.Any], feFuncB = feFuncB.asInstanceOf[js.Any], feFuncG = feFuncG.asInstanceOf[js.Any], feFuncR = feFuncR.asInstanceOf[js.Any], feGaussianBlur = feGaussianBlur.asInstanceOf[js.Any], feImage = feImage.asInstanceOf[js.Any], feMerge = feMerge.asInstanceOf[js.Any], feMergeNode = feMergeNode.asInstanceOf[js.Any], feMorphology = feMorphology.asInstanceOf[js.Any], feOffset = feOffset.asInstanceOf[js.Any], fePointLight = fePointLight.asInstanceOf[js.Any], feSpecularLighting = feSpecularLighting.asInstanceOf[js.Any], feSpotLight = feSpotLight.asInstanceOf[js.Any], feTile = feTile.asInstanceOf[js.Any], feTurbulence = feTurbulence.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], foreignObject = foreignObject.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], keygen = keygen.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linearGradient = linearGradient.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], mpath = mpath.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noindex = noindex.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialGradient = radialGradient.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textPath = textPath.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], tspan = tspan.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
        __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
        __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
      
      @scala.inline
      implicit class IntrinsicElementsMutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]
        ): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAbbr(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddress(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimate(value: typings.react.mod.SVGProps[SVGElement]): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimateMotion(value: typings.react.mod.SVGProps[SVGElement]): Self = StObject.set(x, "animateMotion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimateTransform(value: typings.react.mod.SVGProps[SVGElement]): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArea(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement]
        ): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArticle(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAside(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudio(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement]
        ): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setB(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBase(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement]
        ): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBdi(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBdo(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBig(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockquote(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.BlockquoteHTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBody(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLBodyElement], HTMLBodyElement]
        ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBr(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLBRElement], HTMLBRElement]
        ): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButton(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]
        ): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCanvas(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement]
        ): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaption(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCircle(value: typings.react.mod.SVGProps[SVGCircleElement]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCite(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClipPath(value: typings.react.mod.SVGProps[SVGClipPathElement]): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCode(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCol(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement]
        ): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColgroup(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement]
        ): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.DataHTMLAttributes[HTMLDataElement], HTMLDataElement]
        ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatalist(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLDataListElement], HTMLDataListElement]
        ): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDd(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefs(value: typings.react.mod.SVGProps[SVGDefsElement]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDel(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.DelHTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDesc(value: typings.react.mod.SVGProps[SVGDescElement]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetails(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.DetailsHTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDfn(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDialog(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement]
        ): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDiv(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLDivElement], HTMLDivElement]
        ): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDl(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLDListElement], HTMLDListElement]
        ): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDt(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEllipse(value: typings.react.mod.SVGProps[SVGEllipseElement]): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEm(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmbed(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement]
        ): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeBlend(value: typings.react.mod.SVGProps[SVGFEBlendElement]): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeColorMatrix(value: typings.react.mod.SVGProps[SVGFEColorMatrixElement]): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeComponentTransfer(value: typings.react.mod.SVGProps[SVGFEComponentTransferElement]): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeComposite(value: typings.react.mod.SVGProps[SVGFECompositeElement]): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeConvolveMatrix(value: typings.react.mod.SVGProps[SVGFEConvolveMatrixElement]): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDiffuseLighting(value: typings.react.mod.SVGProps[SVGFEDiffuseLightingElement]): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDisplacementMap(value: typings.react.mod.SVGProps[SVGFEDisplacementMapElement]): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDistantLight(value: typings.react.mod.SVGProps[SVGFEDistantLightElement]): Self = StObject.set(x, "feDistantLight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDropShadow(value: typings.react.mod.SVGProps[SVGFEDropShadowElement]): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFlood(value: typings.react.mod.SVGProps[SVGFEFloodElement]): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncA(value: typings.react.mod.SVGProps[SVGFEFuncAElement]): Self = StObject.set(x, "feFuncA", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncB(value: typings.react.mod.SVGProps[SVGFEFuncBElement]): Self = StObject.set(x, "feFuncB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncG(value: typings.react.mod.SVGProps[SVGFEFuncGElement]): Self = StObject.set(x, "feFuncG", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncR(value: typings.react.mod.SVGProps[SVGFEFuncRElement]): Self = StObject.set(x, "feFuncR", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeGaussianBlur(value: typings.react.mod.SVGProps[SVGFEGaussianBlurElement]): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeImage(value: typings.react.mod.SVGProps[SVGFEImageElement]): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMerge(value: typings.react.mod.SVGProps[SVGFEMergeElement]): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMergeNode(value: typings.react.mod.SVGProps[SVGFEMergeNodeElement]): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMorphology(value: typings.react.mod.SVGProps[SVGFEMorphologyElement]): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeOffset(value: typings.react.mod.SVGProps[SVGFEOffsetElement]): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFePointLight(value: typings.react.mod.SVGProps[SVGFEPointLightElement]): Self = StObject.set(x, "fePointLight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeSpecularLighting(value: typings.react.mod.SVGProps[SVGFESpecularLightingElement]): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeSpotLight(value: typings.react.mod.SVGProps[SVGFESpotLightElement]): Self = StObject.set(x, "feSpotLight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeTile(value: typings.react.mod.SVGProps[SVGFETileElement]): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeTurbulence(value: typings.react.mod.SVGProps[SVGFETurbulenceElement]): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldset(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement]
        ): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFigcaption(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFigure(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilter(value: typings.react.mod.SVGProps[SVGFilterElement]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFooter(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForeignObject(value: typings.react.mod.SVGProps[SVGForeignObjectElement]): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForm(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.FormHTMLAttributes[HTMLFormElement], HTMLFormElement]
        ): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setG(value: typings.react.mod.SVGProps[SVGGElement]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH1(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
        ): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH2(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
        ): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH3(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
        ): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH4(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
        ): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH5(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
        ): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH6(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
        ): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHead(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHeadElement], HTMLHeadElement]
        ): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeader(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHgroup(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHr(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLHRElement], HTMLHRElement]
        ): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtml(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]
        ): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setI(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIframe(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement]
        ): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImage(value: typings.react.mod.SVGProps[SVGImageElement]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImg(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]
        ): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInput(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.InputHTMLAttributes[HTMLInputElement], HTMLInputElement]
        ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIns(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.InsHTMLAttributes[HTMLModElement], HTMLModElement]
        ): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKbd(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeygen(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.KeygenHTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "keygen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement]
        ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegend(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLLegendElement], HTMLLegendElement]
        ): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLi(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.LiHTMLAttributes[HTMLLIElement], HTMLLIElement]
        ): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLine(value: typings.react.mod.SVGProps[SVGLineElement]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinearGradient(value: typings.react.mod.SVGProps[SVGLinearGradientElement]): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLink(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]
        ): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMain(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMap(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.MapHTMLAttributes[HTMLMapElement], HTMLMapElement]
        ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMark(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarker(value: typings.react.mod.SVGProps[SVGMarkerElement]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMask(value: typings.react.mod.SVGProps[SVGMaskElement]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenu(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.MenuHTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenuitem(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeta(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]
        ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: typings.react.mod.SVGProps[SVGMetadataElement]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeter(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.MeterHTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMpath(value: typings.react.mod.SVGProps[SVGElement]): Self = StObject.set(x, "mpath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNav(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoindex(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "noindex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoscript(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObject(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement]
        ): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOl(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.OlHTMLAttributes[HTMLOListElement], HTMLOListElement]
        ): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptgroup(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement]
        ): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOption(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement]
        ): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutput(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.OutputHTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setP(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement]
        ): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParam(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.ParamHTMLAttributes[HTMLParamElement], HTMLParamElement]
        ): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPath(value: typings.react.mod.SVGProps[SVGPathElement]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPattern(value: typings.react.mod.SVGProps[SVGPatternElement]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPicture(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolygon(value: typings.react.mod.SVGProps[SVGPolygonElement]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolyline(value: typings.react.mod.SVGProps[SVGPolylineElement]): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPre(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLPreElement], HTMLPreElement]
        ): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProgress(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement]
        ): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQ(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]
        ): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRadialGradient(value: typings.react.mod.SVGProps[SVGRadialGradientElement]): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRect(value: typings.react.mod.SVGProps[SVGRectElement]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRp(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRt(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuby(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setS(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSamp(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScript(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement]
        ): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSection(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelect(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement]
        ): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlot(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement]
        ): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSmall(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement]
        ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpan(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLSpanElement], HTMLSpanElement]
        ): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStop(value: typings.react.mod.SVGProps[SVGStopElement]): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrong(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyle(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement]
        ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSub(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummary(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSup(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSvg(value: typings.react.mod.SVGProps[SVGSVGElement]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSwitch(value: typings.react.mod.SVGProps[SVGSwitchElement]): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbol(value: typings.react.mod.SVGProps[SVGSymbolElement]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTable(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.TableHTMLAttributes[HTMLTableElement], HTMLTableElement]
        ): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTbody(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
        ): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTd(
          value: typings.react.mod.DetailedHTMLProps[
                  typings.react.mod.TdHTMLAttributes[HTMLTableDataCellElement], 
                  HTMLTableDataCellElement
                ]
        ): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplate(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement]
        ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: typings.react.mod.SVGProps[SVGTextElement]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextPath(value: typings.react.mod.SVGProps[SVGTextPathElement]): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextarea(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]
        ): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTfoot(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
        ): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTh(
          value: typings.react.mod.DetailedHTMLProps[
                  typings.react.mod.ThHTMLAttributes[HTMLTableHeaderCellElement], 
                  HTMLTableHeaderCellElement
                ]
        ): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThead(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
        ): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTime(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.TimeHTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTitleElement], HTMLTitleElement]
        ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTr(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement]
        ): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrack(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement]
        ): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTspan(value: typings.react.mod.SVGProps[SVGTSpanElement]): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setU(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUl(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLUListElement], HTMLUListElement]
        ): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUse(value: typings.react.mod.SVGProps[SVGUseElement]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVar(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideo(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]
        ): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setView(value: typings.react.mod.SVGProps[SVGViewElement]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWbr(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[HTMLElement], HTMLElement]
        ): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebview(
          value: typings.react.mod.DetailedHTMLProps[typings.react.mod.WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]
        ): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
      }
    }
    
    // We can't recurse forever because `type` can't be self-referential;
    // let's assume it's reasonable to do a single React.lazy() around a single React.memo() / vice-versa
    type LibraryManagedAttributes[C, P] = ReactManagedAttributes[js.Any | C, P]
  }
}
