package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttribAvoidFocusOnOpen extends js.Object {
  var attribAvoidFocusOnOpen: String = js.native
  var attribDirection: String = js.native
  var classRefShown: String = js.native
  var classShown: String = js.native
  var eventAfterHidden: String = js.native
  var eventAfterShown: String = js.native
  var eventBeforeHidden: String = js.native
  var eventBeforeShown: String = js.native
  var offset: Left = js.native
  var refNode: Null = js.native
  var selectorContainer: String = js.native
  var selectorPrimaryFocus: String = js.native
}

object AttribAvoidFocusOnOpen {
  @scala.inline
  def apply(
    attribAvoidFocusOnOpen: String,
    attribDirection: String,
    classRefShown: String,
    classShown: String,
    eventAfterHidden: String,
    eventAfterShown: String,
    eventBeforeHidden: String,
    eventBeforeShown: String,
    offset: Left,
    refNode: Null,
    selectorContainer: String,
    selectorPrimaryFocus: String
  ): AttribAvoidFocusOnOpen = {
    val __obj = js.Dynamic.literal(attribAvoidFocusOnOpen = attribAvoidFocusOnOpen.asInstanceOf[js.Any], attribDirection = attribDirection.asInstanceOf[js.Any], classRefShown = classRefShown.asInstanceOf[js.Any], classShown = classShown.asInstanceOf[js.Any], eventAfterHidden = eventAfterHidden.asInstanceOf[js.Any], eventAfterShown = eventAfterShown.asInstanceOf[js.Any], eventBeforeHidden = eventBeforeHidden.asInstanceOf[js.Any], eventBeforeShown = eventBeforeShown.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], refNode = refNode.asInstanceOf[js.Any], selectorContainer = selectorContainer.asInstanceOf[js.Any], selectorPrimaryFocus = selectorPrimaryFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttribAvoidFocusOnOpen]
  }
  @scala.inline
  implicit class AttribAvoidFocusOnOpenOps[Self <: AttribAvoidFocusOnOpen] (val x: Self) extends AnyVal {
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
    def setAttribAvoidFocusOnOpen(value: String): Self = this.set("attribAvoidFocusOnOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttribDirection(value: String): Self = this.set("attribDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassRefShown(value: String): Self = this.set("classRefShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassShown(value: String): Self = this.set("classShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventAfterHidden(value: String): Self = this.set("eventAfterHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventAfterShown(value: String): Self = this.set("eventAfterShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventBeforeHidden(value: String): Self = this.set("eventBeforeHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventBeforeShown(value: String): Self = this.set("eventBeforeShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Left): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNode(value: Null): Self = this.set("refNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorContainer(value: String): Self = this.set("selectorContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorPrimaryFocus(value: String): Self = this.set("selectorPrimaryFocus", value.asInstanceOf[js.Any])
  }
  
}

