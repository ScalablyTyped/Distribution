package typings.datastoreLevel.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-level", JSImport.Default)
@js.native
class defaultCls protected () extends LevelDatastore[Buffer] {
  def this(path: String) = this()
  def this(path: String, options: LevelDatastoreOptions) = this()
}

