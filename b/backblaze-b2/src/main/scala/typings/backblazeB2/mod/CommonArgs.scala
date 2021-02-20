package typings.backblazeB2.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonArgs extends StObject {
  
  var axios: js.UndefOr[Record[String, _]] = js.native
  
  var axiosOverride: js.UndefOr[Record[String, _]] = js.native
}
object CommonArgs {
  
  @scala.inline
  def apply(): CommonArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonArgs]
  }
  
  @scala.inline
  implicit class CommonArgsMutableBuilder[Self <: CommonArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxios(value: Record[String, _]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxiosOverride(value: Record[String, _]): Self = StObject.set(x, "axiosOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxiosOverrideUndefined: Self = StObject.set(x, "axiosOverride", js.undefined)
    
    @scala.inline
    def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
  }
}
