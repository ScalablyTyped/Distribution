package typings.blueprintjsCore.handlePropsMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHandleProps extends IProps {
  /** Intent for the track segment immediately after this handle, taking priority over `intentBefore`. */
  var intentAfter: js.UndefOr[Intent] = js.native
  /** Intent for the track segment immediately before this handle. */
  var intentBefore: js.UndefOr[Intent] = js.native
  /**
    * How this handle interacts with other handles.
    * @default "lock"
    */
  var interactionKind: js.UndefOr[HandleInteractionKind] = js.native
  /**
    * Callback invoked when this handle's value is changed due to a drag
    * interaction. Note that "push" interactions can cause multiple handles to
    * update at the same time.
    */
  var onChange: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  /** Callback invoked when this handle is released (the end of a drag interaction). */
  var onRelease: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  /** Style to use for the track segment immediately after this handle, taking priority over `trackStyleBefore`. */
  var trackStyleAfter: js.UndefOr[CSSProperties] = js.native
  /** Style to use for the track segment immediately before this handle */
  var trackStyleBefore: js.UndefOr[CSSProperties] = js.native
  /**
    * Handle appearance type.
    * @default "full"
    */
  var `type`: js.UndefOr[HandleType] = js.native
  /** Numeric value of this handle. */
  var value: Double = js.native
}

object IHandleProps {
  @scala.inline
  def apply(value: Double): IHandleProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHandleProps]
  }
  @scala.inline
  implicit class IHandlePropsOps[Self <: IHandleProps] (val x: Self) extends AnyVal {
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
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntentAfter(value: Intent): Self = this.set("intentAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntentAfter: Self = this.set("intentAfter", js.undefined)
    @scala.inline
    def setIntentBefore(value: Intent): Self = this.set("intentBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntentBefore: Self = this.set("intentBefore", js.undefined)
    @scala.inline
    def setInteractionKind(value: HandleInteractionKind): Self = this.set("interactionKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractionKind: Self = this.set("interactionKind", js.undefined)
    @scala.inline
    def setOnChange(value: /* newValue */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnRelease(value: /* newValue */ Double => Unit): Self = this.set("onRelease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRelease: Self = this.set("onRelease", js.undefined)
    @scala.inline
    def setTrackStyleAfter(value: CSSProperties): Self = this.set("trackStyleAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackStyleAfter: Self = this.set("trackStyleAfter", js.undefined)
    @scala.inline
    def setTrackStyleBefore(value: CSSProperties): Self = this.set("trackStyleBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackStyleBefore: Self = this.set("trackStyleBefore", js.undefined)
    @scala.inline
    def setType(value: HandleType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

