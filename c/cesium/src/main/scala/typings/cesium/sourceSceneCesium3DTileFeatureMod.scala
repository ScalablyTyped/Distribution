package typings.cesium

import typings.cesium.mod.Cesium3DTileContent
import typings.cesium.mod.Cesium3DTileFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneCesium3DTileFeatureMod {
  
  @JSImport("cesium/Source/Scene/Cesium3DTileFeature", JSImport.Default)
  @js.native
  open class default () extends Cesium3DTileFeature
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/Cesium3DTileFeature", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a copy of the feature's property with the given name, examining all
      * the metadata from 3D Tiles 1.0 formats, the EXT_structural_metadata and legacy
      * EXT_feature_metadata glTF extensions, and the metadata present either in the
      * tileset JSON (3D Tiles 1.1) or in the 3DTILES_metadata 3D Tiles extension.
      * Metadata is checked against name from most specific to most general and the
      * first match is returned. Metadata is checked in this order:
      *
      * <ol>
      *   <li>Batch table (structural metadata) property by semantic</li>
      *   <li>Batch table (structural metadata) property by property ID</li>
      *   <li>Content metadata property by semantic</li>
      *   <li>Content metadata property by property</li>
      *   <li>Tile metadata property by semantic</li>
      *   <li>Tile metadata property by property ID</li>
      *   <li>Subtree metadata property by semantic</li>
      *   <li>Subtree metadata property by property ID</li>
      *   <li>Group metadata property by semantic</li>
      *   <li>Group metadata property by property ID</li>
      *   <li>Tileset metadata property by semantic</li>
      *   <li>Tileset metadata property by property ID</li>
      *   <li>Otherwise, return undefined</li>
      * </ol>
      * <p>
      * For 3D Tiles Next details, see the {@link https://github.com/CesiumGS/3d-tiles/tree/main/extensions/3DTILES_metadata|3DTILES_metadata Extension}
      * for 3D Tiles, as well as the {@link https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_structural_metadata|EXT_structural_metadata Extension}
      * for glTF. For the legacy glTF extension, see {@link https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_feature_metadata|EXT_feature_metadata Extension}
      * </p>
      * @param content - The content for accessing the metadata
      * @param batchId - The batch ID (or feature ID) of the feature to get a property for
      * @param name - The semantic or property ID of the feature. Semantics are checked before property IDs in each granularity of metadata.
      * @returns The value of the property or <code>undefined</code> if the feature does not have this property.
      */
    inline def getPropertyInherited(content: Cesium3DTileContent, batchId: Double, name: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyInherited")(content.asInstanceOf[js.Any], batchId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
