package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppResult extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.native
}
object CreateAppResult {
  
  @scala.inline
  def apply(): CreateAppResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppResult]
  }
  
  @scala.inline
  implicit class CreateAppResultMutableBuilder[Self <: CreateAppResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
  }
}
