package typings.calq

import org.scalablytyped.runtime.StringDictionary
import typings.calq.Calq.Action
import typings.calq.Calq.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calq extends StObject {
  
  var action: Action = js.native
  
  def init(writeKey: String): Unit = js.native
  def init(writeKey: String, options: StringDictionary[js.Any]): Unit = js.native
  
  var user: User = js.native
}
object Calq {
  
  @js.native
  trait Action extends StObject {
    
    def setGlobalProperty(name: String, value: js.Any): Unit = js.native
    def setGlobalProperty(params: StringDictionary[js.Any]): Unit = js.native
    
    def track(action: String): Unit = js.native
    def track(action: String, params: StringDictionary[js.Any]): Unit = js.native
    
    def trackHTMLLink(action: String): Unit = js.native
    def trackHTMLLink(action: String, params: StringDictionary[js.Any]): Unit = js.native
    
    def trackPageView(): Unit = js.native
    def trackPageView(action: String): Unit = js.native
    
    def trackSale(action: String, params: StringDictionary[js.Any], currency: String, amount: Double): Unit = js.native
  }
  
  trait User extends StObject {
    
    def clear(): Unit
    
    def identify(userId: String): Unit
    
    def profile(params: StringDictionary[js.Any]): Unit
  }
  object User {
    
    inline def apply(clear: () => Unit, identify: String => Unit, profile: StringDictionary[js.Any] => Unit): User = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), identify = js.Any.fromFunction1(identify), profile = js.Any.fromFunction1(profile))
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setIdentify(value: String => Unit): Self = StObject.set(x, "identify", js.Any.fromFunction1(value))
      
      inline def setProfile(value: StringDictionary[js.Any] => Unit): Self = StObject.set(x, "profile", js.Any.fromFunction1(value))
    }
  }
}
