package typings.cloneableDashReadable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloneableDashReadableMod {
  import typings.cloneableDashReadable.Anon_Clone
  import typings.node.streamMod.Readable

  type Cloneable[T /* <: Readable */] = T with Anon_Clone
}
