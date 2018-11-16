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

