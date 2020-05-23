package typings.bleno.mod

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
    descriptors: js.UndefOr[Null | js.Array[Descriptor]] = js.undefined,
    onIndicate: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onNotify: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onReadRequest: js.UndefOr[
      Null | ((/* offset */ Double, /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit)
    ] = js.undefined,
    onSubscribe: js.UndefOr[Null | ((/* maxValueSize */ Double, /* updateValueCallback */ js.Any) => Unit)] = js.undefined,
    onUnsubscribe: js.UndefOr[Null | (() => Unit)] = js.undefined,
    onWriteRequest: js.UndefOr[
      Null | ((/* data */ Buffer, /* offset */ Double, /* withoutResponse */ Boolean, /* callback */ js.Function1[/* result */ Double, Unit]) => Unit)
    ] = js.undefined,
    properties: js.UndefOr[Null | js.Array[Property]] = js.undefined,
    secure: js.UndefOr[Null | js.Array[Property]] = js.undefined,
    value: js.UndefOr[Null | Buffer] = js.undefined
  ): CharacteristicOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptors)) __obj.updateDynamic("descriptors")(descriptors.asInstanceOf[js.Any])
    if (!js.isUndefined(onIndicate)) __obj.updateDynamic("onIndicate")(if (onIndicate != null) js.Any.fromFunction0(onIndicate.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onNotify)) __obj.updateDynamic("onNotify")(if (onNotify != null) js.Any.fromFunction0(onNotify.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onReadRequest)) __obj.updateDynamic("onReadRequest")(if (onReadRequest != null) js.Any.fromFunction2(onReadRequest.asInstanceOf[(/* offset */ Double, /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit]) else null)
    if (!js.isUndefined(onSubscribe)) __obj.updateDynamic("onSubscribe")(if (onSubscribe != null) js.Any.fromFunction2(onSubscribe.asInstanceOf[(/* maxValueSize */ Double, /* updateValueCallback */ js.Any) => Unit]) else null)
    if (!js.isUndefined(onUnsubscribe)) __obj.updateDynamic("onUnsubscribe")(if (onUnsubscribe != null) js.Any.fromFunction0(onUnsubscribe.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(onWriteRequest)) __obj.updateDynamic("onWriteRequest")(if (onWriteRequest != null) js.Any.fromFunction4(onWriteRequest.asInstanceOf[(/* data */ Buffer, /* offset */ Double, /* withoutResponse */ Boolean, /* callback */ js.Function1[/* result */ Double, Unit]) => Unit]) else null)
    if (!js.isUndefined(properties)) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicOptions]
  }
}

