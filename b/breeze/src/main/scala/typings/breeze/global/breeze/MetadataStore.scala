package typings.breeze.global.breeze

import typings.breeze.breeze.MetadataStoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.MetadataStore")
@js.native
class MetadataStore ()
  extends typings.breeze.breeze.MetadataStore {
  def this(config: MetadataStoreOptions) = this()
}
/* static members */
object MetadataStore {
  
  @JSGlobal("breeze.MetadataStore.importMetadata")
  @js.native
  def importMetadata(exportedString: String): typings.breeze.breeze.MetadataStore = js.native
  
  @JSGlobal("breeze.MetadataStore.normalizeTypeName")
  @js.native
  def normalizeTypeName(typeName: String): String = js.native
}
