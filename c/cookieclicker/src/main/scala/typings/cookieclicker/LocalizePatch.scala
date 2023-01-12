package typings.cookieclicker

import typings.cookieclicker.cookieclickerInts.`1`
import typings.cookieclicker.cookieclickerInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizePatch extends StObject {
  
  /**
    * The position of the patch
    */
  var id: Double
  
  var points: js.Array[String]
  
  var title: String
  
  /**
    * `1` for a major update, `2` for minor
    */
  var `type`: `1` | `2`
}
object LocalizePatch {
  
  inline def apply(id: Double, points: js.Array[String], title: String, `type`: `1` | `2`): LocalizePatch = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizePatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalizePatch] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: String*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: `1` | `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
