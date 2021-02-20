package typings.cassandraDriver.anon

import typings.cassandraDriver.mod.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  var filter: js.UndefOr[js.Function1[/* host */ Host, Boolean]] = js.native
  
  var localDc: js.UndefOr[String] = js.native
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: /* host */ Host => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setLocalDc(value: String): Self = StObject.set(x, "localDc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalDcUndefined: Self = StObject.set(x, "localDc", js.undefined)
  }
}
