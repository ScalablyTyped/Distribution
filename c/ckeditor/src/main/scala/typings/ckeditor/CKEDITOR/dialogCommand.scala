package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dialogCommand extends StObject {
  
  var value: js.Any = js.native
}
object dialogCommand {
  
  @scala.inline
  def apply(value: js.Any): dialogCommand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[dialogCommand]
  }
  
  @scala.inline
  implicit class dialogCommandMutableBuilder[Self <: dialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
