package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SerializeOptions extends CommonSerializeOptions {
  /** {default:1024*1024*17}, minimum size of the internal temporary serialization buffer. */
  var minInternalBufferSize: js.UndefOr[scala.Double] = js.undefined
}

