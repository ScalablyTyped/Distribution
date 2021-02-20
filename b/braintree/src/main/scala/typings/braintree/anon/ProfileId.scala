package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileId extends StObject {
  
  var profileId: js.UndefOr[String] = js.native
}
object ProfileId {
  
  @scala.inline
  def apply(): ProfileId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileId]
  }
  
  @scala.inline
  implicit class ProfileIdMutableBuilder[Self <: ProfileId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
