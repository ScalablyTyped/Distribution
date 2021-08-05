package typings.cassandraDriver.anon

import typings.cassandraDriver.mod.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var filter: js.UndefOr[js.Function1[/* host */ Host, Boolean]] = js.undefined
  
  var localDc: js.UndefOr[String] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setFilter(value: /* host */ Host => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLocalDc(value: String): Self = StObject.set(x, "localDc", value.asInstanceOf[js.Any])
    
    inline def setLocalDcUndefined: Self = StObject.set(x, "localDc", js.undefined)
  }
}
