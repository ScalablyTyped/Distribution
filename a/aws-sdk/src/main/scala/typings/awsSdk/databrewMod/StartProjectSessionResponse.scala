package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartProjectSessionResponse extends StObject {
  
  /**
    * A system-generated identifier for the session.
    */
  var ClientSessionId: js.UndefOr[typings.awsSdk.databrewMod.ClientSessionId] = js.native
  
  /**
    * The name of the project to be acted upon.
    */
  var Name: ProjectName = js.native
}
object StartProjectSessionResponse {
  
  @scala.inline
  def apply(Name: ProjectName): StartProjectSessionResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProjectSessionResponse]
  }
  
  @scala.inline
  implicit class StartProjectSessionResponseMutableBuilder[Self <: StartProjectSessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientSessionId(value: ClientSessionId): Self = StObject.set(x, "ClientSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSessionIdUndefined: Self = StObject.set(x, "ClientSessionId", js.undefined)
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
