package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Input extends js.Object {
  var prevOutScript: nodeLib.Buffer
  var prevOutType: java.lang.String
  var pubKeys: js.Array[nodeLib.Buffer]
  var signScript: nodeLib.Buffer
  var signType: java.lang.String
  var signatures: js.Array[nodeLib.Buffer]
  var witness: scala.Boolean
}

