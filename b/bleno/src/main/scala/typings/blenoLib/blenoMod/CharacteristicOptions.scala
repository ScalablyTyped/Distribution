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
    onIndicate: js.Function0[scala.Unit] = null,
    onNotify: js.Function0[scala.Unit] = null,
    onReadRequest: js.Function2[
      /* offset */ scala.Double, 
      /* callback */ js.Function2[/* result */ scala.Double, /* data */ js.UndefOr[nodeLib.Buffer], scala.Unit], 
      scala.Unit
    ] = null,
    onSubscribe: js.Function2[/* maxValueSize */ scala.Double, /* updateValueCallback */ js.Any, scala.Unit] = null,
    onUnsubscribe: js.Function0[scala.Unit] = null,
    onWriteRequest: js.Function4[
      /* data */ nodeLib.Buffer, 
      /* offset */ scala.Double, 
      /* withoutResponse */ scala.Boolean, 
      /* callback */ js.Function1[/* result */ scala.Double, scala.Unit], 
      scala.Unit
    ] = null,
    properties: js.Array[blenoLib.Property] = null,
    secure: js.Array[blenoLib.Property] = null,
    value: nodeLib.Buffer = null
  ): CharacteristicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uuid")(uuid)
    if (descriptors != null) __obj.updateDynamic("descriptors")(descriptors)
    if (onIndicate != null) __obj.updateDynamic("onIndicate")(onIndicate)
    if (onNotify != null) __obj.updateDynamic("onNotify")(onNotify)
    if (onReadRequest != null) __obj.updateDynamic("onReadRequest")(onReadRequest)
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(onSubscribe)
    if (onUnsubscribe != null) __obj.updateDynamic("onUnsubscribe")(onUnsubscribe)
    if (onWriteRequest != null) __obj.updateDynamic("onWriteRequest")(onWriteRequest)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (secure != null) __obj.updateDynamic("secure")(secure)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CharacteristicOptions]
  }
}

