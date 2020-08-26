package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cote.mod.Advertisement because Already inherited
- typings.cote.mod.SubscriberAdvertisement because var conflicts: key, name, namespace. Inlined subscribesTo
- typings.cote.mod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts
- typings.cote.mod.ResponderAdvertisement because var conflicts: key, name, namespace. Inlined respondsTo, subset */ @js.native
trait StatusAdvertisement extends RequesterAdvertisement {
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[String]] = js.native
  /**
    * Event types that a Subscriber can listen to.
    */
  var subscribesTo: js.UndefOr[js.Array[String]] = js.native
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[String] = js.native
}

object StatusAdvertisement {
  @scala.inline
  def apply(name: String): StatusAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusAdvertisement]
  }
  @scala.inline
  implicit class StatusAdvertisementOps[Self <: StatusAdvertisement] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setRespondsToVarargs(value: String*): Self = this.set("respondsTo", js.Array(value :_*))
    @scala.inline
    def setRespondsTo(value: js.Array[String]): Self = this.set("respondsTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRespondsTo: Self = this.set("respondsTo", js.undefined)
    @scala.inline
    def setSubscribesToVarargs(value: String*): Self = this.set("subscribesTo", js.Array(value :_*))
    @scala.inline
    def setSubscribesTo(value: js.Array[String]): Self = this.set("subscribesTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscribesTo: Self = this.set("subscribesTo", js.undefined)
    @scala.inline
    def setSubset(value: String): Self = this.set("subset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubset: Self = this.set("subset", js.undefined)
  }
  
}

