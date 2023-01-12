package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictoption
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var `class`: js.UndefOr[String] = js.undefined
}
object Dictoption {
  
  inline def apply(): Dictoption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictoption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dictoption] (val x: Self) extends AnyVal {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
  }
}
