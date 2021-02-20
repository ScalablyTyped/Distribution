package typings.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BgClass extends StObject {
  
  var bgClass: String = js.native
  
  /** Object mapping gutter IDs to marker elements. */
  var gutterMarkers: js.Any = js.native
  
  var handle: js.Any = js.native
  
  var line: js.Any = js.native
  
  var text: String = js.native
  
  var textClass: String = js.native
  
  /** Array of line widgets attached to this line. */
  var widgets: js.Any = js.native
  
  var wrapClass: String = js.native
}
object BgClass {
  
  @scala.inline
  def apply(
    bgClass: String,
    gutterMarkers: js.Any,
    handle: js.Any,
    line: js.Any,
    text: String,
    textClass: String,
    widgets: js.Any,
    wrapClass: String
  ): BgClass = {
    val __obj = js.Dynamic.literal(bgClass = bgClass.asInstanceOf[js.Any], gutterMarkers = gutterMarkers.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textClass = textClass.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any], wrapClass = wrapClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgClass]
  }
  
  @scala.inline
  implicit class BgClassMutableBuilder[Self <: BgClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgClass(value: String): Self = StObject.set(x, "bgClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterMarkers(value: js.Any): Self = StObject.set(x, "gutterMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: js.Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: js.Any): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextClass(value: String): Self = StObject.set(x, "textClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgets(value: js.Any): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapClass(value: String): Self = StObject.set(x, "wrapClass", value.asInstanceOf[js.Any])
  }
}
