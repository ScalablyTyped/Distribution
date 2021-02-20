package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProvider extends StObject {
  
  var handle: js.UndefOr[Double] = js.native
  
  val providerId: String = js.native
}
object DataProvider {
  
  @scala.inline
  def apply(providerId: String): DataProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProvider]
  }
  
  @scala.inline
  implicit class DataProviderMutableBuilder[Self <: DataProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
