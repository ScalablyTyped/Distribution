package typings
package breezeLib.breezeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "MetadataStore")
@js.native
class MetadataStore ()
  extends breezeLib.breezeNs.MetadataStore {
  def this(config: breezeLib.breezeNs.MetadataStoreOptions) = this()
}

/* static members */
@JSImport("breeze", "MetadataStore")
@js.native
object MetadataStore extends js.Object {
  def importMetadata(exportedString: java.lang.String): breezeLib.breezeNs.MetadataStore = js.native
  def normalizeTypeName(typeName: java.lang.String): java.lang.String = js.native
}

