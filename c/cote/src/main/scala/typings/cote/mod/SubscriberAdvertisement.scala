package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriberAdvertisement
  extends StObject
     with Advertisement {
  
  /**
    * Event types that a Subscriber can listen to.
    */
  var subscribesTo: js.UndefOr[js.Array[String]] = js.undefined
}
object SubscriberAdvertisement {
  
  inline def apply(name: String): SubscriberAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberAdvertisement]
  }
  
  extension [Self <: SubscriberAdvertisement](x: Self) {
    
    inline def setSubscribesTo(value: js.Array[String]): Self = StObject.set(x, "subscribesTo", value.asInstanceOf[js.Any])
    
    inline def setSubscribesToUndefined: Self = StObject.set(x, "subscribesTo", js.undefined)
    
    inline def setSubscribesToVarargs(value: String*): Self = StObject.set(x, "subscribesTo", js.Array(value :_*))
  }
}
