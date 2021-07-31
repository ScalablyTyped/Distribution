package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRemoteAccessSessionResult extends StObject {
  
  /**
    * A container that describes the remote access session when the request to create a remote access session is sent.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined
}
object CreateRemoteAccessSessionResult {
  
  @scala.inline
  def apply(): CreateRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRemoteAccessSessionResult]
  }
  
  @scala.inline
  implicit class CreateRemoteAccessSessionResultMutableBuilder[Self <: CreateRemoteAccessSessionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoteAccessSession(value: RemoteAccessSession): Self = StObject.set(x, "remoteAccessSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAccessSessionUndefined: Self = StObject.set(x, "remoteAccessSession", js.undefined)
  }
}
