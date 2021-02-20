package typings.dateFns.anon

import typings.dateFns.dateFnsStrings.basic
import typings.dateFns.dateFnsStrings.complete
import typings.dateFns.dateFnsStrings.date
import typings.dateFns.dateFnsStrings.extended
import typings.dateFns.dateFnsStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatRepresentation extends StObject {
  
  var format: js.UndefOr[extended | basic] = js.native
  
  var representation: js.UndefOr[complete | date | time] = js.native
}
object FormatRepresentation {
  
  @scala.inline
  def apply(): FormatRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatRepresentation]
  }
  
  @scala.inline
  implicit class FormatRepresentationMutableBuilder[Self <: FormatRepresentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: extended | basic): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setRepresentation(value: complete | date | time): Self = StObject.set(x, "representation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepresentationUndefined: Self = StObject.set(x, "representation", js.undefined)
  }
}
