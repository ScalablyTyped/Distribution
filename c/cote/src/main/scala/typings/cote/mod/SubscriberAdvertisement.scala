package typings.cote.mod

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
  implicit class SubscriberAdvertisementOps[Self <: SubscriberAdvertisement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubscribesToVarargs(value: String*): Self = this.set("subscribesTo", js.Array(value :_*))
    
    @scala.inline
    def setSubscribesTo(value: js.Array[String]): Self = this.set("subscribesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribesTo: Self = this.set("subscribesTo", js.undefined)
  }
}
