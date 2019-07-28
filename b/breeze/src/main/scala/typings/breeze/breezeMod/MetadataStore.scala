package typings.breeze.breezeMod

import typings.breeze.breezeNs.MetadataStoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "MetadataStore")
@js.native
class MetadataStore ()
  extends typings.breeze.breezeNs.MetadataStore {
  def this(config: MetadataStoreOptions) = this()
}

/* static members */
@JSImport("breeze", "MetadataStore")
@js.native
object MetadataStore extends js.Object {
  def importMetadata(exportedString: String): typings.breeze.breezeNs.MetadataStore = js.native
  def normalizeTypeName(typeName: String): String = js.native
}

