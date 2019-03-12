package typings
package blenoLib.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacteristicOptions extends js.Object {
  var descriptors: js.UndefOr[js.Array[Descriptor] | scala.Null] = js.undefined
  var onIndicate: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onNotify: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onReadRequest: js.UndefOr[
    (js.Function2[
      /* offset */ scala.Double, 
      /* callback */ js.Function2[/* result */ scala.Double, /* data */ js.UndefOr[nodeLib.Buffer], scala.Unit], 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
  var onSubscribe: js.UndefOr[
    (js.Function2[/* maxValueSize */ scala.Double, /* updateValueCallback */ js.Any, scala.Unit]) | scala.Null
  ] = js.undefined
  var onUnsubscribe: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var onWriteRequest: js.UndefOr[
    (js.Function4[
      /* data */ nodeLib.Buffer, 
      /* offset */ scala.Double, 
      /* withoutResponse */ scala.Boolean, 
      /* callback */ js.Function1[/* result */ scala.Double, scala.Unit], 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
  var properties: js.UndefOr[js.Array[blenoLib.Property] | scala.Null] = js.undefined
  var secure: js.UndefOr[js.Array[blenoLib.Property] | scala.Null] = js.undefined
  var uuid: java.lang.String
  var value: js.UndefOr[nodeLib.Buffer | scala.Null] = js.undefined
}

object CharacteristicOptions {
  @scala.inline
  def apply(
    uuid: java.lang.String,
    descriptors: js.Array[Descriptor] = null,
    onIndicate: () => scala.Unit = null,
    onNotify: () => scala.Unit = null,
    onReadRequest: (/* offset */ scala.Double, /* callback */ js.Function2[/* result */ scala.Double, /* data */ js.UndefOr[nodeLib.Buffer], scala.Unit]) => scala.Unit = null,
    onSubscribe: (/* maxValueSize */ scala.Double, /* updateValueCallback */ js.Any) => scala.Unit = null,
    onUnsubscribe: () => scala.Unit = null,
    onWriteRequest: (/* data */ nodeLib.Buffer, /* offset */ scala.Double, /* withoutResponse */ scala.Boolean, /* callback */ js.Function1[/* result */ scala.Double, scala.Unit]) => scala.Unit = null,
    properties: js.Array[blenoLib.Property] = null,
    secure: js.Array[blenoLib.Property] = null,
    value: nodeLib.Buffer = null
  ): CharacteristicOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid)
    if (descriptors != null) __obj.updateDynamic("descriptors")(descriptors)
    if (onIndicate != null) __obj.updateDynamic("onIndicate")(js.Any.fromFunction0(onIndicate))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction0(onNotify))
    if (onReadRequest != null) __obj.updateDynamic("onReadRequest")(js.Any.fromFunction2(onReadRequest))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(js.Any.fromFunction2(onSubscribe))
    if (onUnsubscribe != null) __obj.updateDynamic("onUnsubscribe")(js.Any.fromFunction0(onUnsubscribe))
    if (onWriteRequest != null) __obj.updateDynamic("onWriteRequest")(js.Any.fromFunction4(onWriteRequest))
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (secure != null) __obj.updateDynamic("secure")(secure)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CharacteristicOptions]
  }
}

