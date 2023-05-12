package typings.culori.anon

import typings.culori.culoriStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait G extends StObject {
  
  var alpha: typings.culori.culoriInts.`0`
  
  var b: typings.culori.culoriInts.`0`
  
  var g: typings.culori.culoriInts.`0`
  
  var mode: rgb
  
  var r: typings.culori.culoriInts.`0`
}
object G {
  
  inline def apply(): G = {
    val __obj = js.Dynamic.literal(alpha = 0, b = 0, g = 0, mode = "rgb", r = 0)
    __obj.asInstanceOf[G]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: G] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: typings.culori.culoriInts.`0`): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setB(value: typings.culori.culoriInts.`0`): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: typings.culori.culoriInts.`0`): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setMode(value: rgb): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setR(value: typings.culori.culoriInts.`0`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
