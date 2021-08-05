package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictoption
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var `class`: js.UndefOr[String] = js.undefined
}
object Dictoption {
  
  inline def apply(): Dictoption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictoption]
  }
  
  extension [Self <: Dictoption](x: Self) {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
  }
}
