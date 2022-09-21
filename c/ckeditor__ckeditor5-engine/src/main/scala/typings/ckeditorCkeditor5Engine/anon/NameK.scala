package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameK[K /* <: String */] extends StObject {
  
  var name: K
}
object NameK {
  
  inline def apply[K /* <: String */](name: K): NameK[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameK[K]]
  }
  
  extension [Self <: NameK[?], K /* <: String */](x: Self & NameK[K]) {
    
    inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
