package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempImagePath extends StObject {
  
  var tempImagePath: String
}
object TempImagePath {
  
  inline def apply(tempImagePath: String): TempImagePath = {
    val __obj = js.Dynamic.literal(tempImagePath = tempImagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempImagePath]
  }
  
  extension [Self <: TempImagePath](x: Self) {
    
    inline def setTempImagePath(value: String): Self = StObject.set(x, "tempImagePath", value.asInstanceOf[js.Any])
  }
}
