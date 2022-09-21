package typings.cesium

import typings.cesium.mod.CompositeEntityCollection
import typings.cesium.mod.DataSource
import typings.cesium.mod.EntityCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositeEntityCollectionMod {
  
  @JSImport("cesium/Source/DataSources/CompositeEntityCollection", JSImport.Default)
  @js.native
  open class default () extends CompositeEntityCollection {
    def this(collections: js.Array[EntityCollection]) = this()
    def this(collections: js.Array[EntityCollection], owner: CompositeEntityCollection) = this()
    def this(collections: js.Array[EntityCollection], owner: DataSource) = this()
    def this(collections: Unit, owner: CompositeEntityCollection) = this()
    def this(collections: Unit, owner: DataSource) = this()
  }
}
