package typings.devextremeB5DqTZzf.mod.DevExpress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSchedulerTimeZone extends StObject {
  
  /**
    * A time zone text string from the IANA database.
    */
  var id: String
  
  /**
    * A GMT offset.
    */
  var offset: Double
  
  /**
    * A time zone in the following format: `(GMT ±[hh]:[mm]) [id]`.
    */
  var title: String
}
object dxSchedulerTimeZone {
  
  inline def apply(id: String, offset: Double, title: String): dxSchedulerTimeZone = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSchedulerTimeZone]
  }
  
  extension [Self <: dxSchedulerTimeZone](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
