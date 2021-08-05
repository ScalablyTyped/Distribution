package typings.chrome.anon

import typings.chrome.chrome.devtools.network.HARLog
import typings.chrome.chrome.devtools.network.NavigatedEvent
import typings.chrome.chrome.devtools.network.RequestFinishedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofnetwork extends StObject {
  
  def getHAR(callback: js.Function1[/* harLog */ HARLog, Unit]): Unit
  
  var onNavigated: NavigatedEvent
  
  var onRequestFinished: RequestFinishedEvent
}
object Typeofnetwork {
  
  inline def apply(
    getHAR: js.Function1[/* harLog */ HARLog, Unit] => Unit,
    onNavigated: NavigatedEvent,
    onRequestFinished: RequestFinishedEvent
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getHAR = js.Any.fromFunction1(getHAR), onNavigated = onNavigated.asInstanceOf[js.Any], onRequestFinished = onRequestFinished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetwork]
  }
  
  extension [Self <: Typeofnetwork](x: Self) {
    
    inline def setGetHAR(value: js.Function1[/* harLog */ HARLog, Unit] => Unit): Self = StObject.set(x, "getHAR", js.Any.fromFunction1(value))
    
    inline def setOnNavigated(value: NavigatedEvent): Self = StObject.set(x, "onNavigated", value.asInstanceOf[js.Any])
    
    inline def setOnRequestFinished(value: RequestFinishedEvent): Self = StObject.set(x, "onRequestFinished", value.asInstanceOf[js.Any])
  }
}
