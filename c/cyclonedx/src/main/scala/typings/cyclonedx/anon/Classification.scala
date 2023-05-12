package typings.cyclonedx.anon

import typings.cyclonedx.cyclonedxStrings.`bi-directional`
import typings.cyclonedx.cyclonedxStrings.inbound
import typings.cyclonedx.cyclonedxStrings.outbound
import typings.cyclonedx.cyclonedxStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classification extends StObject {
  
  var classification: String
  
  var flow: inbound | outbound | `bi-directional` | unknown
}
object Classification {
  
  inline def apply(classification: String, flow: inbound | outbound | `bi-directional` | unknown): Classification = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Classification] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: String): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: inbound | outbound | `bi-directional` | unknown): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
  }
}
