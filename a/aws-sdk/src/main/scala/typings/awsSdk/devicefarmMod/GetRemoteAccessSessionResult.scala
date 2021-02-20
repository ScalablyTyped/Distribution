package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRemoteAccessSessionResult extends StObject {
  
  /**
    * A container that lists detailed information about the remote access session.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.native
}
object GetRemoteAccessSessionResult {
  
  @scala.inline
  def apply(): GetRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRemoteAccessSessionResult]
  }
  
  @scala.inline
  implicit class GetRemoteAccessSessionResultMutableBuilder[Self <: GetRemoteAccessSessionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoteAccessSession(value: RemoteAccessSession): Self = StObject.set(x, "remoteAccessSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAccessSessionUndefined: Self = StObject.set(x, "remoteAccessSession", js.undefined)
  }
}
