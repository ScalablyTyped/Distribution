package typings.reactLib

import org.scalablytyped.runtime.{Instantiable1, Instantiable2}
import typings.reactLib.reactMod.ReactNs._
import typings.reactLib.reactMod.^
import typings.stdLib.^.{Object, console}
import typings.{reactLib, stdLib}

import scala.language.{higherKinds, implicitConversions}
import scala.scalajs.js.|
import scala.scalajs.{LinkingInfo, js}

object dsl {

  object define {
    /* define a functional component */
    def fc[P](f: js.Function1[P with Anon_Children, ReactNode]): FC[P] =
      f.asInstanceOf[FC[P]]
  }

  @inline implicit def fromComponent[P](_ctor: ComponentClass[P, _]): BuildComponent[P] = dsl.c(_ctor)

  @inline implicit def fromInstantiable1[P](_ctor: Instantiable1[P, ReactElement[_]]): BuildComponent[P] =
    dsl.c(_ctor)

  @inline implicit def fromInstantiable2[P](_ctor: Instantiable2[P, _, ReactElement[_]]): BuildComponent[P] =
    dsl.c(_ctor)

  @inline implicit def fromFc[P](_ctor: FunctionComponent[P]): BuildComponent[P] = dsl.c(_ctor)

  @inline final class BuildIntrinsic[P[e] <: DOMAttributes[e], E](
                                                                   tpe: String,
                                                                   _key: js.UndefOr[Key] = js.undefined,
                                                                   _ref: js.UndefOr[Ref[E]] = js.undefined
                                                                 ) {

    @inline def withKey(newKey: Key): BuildIntrinsic[P, E] =
      new BuildIntrinsic[P, E](tpe, newKey, _ref)

    @inline def withRef(newRef: Ref[E]): BuildIntrinsic[P, E] =
      new BuildIntrinsic[P, E](tpe, _key, newRef)

    @inline protected def fullProps(props: P[E] | Null): ClassAttributes[E] with (P[E] | Null) =
      Object.assign[ClassAttributes[E], P[E] | Null](
        new ClassAttributes[E] {
          key = _key
          ref = _ref
        },
        props,
      )

    @inline def noprops(children: ReactNode*): ReactElement[P[E]] =
      ^.createElement[P[E], E](tpe, fullProps(null), children: _*)

    @inline def props(props: P[E], children: ReactNode*): ReactElement[P[E]] =
      ^.createElement[P[E], E](tpe, fullProps(props), children: _*)
  }

  lazy val a = new BuildIntrinsic[AnchorHTMLAttributes, stdLib.HTMLAnchorElement]("a")
  lazy val abbr = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("abbr")
  lazy val address = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("address")
  lazy val animate = new BuildIntrinsic[SVGAttributes, stdLib.SVGElement]("animate")
  lazy val animateTransform = new BuildIntrinsic[SVGAttributes, stdLib.SVGElement]("animateTransform")
  lazy val area = new BuildIntrinsic[AreaHTMLAttributes, stdLib.HTMLAreaElement]("area")
  lazy val article = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("article")
  lazy val aside = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("aside")
  lazy val audio = new BuildIntrinsic[AudioHTMLAttributes, stdLib.HTMLAudioElement]("audio")
  lazy val b = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("b")
  lazy val base = new BuildIntrinsic[BaseHTMLAttributes, stdLib.HTMLBaseElement]("base")
  lazy val bdi = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("bdi")
  lazy val bdo = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("bdo")
  lazy val big = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("big")
  lazy val blockquote = new BuildIntrinsic[BlockquoteHTMLAttributes, stdLib.HTMLElement]("blockquote")
  lazy val body = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLBodyElement]("body")
  lazy val br = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLBRElement]("br")
  lazy val button = new BuildIntrinsic[ButtonHTMLAttributes, stdLib.HTMLButtonElement]("button")
  lazy val canvas = new BuildIntrinsic[CanvasHTMLAttributes, stdLib.HTMLCanvasElement]("canvas")
  lazy val caption = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("caption")
  lazy val circle = new BuildIntrinsic[SVGAttributes, stdLib.SVGCircleElement]("circle")
  lazy val cite = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("cite")
  lazy val clipPath = new BuildIntrinsic[SVGAttributes, stdLib.SVGClipPathElement]("clipPath")
  lazy val code = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("code")
  lazy val col = new BuildIntrinsic[ColHTMLAttributes, stdLib.HTMLTableColElement]("col")
  lazy val colgroup = new BuildIntrinsic[ColgroupHTMLAttributes, stdLib.HTMLTableColElement]("colgroup")
  lazy val data = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("data")
  lazy val datalist = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLDataListElement]("datalist")
  lazy val dd = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("dd")
  lazy val defs = new BuildIntrinsic[SVGAttributes, stdLib.SVGDefsElement]("defs")
  lazy val del = new BuildIntrinsic[DelHTMLAttributes, stdLib.HTMLElement]("del")
  lazy val desc = new BuildIntrinsic[SVGAttributes, stdLib.SVGDescElement]("desc")
  lazy val details = new BuildIntrinsic[DetailsHTMLAttributes, stdLib.HTMLElement]("details")
  lazy val dfn = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("dfn")
  lazy val dialog = new BuildIntrinsic[DialogHTMLAttributes, stdLib.HTMLDialogElement]("dialog")
  lazy val div = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLDivElement]("div")
  lazy val dl = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLDListElement]("dl")
  lazy val dt = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("dt")
  lazy val ellipse = new BuildIntrinsic[SVGAttributes, stdLib.SVGEllipseElement]("ellipse")
  lazy val em = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("em")
  lazy val embed = new BuildIntrinsic[EmbedHTMLAttributes, stdLib.HTMLEmbedElement]("embed")
  lazy val feBlend = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEBlendElement]("feBlend")
  lazy val feColorMatrix = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEColorMatrixElement]("feColorMatrix")
  lazy val feComponentTransfer =
    new BuildIntrinsic[SVGAttributes, stdLib.SVGFEComponentTransferElement]("feComponentTransfer")
  lazy val feComposite = new BuildIntrinsic[SVGAttributes, stdLib.SVGFECompositeElement]("feComposite")
  lazy val feConvolveMatrix = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEConvolveMatrixElement]("feConvolveMatrix")
  lazy val feDiffuseLighting =
    new BuildIntrinsic[SVGAttributes, stdLib.SVGFEDiffuseLightingElement]("feDiffuseLighting")
  lazy val feDisplacementMap =
    new BuildIntrinsic[SVGAttributes, stdLib.SVGFEDisplacementMapElement]("feDisplacementMap")
  lazy val feDistantLight = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEDistantLightElement]("feDistantLight")
  lazy val feFlood = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEFloodElement]("feFlood")
  lazy val feFuncA = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEFuncAElement]("feFuncA")
  lazy val feFuncB = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEFuncBElement]("feFuncB")
  lazy val feFuncG = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEFuncGElement]("feFuncG")
  lazy val feFuncR = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEFuncRElement]("feFuncR")
  lazy val feGaussianBlur = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEGaussianBlurElement]("feGaussianBlur")
  lazy val feImage = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEImageElement]("feImage")
  lazy val feMerge = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEMergeElement]("feMerge")
  lazy val feMergeNode = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEMergeNodeElement]("feMergeNode")
  lazy val feMorphology = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEMorphologyElement]("feMorphology")
  lazy val feOffset = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEOffsetElement]("feOffset")
  lazy val fePointLight = new BuildIntrinsic[SVGAttributes, stdLib.SVGFEPointLightElement]("fePointLight")
  lazy val feSpecularLighting =
    new BuildIntrinsic[SVGAttributes, stdLib.SVGFESpecularLightingElement]("feSpecularLighting")
  lazy val feSpotLight = new BuildIntrinsic[SVGAttributes, stdLib.SVGFESpotLightElement]("feSpotLight")
  lazy val feTile = new BuildIntrinsic[SVGAttributes, stdLib.SVGFETileElement]("feTile")
  lazy val feTurbulence = new BuildIntrinsic[SVGAttributes, stdLib.SVGFETurbulenceElement]("feTurbulence")
  lazy val fieldset = new BuildIntrinsic[FieldsetHTMLAttributes, stdLib.HTMLFieldSetElement]("fieldset")
  lazy val figcaption = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("figcaption")
  lazy val figure = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("figure")
  lazy val filter = new BuildIntrinsic[SVGAttributes, stdLib.SVGFilterElement]("filter")
  lazy val footer = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("footer")
  lazy val foreignObject = new BuildIntrinsic[SVGAttributes, stdLib.SVGForeignObjectElement]("foreignObject")
  lazy val form = new BuildIntrinsic[FormHTMLAttributes, stdLib.HTMLFormElement]("form")
  lazy val g = new BuildIntrinsic[SVGAttributes, stdLib.SVGGElement]("g")
  lazy val h1 = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLHeadingElement]("h1")
  lazy val h2 = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLHeadingElement]("h2")
  lazy val h3 = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLHeadingElement]("h3")
  lazy val h4 = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLHeadingElement]("h4")
  lazy val h5 = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLHeadingElement]("h5")
  lazy val h6 = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLHeadingElement]("h6")
  lazy val head = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLHeadElement]("head")
  lazy val header = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("header")
  lazy val hgroup = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("hgroup")
  lazy val hr = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLHRElement]("hr")
  lazy val html = new BuildIntrinsic[HtmlHTMLAttributes, stdLib.HTMLHtmlElement]("html")
  lazy val i = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("i")
  lazy val iframe = new BuildIntrinsic[IframeHTMLAttributes, stdLib.HTMLIFrameElement]("iframe")
  lazy val image = new BuildIntrinsic[SVGAttributes, stdLib.SVGImageElement]("image")
  lazy val img = new BuildIntrinsic[ImgHTMLAttributes, stdLib.HTMLImageElement]("img")
  lazy val input = new BuildIntrinsic[InputHTMLAttributes, stdLib.HTMLInputElement]("input")
  lazy val ins = new BuildIntrinsic[InsHTMLAttributes, stdLib.HTMLModElement]("ins")
  lazy val kbd = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("kbd")
  lazy val keygen = new BuildIntrinsic[KeygenHTMLAttributes, stdLib.HTMLElement]("keygen")
  lazy val label = new BuildIntrinsic[LabelHTMLAttributes, stdLib.HTMLLabelElement]("label")
  lazy val legend = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLLegendElement]("legend")
  lazy val li = new BuildIntrinsic[LiHTMLAttributes, stdLib.HTMLLIElement]("li")
  lazy val line = new BuildIntrinsic[SVGAttributes, stdLib.SVGLineElement]("line")
  lazy val linearGradient = new BuildIntrinsic[SVGAttributes, stdLib.SVGLinearGradientElement]("linearGradient")
  lazy val link = new BuildIntrinsic[LinkHTMLAttributes, stdLib.HTMLLinkElement]("link")
  lazy val main = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("main")
  lazy val map = new BuildIntrinsic[MapHTMLAttributes, stdLib.HTMLMapElement]("map")
  lazy val mark = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("mark")
  lazy val marker = new BuildIntrinsic[SVGAttributes, stdLib.SVGMarkerElement]("marker")
  lazy val mask = new BuildIntrinsic[SVGAttributes, stdLib.SVGMaskElement]("mask")
  lazy val menu = new BuildIntrinsic[MenuHTMLAttributes, stdLib.HTMLElement]("menu")
  lazy val menuitem = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("menuitem")
  lazy val meta = new BuildIntrinsic[MetaHTMLAttributes, stdLib.HTMLMetaElement]("meta")
  lazy val metadata = new BuildIntrinsic[SVGAttributes, stdLib.SVGMetadataElement]("metadata")
  lazy val meter = new BuildIntrinsic[MeterHTMLAttributes, stdLib.HTMLElement]("meter")
  lazy val nav = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("nav")
  lazy val noindex = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("noindex")
  lazy val noscript = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("noscript")
  lazy val `object` = new BuildIntrinsic[ObjectHTMLAttributes, stdLib.HTMLObjectElement]("object")
  lazy val ol = new BuildIntrinsic[OlHTMLAttributes, stdLib.HTMLOListElement]("ol")
  lazy val optgroup = new BuildIntrinsic[OptgroupHTMLAttributes, stdLib.HTMLOptGroupElement]("optgroup")
  lazy val option = new BuildIntrinsic[OptionHTMLAttributes, stdLib.HTMLOptionElement]("option")
  lazy val output = new BuildIntrinsic[OutputHTMLAttributes, stdLib.HTMLElement]("output")
  lazy val p = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLParagraphElement]("p")
  lazy val param = new BuildIntrinsic[ParamHTMLAttributes, stdLib.HTMLParamElement]("param")
  lazy val path = new BuildIntrinsic[SVGAttributes, stdLib.SVGPathElement]("path")
  lazy val pattern = new BuildIntrinsic[SVGAttributes, stdLib.SVGPatternElement]("pattern")
  lazy val picture = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("picture")
  lazy val polygon = new BuildIntrinsic[SVGAttributes, stdLib.SVGPolygonElement]("polygon")
  lazy val polyline = new BuildIntrinsic[SVGAttributes, stdLib.SVGPolylineElement]("polyline")
  lazy val pre = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLPreElement]("pre")
  lazy val progress = new BuildIntrinsic[ProgressHTMLAttributes, stdLib.HTMLProgressElement]("progress")
  lazy val q = new BuildIntrinsic[QuoteHTMLAttributes, stdLib.HTMLQuoteElement]("q")
  lazy val radialGradient = new BuildIntrinsic[SVGAttributes, stdLib.SVGRadialGradientElement]("radialGradient")
  lazy val rect = new BuildIntrinsic[SVGAttributes, stdLib.SVGRectElement]("rect")
  lazy val rp = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("rp")
  lazy val rt = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("rt")
  lazy val ruby = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("ruby")
  lazy val s = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("s")
  lazy val samp = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("samp")
  lazy val script = new BuildIntrinsic[ScriptHTMLAttributes, stdLib.HTMLScriptElement]("script")
  lazy val section = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("section")
  lazy val select = new BuildIntrinsic[SelectHTMLAttributes, stdLib.HTMLSelectElement]("select")
  lazy val small = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("small")
  lazy val source = new BuildIntrinsic[SourceHTMLAttributes, stdLib.HTMLSourceElement]("source")
  lazy val span = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLSpanElement]("span")
  lazy val stop = new BuildIntrinsic[SVGAttributes, stdLib.SVGStopElement]("stop")
  lazy val strong = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("strong")
  lazy val style = new BuildIntrinsic[StyleHTMLAttributes, stdLib.HTMLStyleElement]("style")
  lazy val sub = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("sub")
  lazy val summary = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("summary")
  lazy val sup = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("sup")
  lazy val svg = new BuildIntrinsic[SVGAttributes, stdLib.SVGSVGElement]("svg")
  lazy val switch = new BuildIntrinsic[SVGAttributes, stdLib.SVGSwitchElement]("switch")
  lazy val symbol = new BuildIntrinsic[SVGAttributes, stdLib.SVGSymbolElement]("symbol")
  lazy val table = new BuildIntrinsic[TableHTMLAttributes, stdLib.HTMLTableElement]("table")
  lazy val tbody = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLTableSectionElement]("tbody")
  lazy val td = new BuildIntrinsic[TdHTMLAttributes, stdLib.HTMLTableDataCellElement]("td")
  lazy val text = new BuildIntrinsic[SVGAttributes, stdLib.SVGTextElement]("text")
  lazy val textPath = new BuildIntrinsic[SVGAttributes, stdLib.SVGTextPathElement]("textPath")
  lazy val textarea = new BuildIntrinsic[TextareaHTMLAttributes, stdLib.HTMLTextAreaElement]("textarea")
  lazy val tfoot = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLTableSectionElement]("tfoot")
  lazy val th = new BuildIntrinsic[ThHTMLAttributes, stdLib.HTMLTableHeaderCellElement]("th")
  lazy val thead = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLTableSectionElement]("thead")
  lazy val time = new BuildIntrinsic[TimeHTMLAttributes, stdLib.HTMLElement]("time")
  lazy val title = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLTitleElement]("title")
  lazy val tr = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLTableRowElement]("tr")
  lazy val track = new BuildIntrinsic[TrackHTMLAttributes, stdLib.HTMLTrackElement]("track")
  lazy val tspan = new BuildIntrinsic[SVGAttributes, stdLib.SVGTSpanElement]("tspan")
  lazy val u = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("u")
  lazy val ul = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLUListElement]("ul")
  lazy val use = new BuildIntrinsic[SVGAttributes, stdLib.SVGUseElement]("use")
  lazy val `var` = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("var")
  lazy val video = new BuildIntrinsic[VideoHTMLAttributes, stdLib.HTMLVideoElement]("video")
  lazy val view = new BuildIntrinsic[SVGAttributes, stdLib.SVGViewElement]("view")
  lazy val wbr = new BuildIntrinsic[HTMLAttributes, stdLib.HTMLElement]("wbr")
  lazy val webview = new BuildIntrinsic[WebViewHTMLAttributes, reactLib.HTMLWebViewElement]("webview")

  /**
    * ```scala
    * // component you want to use
    * class Foo extends React.Component[FooProps, ...]{...}
    *
    * // usage
    * dsl.cls[Foo].props(new FooProps{}, "child1", 2)
    * ```
    */
  @inline def cls[C <: Component[_, _, _]](implicit C: js.ConstructorTag[C]): InferProps[C] =
    C.constructor.asInstanceOf[InferProps[C]]

  @inline def c[P](_ctor: ComponentClass[P, _]): BuildComponent[P] =
    new BuildComponent[P](_ctor.asInstanceOf[ComponentClass[P, ComponentState]], js.undefined, js.undefined)

  @inline def c[P](_ctor: Instantiable1[P, ReactElement[_]]): BuildComponent[P] =
    new BuildComponent[P](_ctor.asInstanceOf[ComponentClass[P, ComponentState]], js.undefined, js.undefined)

  @inline def c[P](_ctor: Instantiable2[P, _, ReactElement[_]]): BuildComponent[P] =
    new BuildComponent[P](_ctor.asInstanceOf[ComponentClass[P, ComponentState]], js.undefined, js.undefined)

  // dodgy cast inside here, but I don't think it matters. let's see
  @inline def c[P](_ctor: FunctionComponent[P]): BuildComponent[P] =
    new BuildComponent[P](_ctor.asInstanceOf[ComponentClass[P, ComponentState]], js.undefined, js.undefined)

  @js.native
  trait InferProps[+C <: Component[_, _, _]] extends js.Object

  object InferProps {
    @inline implicit def builder[P](ctor: InferProps[Component[P, _, _]]): BuildComponent[P] =
      new BuildComponent[P](ctor.asInstanceOf[ComponentClass[P, ComponentState]])
  }

  /* we're having some instability with createElement and overloads, so just inline it for now*/
  @js.native
  sealed trait Hack extends js.Object {
    def createElement[P /* <: js.Object */ ](
                                              `type`: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState],
                                              props: reactLib.reactMod.ReactNs.Attributes with (P | scala.Null),
                                              children: reactLib.reactMod.ReactNs.ReactNode*
                                            ): reactLib.reactMod.ReactNs.ReactElement[P] = js.native

  }

  @inline final class BuildComponent[P] private[dsl](ctor: ComponentClass[P, ComponentState],
                                                     _key: js.UndefOr[Key] = js.undefined,
                                                     _ref: js.UndefOr[Ref[Component[P, ComponentState, _]]] = js.undefined) {

    @inline def withKey(newKey: Key): BuildComponent[P] =
      new BuildComponent(ctor, newKey, _ref)

    @inline def withRef(newRef: Ref[Component[P, ComponentState, _]]): BuildComponent[P] =
      new BuildComponent(ctor, _key, newRef)

    @inline protected def fullProps(props: P | Null): ClassAttributes[Component[P, ComponentState, _]] with (P | Null) =
      Object.assign[ClassAttributes[Component[P, ComponentState, _]], P | Null](
        new ClassAttributes[Component[P, ComponentState, _]] {
          key = _key
          ref = _ref
        },
        props,
      )

    @inline def props(props: P, children: ReactNode*): ReactElement[P] = {
      if (LinkingInfo.developmentMode && js.isUndefined(ctor))
        console.warn("Component was undefined",
          props.asInstanceOf[js.Any],
          _key.asInstanceOf[js.Any],
          _ref.asInstanceOf[js.Any],
          children)

      ^.asInstanceOf[Hack].createElement(ctor, fullProps(props), children: _*)
    }

    @inline def noprops(children: ReactNode*): ReactElement[P] = {
      if (LinkingInfo.developmentMode && js.isUndefined(ctor))
        console.warn("Component was undefined", _key.asInstanceOf[js.Any], _ref.asInstanceOf[js.Any], children)

      ^.asInstanceOf[Hack].createElement(ctor, fullProps(null), children: _*)
    }
  }

}
