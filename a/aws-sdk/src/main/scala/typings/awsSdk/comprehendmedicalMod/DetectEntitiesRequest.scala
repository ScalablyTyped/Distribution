package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectEntitiesRequest extends StObject {
  
  /**
    *  A UTF-8 text string containing the clinical content being examined for entities. Each string must contain fewer than 20,000 bytes of characters.
    */
  var Text: BoundedLengthString = js.native
}
object DetectEntitiesRequest {
  
  @scala.inline
  def apply(Text: BoundedLengthString): DetectEntitiesRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectEntitiesRequest]
  }
  
  @scala.inline
  implicit class DetectEntitiesRequestMutableBuilder[Self <: DetectEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: BoundedLengthString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
