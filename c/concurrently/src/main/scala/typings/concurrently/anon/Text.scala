package typings.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var command: js.UndefOr[typings.concurrently.distSrcCommandMod.Command] = js.undefined
  
  var text: String
}
object Text {
  
  inline def apply(text: String): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setCommand(value: typings.concurrently.distSrcCommandMod.Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
