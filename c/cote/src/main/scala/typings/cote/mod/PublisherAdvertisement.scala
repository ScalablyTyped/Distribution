package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherAdvertisement extends Advertisement {
  
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.native
}
object PublisherAdvertisement {
  
  @scala.inline
  def apply(name: String): PublisherAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherAdvertisement]
  }
  
  @scala.inline
  implicit class PublisherAdvertisementOps[Self <: PublisherAdvertisement] (val x: Self) extends AnyVal {
    
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
    def setBroadcastsVarargs(value: String*): Self = this.set("broadcasts", js.Array(value :_*))
    
    @scala.inline
    def setBroadcasts(value: js.Array[String]): Self = this.set("broadcasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBroadcasts: Self = this.set("broadcasts", js.undefined)
  }
}
