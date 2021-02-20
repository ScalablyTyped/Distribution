package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriberAdvertisement extends Advertisement {
  
  /**
    * Event types that a Subscriber can listen to.
    */
  var subscribesTo: js.UndefOr[js.Array[String]] = js.native
}
object SubscriberAdvertisement {
  
  @scala.inline
  def apply(name: String): SubscriberAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberAdvertisement]
  }
  
  @scala.inline
  implicit class SubscriberAdvertisementMutableBuilder[Self <: SubscriberAdvertisement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscribesTo(value: js.Array[String]): Self = StObject.set(x, "subscribesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribesToUndefined: Self = StObject.set(x, "subscribesTo", js.undefined)
    
    @scala.inline
    def setSubscribesToVarargs(value: String*): Self = StObject.set(x, "subscribesTo", js.Array(value :_*))
  }
}
