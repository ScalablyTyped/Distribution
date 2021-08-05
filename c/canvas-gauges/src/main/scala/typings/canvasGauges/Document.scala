package typings.canvasGauges

import typings.canvasGauges.CanvasGauges.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  var gauges: Collection
}
object Document {
  
  inline def apply(gauges: Collection): Document = {
    val __obj = js.Dynamic.literal(gauges = gauges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setGauges(value: Collection): Self = StObject.set(x, "gauges", value.asInstanceOf[js.Any])
  }
}
