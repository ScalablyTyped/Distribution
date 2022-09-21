package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.HostCancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerCancellationToken
  extends StObject
     with HostCancellationToken {
  
  def resetRequest(requestId: Double): Unit
  
  def setRequest(requestId: Double): Unit
}
object ServerCancellationToken {
  
  inline def apply(isCancellationRequested: () => Boolean, resetRequest: Double => Unit, setRequest: Double => Unit): ServerCancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = js.Any.fromFunction0(isCancellationRequested), resetRequest = js.Any.fromFunction1(resetRequest), setRequest = js.Any.fromFunction1(setRequest))
    __obj.asInstanceOf[ServerCancellationToken]
  }
  
  extension [Self <: ServerCancellationToken](x: Self) {
    
    inline def setResetRequest(value: Double => Unit): Self = StObject.set(x, "resetRequest", js.Any.fromFunction1(value))
    
    inline def setSetRequest(value: Double => Unit): Self = StObject.set(x, "setRequest", js.Any.fromFunction1(value))
  }
}
