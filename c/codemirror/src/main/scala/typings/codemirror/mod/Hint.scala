package typings.codemirror.mod

import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface used by showHint.js Codemirror add-on
  When completions aren't simple strings, they should be objects with the following properties: */
trait Hint extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var displayText: js.UndefOr[String] = js.undefined
  
  var from: js.UndefOr[Position] = js.undefined
  
  /** Called if a completion is picked. If provided *you* are responsible for applying the completion */
  var hint: js.UndefOr[js.Function3[/* cm */ Editor, /* data */ Hints, /* cur */ this.type, Unit]] = js.undefined
  
  var render: js.UndefOr[
    js.Function3[/* element */ HTMLLIElement, /* data */ Hints, /* cur */ this.type, Unit]
  ] = js.undefined
  
  var text: String
  
  var to: js.UndefOr[Position] = js.undefined
}
object Hint {
  
  @scala.inline
  def apply(text: String): Hint = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
  
  @scala.inline
  implicit class HintMutableBuilder[Self <: Hint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    @scala.inline
    def setFrom(value: Position): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setHint(value: (/* cm */ Editor, /* data */ Hints, Hint) => Unit): Self = StObject.set(x, "hint", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setRender(value: (/* element */ HTMLLIElement, /* data */ Hints, Hint) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Position): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
