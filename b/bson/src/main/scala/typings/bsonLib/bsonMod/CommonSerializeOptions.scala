package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSerializeOptions extends js.Object {
  /** {default:false}, the serializer will check if keys are valid. */
  var checkKeys: js.UndefOr[scala.Boolean] = js.undefined
  /** {default:true}, ignore undefined fields. */
  var ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined
  /** {default:false}, serialize the javascript functions. */
  var serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
}

