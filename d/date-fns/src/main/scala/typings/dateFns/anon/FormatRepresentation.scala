package typings.dateFns.anon

import typings.dateFns.dateFnsStrings.basic
import typings.dateFns.dateFnsStrings.complete
import typings.dateFns.dateFnsStrings.date
import typings.dateFns.dateFnsStrings.extended
import typings.dateFns.dateFnsStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatRepresentation extends StObject {
  
  var format: js.UndefOr[extended | basic] = js.undefined
  
  var representation: js.UndefOr[complete | date | time] = js.undefined
}
object FormatRepresentation {
  
  inline def apply(): FormatRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatRepresentation]
  }
  
  extension [Self <: FormatRepresentation](x: Self) {
    
    inline def setFormat(value: extended | basic): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRepresentation(value: complete | date | time): Self = StObject.set(x, "representation", value.asInstanceOf[js.Any])
    
    inline def setRepresentationUndefined: Self = StObject.set(x, "representation", js.undefined)
  }
}
