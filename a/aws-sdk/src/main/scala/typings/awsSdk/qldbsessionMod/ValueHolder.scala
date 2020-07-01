package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueHolder extends js.Object {
  /**
    * An Amazon Ion binary value contained in a ValueHolder structure.
    */
  var IonBinary: js.UndefOr[typings.awsSdk.qldbsessionMod.IonBinary] = js.native
  /**
    * An Amazon Ion plaintext value contained in a ValueHolder structure.
    */
  var IonText: js.UndefOr[typings.awsSdk.qldbsessionMod.IonText] = js.native
}

object ValueHolder {
  @scala.inline
  def apply(IonBinary: IonBinary = null, IonText: IonText = null): ValueHolder = {
    val __obj = js.Dynamic.literal()
    if (IonBinary != null) __obj.updateDynamic("IonBinary")(IonBinary.asInstanceOf[js.Any])
    if (IonText != null) __obj.updateDynamic("IonText")(IonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueHolder]
  }
}

