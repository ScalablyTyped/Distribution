package typings
package d3DashSelectionLib.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends js.Object {
  /**
    * Appends a new element of the type provided by the element creator function as the last child of each selected element,
    * or before the next following sibling in the update selection if this is an enter selection.
    * The latter behavior for enter selections allows you to insert elements into the DOM in an order consistent with the new bound data;
    * however, note that selection.order may still be required if updating elements change order
    * (i.e., if the order of new data is inconsistent with old data).
    *
    * This method returns a new selection containing the appended elements.
    * Each new element inherits the data of the current elements, if any.
    *
    * The generic refers to the type of the child element to be appended.
    *
    * @param type A creator function which is evaluated for each selected element, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return
    * an element to be appended. (The function typically creates a new element, but it may instead return an existing element.)
    */
  def append[ChildElement /* <: BaseType */](`type`: ValueFn[GElement, Datum, ChildElement]): Selection[ChildElement, Datum, PElement, PDatum] = js.native
  /**
    * Appends a new element of this type (tag name) as the last child of each selected element,
    * or before the next following sibling in the update selection if this is an enter selection.
    * The latter behavior for enter selections allows you to insert elements into the DOM in an order consistent with the new bound data;
    * however, note that selection.order may still be required if updating elements change order
    * (i.e., if the order of new data is inconsistent with old data).
    *
    * This method returns a new selection containing the appended elements.
    * Each new element inherits the data of the current elements, if any.
    *
    * The generic refers to the type of the child element to be appended.
    *
    * @param type A string representing the tag name. The specified name may have a namespace prefix, such as svg:text
    * to specify a text attribute in the SVG namespace. If no namespace is specified, the namespace will be inherited
    * from the parent element; or, if the name is one of the known prefixes, the corresponding namespace will be used
    * (for example, svg implies svg:svg)
    */
  def append[ChildElement /* <: BaseType */](`type`: java.lang.String): Selection[ChildElement, Datum, PElement, PDatum] = js.native
  /**
    * Appends a new element of this type (tag name) as the last child of each selected element,
    * or before the next following sibling in the update selection if this is an enter selection.
    * The latter behavior for enter selections allows you to insert elements into the DOM in an order consistent with the new bound data;
    * however, note that selection.order may still be required if updating elements change order
    * (i.e., if the order of new data is inconsistent with old data).
    *
    * This method returns a new selection containing the appended elements.
    * Each new element inherits the data of the current elements, if any.
    *
    * @param type A string representing the tag name.
    */
  @JSName("append")
  def append_a(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.a): Selection[stdLib.HTMLAnchorElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_abbr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.abbr): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_address(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.address): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_applet(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.applet): Selection[stdLib.HTMLAppletElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_area(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.area): Selection[stdLib.HTMLAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_article(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.article): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_aside(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.aside): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_audio(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.audio): Selection[stdLib.HTMLAudioElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_b(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.b): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_base(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.base): Selection[stdLib.HTMLBaseElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_basefont(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.basefont): Selection[stdLib.HTMLBaseFontElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_bdi(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.bdi): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_bdo(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.bdo): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_blockquote(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.blockquote): Selection[stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_body(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.body): Selection[stdLib.HTMLBodyElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_br(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.br): Selection[stdLib.HTMLBRElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_button(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.button): Selection[stdLib.HTMLButtonElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_canvas(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.canvas): Selection[stdLib.HTMLCanvasElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_caption(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.caption): Selection[stdLib.HTMLTableCaptionElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_cite(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.cite): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_code(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.code): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_col(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.col): Selection[stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_colgroup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.colgroup): Selection[stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_data(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.data): Selection[stdLib.HTMLDataElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_datalist(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.datalist): Selection[stdLib.HTMLDataListElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_dd(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dd): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_del(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.del): Selection[stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_details(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.details): Selection[stdLib.HTMLDetailsElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_dfn(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dfn): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_dialog(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dialog): Selection[stdLib.HTMLDialogElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_dir(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dir): Selection[stdLib.HTMLDirectoryElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_div(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.div): Selection[stdLib.HTMLDivElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_dl(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dl): Selection[stdLib.HTMLDListElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_dt(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dt): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_em(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.em): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_embed(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.embed): Selection[stdLib.HTMLEmbedElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_fieldset(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.fieldset): Selection[stdLib.HTMLFieldSetElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_figcaption(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.figcaption): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_figure(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.figure): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_font(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.font): Selection[stdLib.HTMLFontElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_footer(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.footer): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_form(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.form): Selection[stdLib.HTMLFormElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_frame(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.frame): Selection[stdLib.HTMLFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_frameset(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.frameset): Selection[stdLib.HTMLFrameSetElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_h1(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h1): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_h2(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h2): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_h3(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h3): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_h4(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h4): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_h5(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h5): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_h6(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h6): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_head(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.head): Selection[stdLib.HTMLHeadElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_header(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.header): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_hgroup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.hgroup): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_hr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.hr): Selection[stdLib.HTMLHRElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_html(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.html): Selection[stdLib.HTMLHtmlElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_i(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.i): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_iframe(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.iframe): Selection[stdLib.HTMLIFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_img(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.img): Selection[stdLib.HTMLImageElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_input(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.input): Selection[stdLib.HTMLInputElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_ins(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ins): Selection[stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_kbd(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.kbd): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_label(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.label): Selection[stdLib.HTMLLabelElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_legend(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.legend): Selection[stdLib.HTMLLegendElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_li(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.li): Selection[stdLib.HTMLLIElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_link(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.link): Selection[stdLib.HTMLLinkElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_main(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.main): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_map(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.map): Selection[stdLib.HTMLMapElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_mark(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.mark): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_marquee(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.marquee): Selection[stdLib.HTMLMarqueeElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_menu(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.menu): Selection[stdLib.HTMLMenuElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_meta(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.meta): Selection[stdLib.HTMLMetaElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_meter(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.meter): Selection[stdLib.HTMLMeterElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_nav(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.nav): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_noscript(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.noscript): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_object(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.`object`): Selection[stdLib.HTMLObjectElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_ol(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ol): Selection[stdLib.HTMLOListElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_optgroup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.optgroup): Selection[stdLib.HTMLOptGroupElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_option(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.option): Selection[stdLib.HTMLOptionElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_output(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.output): Selection[stdLib.HTMLOutputElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_p(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.p): Selection[stdLib.HTMLParagraphElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_param(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.param): Selection[stdLib.HTMLParamElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_picture(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.picture): Selection[stdLib.HTMLPictureElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_pre(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.pre): Selection[stdLib.HTMLPreElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_progress(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.progress): Selection[stdLib.HTMLProgressElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_q(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.q): Selection[stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_rp(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.rp): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_rt(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.rt): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_ruby(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ruby): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_s(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.s): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_samp(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.samp): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_script(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.script): Selection[stdLib.HTMLScriptElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_section(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.section): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_select(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.select): Selection[stdLib.HTMLSelectElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_slot(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.slot): Selection[stdLib.HTMLSlotElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_small(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.small): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_source(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.source): Selection[stdLib.HTMLSourceElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_span(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.span): Selection[stdLib.HTMLSpanElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_strong(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.strong): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_style(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.style): Selection[stdLib.HTMLStyleElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_sub(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.sub): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_summary(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.summary): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_sup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.sup): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_table(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.table): Selection[stdLib.HTMLTableElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_tbody(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.tbody): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_td(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.td): Selection[stdLib.HTMLTableDataCellElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_template(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.template): Selection[stdLib.HTMLTemplateElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_textarea(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.textarea): Selection[stdLib.HTMLTextAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_tfoot(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.tfoot): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_th(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.th): Selection[stdLib.HTMLTableHeaderCellElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_thead(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.thead): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_time(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.time): Selection[stdLib.HTMLTimeElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_title(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.title): Selection[stdLib.HTMLTitleElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_tr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.tr): Selection[stdLib.HTMLTableRowElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_track(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.track): Selection[stdLib.HTMLTrackElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_u(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.u): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_ul(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ul): Selection[stdLib.HTMLUListElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_var(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.`var`): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_video(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.video): Selection[stdLib.HTMLVideoElement, Datum, PElement, PDatum] = js.native
  @JSName("append")
  def append_wbr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.wbr): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  /**
    * Clear the attribute with the specified name for the selected elements and returns this selection.
    *
    * @param name Name of the attribute
    * @param value null,to clear the attribute
    */
  def attr(name: java.lang.String): this.type = js.native
  /**
    * Sets the value of the attribute with the specified name for the selected elements and returns this selection.
    * The value for the individual selected elements is determined by the value function.
    *
    * @param name Name of the attribute
    * @param value A value function which is evaluated for each selected element, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).  A null value will clear the attribute.
    */
  def attr(
    name: java.lang.String,
    value: ValueFn[GElement, Datum, java.lang.String | scala.Double | scala.Boolean | scala.Null]
  ): this.type = js.native
  /**
    * Sets the value of the attribute with the specified name for the selected elements and returns this selection.
    * All elements are given the same attribute value.
    *
    * @param name Name of the attribute
    * @param value Constant value for the attribute
    */
  def attr(name: java.lang.String, value: java.lang.String): this.type = js.native
  def attr(name: java.lang.String, value: scala.Boolean): this.type = js.native
  def attr(name: java.lang.String, value: scala.Double): this.type = js.native
  // Modifying -------------------------------
  /**
    * Return the current value of the specified attribute for the first (non-null) element in the selection.
    * This is generally useful only if you know that the selection contains exactly one element.
    *
    * @param name Name of the attribute
    */
  @JSName("attr")
  def attr_String(name: java.lang.String): java.lang.String = js.native
  /**
    * Invoke the specified function exactly once, passing in this selection along with any optional arguments.
    * Returns this selection.
    *
    * @param func A function which is passed this selection as the first argument along with any optional arguments.
    * @param args List of optional arguments to be passed to the callback function.
    */
  def call(
    func: js.Function2[
      /* selection */ Selection[GElement, Datum, PElement, PDatum], 
      /* repeated */ js.Any, 
      scala.Unit
    ],
    args: js.Any*
  ): this.type = js.native
  /**
    * Returns true if and only if the first (non-null) selected element has the specified classes.
    * This is generally useful only if you know the selection contains exactly one element.
    *
    * @param name A string of space-separated class names.
    */
  def classed(names: java.lang.String): scala.Boolean = js.native
  /**
    * Assigns or unassigns the specified CSS class names on the selected elements by setting
    * the class attribute or modifying the classList property and returns this selection.
    * The assign/unassign status for the individual selected elements is determined by the boolean return
    * value of the value function.
    *
    * @param names A string of space-separated class names.
    * @param value A value function which is evaluated for each selected element, in order,
    * being passed the current datum (d), the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
    * The function’s return value is then used to assign or unassign classes on each element.
    */
  def classed(names: java.lang.String, value: ValueFn[GElement, Datum, scala.Boolean]): this.type = js.native
  /**
    * Assigns or unassigns the specified CSS class names on the selected elements by setting
    * the class attribute or modifying the classList property and returns this selection.
    * If the constant value is truthy, then all elements are assigned the specified classes; otherwise, the classes are unassigned.
    *
    * @param names A string of space-separated class names.
    * @param value A boolean flag (true = assign / false = unassign)
    */
  def classed(names: java.lang.String, value: scala.Boolean): this.type = js.native
  def clone(deep: scala.Boolean): Selection[GElement, Datum, PElement, PDatum] = js.native
  /**
    * Returns the array of data for the selected elements.
    */
  def data(): js.Array[Datum] = js.native
  /**
    * Joins the data returned by the specified value function with the selected elements, returning a new selection that it represents
    * the update selection: the elements successfully bound to data. Also defines the enter and exit selections on
    * the returned selection, which can be used to add or remove elements to correspond to the new data.
    *
    * The data is specified for each group in the selection.
    *
    * If a key function is not specified, then the first datum in data is assigned to the first selected element,
    * the second datum to the second selected element, and so on.
    * A key function may be specified to control which datum is assigned to which element, replacing the default join-by-index,
    * by computing a string identifier for each datum and element.
    *
    * The update and enter selections are returned in data order, while the exit selection preserves the selection
    * order prior to the join. If a key function is specified, the order of elements in the selection may not match
    * their order in the document; use selection.order or selection.sort as needed.
    *
    * This method cannot be used to clear bound data; use selection.datum instead.
    *
    * For details see: {@link https://github.com/d3/d3-selection#joining-data }
    *
    * The generic refers to the type of the new datum to be used for the selected elements.
    *
    * @param data A value function which will be evaluated for each group in order, being passed the group’s parent datum
    * (d, which may be undefined), the group index (i), and the selection’s parent nodes (nodes),
    * with this as the group’s parent element. The function returns an array of values for each group.
    * @param key An optional key function which is evaluated for each selected element, in order, being passed the
    * current datum (d), the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]); the returned string is the element’s key.
    * The key function is then also evaluated for each new datum in data, being passed the current datum (d),
    * the current index (i), and the group’s new data, with this as the group’s parent DOM element (nodes[i]); the returned string is the datum’s key.
    * The datum for a given key is assigned to the element with the matching key. If multiple elements have the same key,
    * the duplicate elements are put into the exit selection; if multiple data have the same key, the duplicate data are put into the enter selection.
    */
  def data[NewDatum](data: ValueFn[PElement, PDatum, js.Array[NewDatum]]): Selection[GElement, NewDatum, PElement, PDatum] = js.native
  def data[NewDatum](
    data: ValueFn[PElement, PDatum, js.Array[NewDatum]],
    key: ValueFn[GElement | PElement, Datum | NewDatum, java.lang.String]
  ): Selection[GElement, NewDatum, PElement, PDatum] = js.native
  /**
    * Joins the specified array of data with the selected elements, returning a new selection that represents
    * the update selection: the elements successfully bound to data. Also defines the enter and exit selections on
    * the returned selection, which can be used to add or remove elements to correspond to the new data.
    *
    * The data is specified for each group in the selection. If the selection has multiple groups
    * (such as d3.selectAll followed by selection.selectAll), then data should typically be specified as a function.
    *
    * If a key function is not specified, then the first datum in data is assigned to the first selected element,
    * the second datum to the second selected element, and so on.
    * A key function may be specified to control which datum is assigned to which element, replacing the default join-by-index,
    * by computing a string identifier for each datum and element.
    *
    * The update and enter selections are returned in data order, while the exit selection preserves the selection
    * order prior to the join. If a key function is specified, the order of elements in the selection may not match
    * their order in the document; use selection.order or selection.sort as needed.
    *
    * This method cannot be used to clear bound data; use selection.datum instead.
    *
    * For details see: {@link https://github.com/d3/d3-selection#joining-data }
    *
    * The generic refers to the type of the new datum to be used for the selected elements.
    *
    * @param data The specified data is an array of arbitrary values (e.g., numbers or objects).
    * @param key An optional key function which is evaluated for each selected element, in order, being passed the
    * current datum (d), the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]); the returned string is the element’s key.
    * The key function is then also evaluated for each new datum in data, being passed the current datum (d),
    * the current index (i), and the group’s new data, with this as the group’s parent DOM element (nodes[i]); the returned string is the datum’s key.
    * The datum for a given key is assigned to the element with the matching key. If multiple elements have the same key,
    * the duplicate elements are put into the exit selection; if multiple data have the same key, the duplicate data are put into the enter selection.
    */
  def data[NewDatum](data: js.Array[NewDatum]): Selection[GElement, NewDatum, PElement, PDatum] = js.native
  def data[NewDatum](data: js.Array[NewDatum], key: ValueFn[GElement | PElement, Datum | NewDatum, java.lang.String]): Selection[GElement, NewDatum, PElement, PDatum] = js.native
  // Data Join ---------------------------------
  /**
    * Returns the bound datum for the first (non-null) element in the selection.
    * This is generally useful only if you know the selection contains exactly one element.
    */
  def datum(): Datum = js.native
  /**
    * Sets the element’s bound data to the specified value on all selected elements.
    * Unlike selection.data, this method does not compute a join and does not affect
    * indexes or the enter and exit selections.
    *
    * The generic refers to the type of the new datum to be used for the selected elements.
    *
    * @param value A value object to be used as the datum for each element.
    */
  def datum[NewDatum](value: NewDatum): Selection[GElement, NewDatum, PElement, PDatum] = js.native
  /**
    * Sets the element’s bound data using the specified value function on all selected elements.
    * Unlike selection.data, this method does not compute a join and does not affect
    * indexes or the enter and exit selections.
    *
    * The generic refers to the type of the new datum to be used for the selected elements.
    *
    * @param value A value function which is evaluated for each selected element, in order,
    * being passed the current datum (d), the current index (i), and the current group (nodes),
    * with this as the current DOM element (nodes[i]). The function is then used to set each element’s new data.
    * A null value will delete the bound data.
    */
  def datum[NewDatum](value: ValueFn[GElement, Datum, NewDatum]): Selection[GElement, NewDatum, PElement, PDatum] = js.native
  /**
    * Delete the bound data for each element in the selection.
    */
  @JSName("datum")
  def datum_Selection(): Selection[GElement, js.UndefOr[scala.Nothing], PElement, PDatum] = js.native
  /**
    * Dispatches a custom event of the specified type to each selected element, in order.
    * An optional parameters map may be specified to set additional properties of the event.
    *
    * @param type Name of event to dispatch
    * @param parameters An optional value map with custom event parameters
    */
  def dispatch(`type`: java.lang.String): this.type = js.native
  def dispatch(`type`: java.lang.String, parameters: CustomEventParameters): this.type = js.native
  def dispatch(`type`: java.lang.String, parameters: ValueFn[GElement, Datum, CustomEventParameters]): this.type = js.native
  // Control Flow ----------------------
  /**
    * Invoke the specified function for each selected element, passing in the current datum (d),
    * the current index (i), and the current group (nodes), with this of the current DOM element (nodes[i]).
    * This method can be used to invoke arbitrary code for each selected element, and is useful for creating a context to access parent and child data simultaneously.
    *
    * @param func A function which is invoked for each selected element,
    *             being passed the current datum (d), the current index (i), and the current group (nodes), with this of the current DOM element (nodes[i]).
    */
  def each(func: ValueFn[GElement, Datum, scala.Unit]): this.type = js.native
  /**
    * Return true if this selection contains no (non-null) elements.
    */
  def empty(): scala.Boolean = js.native
  /**
    * Return the enter selection: placeholder nodes for each datum that had no corresponding DOM element
    * in the selection. (The enter selection is empty for selections not returned by selection.data.)
    */
  def enter(): Selection[EnterElement, Datum, PElement, PDatum] = js.native
  /**
    * Returns the exit selection: existing DOM elements in the selection for which no new datum was found.
    * (The exit selection is empty for selections not returned by selection.data.)
    *
    * IMPORTANT: The generic refers to the type of the old datum associated with the exit selection elements.
    * Ensure you set the generic to the correct type, if you need to access the data on the exit selection in
    * follow-up steps, e.g. to set styles as part of an exit transition before removing them.
    */
  def exit[OldDatum](): Selection[GElement, OldDatum, PElement, PDatum] = js.native
  /**
    * Filter the selection, returning a new selection that contains only the elements for
    * which the specified filter is true.
    *
    * The returned filtered selection preserves the parents of this selection, but like array.filter,
    * it does not preserve indexes as some elements may be removed; use selection.select to preserve the index, if needed.
    *
    * @param selector  A value function which is evaluated for each selected element, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return true
    * for an element to be included, and false otherwise.
    */
  def filter(selector: ValueFn[GElement, Datum, scala.Boolean]): Selection[GElement, Datum, PElement, PDatum] = js.native
  /**
    * Filters the selection, returning a new selection that contains only the elements for
    * which the specified filter is true.
    *
    * The returned filtered selection preserves the parents of this selection, but like array.filter,
    * it does not preserve indexes as some elements may be removed; use selection.select to preserve the index, if needed.
    *
    * @param selector A CSS selector string to match when filtering.
    */
  def filter(selector: java.lang.String): Selection[GElement, Datum, PElement, PDatum] = js.native
  /**
    * Filter the selection, returning a new selection that contains only the elements for
    * which the specified filter is true.
    *
    * The returned filtered selection preserves the parents of this selection, but like array.filter,
    * it does not preserve indexes as some elements may be removed; use selection.select to preserve the index, if needed.
    *
    * @param selector  A value function which is evaluated for each selected element, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return true
    * for an element to be included, and false otherwise.
    */
  @JSName("filter")
  def filter_FilteredElementBaseType[FilteredElement /* <: BaseType */](selector: ValueFn[GElement, Datum, scala.Boolean]): Selection[FilteredElement, Datum, PElement, PDatum] = js.native
  /**
    * Filters the selection, returning a new selection that contains only the elements for
    * which the specified filter is true.
    *
    * The returned filtered selection preserves the parents of this selection, but like array.filter,
    * it does not preserve indexes as some elements may be removed; use selection.select to preserve the index, if needed.
    *
    * The generic refers to the type of element which will be selected after applying the filter, i.e. if the element types
    * contained in a pre-filter selection are narrowed to a subset as part of the filtering.
    *
    * @param selector A CSS selector string to match when filtering.
    */
  @JSName("filter")
  def filter_FilteredElementBaseType[FilteredElement /* <: BaseType */](selector: java.lang.String): Selection[FilteredElement, Datum, PElement, PDatum] = js.native
  /**
    * Clear the html content of the selected elements and return the selection.
    */
  def html(): this.type = js.native
  /**
    * Sets the inner HTML to the specified value on all selected elements, replacing any existing child elements.
    * The inner HTML is determined for each individual element using a value function.
    *
    * @param value A value function which is evaluated for each selected element, in order, being passed the current
    * datum (d), the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
    * The function’s return value is then used to set each element’s inner HTML. A null value will clear the content.
    */
  def html(value: ValueFn[GElement, Datum, java.lang.String | scala.Null]): this.type = js.native
  /**
    * Sets the inner HTML to the specified value on all selected elements, replacing any existing child elements.
    * All elements are given the same inner HTML
    *
    * @param value String representation of inner HTML.
    */
  def html(value: java.lang.String): this.type = js.native
  /**
    * Returns a string representation of the inner HTML for the first (non-null) element in the selection.
    * This is generally useful only if you know the selection contains exactly one element.
    */
  @JSName("html")
  def html_String(): java.lang.String = js.native
  def insert[ChildElement /* <: BaseType */](`type`: ValueFn[GElement, Datum, ChildElement]): Selection[ChildElement, Datum, PElement, PDatum] = js.native
  def insert[ChildElement /* <: BaseType */](`type`: ValueFn[GElement, Datum, ChildElement], before: ValueFn[GElement, Datum, BaseType]): Selection[ChildElement, Datum, PElement, PDatum] = js.native
  def insert[ChildElement /* <: BaseType */](`type`: ValueFn[GElement, Datum, ChildElement], before: java.lang.String): Selection[ChildElement, Datum, PElement, PDatum] = js.native
  /**
    * Inserts a new element of the specified type (tag name) before the first element matching the specified
    * before selector for each selected element. For example, a before selector :first-child will prepend nodes before the first child.
    * If before is not specified, it defaults to null. (To append elements in an order consistent with bound data, use selection.append.)
    *
    * This method returns a new selection containing the appended elements.
    * Each new element inherits the data of the current elements, if any.
    *
    * The generic refers to the type of the child element to be appended.
    *
    * @param type One of:
    *   * A string representing the tag name for the element type to be inserted. The specified name may have a namespace prefix,
    *     such as svg:text to specify a text attribute in the SVG namespace. If no namespace is specified, the namespace will be inherited
    *     from the parent element; or, if the name is one of the known prefixes, the corresponding namespace will be used
    *     (for example, svg implies svg:svg)
    *   * A creator function which is evaluated for each selected element, in order, being passed the current datum (d),
    *     the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return
    *     an element to be inserted. (The function typically creates a new element, but it may instead return an existing element.)
    * @param before One of:
    *   * A CSS selector string for the element before which the insertion should occur.
    *   * A child selector function which is evaluated for each selected element, in order, being passed the current datum (d),
    *     the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return the child element
    *     before which the element should be inserted.
    */
  def insert[ChildElement /* <: BaseType */](`type`: java.lang.String): Selection[ChildElement, Datum, PElement, PDatum] = js.native
  def insert[ChildElement /* <: BaseType */](`type`: java.lang.String, before: ValueFn[GElement, Datum, BaseType]): Selection[ChildElement, Datum, PElement, PDatum] = js.native
  def insert[ChildElement /* <: BaseType */](`type`: java.lang.String, before: java.lang.String): Selection[ChildElement, Datum, PElement, PDatum] = js.native
  /**
    * Inserts a new element of the specified type (tag name) before the first element matching the specified
    * before selector for each selected element. For example, a before selector :first-child will prepend nodes before the first child.
    * If before is not specified, it defaults to null. (To append elements in an order consistent with bound data, use selection.append.)
    *
    * This method returns a new selection containing the appended elements.
    * Each new element inherits the data of the current elements, if any.
    *
    * The generic refers to the type of the child element to be appended.
    *
    * @param type A string representing the tag name for the element type to be inserted.
    * @param before One of:
    *   * A CSS selector string for the element before which the insertion should occur.
    *   * A child selector function which is evaluated for each selected element, in order, being passed the current datum (d),
    *     the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). This function should return the child element
    *     before which the element should be inserted.
    */
  @JSName("insert")
  def insert_a(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.a): Selection[stdLib.HTMLAnchorElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_a(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.a, before: ValueFn[GElement, Datum, BaseType]): Selection[stdLib.HTMLAnchorElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_a(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.a, before: java.lang.String): Selection[stdLib.HTMLAnchorElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_abbr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.abbr): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_abbr(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.abbr,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_abbr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.abbr, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_address(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.address): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_address(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.address,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_address(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.address, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_applet(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.applet): Selection[stdLib.HTMLAppletElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_applet(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.applet,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLAppletElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_applet(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.applet, before: java.lang.String): Selection[stdLib.HTMLAppletElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_area(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.area): Selection[stdLib.HTMLAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_area(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.area,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_area(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.area, before: java.lang.String): Selection[stdLib.HTMLAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_article(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.article): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_article(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.article,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_article(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.article, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_aside(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.aside): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_aside(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.aside,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_aside(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.aside, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_audio(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.audio): Selection[stdLib.HTMLAudioElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_audio(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.audio,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLAudioElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_audio(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.audio, before: java.lang.String): Selection[stdLib.HTMLAudioElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_b(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.b): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_b(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.b, before: ValueFn[GElement, Datum, BaseType]): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_b(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.b, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_base(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.base): Selection[stdLib.HTMLBaseElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_base(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.base,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLBaseElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_base(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.base, before: java.lang.String): Selection[stdLib.HTMLBaseElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_basefont(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.basefont): Selection[stdLib.HTMLBaseFontElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_basefont(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.basefont,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLBaseFontElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_basefont(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.basefont, before: java.lang.String): Selection[stdLib.HTMLBaseFontElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_bdi(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.bdi): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_bdi(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.bdi,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_bdi(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.bdi, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_bdo(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.bdo): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_bdo(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.bdo,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_bdo(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.bdo, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_blockquote(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.blockquote): Selection[stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_blockquote(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.blockquote,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_blockquote(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.blockquote, before: java.lang.String): Selection[stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_body(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.body): Selection[stdLib.HTMLBodyElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_body(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.body,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLBodyElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_body(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.body, before: java.lang.String): Selection[stdLib.HTMLBodyElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_br(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.br): Selection[stdLib.HTMLBRElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_br(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.br,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLBRElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_br(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.br, before: java.lang.String): Selection[stdLib.HTMLBRElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_button(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.button): Selection[stdLib.HTMLButtonElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_button(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.button,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLButtonElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_button(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.button, before: java.lang.String): Selection[stdLib.HTMLButtonElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_canvas(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.canvas): Selection[stdLib.HTMLCanvasElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_canvas(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.canvas,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLCanvasElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_canvas(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.canvas, before: java.lang.String): Selection[stdLib.HTMLCanvasElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_caption(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.caption): Selection[stdLib.HTMLTableCaptionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_caption(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.caption,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTableCaptionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_caption(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.caption, before: java.lang.String): Selection[stdLib.HTMLTableCaptionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_cite(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.cite): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_cite(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.cite,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_cite(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.cite, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_code(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.code): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_code(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.code,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_code(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.code, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_col(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.col): Selection[stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_col(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.col,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_col(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.col, before: java.lang.String): Selection[stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_colgroup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.colgroup): Selection[stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_colgroup(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.colgroup,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_colgroup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.colgroup, before: java.lang.String): Selection[stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_data(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.data): Selection[stdLib.HTMLDataElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_data(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.data,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLDataElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_data(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.data, before: java.lang.String): Selection[stdLib.HTMLDataElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_datalist(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.datalist): Selection[stdLib.HTMLDataListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_datalist(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.datalist,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLDataListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_datalist(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.datalist, before: java.lang.String): Selection[stdLib.HTMLDataListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dd(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dd): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dd(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.dd,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dd(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dd, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_del(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.del): Selection[stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_del(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.del,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_del(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.del, before: java.lang.String): Selection[stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_details(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.details): Selection[stdLib.HTMLDetailsElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_details(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.details,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLDetailsElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_details(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.details, before: java.lang.String): Selection[stdLib.HTMLDetailsElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dfn(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dfn): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dfn(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.dfn,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dfn(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dfn, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dialog(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dialog): Selection[stdLib.HTMLDialogElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dialog(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.dialog,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLDialogElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dialog(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dialog, before: java.lang.String): Selection[stdLib.HTMLDialogElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dir(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dir): Selection[stdLib.HTMLDirectoryElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dir(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.dir,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLDirectoryElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dir(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dir, before: java.lang.String): Selection[stdLib.HTMLDirectoryElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_div(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.div): Selection[stdLib.HTMLDivElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_div(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.div,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLDivElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_div(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.div, before: java.lang.String): Selection[stdLib.HTMLDivElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dl(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dl): Selection[stdLib.HTMLDListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dl(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.dl,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLDListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dl(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dl, before: java.lang.String): Selection[stdLib.HTMLDListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dt(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dt): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dt(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.dt,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_dt(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.dt, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_em(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.em): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_em(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.em,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_em(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.em, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_embed(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.embed): Selection[stdLib.HTMLEmbedElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_embed(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.embed,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLEmbedElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_embed(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.embed, before: java.lang.String): Selection[stdLib.HTMLEmbedElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_fieldset(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.fieldset): Selection[stdLib.HTMLFieldSetElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_fieldset(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.fieldset,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLFieldSetElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_fieldset(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.fieldset, before: java.lang.String): Selection[stdLib.HTMLFieldSetElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_figcaption(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.figcaption): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_figcaption(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.figcaption,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_figcaption(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.figcaption, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_figure(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.figure): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_figure(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.figure,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_figure(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.figure, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_font(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.font): Selection[stdLib.HTMLFontElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_font(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.font,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLFontElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_font(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.font, before: java.lang.String): Selection[stdLib.HTMLFontElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_footer(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.footer): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_footer(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.footer,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_footer(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.footer, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_form(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.form): Selection[stdLib.HTMLFormElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_form(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.form,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLFormElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_form(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.form, before: java.lang.String): Selection[stdLib.HTMLFormElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_frame(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.frame): Selection[stdLib.HTMLFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_frame(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.frame,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_frame(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.frame, before: java.lang.String): Selection[stdLib.HTMLFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_frameset(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.frameset): Selection[stdLib.HTMLFrameSetElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_frameset(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.frameset,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLFrameSetElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_frameset(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.frameset, before: java.lang.String): Selection[stdLib.HTMLFrameSetElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h1(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h1): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h1(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.h1,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h1(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h1, before: java.lang.String): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h2(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h2): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h2(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.h2,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h2(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h2, before: java.lang.String): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h3(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h3): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h3(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.h3,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h3(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h3, before: java.lang.String): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h4(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h4): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h4(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.h4,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h4(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h4, before: java.lang.String): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h5(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h5): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h5(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.h5,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h5(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h5, before: java.lang.String): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h6(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h6): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h6(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.h6,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_h6(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.h6, before: java.lang.String): Selection[stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_head(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.head): Selection[stdLib.HTMLHeadElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_head(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.head,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLHeadElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_head(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.head, before: java.lang.String): Selection[stdLib.HTMLHeadElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_header(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.header): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_header(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.header,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_header(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.header, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_hgroup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.hgroup): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_hgroup(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.hgroup,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_hgroup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.hgroup, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_hr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.hr): Selection[stdLib.HTMLHRElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_hr(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.hr,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLHRElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_hr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.hr, before: java.lang.String): Selection[stdLib.HTMLHRElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_html(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.html): Selection[stdLib.HTMLHtmlElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_html(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.html,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLHtmlElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_html(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.html, before: java.lang.String): Selection[stdLib.HTMLHtmlElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_i(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.i): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_i(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.i, before: ValueFn[GElement, Datum, BaseType]): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_i(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.i, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_iframe(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.iframe): Selection[stdLib.HTMLIFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_iframe(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.iframe,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLIFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_iframe(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.iframe, before: java.lang.String): Selection[stdLib.HTMLIFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_img(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.img): Selection[stdLib.HTMLImageElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_img(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.img,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLImageElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_img(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.img, before: java.lang.String): Selection[stdLib.HTMLImageElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_input(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.input): Selection[stdLib.HTMLInputElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_input(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.input,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLInputElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_input(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.input, before: java.lang.String): Selection[stdLib.HTMLInputElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ins(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ins): Selection[stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ins(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.ins,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ins(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ins, before: java.lang.String): Selection[stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_kbd(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.kbd): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_kbd(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.kbd,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_kbd(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.kbd, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_label(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.label): Selection[stdLib.HTMLLabelElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_label(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.label,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLLabelElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_label(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.label, before: java.lang.String): Selection[stdLib.HTMLLabelElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_legend(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.legend): Selection[stdLib.HTMLLegendElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_legend(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.legend,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLLegendElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_legend(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.legend, before: java.lang.String): Selection[stdLib.HTMLLegendElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_li(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.li): Selection[stdLib.HTMLLIElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_li(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.li,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLLIElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_li(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.li, before: java.lang.String): Selection[stdLib.HTMLLIElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_link(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.link): Selection[stdLib.HTMLLinkElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_link(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.link,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLLinkElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_link(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.link, before: java.lang.String): Selection[stdLib.HTMLLinkElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_main(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.main): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_main(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.main,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_main(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.main, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_map(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.map): Selection[stdLib.HTMLMapElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_map(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.map,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLMapElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_map(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.map, before: java.lang.String): Selection[stdLib.HTMLMapElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_mark(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.mark): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_mark(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.mark,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_mark(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.mark, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_marquee(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.marquee): Selection[stdLib.HTMLMarqueeElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_marquee(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.marquee,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLMarqueeElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_marquee(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.marquee, before: java.lang.String): Selection[stdLib.HTMLMarqueeElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_menu(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.menu): Selection[stdLib.HTMLMenuElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_menu(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.menu,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLMenuElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_menu(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.menu, before: java.lang.String): Selection[stdLib.HTMLMenuElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_meta(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.meta): Selection[stdLib.HTMLMetaElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_meta(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.meta,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLMetaElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_meta(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.meta, before: java.lang.String): Selection[stdLib.HTMLMetaElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_meter(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.meter): Selection[stdLib.HTMLMeterElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_meter(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.meter,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLMeterElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_meter(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.meter, before: java.lang.String): Selection[stdLib.HTMLMeterElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_nav(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.nav): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_nav(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.nav,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_nav(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.nav, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_noscript(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.noscript): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_noscript(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.noscript,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_noscript(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.noscript, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_object(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.`object`): Selection[stdLib.HTMLObjectElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_object(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.`object`,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLObjectElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_object(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.`object`, before: java.lang.String): Selection[stdLib.HTMLObjectElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ol(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ol): Selection[stdLib.HTMLOListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ol(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.ol,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLOListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ol(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ol, before: java.lang.String): Selection[stdLib.HTMLOListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_optgroup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.optgroup): Selection[stdLib.HTMLOptGroupElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_optgroup(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.optgroup,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLOptGroupElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_optgroup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.optgroup, before: java.lang.String): Selection[stdLib.HTMLOptGroupElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_option(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.option): Selection[stdLib.HTMLOptionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_option(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.option,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLOptionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_option(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.option, before: java.lang.String): Selection[stdLib.HTMLOptionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_output(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.output): Selection[stdLib.HTMLOutputElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_output(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.output,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLOutputElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_output(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.output, before: java.lang.String): Selection[stdLib.HTMLOutputElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_p(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.p): Selection[stdLib.HTMLParagraphElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_p(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.p, before: ValueFn[GElement, Datum, BaseType]): Selection[stdLib.HTMLParagraphElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_p(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.p, before: java.lang.String): Selection[stdLib.HTMLParagraphElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_param(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.param): Selection[stdLib.HTMLParamElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_param(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.param,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLParamElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_param(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.param, before: java.lang.String): Selection[stdLib.HTMLParamElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_picture(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.picture): Selection[stdLib.HTMLPictureElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_picture(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.picture,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLPictureElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_picture(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.picture, before: java.lang.String): Selection[stdLib.HTMLPictureElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_pre(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.pre): Selection[stdLib.HTMLPreElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_pre(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.pre,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLPreElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_pre(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.pre, before: java.lang.String): Selection[stdLib.HTMLPreElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_progress(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.progress): Selection[stdLib.HTMLProgressElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_progress(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.progress,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLProgressElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_progress(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.progress, before: java.lang.String): Selection[stdLib.HTMLProgressElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_q(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.q): Selection[stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_q(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.q, before: ValueFn[GElement, Datum, BaseType]): Selection[stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_q(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.q, before: java.lang.String): Selection[stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_rp(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.rp): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_rp(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.rp,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_rp(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.rp, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_rt(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.rt): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_rt(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.rt,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_rt(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.rt, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ruby(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ruby): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ruby(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.ruby,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ruby(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ruby, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_s(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.s): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_s(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.s, before: ValueFn[GElement, Datum, BaseType]): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_s(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.s, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_samp(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.samp): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_samp(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.samp,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_samp(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.samp, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_script(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.script): Selection[stdLib.HTMLScriptElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_script(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.script,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLScriptElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_script(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.script, before: java.lang.String): Selection[stdLib.HTMLScriptElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_section(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.section): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_section(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.section,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_section(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.section, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_select(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.select): Selection[stdLib.HTMLSelectElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_select(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.select,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLSelectElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_select(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.select, before: java.lang.String): Selection[stdLib.HTMLSelectElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_slot(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.slot): Selection[stdLib.HTMLSlotElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_slot(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.slot,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLSlotElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_slot(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.slot, before: java.lang.String): Selection[stdLib.HTMLSlotElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_small(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.small): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_small(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.small,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_small(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.small, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_source(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.source): Selection[stdLib.HTMLSourceElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_source(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.source,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLSourceElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_source(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.source, before: java.lang.String): Selection[stdLib.HTMLSourceElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_span(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.span): Selection[stdLib.HTMLSpanElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_span(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.span,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLSpanElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_span(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.span, before: java.lang.String): Selection[stdLib.HTMLSpanElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_strong(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.strong): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_strong(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.strong,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_strong(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.strong, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_style(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.style): Selection[stdLib.HTMLStyleElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_style(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.style,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLStyleElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_style(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.style, before: java.lang.String): Selection[stdLib.HTMLStyleElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_sub(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.sub): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_sub(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.sub,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_sub(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.sub, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_summary(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.summary): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_summary(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.summary,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_summary(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.summary, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_sup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.sup): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_sup(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.sup,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_sup(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.sup, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_table(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.table): Selection[stdLib.HTMLTableElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_table(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.table,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTableElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_table(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.table, before: java.lang.String): Selection[stdLib.HTMLTableElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_tbody(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.tbody): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_tbody(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.tbody,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_tbody(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.tbody, before: java.lang.String): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_td(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.td): Selection[stdLib.HTMLTableDataCellElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_td(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.td,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTableDataCellElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_td(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.td, before: java.lang.String): Selection[stdLib.HTMLTableDataCellElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_template(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.template): Selection[stdLib.HTMLTemplateElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_template(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.template,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTemplateElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_template(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.template, before: java.lang.String): Selection[stdLib.HTMLTemplateElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_textarea(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.textarea): Selection[stdLib.HTMLTextAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_textarea(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.textarea,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTextAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_textarea(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.textarea, before: java.lang.String): Selection[stdLib.HTMLTextAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_tfoot(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.tfoot): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_tfoot(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.tfoot,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_tfoot(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.tfoot, before: java.lang.String): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_th(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.th): Selection[stdLib.HTMLTableHeaderCellElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_th(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.th,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTableHeaderCellElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_th(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.th, before: java.lang.String): Selection[stdLib.HTMLTableHeaderCellElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_thead(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.thead): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_thead(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.thead,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_thead(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.thead, before: java.lang.String): Selection[stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_time(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.time): Selection[stdLib.HTMLTimeElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_time(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.time,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTimeElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_time(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.time, before: java.lang.String): Selection[stdLib.HTMLTimeElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_title(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.title): Selection[stdLib.HTMLTitleElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_title(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.title,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTitleElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_title(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.title, before: java.lang.String): Selection[stdLib.HTMLTitleElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_tr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.tr): Selection[stdLib.HTMLTableRowElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_tr(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.tr,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTableRowElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_tr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.tr, before: java.lang.String): Selection[stdLib.HTMLTableRowElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_track(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.track): Selection[stdLib.HTMLTrackElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_track(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.track,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLTrackElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_track(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.track, before: java.lang.String): Selection[stdLib.HTMLTrackElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_u(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.u): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_u(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.u, before: ValueFn[GElement, Datum, BaseType]): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_u(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.u, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ul(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ul): Selection[stdLib.HTMLUListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ul(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.ul,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLUListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_ul(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.ul, before: java.lang.String): Selection[stdLib.HTMLUListElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_var(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.`var`): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_var(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.`var`,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_var(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.`var`, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_video(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.video): Selection[stdLib.HTMLVideoElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_video(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.video,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLVideoElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_video(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.video, before: java.lang.String): Selection[stdLib.HTMLVideoElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_wbr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.wbr): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_wbr(
    `type`: d3DashSelectionLib.d3DashSelectionLibStrings.wbr,
    before: ValueFn[GElement, Datum, BaseType]
  ): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("insert")
  def insert_wbr(`type`: d3DashSelectionLib.d3DashSelectionLibStrings.wbr, before: java.lang.String): Selection[stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  /**
    * Appends, removes and reorders elements as necessary to match the data that was previously bound by `selection.data`, returning the merged enter and update selection.
    * This method is a convenient alternative to the more explicit `selection.enter`, `selection.exit`, `selection.append` and `selection.remove`.
    *
    * The "matching" logic is determined by the key function passed to `selection.data`.
    */
  def join[ChildElement /* <: BaseType */, OldDatum](enter: java.lang.String): Selection[ChildElement | GElement, Datum, PElement, PDatum] = js.native
  def join[ChildElement /* <: BaseType */, OldDatum](
    enter: java.lang.String,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[ChildElement | GElement, Datum, PElement, PDatum] = js.native
  def join[ChildElement /* <: BaseType */, OldDatum](
    enter: java.lang.String,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[ChildElement | GElement, Datum, PElement, PDatum] = js.native
  /**
    * Appends, removes and reorders elements as necessary to match the data that was previously bound by `selection.data`, returning the merged enter and update selection.
    * This method is a convenient alternative to the more explicit `selection.enter`, `selection.exit`, `selection.append` and `selection.remove`.
    *
    * The "matching" logic is determined by the key function passed to `selection.data`.
    */
  def join[ChildElement /* <: BaseType */, OldDatum](
    enter: js.Function1[
      /* elem */ Selection[EnterElement, Datum, PElement, PDatum], 
      Selection[ChildElement, Datum, PElement, PDatum]
    ]
  ): Selection[ChildElement | GElement, Datum, PElement, PDatum] = js.native
  def join[ChildElement /* <: BaseType */, OldDatum](
    enter: js.Function1[
      /* elem */ Selection[EnterElement, Datum, PElement, PDatum], 
      Selection[ChildElement, Datum, PElement, PDatum]
    ],
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[ChildElement | GElement, Datum, PElement, PDatum] = js.native
  def join[ChildElement /* <: BaseType */, OldDatum](
    enter: js.Function1[
      /* elem */ Selection[EnterElement, Datum, PElement, PDatum], 
      Selection[ChildElement, Datum, PElement, PDatum]
    ],
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[ChildElement | GElement, Datum, PElement, PDatum] = js.native
  /**
    * Appends, removes and reorders elements as necessary to match the data that was previously bound by `selection.data`, returning the merged enter and update selection.
    * This method is a convenient alternative to the more explicit `selection.enter`, `selection.exit`, `selection.append` and `selection.remove`.
    *
    * The "matching" logic is determined by the key function passed to `selection.data`.
    */
  @JSName("join")
  def join_a[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.a): Selection[GElement | stdLib.HTMLAnchorElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_a[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.a,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLAnchorElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_a[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.a,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLAnchorElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_abbr[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.abbr): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_abbr[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.abbr,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_abbr[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.abbr,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_address[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.address): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_address[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.address,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_address[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.address,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_applet[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.applet): Selection[GElement | stdLib.HTMLAppletElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_applet[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.applet,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLAppletElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_applet[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.applet,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLAppletElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_area[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.area): Selection[GElement | stdLib.HTMLAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_area[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.area,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_area[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.area,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_article[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.article): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_article[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.article,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_article[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.article,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_aside[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.aside): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_aside[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.aside,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_aside[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.aside,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_audio[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.audio): Selection[GElement | stdLib.HTMLAudioElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_audio[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.audio,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLAudioElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_audio[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.audio,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLAudioElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_b[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.b): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_b[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.b,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_b[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.b,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_base[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.base): Selection[GElement | stdLib.HTMLBaseElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_base[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.base,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLBaseElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_base[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.base,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLBaseElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_basefont[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.basefont): Selection[GElement | stdLib.HTMLBaseFontElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_basefont[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.basefont,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLBaseFontElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_basefont[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.basefont,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLBaseFontElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_bdi[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.bdi): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_bdi[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.bdi,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_bdi[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.bdi,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_bdo[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.bdo): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_bdo[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.bdo,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_bdo[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.bdo,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_blockquote[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.blockquote): Selection[GElement | stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_blockquote[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.blockquote,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_blockquote[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.blockquote,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_body[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.body): Selection[GElement | stdLib.HTMLBodyElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_body[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.body,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLBodyElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_body[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.body,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLBodyElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_br[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.br): Selection[GElement | stdLib.HTMLBRElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_br[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.br,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLBRElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_br[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.br,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLBRElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_button[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.button): Selection[GElement | stdLib.HTMLButtonElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_button[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.button,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLButtonElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_button[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.button,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLButtonElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_canvas[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.canvas): Selection[GElement | stdLib.HTMLCanvasElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_canvas[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.canvas,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLCanvasElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_canvas[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.canvas,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLCanvasElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_caption[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.caption): Selection[GElement | stdLib.HTMLTableCaptionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_caption[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.caption,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTableCaptionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_caption[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.caption,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTableCaptionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_cite[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.cite): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_cite[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.cite,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_cite[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.cite,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_code[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.code): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_code[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.code,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_code[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.code,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_col[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.col): Selection[GElement | stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_col[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.col,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_col[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.col,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_colgroup[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.colgroup): Selection[GElement | stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_colgroup[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.colgroup,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_colgroup[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.colgroup,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTableColElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_data[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.data): Selection[GElement | stdLib.HTMLDataElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_data[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.data,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLDataElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_data[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.data,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLDataElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_datalist[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.datalist): Selection[GElement | stdLib.HTMLDataListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_datalist[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.datalist,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLDataListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_datalist[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.datalist,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLDataListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dd[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.dd): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dd[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dd,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dd[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dd,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_del[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.del): Selection[GElement | stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_del[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.del,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_del[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.del,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_details[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.details): Selection[GElement | stdLib.HTMLDetailsElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_details[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.details,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLDetailsElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_details[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.details,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLDetailsElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dfn[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.dfn): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dfn[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dfn,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dfn[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dfn,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dialog[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.dialog): Selection[GElement | stdLib.HTMLDialogElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dialog[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dialog,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLDialogElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dialog[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dialog,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLDialogElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dir[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.dir): Selection[GElement | stdLib.HTMLDirectoryElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dir[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dir,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLDirectoryElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dir[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dir,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLDirectoryElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_div[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.div): Selection[GElement | stdLib.HTMLDivElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_div[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.div,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLDivElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_div[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.div,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLDivElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dl[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.dl): Selection[GElement | stdLib.HTMLDListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dl[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dl,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLDListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dl[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dl,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLDListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dt[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.dt): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dt[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dt,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_dt[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.dt,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_em[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.em): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_em[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.em,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_em[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.em,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_embed[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.embed): Selection[GElement | stdLib.HTMLEmbedElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_embed[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.embed,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLEmbedElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_embed[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.embed,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLEmbedElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_fieldset[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.fieldset): Selection[GElement | stdLib.HTMLFieldSetElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_fieldset[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.fieldset,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLFieldSetElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_fieldset[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.fieldset,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLFieldSetElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_figcaption[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.figcaption): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_figcaption[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.figcaption,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_figcaption[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.figcaption,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_figure[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.figure): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_figure[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.figure,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_figure[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.figure,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_font[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.font): Selection[GElement | stdLib.HTMLFontElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_font[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.font,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLFontElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_font[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.font,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLFontElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_footer[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.footer): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_footer[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.footer,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_footer[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.footer,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_form[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.form): Selection[GElement | stdLib.HTMLFormElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_form[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.form,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLFormElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_form[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.form,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLFormElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_frame[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.frame): Selection[GElement | stdLib.HTMLFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_frame[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.frame,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_frame[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.frame,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_frameset[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.frameset): Selection[GElement | stdLib.HTMLFrameSetElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_frameset[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.frameset,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLFrameSetElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_frameset[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.frameset,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLFrameSetElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h1[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.h1): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h1[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h1,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h1[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h1,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h2[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.h2): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h2[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h2,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h2[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h2,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h3[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.h3): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h3[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h3,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h3[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h3,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h4[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.h4): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h4[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h4,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h4[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h4,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h5[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.h5): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h5[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h5,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h5[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h5,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h6[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.h6): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h6[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h6,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_h6[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.h6,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLHeadingElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_head[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.head): Selection[GElement | stdLib.HTMLHeadElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_head[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.head,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLHeadElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_head[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.head,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLHeadElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_header[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.header): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_header[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.header,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_header[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.header,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_hgroup[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.hgroup): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_hgroup[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.hgroup,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_hgroup[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.hgroup,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_hr[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.hr): Selection[GElement | stdLib.HTMLHRElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_hr[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.hr,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLHRElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_hr[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.hr,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLHRElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_html[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.html): Selection[GElement | stdLib.HTMLHtmlElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_html[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.html,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLHtmlElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_html[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.html,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLHtmlElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_i[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.i): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_i[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.i,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_i[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.i,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_iframe[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.iframe): Selection[GElement | stdLib.HTMLIFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_iframe[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.iframe,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLIFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_iframe[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.iframe,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLIFrameElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_img[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.img): Selection[GElement | stdLib.HTMLImageElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_img[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.img,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLImageElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_img[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.img,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLImageElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_input[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.input): Selection[GElement | stdLib.HTMLInputElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_input[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.input,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLInputElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_input[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.input,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLInputElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ins[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.ins): Selection[GElement | stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ins[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.ins,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ins[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.ins,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLModElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_kbd[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.kbd): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_kbd[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.kbd,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_kbd[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.kbd,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_label[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.label): Selection[GElement | stdLib.HTMLLabelElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_label[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.label,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLLabelElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_label[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.label,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLLabelElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_legend[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.legend): Selection[GElement | stdLib.HTMLLegendElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_legend[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.legend,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLLegendElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_legend[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.legend,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLLegendElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_li[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.li): Selection[GElement | stdLib.HTMLLIElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_li[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.li,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLLIElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_li[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.li,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLLIElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_link[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.link): Selection[GElement | stdLib.HTMLLinkElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_link[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.link,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLLinkElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_link[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.link,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLLinkElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_main[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.main): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_main[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.main,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_main[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.main,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_map[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.map): Selection[GElement | stdLib.HTMLMapElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_map[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.map,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLMapElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_map[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.map,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLMapElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_mark[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.mark): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_mark[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.mark,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_mark[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.mark,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_marquee[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.marquee): Selection[GElement | stdLib.HTMLMarqueeElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_marquee[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.marquee,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLMarqueeElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_marquee[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.marquee,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLMarqueeElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_menu[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.menu): Selection[GElement | stdLib.HTMLMenuElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_menu[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.menu,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLMenuElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_menu[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.menu,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLMenuElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_meta[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.meta): Selection[GElement | stdLib.HTMLMetaElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_meta[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.meta,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLMetaElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_meta[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.meta,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLMetaElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_meter[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.meter): Selection[GElement | stdLib.HTMLMeterElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_meter[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.meter,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLMeterElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_meter[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.meter,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLMeterElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_nav[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.nav): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_nav[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.nav,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_nav[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.nav,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_noscript[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.noscript): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_noscript[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.noscript,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_noscript[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.noscript,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_object[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.`object`): Selection[GElement | stdLib.HTMLObjectElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_object[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.`object`,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLObjectElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_object[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.`object`,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLObjectElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ol[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.ol): Selection[GElement | stdLib.HTMLOListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ol[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.ol,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLOListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ol[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.ol,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLOListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_optgroup[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.optgroup): Selection[GElement | stdLib.HTMLOptGroupElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_optgroup[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.optgroup,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLOptGroupElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_optgroup[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.optgroup,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLOptGroupElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_option[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.option): Selection[GElement | stdLib.HTMLOptionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_option[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.option,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLOptionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_option[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.option,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLOptionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_output[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.output): Selection[GElement | stdLib.HTMLOutputElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_output[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.output,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLOutputElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_output[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.output,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLOutputElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_p[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.p): Selection[GElement | stdLib.HTMLParagraphElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_p[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.p,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLParagraphElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_p[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.p,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLParagraphElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_param[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.param): Selection[GElement | stdLib.HTMLParamElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_param[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.param,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLParamElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_param[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.param,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLParamElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_picture[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.picture): Selection[GElement | stdLib.HTMLPictureElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_picture[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.picture,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLPictureElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_picture[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.picture,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLPictureElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_pre[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.pre): Selection[GElement | stdLib.HTMLPreElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_pre[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.pre,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLPreElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_pre[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.pre,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLPreElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_progress[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.progress): Selection[GElement | stdLib.HTMLProgressElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_progress[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.progress,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLProgressElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_progress[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.progress,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLProgressElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_q[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.q): Selection[GElement | stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_q[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.q,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_q[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.q,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLQuoteElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_rp[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.rp): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_rp[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.rp,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_rp[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.rp,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_rt[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.rt): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_rt[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.rt,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_rt[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.rt,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ruby[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.ruby): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ruby[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.ruby,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ruby[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.ruby,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_s[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.s): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_s[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.s,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_s[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.s,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_samp[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.samp): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_samp[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.samp,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_samp[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.samp,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_script[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.script): Selection[GElement | stdLib.HTMLScriptElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_script[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.script,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLScriptElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_script[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.script,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLScriptElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_section[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.section): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_section[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.section,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_section[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.section,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_select[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.select): Selection[GElement | stdLib.HTMLSelectElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_select[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.select,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLSelectElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_select[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.select,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLSelectElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_slot[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.slot): Selection[GElement | stdLib.HTMLSlotElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_slot[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.slot,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLSlotElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_slot[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.slot,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLSlotElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_small[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.small): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_small[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.small,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_small[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.small,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_source[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.source): Selection[GElement | stdLib.HTMLSourceElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_source[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.source,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLSourceElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_source[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.source,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLSourceElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_span[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.span): Selection[GElement | stdLib.HTMLSpanElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_span[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.span,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLSpanElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_span[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.span,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLSpanElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_strong[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.strong): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_strong[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.strong,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_strong[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.strong,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_style[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.style): Selection[GElement | stdLib.HTMLStyleElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_style[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.style,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLStyleElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_style[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.style,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLStyleElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_sub[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.sub): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_sub[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.sub,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_sub[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.sub,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_summary[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.summary): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_summary[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.summary,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_summary[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.summary,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_sup[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.sup): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_sup[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.sup,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_sup[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.sup,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_table[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.table): Selection[GElement | stdLib.HTMLTableElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_table[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.table,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTableElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_table[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.table,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTableElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_tbody[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.tbody): Selection[GElement | stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_tbody[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.tbody,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_tbody[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.tbody,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_td[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.td): Selection[GElement | stdLib.HTMLTableDataCellElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_td[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.td,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTableDataCellElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_td[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.td,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTableDataCellElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_template[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.template): Selection[GElement | stdLib.HTMLTemplateElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_template[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.template,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTemplateElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_template[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.template,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTemplateElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_textarea[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.textarea): Selection[GElement | stdLib.HTMLTextAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_textarea[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.textarea,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTextAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_textarea[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.textarea,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTextAreaElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_tfoot[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.tfoot): Selection[GElement | stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_tfoot[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.tfoot,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_tfoot[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.tfoot,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_th[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.th): Selection[GElement | stdLib.HTMLTableHeaderCellElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_th[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.th,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTableHeaderCellElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_th[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.th,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTableHeaderCellElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_thead[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.thead): Selection[GElement | stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_thead[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.thead,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_thead[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.thead,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTableSectionElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_time[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.time): Selection[GElement | stdLib.HTMLTimeElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_time[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.time,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTimeElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_time[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.time,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTimeElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_title[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.title): Selection[GElement | stdLib.HTMLTitleElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_title[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.title,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTitleElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_title[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.title,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTitleElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_tr[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.tr): Selection[GElement | stdLib.HTMLTableRowElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_tr[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.tr,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTableRowElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_tr[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.tr,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTableRowElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_track[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.track): Selection[GElement | stdLib.HTMLTrackElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_track[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.track,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLTrackElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_track[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.track,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLTrackElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_u[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.u): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_u[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.u,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_u[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.u,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ul[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.ul): Selection[GElement | stdLib.HTMLUListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ul[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.ul,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLUListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_ul[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.ul,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLUListElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_var[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.`var`): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_var[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.`var`,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_var[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.`var`,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_video[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.video): Selection[GElement | stdLib.HTMLVideoElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_video[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.video,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLVideoElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_video[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.video,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLVideoElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_wbr[OldDatum](enter: d3DashSelectionLib.d3DashSelectionLibStrings.wbr): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_wbr[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.wbr,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  @JSName("join")
  def join_wbr[OldDatum](
    enter: d3DashSelectionLib.d3DashSelectionLibStrings.wbr,
    update: js.Function1[
      /* elem */ Selection[GElement, Datum, PElement, PDatum], 
      js.UndefOr[Selection[GElement, Datum, PElement, PDatum]]
    ],
    exit: js.Function1[/* elem */ Selection[GElement, OldDatum, PElement, PDatum], scala.Unit]
  ): Selection[GElement | stdLib.HTMLElement, Datum, PElement, PDatum] = js.native
  /**
    * Re-insert each selected element, in order, as the first child of its parent.
    */
  def lower(): this.type = js.native
  /**
    * Returns a new selection merging this selection with the specified other selection.
    * The returned selection has the same number of groups and the same parents as this selection.
    * Any missing (null) elements in this selection are filled with the corresponding element,
    * if present (not null), from the specified selection. (If the other selection has additional groups or parents,
    * they are ignored.)
    *
    * This method is commonly used to merge the enter and update selections after a data-join.
    * After modifying the entering and updating elements separately, you can merge the two selections and
    * perform operations on both without duplicate code.
    *
    * This method is not intended for concatenating arbitrary selections, however: if both this selection
    * and the specified other selection have (non-null) elements at the same index, this selection’s element
    * is returned in the merge and the other selection’s element is ignored.
    *
    * @param other Selection to be merged.
    */
  def merge(other: Selection[GElement, Datum, PElement, PDatum]): Selection[GElement, Datum, PElement, PDatum] = js.native
  /**
    * Return the first (non-null) element in this selection. If the selection is empty, returns null.
    */
  def node(): GElement | scala.Null = js.native
  /**
    * Return an array of all (non-null) elements in this selection.
    */
  def nodes(): js.Array[GElement] = js.native
  // Event Handling -------------------
  /**
    * Return the currently-assigned listener for the specified event typename on the first (non-null) selected element,
    * if any, If multiple typenames are specified, the first matching listener is returned.
    *
    * @param typenames The typenames is a string event type, such as click, mouseover, or submit; any DOM event type supported by your browser may be used.
    * The type may be optionally followed by a period (.) and a name; the optional name allows multiple callbacks to be registered
    * to receive events of the same type, such as click.foo and click.bar. To specify multiple typenames, separate typenames with spaces,
    * such as "input change"" or "click.foo click.bar".
    */
  def on(typenames: java.lang.String): js.UndefOr[ValueFn[GElement, Datum, scala.Unit]] = js.native
  /**
    * Add an event listener for the specified event type names. If an event listener was previously registered for the same typename
    * on a selected element, the old listener is removed before the new listener is added.
    *
    * When a specified event is dispatched on a selected node, the specified listener will be evaluated for each selected element.
    *
    * An optional capture flag may be specified which corresponds to the W3C useCapture flag:
    * "After initiating capture, all events of the specified type will be dispatched to the registered EventListener before being
    * dispatched to any EventTargets beneath them in the tree. Events which are bubbling upward through the tree will not
    * trigger an EventListener designated to use capture."
    *
    * @param typenames The typenames is a string event type, such as click, mouseover, or submit; any DOM event type supported by your browser may be used.
    * The type may be optionally followed by a period (.) and a name; the optional name allows multiple callbacks to be registered
    * to receive events of the same type, such as click.foo and click.bar. To specify multiple typenames, separate typenames with spaces,
    * such as "input change"" or "click.foo click.bar".
    * @param listener A listener function which will be evaluated for each selected element, being passed the current datum (d), the current index (i),
    * and the current group (nodes), with this as the current DOM element (nodes[i]). Listeners always see the latest datum for their element,
    * but the index is a property of the selection and is fixed when the listener is assigned; to update the index, re-assign the listener.
    * To access the current event within a listener, use d3.event.
    * @param capture An optional capture flag which corresponds to the W3C useCapture flag.
    */
  def on(typenames: java.lang.String, listener: ValueFn[GElement, Datum, scala.Unit]): this.type = js.native
  def on(
    typenames: java.lang.String,
    listener: ValueFn[GElement, Datum, scala.Unit],
    capture: scala.Boolean
  ): this.type = js.native
  /**
    * Remove a listener for the specified event type names. To remove all listeners for a given name,
    * pass null as the listener and ".foo" as the typename, where foo is the name; to remove all listeners with no name, specify "." as the typename.
    *
    * @param typenames The typenames is a string event type, such as click, mouseover, or submit; any DOM event type supported by your browser may be used.
    * The type may be optionally followed by a period (.) and a name; the optional name allows multiple callbacks to be registered
    * to receive events of the same type, such as click.foo and click.bar. To specify multiple typenames, separate typenames with spaces,
    * such as "input change"" or "click.foo click.bar".
    * @param listener null to indicate removal of listener
    */
  @JSName("on")
  def `on_<this>`(typenames: java.lang.String): this.type = js.native
  /**
    * Re-insert elements into the document such that the document order of each group matches the selection order.
    * This is equivalent to calling selection.sort if the data is already sorted, but much faster.
    */
  def order(): this.type = js.native
  /**
    * Clears the property with the specified name for the selected elements and returns this selection.
    *
    * @param name Name of the property
    * @param value null,to clear the property
    */
  def property(name: java.lang.String): this.type = js.native
  /**
    * Sets the value of the property with the specified name for the selected elements and returns this selection.
    * The value for the individual selected elements is determined by the value function.
    *
    * Some HTML elements have special properties that are not addressable using attributes or styles,
    * such as a form field’s text value and a checkbox’s checked boolean. Use this method to get or set these properties.
    *
    * @param name Name of the property
    * @param value A value function which is evaluated for each selected element, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).  A null value will clear the property.
    */
  def property(name: java.lang.String, value: ValueFn[GElement, Datum, _]): this.type = js.native
  /**
    * Sets the value of the property with the specified name for the selected elements and returns this selection.
    * All elements are given the same property value.
    *
    * @param name Name of the property
    * @param value Constant value for the property
    */
  def property(name: java.lang.String, value: js.Any): this.type = js.native
  /**
    * Look up a local variable on the first node of this selection. Note that this is not equivalent to `local.get(selection.node())` in that it will not look up locals set on the parent node(s).
    *
    * @param name The `d3.local` variable to look up.
    */
  def property[T](name: Local[T]): js.UndefOr[T] = js.native
  /**
    * Store a value in a `d3.local` variable for each node in the selection.
    * This is equivalent to `selection.each(function () { name.set(this, value); })` but more concise.
    *
    * @param name A `d3.local` variable
    * @param value A callback that returns the value to store
    */
  def property[T](name: Local[T], value: T): this.type = js.native
  /**
    * Store a value in a `d3.local` variable.
    * This is equivalent to `selection.each(function (d, i, g) { name.set(this, value.call(this, d, i, g)); })` but more concise.
    *
    * @param name A `d3.local` variable
    * @param value A callback that returns the value to store
    */
  def property[T](name: Local[T], value: ValueFn[GElement, Datum, T]): this.type = js.native
  /**
    * Return the current value of the specified property for the first (non-null) element in the selection.
    * This is generally useful only if you know that the selection contains exactly one element.
    *
    * @param name Name of the property
    */
  @JSName("property")
  def property_Any(name: java.lang.String): js.Any = js.native
  /**
    * Re-insert each selected element, in order, as the last child of its parent.
    */
  def raise(): this.type = js.native
  /**
    * Removes the selected elements from the document.
    * Returns this selection (the removed elements) which are now detached from the DOM.
    */
  def remove(): this.type = js.native
  /**
    * Create an empty sub-selection. Selection.select does not affect grouping: it preserves the existing group
    * structure and indexes.
    */
  def select[DescElement /* <: BaseType */](): Selection[scala.Null, js.UndefOr[scala.Nothing], PElement, PDatum] = js.native
  /**
    * For each selected element, select the descendant element returned by the selector function.
    * If no element is returned by the selector function for the current element, the element at the
    * current index will be null in the returned selection. Selection.select does not affect grouping:
    * it preserves the existing group structure and indexes, and propagates data (if any) to selected children.
    *
    * If the current element has associated data, this data is propagated to the
    * corresponding selected element.
    *
    * The generic represents the type of the descendant element to be selected.
    *
    * @param selector A selector function, which is evaluated for each selected element, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
    * It must return an element, or null if there is no matching element.
    */
  def select[DescElement /* <: BaseType */](selector: ValueFn[GElement, Datum, DescElement]): Selection[DescElement, Datum, PElement, PDatum] = js.native
  // Sub-selection -------------------------
  /**
    * For each selected element, select the first descendant element that matches the specified selector string.
    * If no element matches the specified selector for the current element, the element at the current index will
    * be null in the returned selection. If multiple elements match the selector, only the first matching element
    * in document order is selected. Selection.select does not affect grouping: it preserves the existing group
    * structure and indexes, and propagates data (if any) to selected children.
    *
    * If the current element has associated data, this data is propagated to the
    * corresponding selected element.
    *
    * The generic represents the type of the descendant element to be selected.
    *
    * @param selector CSS selector string
    */
  def select[DescElement /* <: BaseType */](selector: java.lang.String): Selection[DescElement, Datum, PElement, PDatum] = js.native
  /**
    * Create an empty sub-selection. Selection.selectAll does affect grouping: The elements in the returned
    * selection are grouped by their corresponding parent node in this selection, the group at the current index will be empty.
    */
  def selectAll(): Selection[scala.Null, js.UndefOr[scala.Nothing], GElement, Datum] = js.native
  /**
    * For each selected element, selects the descendant elements returned by the selector function. The elements in the returned
    * selection are grouped by their corresponding parent node in this selection. If no element matches the specified selector
    * for the current element, the group at the current index will be empty. Selection.selectAll does affect grouping: each selected descendant
    * is grouped by the parent element in the originating selection.
    *
    * The selected elements do not inherit data from this selection; use selection.data to propagate data to children.
    *
    * The first generic "DescElement" refers to the type of descendant element to be selected. The second generic "OldDatum" refers to the type of the
    * datum, of a selected element. This is useful when re-selecting elements with a previously set, know datum type.
    *
    * @param selector A selector function which is evaluated for each selected element, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]). It must return an array of elements
    * (or a pseudo-array, such as a NodeList), or the empty array if there are no matching elements.
    */
  def selectAll[DescElement /* <: BaseType */, OldDatum](selector: ValueFn[GElement, Datum, js.Array[DescElement] | ArrayLike[DescElement]]): Selection[DescElement, OldDatum, GElement, Datum] = js.native
  /**
    * For each selected element, selects the descendant elements that match the specified selector string. The elements in the returned
    * selection are grouped by their corresponding parent node in this selection. If no element matches the specified selector
    * for the current element, the group at the current index will be empty. Selection.selectAll does affect grouping: each selected descendant
    * is grouped by the parent element in the originating selection.
    *
    * The selected elements do not inherit data from this selection; use selection.data to propagate data to children.
    *
    * The first generic "DescElement" refers to the type of descendant element to be selected. The second generic "OldDatum" refers to the type of the
    * datum, of a selected element. This is useful when re-selecting elements with a previously set, know datum type.
    *
    * @param selector CSS selector string
    */
  def selectAll[DescElement /* <: BaseType */, OldDatum](selector: java.lang.String): Selection[DescElement, OldDatum, GElement, Datum] = js.native
  /**
    * Returns the total number of elements in this selection.
    */
  def size(): scala.Double = js.native
  /**
    * Return a new selection that contains a copy of each group in this selection sorted according
    * to the compare function. After sorting, re-inserts elements to match the resulting order (per selection.order).
    *
    * Note that sorting is not guaranteed to be stable; however, it is guaranteed to have the same
    * behavior as your browser’s built-in sort method on arrays.
    *
    * @param comparator An optional comparator function, which defaults to "ascending". The function is passed
    * two elements’ data a and b to compare. It should return either a negative, positive, or zero value.
    * If negative, then a should be before b; if positive, then a should be after b; otherwise, a and b are
    * considered equal and the order is arbitrary.
    */
  def sort(): this.type = js.native
  def sort(comparator: js.Function2[/* a */ Datum, /* b */ Datum, scala.Double]): this.type = js.native
  /**
    * Clear the style with the specified name for the selected elements and returns this selection.
    *
    * @param name Name of the style
    * @param value null,to clear the style
    */
  def style(name: java.lang.String): this.type = js.native
  /**
    * Sets the value of the style with the specified name for the selected elements and returns this selection.
    * The value for the individual selected elements is determined by the value function.
    *
    * @param name Name of the style
    * @param value A value function which is evaluated for each selected element, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).  A null value will clear the style.
    * @param priority An optional priority flag, either null or the string important (without the exclamation point)
    */
  def style(
    name: java.lang.String,
    value: ValueFn[GElement, Datum, java.lang.String | scala.Double | scala.Boolean | scala.Null]
  ): this.type = js.native
  /**
    * Sets the value of the style with the specified name for the selected elements and returns this selection.
    * All elements are given the same style value.
    *
    * @param name Name of the style
    * @param value Constant value for the style
    * @param priority An optional priority flag, either null or the string important (without the exclamation point)
    */
  def style(name: java.lang.String, value: java.lang.String): this.type = js.native
  def style(name: java.lang.String, value: scala.Boolean): this.type = js.native
  def style(name: java.lang.String, value: scala.Double): this.type = js.native
  /**
    * Returns the current value of the specified style property for the first (non-null) element in the selection.
    * The current value is defined as the element’s inline value, if present, and otherwise its computed value.
    * Accessing the current style value is generally useful only if you know the selection contains exactly one element.
    *
    * @param name Name of the style
    */
  @JSName("style")
  def style_String(name: java.lang.String): java.lang.String = js.native
  @JSName("style")
  def style_important(
    name: java.lang.String,
    value: ValueFn[GElement, Datum, java.lang.String | scala.Double | scala.Boolean | scala.Null],
    priority: d3DashSelectionLib.d3DashSelectionLibStrings.important
  ): this.type = js.native
  @JSName("style")
  def style_important(
    name: java.lang.String,
    value: java.lang.String,
    priority: d3DashSelectionLib.d3DashSelectionLibStrings.important
  ): this.type = js.native
  @JSName("style")
  def style_important(
    name: java.lang.String,
    value: scala.Boolean,
    priority: d3DashSelectionLib.d3DashSelectionLibStrings.important
  ): this.type = js.native
  @JSName("style")
  def style_important(
    name: java.lang.String,
    value: scala.Double,
    priority: d3DashSelectionLib.d3DashSelectionLibStrings.important
  ): this.type = js.native
  /**
    * Clear the text content of the selected elements and return the selection.
    */
  def text(): this.type = js.native
  /**
    * Sets the text content to the specified value on all selected elements, replacing any existing child elements.
    * All elements are given the same text content.
    *
    * @param value A value unction which is evaluated for each selected element, in order, being passed the current datum (d),
    * the current index (i), and the current group (nodes), with this as the current DOM element (nodes[i]).
    * The function’s return value is then used to set each element’s text content. A null value will clear the content.
    */
  def text(value: ValueFn[GElement, Datum, java.lang.String | scala.Double | scala.Boolean | scala.Null]): this.type = js.native
  /**
    * Sets the text content to the specified value on all selected elements, replacing any existing child elements.
    * All elements are given the same text content.
    *
    * @param value Text content value for the elements.
    */
  def text(value: java.lang.String): this.type = js.native
  def text(value: scala.Boolean): this.type = js.native
  def text(value: scala.Double): this.type = js.native
  /**
    * Returns the text content for the first (non-null) element in the selection.
    * This is generally useful only if you know the selection contains exactly one element.
    */
  @JSName("text")
  def text_String(): java.lang.String = js.native
}

