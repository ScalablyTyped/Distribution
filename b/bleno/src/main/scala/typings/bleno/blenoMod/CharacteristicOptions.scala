package typings.bleno.blenoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacteristicOptions extends js.Object {
  var descriptors: js.UndefOr[js.Array[Descriptor] | Null] = js.undefined
  var onIndicate: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onNotify: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onReadRequest: js.UndefOr[
    (js.Function2[
      /* offset */ Double, 
      /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit], 
      Unit
    ]) | Null
  ] = js.undefined
  var onSubscribe: js.UndefOr[
    (js.Function2[/* maxValueSize */ Double, /* updateValueCallback */ js.Any, Unit]) | Null
  ] = js.undefined
  var onUnsubscribe: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onWriteRequest: js.UndefOr[
    (js.Function4[
      /* data */ Buffer, 
      /* offset */ Double, 
      /* withoutResponse */ Boolean, 
      /* callback */ js.Function1[/* result */ Double, Unit], 
      Unit
    ]) | Null
  ] = js.undefined
  var properties: js.UndefOr[js.Array[Property] | Null] = js.undefined
  var secure: js.UndefOr[js.Array[Property] | Null] = js.undefined
  var uuid: String
  var value: js.UndefOr[Buffer | Null] = js.undefined
}

object CharacteristicOptions {
  @scala.inline
  def apply(
    uuid: String,
    descriptors: js.Array[Descriptor] = null,
    onIndicate: () => Unit = null,
    onNotify: () => Unit = null,
    onReadRequest: (/* offset */ Double, /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit = null,
    onSubscribe: (/* maxValueSize */ Double, /* updateValueCallback */ js.Any) => Unit = null,
    onUnsubscribe: () => Unit = null,
    onWriteRequest: (/* data */ Buffer, /* offset */ Double, /* withoutResponse */ Boolean, /* callback */ js.Function1[/* result */ Double, Unit]) => Unit = null,
    properties: js.Array[Property] = null,
    secure: js.Array[Property] = null,
    value: Buffer = null
  ): CharacteristicOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (descriptors != null) __obj.updateDynamic("descriptors")(descriptors.asInstanceOf[js.Any])
    if (onIndicate != null) __obj.updateDynamic("onIndicate")(js.Any.fromFunction0(onIndicate))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction0(onNotify))
    if (onReadRequest != null) __obj.updateDynamic("onReadRequest")(js.Any.fromFunction2(onReadRequest))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(js.Any.fromFunction2(onSubscribe))
    if (onUnsubscribe != null) __obj.updateDynamic("onUnsubscribe")(js.Any.fromFunction0(onUnsubscribe))
    if (onWriteRequest != null) __obj.updateDynamic("onWriteRequest")(js.Any.fromFunction4(onWriteRequest))
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicOptions]
  }
}

