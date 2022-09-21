package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentTimelineOptions extends StObject {
  
  var originTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
}
object DocumentTimelineOptions {
  
  inline def apply(): DocumentTimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTimelineOptions]
  }
  
  extension [Self <: DocumentTimelineOptions](x: Self) {
    
    inline def setOriginTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "originTime", value.asInstanceOf[js.Any])
    
    inline def setOriginTimeUndefined: Self = StObject.set(x, "originTime", js.undefined)
  }
}
