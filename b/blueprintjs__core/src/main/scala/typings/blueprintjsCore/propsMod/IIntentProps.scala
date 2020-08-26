package typings.blueprintjsCore.propsMod

import typings.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIntentProps extends js.Object {
  /** Visual intent color to apply to element. */
  var intent: js.UndefOr[Intent] = js.native
}

object IIntentProps {
  @scala.inline
  def apply(): IIntentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIntentProps]
  }
  @scala.inline
  implicit class IIntentPropsOps[Self <: IIntentProps] (val x: Self) extends AnyVal {
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
    def setIntent(value: Intent): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
  }
  
}

