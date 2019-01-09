package typings
package blissfuljsLib.BlissNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlissStatic extends js.Object {
  @JSName("$")
  var $_Original: BlissStaticCollection = js.native
  var classProps: js.Object = js.native
  var hooks: blissfuljsLib.Anon_Add = js.native
  @JSName("$")
  def $(expr: stdLib.Node): js.Array[stdLib.Node] = js.native
  @JSName("$")
  def $(expr: stdLib.Node, context: blissfuljsLib.Element): js.Array[stdLib.Node] = js.native
  @JSName("$")
  def $(expr: stdLib.Window): js.Array[stdLib.Window] = js.native
  @JSName("$")
  def $(expr: stdLib.Window, context: blissfuljsLib.Element): js.Array[stdLib.Window] = js.native
  @JSName("$")
  def $[T](expr: js.Object): blissfuljsLib.Array[T] = js.native
  @JSName("$")
  def $[T](expr: js.Object, context: blissfuljsLib.Element): blissfuljsLib.Array[T] = js.native
  @JSName("$")
  def $[T](selector: java.lang.String): BlissDecoratedArrayElement[T] = js.native
  @JSName("$")
  def $[T](selector: java.lang.String, context: blissfuljsLib.Element): BlissDecoratedArrayElement[T] = js.native
  @JSName("$")
  def $_TBlissDecoratedElement[T](selector: java.lang.String): BlissDecoratedElement[T] = js.native
  @JSName("$")
  def $_TBlissDecoratedElement[T](selector: java.lang.String, context: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def apply[T](selector: java.lang.String): BlissDecoratedElement[T] = js.native
  def apply[T](selector: java.lang.String, context: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def Class(options: blissfuljsLib.Anon_Abstract): js.Object = js.native
  @JSName("Class")
  def Class_TT[T](options: blissfuljsLib.Anon_Abstract): T = js.native
  def add(callbacks: org.scalablytyped.runtime.StringDictionary[js.Function]): scala.Unit = js.native
  def add(callbacks: org.scalablytyped.runtime.StringDictionary[js.Function], on: blissfuljsLib.Array[_]): scala.Unit = js.native
  def add(callbacks: org.scalablytyped.runtime.StringDictionary[js.Function], on: BlissStatic): scala.Unit = js.native
  def add(callbacks: org.scalablytyped.runtime.StringDictionary[js.Function], on: BlissStaticCollection): scala.Unit = js.native
  def add(callbacks: org.scalablytyped.runtime.StringDictionary[js.Function], on: blissfuljsLib.Element): scala.Unit = js.native
  def add(name: java.lang.String, callback: js.Function): scala.Unit = js.native
  def add(name: java.lang.String, callback: js.Function, on: blissfuljsLib.Array[_]): scala.Unit = js.native
  def add(name: java.lang.String, callback: js.Function, on: BlissStatic): scala.Unit = js.native
  def add(name: java.lang.String, callback: js.Function, on: BlissStaticCollection): scala.Unit = js.native
  def add(name: java.lang.String, callback: js.Function, on: blissfuljsLib.Element): scala.Unit = js.native
  def after[T](subject: BlissDecoratedElement[T], element: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def all(array: blissfuljsLib.Array[_], method: java.lang.String, args: js.Any*): blissfuljsLib.Array[_] = js.native
  @JSName("all")
  def all_T[T](array: blissfuljsLib.Array[T], method: java.lang.String, args: js.Any*): blissfuljsLib.Array[T] = js.native
  def around[T](subject: BlissDecoratedElement[T], element: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def attributes[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], attrs: js.Object): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def attributes[T](subject: BlissDecoratedElement[T], attrs: js.Object): BlissDecoratedElement[T] = js.native
  def before[T](subject: BlissDecoratedElement[T], element: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def clone[T](subject: BlissDecoratedElement[T]): BlissDecoratedElement[T] = js.native
  def contents[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], elements: blissfuljsLib.Array[_]): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def contents[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], elements: java.lang.String): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def contents[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], elements: js.Object): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def contents[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], elements: stdLib.Node): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def contents[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], elements: stdLib.Number): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def contents[T](subject: BlissDecoratedElement[T], elements: blissfuljsLib.Array[_]): BlissDecoratedElement[T] = js.native
  def contents[T](subject: BlissDecoratedElement[T], elements: java.lang.String): BlissDecoratedElement[T] = js.native
  def contents[T](subject: BlissDecoratedElement[T], elements: js.Object): BlissDecoratedElement[T] = js.native
  def contents[T](subject: BlissDecoratedElement[T], elements: stdLib.Node): BlissDecoratedElement[T] = js.native
  def contents[T](subject: BlissDecoratedElement[T], elements: stdLib.Number): BlissDecoratedElement[T] = js.native
  def create[T](args: js.Any*): BlissDecoratedElement[T] = js.native
  def create[T](options: js.Object): BlissDecoratedElement[T] = js.native
  def create[T](tag: java.lang.String): BlissDecoratedElement[T] = js.native
  def create[T](tag: java.lang.String, options: js.Object): BlissDecoratedElement[T] = js.native
  @JSName("create")
  def create_a(tag: blissfuljsLib.blissfuljsLibStrings.a): stdLib.HTMLAnchorElement = js.native
  @JSName("create")
  def create_a(tag: blissfuljsLib.blissfuljsLibStrings.a, options: js.Object): stdLib.HTMLAnchorElement = js.native
  @JSName("create")
  def create_applet(tag: blissfuljsLib.blissfuljsLibStrings.applet): stdLib.HTMLAppletElement = js.native
  @JSName("create")
  def create_applet(tag: blissfuljsLib.blissfuljsLibStrings.applet, options: js.Object): stdLib.HTMLAppletElement = js.native
  @JSName("create")
  def create_area(tag: blissfuljsLib.blissfuljsLibStrings.area): stdLib.HTMLAreaElement = js.native
  @JSName("create")
  def create_area(tag: blissfuljsLib.blissfuljsLibStrings.area, options: js.Object): stdLib.HTMLAreaElement = js.native
  @JSName("create")
  def create_audio(tag: blissfuljsLib.blissfuljsLibStrings.audio): stdLib.HTMLAudioElement = js.native
  @JSName("create")
  def create_audio(tag: blissfuljsLib.blissfuljsLibStrings.audio, options: js.Object): stdLib.HTMLAudioElement = js.native
  @JSName("create")
  def create_base(tag: blissfuljsLib.blissfuljsLibStrings.base): stdLib.HTMLBaseElement = js.native
  @JSName("create")
  def create_base(tag: blissfuljsLib.blissfuljsLibStrings.base, options: js.Object): stdLib.HTMLBaseElement = js.native
  @JSName("create")
  def create_basefont(tag: blissfuljsLib.blissfuljsLibStrings.basefont): stdLib.HTMLBaseFontElement = js.native
  @JSName("create")
  def create_basefont(tag: blissfuljsLib.blissfuljsLibStrings.basefont, options: js.Object): stdLib.HTMLBaseFontElement = js.native
  @JSName("create")
  def create_blockquote(tag: blissfuljsLib.blissfuljsLibStrings.blockquote): stdLib.HTMLQuoteElement = js.native
  @JSName("create")
  def create_blockquote(tag: blissfuljsLib.blissfuljsLibStrings.blockquote, options: js.Object): stdLib.HTMLQuoteElement = js.native
  @JSName("create")
  def create_body(tag: blissfuljsLib.blissfuljsLibStrings.body): stdLib.HTMLBodyElement = js.native
  @JSName("create")
  def create_body(tag: blissfuljsLib.blissfuljsLibStrings.body, options: js.Object): stdLib.HTMLBodyElement = js.native
  @JSName("create")
  def create_br(tag: blissfuljsLib.blissfuljsLibStrings.br): stdLib.HTMLBRElement = js.native
  @JSName("create")
  def create_br(tag: blissfuljsLib.blissfuljsLibStrings.br, options: js.Object): stdLib.HTMLBRElement = js.native
  @JSName("create")
  def create_button(tag: blissfuljsLib.blissfuljsLibStrings.button): stdLib.HTMLButtonElement = js.native
  @JSName("create")
  def create_button(tag: blissfuljsLib.blissfuljsLibStrings.button, options: js.Object): stdLib.HTMLButtonElement = js.native
  @JSName("create")
  def create_canvas(tag: blissfuljsLib.blissfuljsLibStrings.canvas): stdLib.HTMLCanvasElement = js.native
  @JSName("create")
  def create_canvas(tag: blissfuljsLib.blissfuljsLibStrings.canvas, options: js.Object): stdLib.HTMLCanvasElement = js.native
  @JSName("create")
  def create_datalist(tag: blissfuljsLib.blissfuljsLibStrings.datalist): stdLib.HTMLDataListElement = js.native
  @JSName("create")
  def create_datalist(tag: blissfuljsLib.blissfuljsLibStrings.datalist, options: js.Object): stdLib.HTMLDataListElement = js.native
  @JSName("create")
  def create_dd(tag: blissfuljsLib.blissfuljsLibStrings.dd): stdLib.HTMLElement = js.native
  @JSName("create")
  def create_dd(tag: blissfuljsLib.blissfuljsLibStrings.dd, options: js.Object): stdLib.HTMLElement = js.native
  @JSName("create")
  def create_directory(tag: blissfuljsLib.blissfuljsLibStrings.directory): stdLib.HTMLDirectoryElement = js.native
  @JSName("create")
  def create_directory(tag: blissfuljsLib.blissfuljsLibStrings.directory, options: js.Object): stdLib.HTMLDirectoryElement = js.native
  @JSName("create")
  def create_div(tag: blissfuljsLib.blissfuljsLibStrings.div): stdLib.HTMLDivElement = js.native
  @JSName("create")
  def create_div(tag: blissfuljsLib.blissfuljsLibStrings.div, options: js.Object): stdLib.HTMLDivElement = js.native
  @JSName("create")
  def create_embeded(tag: blissfuljsLib.blissfuljsLibStrings.embeded): stdLib.HTMLEmbedElement = js.native
  @JSName("create")
  def create_embeded(tag: blissfuljsLib.blissfuljsLibStrings.embeded, options: js.Object): stdLib.HTMLEmbedElement = js.native
  @JSName("create")
  def create_fieldset(tag: blissfuljsLib.blissfuljsLibStrings.fieldset): stdLib.HTMLFieldSetElement = js.native
  @JSName("create")
  def create_fieldset(tag: blissfuljsLib.blissfuljsLibStrings.fieldset, options: js.Object): stdLib.HTMLFieldSetElement = js.native
  @JSName("create")
  def create_form(tag: blissfuljsLib.blissfuljsLibStrings.form): stdLib.HTMLFormElement = js.native
  @JSName("create")
  def create_form(tag: blissfuljsLib.blissfuljsLibStrings.form, options: js.Object): stdLib.HTMLFormElement = js.native
  @JSName("create")
  def create_frame(tag: blissfuljsLib.blissfuljsLibStrings.frame): stdLib.HTMLFrameElement = js.native
  @JSName("create")
  def create_frame(tag: blissfuljsLib.blissfuljsLibStrings.frame, options: js.Object): stdLib.HTMLFrameElement = js.native
  @JSName("create")
  def create_frameset(tag: blissfuljsLib.blissfuljsLibStrings.frameset): stdLib.HTMLFrameSetElement = js.native
  @JSName("create")
  def create_frameset(tag: blissfuljsLib.blissfuljsLibStrings.frameset, options: js.Object): stdLib.HTMLFrameSetElement = js.native
  @JSName("create")
  def create_i(tag: blissfuljsLib.blissfuljsLibStrings.i): stdLib.HTMLLIElement = js.native
  @JSName("create")
  def create_i(tag: blissfuljsLib.blissfuljsLibStrings.i, options: js.Object): stdLib.HTMLLIElement = js.native
  @JSName("create")
  def create_iframe(tag: blissfuljsLib.blissfuljsLibStrings.iframe): stdLib.HTMLDListElement = js.native
  @JSName("create")
  def create_iframe(tag: blissfuljsLib.blissfuljsLibStrings.iframe, options: js.Object): stdLib.HTMLDListElement = js.native
  @JSName("create")
  def create_image(tag: blissfuljsLib.blissfuljsLibStrings.image): stdLib.HTMLImageElement = js.native
  @JSName("create")
  def create_image(tag: blissfuljsLib.blissfuljsLibStrings.image, options: js.Object): stdLib.HTMLImageElement = js.native
  @JSName("create")
  def create_input(tag: blissfuljsLib.blissfuljsLibStrings.input): stdLib.HTMLInputElement = js.native
  @JSName("create")
  def create_input(tag: blissfuljsLib.blissfuljsLibStrings.input, options: js.Object): stdLib.HTMLInputElement = js.native
  @JSName("create")
  def create_label(tag: blissfuljsLib.blissfuljsLibStrings.label): stdLib.HTMLLabelElement = js.native
  @JSName("create")
  def create_label(tag: blissfuljsLib.blissfuljsLibStrings.label, options: js.Object): stdLib.HTMLLabelElement = js.native
  @JSName("create")
  def create_legend(tag: blissfuljsLib.blissfuljsLibStrings.legend): stdLib.HTMLLegendElement = js.native
  @JSName("create")
  def create_legend(tag: blissfuljsLib.blissfuljsLibStrings.legend, options: js.Object): stdLib.HTMLLegendElement = js.native
  @JSName("create")
  def create_li(tag: blissfuljsLib.blissfuljsLibStrings.li): stdLib.HTMLLIElement = js.native
  @JSName("create")
  def create_li(tag: blissfuljsLib.blissfuljsLibStrings.li, options: js.Object): stdLib.HTMLLIElement = js.native
  @JSName("create")
  def create_link(tag: blissfuljsLib.blissfuljsLibStrings.link): stdLib.HTMLLinkElement = js.native
  @JSName("create")
  def create_link(tag: blissfuljsLib.blissfuljsLibStrings.link, options: js.Object): stdLib.HTMLLinkElement = js.native
  @JSName("create")
  def create_map(tag: blissfuljsLib.blissfuljsLibStrings.map): stdLib.HTMLMapElement = js.native
  @JSName("create")
  def create_map(tag: blissfuljsLib.blissfuljsLibStrings.map, options: js.Object): stdLib.HTMLMapElement = js.native
  @JSName("create")
  def create_mark(tag: blissfuljsLib.blissfuljsLibStrings.mark): stdLib.HTMLMarqueeElement = js.native
  @JSName("create")
  def create_mark(tag: blissfuljsLib.blissfuljsLibStrings.mark, options: js.Object): stdLib.HTMLMarqueeElement = js.native
  @JSName("create")
  def create_menu(tag: blissfuljsLib.blissfuljsLibStrings.menu): stdLib.HTMLMenuElement = js.native
  @JSName("create")
  def create_menu(tag: blissfuljsLib.blissfuljsLibStrings.menu, options: js.Object): stdLib.HTMLMenuElement = js.native
  @JSName("create")
  def create_meta(tag: blissfuljsLib.blissfuljsLibStrings.meta): stdLib.HTMLMetaElement = js.native
  @JSName("create")
  def create_meta(tag: blissfuljsLib.blissfuljsLibStrings.meta, options: js.Object): stdLib.HTMLMetaElement = js.native
  @JSName("create")
  def create_object(tag: blissfuljsLib.blissfuljsLibStrings.`object`): stdLib.HTMLObjectElement = js.native
  @JSName("create")
  def create_object(tag: blissfuljsLib.blissfuljsLibStrings.`object`, options: js.Object): stdLib.HTMLObjectElement = js.native
  @JSName("create")
  def create_ol(tag: blissfuljsLib.blissfuljsLibStrings.ol): stdLib.HTMLOListElement = js.native
  @JSName("create")
  def create_ol(tag: blissfuljsLib.blissfuljsLibStrings.ol, options: js.Object): stdLib.HTMLOListElement = js.native
  @JSName("create")
  def create_optgroup(tag: blissfuljsLib.blissfuljsLibStrings.optgroup): stdLib.HTMLOptGroupElement = js.native
  @JSName("create")
  def create_optgroup(tag: blissfuljsLib.blissfuljsLibStrings.optgroup, options: js.Object): stdLib.HTMLOptGroupElement = js.native
  @JSName("create")
  def create_option(tag: blissfuljsLib.blissfuljsLibStrings.option): stdLib.HTMLOptionElement = js.native
  @JSName("create")
  def create_option(tag: blissfuljsLib.blissfuljsLibStrings.option, options: js.Object): stdLib.HTMLOptionElement = js.native
  @JSName("create")
  def create_p(tag: blissfuljsLib.blissfuljsLibStrings.p): stdLib.HTMLParagraphElement = js.native
  @JSName("create")
  def create_p(tag: blissfuljsLib.blissfuljsLibStrings.p, options: js.Object): stdLib.HTMLParagraphElement = js.native
  @JSName("create")
  def create_param(tag: blissfuljsLib.blissfuljsLibStrings.param): stdLib.HTMLParamElement = js.native
  @JSName("create")
  def create_param(tag: blissfuljsLib.blissfuljsLibStrings.param, options: js.Object): stdLib.HTMLParamElement = js.native
  @JSName("create")
  def create_pre(tag: blissfuljsLib.blissfuljsLibStrings.pre): stdLib.HTMLPreElement = js.native
  @JSName("create")
  def create_pre(tag: blissfuljsLib.blissfuljsLibStrings.pre, options: js.Object): stdLib.HTMLPreElement = js.native
  @JSName("create")
  def create_progress(tag: blissfuljsLib.blissfuljsLibStrings.progress): stdLib.HTMLProgressElement = js.native
  @JSName("create")
  def create_progress(tag: blissfuljsLib.blissfuljsLibStrings.progress, options: js.Object): stdLib.HTMLProgressElement = js.native
  @JSName("create")
  def create_q(tag: blissfuljsLib.blissfuljsLibStrings.q): stdLib.HTMLQuoteElement = js.native
  @JSName("create")
  def create_q(tag: blissfuljsLib.blissfuljsLibStrings.q, options: js.Object): stdLib.HTMLQuoteElement = js.native
  @JSName("create")
  def create_script(tag: blissfuljsLib.blissfuljsLibStrings.script): stdLib.HTMLScriptElement = js.native
  @JSName("create")
  def create_script(tag: blissfuljsLib.blissfuljsLibStrings.script, options: js.Object): stdLib.HTMLScriptElement = js.native
  @JSName("create")
  def create_select(tag: blissfuljsLib.blissfuljsLibStrings.select): stdLib.HTMLSelectElement = js.native
  @JSName("create")
  def create_select(tag: blissfuljsLib.blissfuljsLibStrings.select, options: js.Object): stdLib.HTMLSelectElement = js.native
  @JSName("create")
  def create_source(tag: blissfuljsLib.blissfuljsLibStrings.source): stdLib.HTMLSourceElement = js.native
  @JSName("create")
  def create_source(tag: blissfuljsLib.blissfuljsLibStrings.source, options: js.Object): stdLib.HTMLSourceElement = js.native
  @JSName("create")
  def create_span(tag: blissfuljsLib.blissfuljsLibStrings.span): stdLib.HTMLSpanElement = js.native
  @JSName("create")
  def create_span(tag: blissfuljsLib.blissfuljsLibStrings.span, options: js.Object): stdLib.HTMLSpanElement = js.native
  @JSName("create")
  def create_style(tag: blissfuljsLib.blissfuljsLibStrings.style): stdLib.HTMLStyleElement = js.native
  @JSName("create")
  def create_style(tag: blissfuljsLib.blissfuljsLibStrings.style, options: js.Object): stdLib.HTMLStyleElement = js.native
  @JSName("create")
  def create_table(tag: blissfuljsLib.blissfuljsLibStrings.table): stdLib.HTMLTableElement = js.native
  @JSName("create")
  def create_table(tag: blissfuljsLib.blissfuljsLibStrings.table, options: js.Object): stdLib.HTMLTableElement = js.native
  @JSName("create")
  def create_thead(tag: blissfuljsLib.blissfuljsLibStrings.thead): stdLib.HTMLTableHeaderCellElement = js.native
  @JSName("create")
  def create_thead(tag: blissfuljsLib.blissfuljsLibStrings.thead, options: js.Object): stdLib.HTMLTableHeaderCellElement = js.native
  @JSName("create")
  def create_ul(tag: blissfuljsLib.blissfuljsLibStrings.ul): stdLib.HTMLUListElement = js.native
  @JSName("create")
  def create_ul(tag: blissfuljsLib.blissfuljsLibStrings.ul, options: js.Object): stdLib.HTMLUListElement = js.native
  @JSName("create")
  def create_video(tag: blissfuljsLib.blissfuljsLibStrings.video): stdLib.HTMLVideoElement = js.native
  @JSName("create")
  def create_video(tag: blissfuljsLib.blissfuljsLibStrings.video, options: js.Object): stdLib.HTMLVideoElement = js.native
  def delegate[T](
    subject: blissfuljsLib.Array[BlissDecoratedElement[T]],
    `type`: java.lang.String,
    selector: java.lang.String,
    callback: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def delegate[T](
    subject: blissfuljsLib.Array[BlissDecoratedElement[T]],
    `type`: java.lang.String,
    selectorsToCallbacks: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def delegate[T](
    subject: blissfuljsLib.Array[BlissDecoratedElement[T]],
    typesToSelectorsToCallbacks: org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
    ]
  ): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def delegate[T](
    subject: BlissDecoratedElement[T],
    `type`: java.lang.String,
    selector: java.lang.String,
    callback: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): BlissDecoratedElement[T] = js.native
  def delegate[T](
    subject: BlissDecoratedElement[T],
    `type`: java.lang.String,
    selectorsToCallbacks: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): BlissDecoratedElement[T] = js.native
  def delegate[T](
    subject: BlissDecoratedElement[T],
    typesToSelectorsToCallbacks: org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
    ]
  ): BlissDecoratedElement[T] = js.native
  def each(obj: org.scalablytyped.runtime.StringDictionary[js.Any], callback: js.Function): js.Object = js.native
  def each(obj: org.scalablytyped.runtime.StringDictionary[js.Any], callback: js.Function, ret: js.Object): js.Object = js.native
  @JSName("each")
  def each_TT[T](obj: org.scalablytyped.runtime.StringDictionary[js.Any], callback: js.Function): T = js.native
  @JSName("each")
  def each_TT[T](obj: org.scalablytyped.runtime.StringDictionary[js.Any], callback: js.Function, ret: js.Object): T = js.native
  def events[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], handlers: blissfuljsLib.Element): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def events[T](
    subject: blissfuljsLib.Array[BlissDecoratedElement[T]],
    handlers: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def events[T](subject: BlissDecoratedElement[T], handlers: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def events[T](
    subject: BlissDecoratedElement[T],
    handlers: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): BlissDecoratedElement[T] = js.native
  def extend(target: js.Object, source: js.Any): js.Object = js.native
  def extend(target: js.Object, source: js.Any, whitelist: blissfuljsLib.Array[java.lang.String]): js.Object = js.native
  def extend(target: js.Object, source: js.Any, whitelist: java.lang.String): js.Object = js.native
  def extend(target: js.Object, source: js.Any, whitelist: js.Function): js.Object = js.native
  def extend(target: js.Object, source: js.Any, whitelist: stdLib.RegExp): js.Object = js.native
  @JSName("extend")
  def extend_TT[T](target: js.Object, source: js.Any): T = js.native
  @JSName("extend")
  def extend_TT[T](target: js.Object, source: js.Any, whitelist: blissfuljsLib.Array[java.lang.String]): T = js.native
  @JSName("extend")
  def extend_TT[T](target: js.Object, source: js.Any, whitelist: java.lang.String): T = js.native
  @JSName("extend")
  def extend_TT[T](target: js.Object, source: js.Any, whitelist: js.Function): T = js.native
  @JSName("extend")
  def extend_TT[T](target: js.Object, source: js.Any, whitelist: stdLib.RegExp): T = js.native
  def fetch(url: java.lang.String): js.Promise[stdLib.XMLHttpRequest] = js.native
  def fetch(url: java.lang.String, options: blissfuljsLib.Anon_Data): js.Promise[stdLib.XMLHttpRequest] = js.native
  def fire[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], `type`: java.lang.String): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def fire[T](
    subject: blissfuljsLib.Array[BlissDecoratedElement[T]],
    `type`: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def fire[T](subject: BlissDecoratedElement[T], `type`: java.lang.String): BlissDecoratedElement[T] = js.native
  def fire[T](
    subject: BlissDecoratedElement[T],
    `type`: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): BlissDecoratedElement[T] = js.native
  def include(condition: js.Any, url: java.lang.String): js.Promise[scala.Unit] = js.native
  def include(url: java.lang.String): js.Promise[scala.Unit] = js.native
  def inside[T](subject: BlissDecoratedElement[T], element: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def `lazy`(`object`: js.Object, properties: org.scalablytyped.runtime.StringDictionary[js.Function0[_]]): js.Object = js.native
  def `lazy`(`object`: js.Object, property: java.lang.String, getter: js.Function0[_]): js.Object = js.native
  @JSName("lazy")
  def lazy_TT[T](`object`: js.Object, properties: org.scalablytyped.runtime.StringDictionary[js.Function0[_]]): T = js.native
  @JSName("lazy")
  def lazy_TT[T](`object`: js.Object, property: java.lang.String, getter: js.Function0[_]): T = js.native
  def live(
    `object`: js.Object,
    properties: org.scalablytyped.runtime.StringDictionary[js.Object | js.Function]
  ): js.Object = js.native
  def live(`object`: js.Object, property: java.lang.String, descriptor: js.Function): js.Object = js.native
  def live(`object`: js.Object, property: java.lang.String, descriptor: js.Object): js.Object = js.native
  @JSName("live")
  def live_TT[T](
    `object`: js.Object,
    properties: org.scalablytyped.runtime.StringDictionary[js.Object | js.Function]
  ): T = js.native
  @JSName("live")
  def live_TT[T](`object`: js.Object, property: java.lang.String, descriptor: js.Function): T = js.native
  @JSName("live")
  def live_TT[T](`object`: js.Object, property: java.lang.String, descriptor: js.Object): T = js.native
  def once[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], handlers: blissfuljsLib.Element): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def once[T](
    subject: blissfuljsLib.Array[BlissDecoratedElement[T]],
    handlers: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def once[T](subject: BlissDecoratedElement[T], handlers: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def once[T](
    subject: BlissDecoratedElement[T],
    handlers: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ stdLib.Event, scala.Unit]]
  ): BlissDecoratedElement[T] = js.native
  def properties[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], props: js.Object): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def properties[T](subject: BlissDecoratedElement[T], props: js.Object): BlissDecoratedElement[T] = js.native
  def ready(): js.Promise[_] = js.native
  def ready(context: stdLib.Document): js.Promise[_] = js.native
  def remove(subject: BlissStatic): scala.Unit = js.native
  def remove(subject: blissfuljsLib.Element): scala.Unit = js.native
  def set[T](subject: BlissDecoratedElement[T], options: js.Object): BlissDecoratedElement[T] = js.native
  def start[T](subject: BlissDecoratedElement[T], element: blissfuljsLib.Element): BlissDecoratedElement[T] = js.native
  def style[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], properties: js.Object): blissfuljsLib.Array[BlissDecoratedElement[T]] = js.native
  def style[T](subject: BlissDecoratedElement[T], properties: js.Object): BlissDecoratedElement[T] = js.native
  def transition[T](subject: blissfuljsLib.Array[BlissDecoratedElement[T]], properties: js.Object): js.Promise[T] = js.native
  def transition[T](
    subject: blissfuljsLib.Array[BlissDecoratedElement[T]],
    properties: js.Object,
    duration: scala.Double
  ): js.Promise[T] = js.native
  def transition[T](subject: BlissDecoratedElement[T], properties: js.Object): js.Promise[T] = js.native
  def transition[T](subject: BlissDecoratedElement[T], properties: js.Object, duration: scala.Double): js.Promise[T] = js.native
  def `type`(`object`: js.Object): java.lang.String = js.native
  def value(obj: js.Object, properties: java.lang.String*): js.Any = js.native
  def value(property: java.lang.String, properties: java.lang.String*): js.Any = js.native
  @JSName("value")
  def value_TT[T](obj: js.Object, properties: java.lang.String*): T = js.native
  @JSName("value")
  def value_TT[T](property: java.lang.String, properties: java.lang.String*): T = js.native
}

