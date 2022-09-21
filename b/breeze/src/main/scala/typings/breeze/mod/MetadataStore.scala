package typings.breeze.mod

import typings.breeze.breeze.MetadataStoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "MetadataStore")
@js.native
open class MetadataStore ()
  extends StObject
     with typings.breeze.breeze.MetadataStore {
  def this(config: MetadataStoreOptions) = this()
}
/* static members */
object MetadataStore {
  
  @JSImport("breeze", "MetadataStore")
  @js.native
  val ^ : js.Any = js.native
  
  inline def importMetadata(exportedString: String): typings.breeze.breeze.MetadataStore = ^.asInstanceOf[js.Dynamic].applyDynamic("importMetadata")(exportedString.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.MetadataStore]
  
  inline def normalizeTypeName(typeName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTypeName")(typeName.asInstanceOf[js.Any]).asInstanceOf[String]
}
