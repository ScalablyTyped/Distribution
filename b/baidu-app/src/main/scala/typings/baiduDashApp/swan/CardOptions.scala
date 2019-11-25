package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardOptions
  extends BaseOptions[js.Any, js.Any] {
  var cardList: js.Array[Card]
  @JSName("complete")
  var complete_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  @JSName("fail")
  var fail_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  @JSName("success")
  var success_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CardOptions {
  @scala.inline
  def apply(
    cardList: js.Array[Card],
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): CardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[CardOptions]
  }
}

