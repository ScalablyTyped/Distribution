package typings.codemirror.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextMarkerOptions extends StObject {
  
  /** When set to true (default is false), adding this marker will create an event in the undo history that can be individually undone(clearing the marker). */
  var addToHistory: js.UndefOr[Boolean] = js.undefined
  
  /** Atomic ranges act as a single unit when cursor movement is concerned — i.e. it is impossible to place the cursor inside of them.
    In atomic ranges, inclusiveLeft and inclusiveRight have a different meaning — they will prevent the cursor from being placed
    respectively directly before and directly after the range. */
  var atomic: js.UndefOr[Boolean] = js.undefined
  
  /** Assigns a CSS class to the marked stretch of text. */
  var className: js.UndefOr[String] = js.undefined
  
  /** When enabled, will cause the mark to clear itself whenever the cursor enters its range.
    This is mostly useful for text - replacement widgets that need to 'snap open' when the user tries to edit them.
    The "clear" event fired on the range handle can be used to be notified when this happens. */
  var clearOnEnter: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether the mark is automatically cleared when it becomes empty. Default is true. */
  var clearWhenEmpty: js.UndefOr[Boolean] = js.undefined
  
  /** Collapsed ranges do not show up in the display.Setting a range to be collapsed will automatically make it atomic. */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /** A string of CSS to be applied to the covered text. For example "color: #fe3". */
  var css: js.UndefOr[String] = js.undefined
  
  /** Equivalent to startStyle, but for the rightmost span. */
  var endStyle: js.UndefOr[String] = js.undefined
  
  /** When replacedWith is given, this determines whether the editor will
    * capture mouse and drag events occurring in this widget. Default is
    * false—the events will be left alone for the default browser handler,
    * or specific handlers on the widget, to capture. */
  var handleMouseEvents: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether text inserted on the left of the marker will end up inside or outside of it. */
  var inclusiveLeft: js.UndefOr[Boolean] = js.undefined
  
  /** Like inclusiveLeft , but for the right side. */
  var inclusiveRight: js.UndefOr[Boolean] = js.undefined
  
  /** A read - only span can, as long as it is not cleared, not be modified except by calling setValue to reset the whole document.
    Note: adding a read - only span currently clears the undo history of the editor,
    because existing undo events being partially nullified by read - only spans would corrupt the history (in the current implementation). */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Use a given node to display this range.Implies both collapsed and atomic.
    The given DOM node must be an inline element(as opposed to a block element). */
  var replacedWith: js.UndefOr[HTMLElement] = js.undefined
  
  /** When the target document is linked to other documents, you can set shared to true to make the marker appear in all documents.
    By default, a marker appears only in its target document. */
  var shared: js.UndefOr[Boolean] = js.undefined
  
  /** Can be used to specify an extra CSS class to be applied to the leftmost span that is part of the marker. */
  var startStyle: js.UndefOr[String] = js.undefined
  
  /** When given, will give the nodes created for this span a HTML title attribute with the given value. */
  var title: js.UndefOr[String] = js.undefined
}
object TextMarkerOptions {
  
  @scala.inline
  def apply(): TextMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextMarkerOptions]
  }
  
  @scala.inline
  implicit class TextMarkerOptionsMutableBuilder[Self <: TextMarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddToHistory(value: Boolean): Self = StObject.set(x, "addToHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddToHistoryUndefined: Self = StObject.set(x, "addToHistory", js.undefined)
    
    @scala.inline
    def setAtomic(value: Boolean): Self = StObject.set(x, "atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtomicUndefined: Self = StObject.set(x, "atomic", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClearOnEnter(value: Boolean): Self = StObject.set(x, "clearOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearOnEnterUndefined: Self = StObject.set(x, "clearOnEnter", js.undefined)
    
    @scala.inline
    def setClearWhenEmpty(value: Boolean): Self = StObject.set(x, "clearWhenEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearWhenEmptyUndefined: Self = StObject.set(x, "clearWhenEmpty", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setEndStyle(value: String): Self = StObject.set(x, "endStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndStyleUndefined: Self = StObject.set(x, "endStyle", js.undefined)
    
    @scala.inline
    def setHandleMouseEvents(value: Boolean): Self = StObject.set(x, "handleMouseEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleMouseEventsUndefined: Self = StObject.set(x, "handleMouseEvents", js.undefined)
    
    @scala.inline
    def setInclusiveLeft(value: Boolean): Self = StObject.set(x, "inclusiveLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusiveLeftUndefined: Self = StObject.set(x, "inclusiveLeft", js.undefined)
    
    @scala.inline
    def setInclusiveRight(value: Boolean): Self = StObject.set(x, "inclusiveRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusiveRightUndefined: Self = StObject.set(x, "inclusiveRight", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReplacedWith(value: HTMLElement): Self = StObject.set(x, "replacedWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacedWithUndefined: Self = StObject.set(x, "replacedWith", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setStartStyle(value: String): Self = StObject.set(x, "startStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartStyleUndefined: Self = StObject.set(x, "startStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
