package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsoWeekday extends StObject {
  
  var isoWeekday: Any
  
  var parser: Any
  
  var round: Any
}
object IsoWeekday {
  
  inline def apply(isoWeekday: Any, parser: Any, round: Any): IsoWeekday = {
    val __obj = js.Dynamic.literal(isoWeekday = isoWeekday.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsoWeekday]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsoWeekday] (val x: Self) extends AnyVal {
    
    inline def setIsoWeekday(value: Any): Self = StObject.set(x, "isoWeekday", value.asInstanceOf[js.Any])
    
    inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setRound(value: Any): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
  }
}
