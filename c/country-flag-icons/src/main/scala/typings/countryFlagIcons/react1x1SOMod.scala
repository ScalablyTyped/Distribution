package typings.countryFlagIcons

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object react1x1SOMod extends Shortcut {
  
  @JSImport("country-flag-icons/react/1x1/SO", JSImport.Default)
  @js.native
  val default: FlagComponent = js.native
  
  // React TypeScript Cheatsheet doesn't recommend using React.FunctionalComponent.
  // https://react-typescript-cheatsheet.netlify.app/docs/basic/getting-started/function_components
  // declare const ReactTimeAgo: React.FC<Props>;
  type FlagComponent = js.Function1[/* props */ Props, Element]
  
  // https://stackoverflow.com/questions/63165896/what-is-the-type-of-the-svg-element-in-typescript
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.EventTarget because Already inherited
  - typings.std.Node because Already inherited
  - typings.std.Slottable because Already inherited
  - typings.std.NonDocumentTypeChildNode because Already inherited
  - typings.std.InnerHTML because Already inherited
  - typings.std.ChildNode because Already inherited
  - typings.std.Animatable because Already inherited
  - typings.std.ARIAMixin because Already inherited
  - typings.std.HTMLOrSVGElement because Already inherited
  - typings.std.GlobalEventHandlers because Already inherited
  - typings.std.ElementCSSInlineStyle because Already inherited
  - typings.std.DocumentAndElementEventHandlers because Already inherited
  - typings.std.Element because Already inherited
  - typings.std.SVGElement because var conflicts: ariaAtomic, ariaAutoComplete, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autofocus, className, id, innerHTML, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextmenu, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, role, scrollLeft, scrollTop, slot, tabIndex, textContent. Inlined ownerSVGElement, viewportElement */ @js.native
  trait HTMLSVGElement
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* standard dom */
    val ownerSVGElement: SVGSVGElement | Null = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* standard dom */
    val viewportElement: SVGElement | Null = js.native
  }
  
  type Props = HTMLAttributes[HTMLSVGElement]
  
  type _To = FlagComponent
  
  /* This means you don't have to write `default`, but can instead just say `react1x1SOMod.foo` */
  override def _to: FlagComponent = default
}
