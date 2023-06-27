package typings.codemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetDecorationSpec
  extends StObject
     with /**
  Other properties are allowed.
  */
/* other */ StringDictionary[Any] {
  
  /**
    Determines whether this is a block widgets, which will be drawn
    between lines, or an inline widget (the default) which is drawn
    between the surrounding text.
    
    Note that block-level decorations should not have vertical
    margins, and if you dynamically change their height, you should
    make sure to call
    [`requestMeasure`](https://codemirror.net/6/docs/ref/#view.EditorView.requestMeasure), so that the
    editor can update its information about its vertical layout.
    */
  var block: js.UndefOr[Boolean] = js.undefined
  
  /**
    Which side of the given position the widget is on. When this is
    positive, the widget will be drawn after the cursor if the
    cursor is on the same position. Otherwise, it'll be drawn before
    it. When multiple widgets sit at the same position, their `side`
    values will determine their ordering—those with a lower value
    come first. Defaults to 0. May not be more than 10000 or less
    than -10000.
    
    Block widgets are always drawn before inline widgets when side
    is non-positive, and after them when side is positive,
    regardless of the value of `side`.
    */
  var side: js.UndefOr[Double] = js.undefined
  
  /**
    The type of widget to draw here.
    */
  var widget: WidgetType
}
object WidgetDecorationSpec {
  
  inline def apply(widget: WidgetType): WidgetDecorationSpec = {
    val __obj = js.Dynamic.literal(widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetDecorationSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WidgetDecorationSpec] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setSide(value: Double): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setWidget(value: WidgetType): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
  }
}
