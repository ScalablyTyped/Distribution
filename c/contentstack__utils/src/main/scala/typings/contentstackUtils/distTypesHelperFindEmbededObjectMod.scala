package typings.contentstackUtils

import typings.contentstackUtils.distTypesModelsEmbeddedObjectMod.EmbeddedItem
import typings.contentstackUtils.distTypesModelsEmbeddedObjectMod.EntryEmbedable
import typings.contentstackUtils.distTypesModelsJsonRteModelMod.EntryNode
import typings.contentstackUtils.distTypesModelsMetadataModelMod.Metadata
import typings.contentstackUtils.distTypesOptionsMod.RenderOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHelperFindEmbededObjectMod {
  
  @JSImport("@contentstack/utils/dist/types/helper/find-embeded-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findEmbeddedAsset(uid: String): js.Array[EmbeddedItem | EntryNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("findEmbeddedAsset")(uid.asInstanceOf[js.Any]).asInstanceOf[js.Array[EmbeddedItem | EntryNode]]
  inline def findEmbeddedAsset(uid: String, embeddedAssets: js.Array[EmbeddedItem | EntryNode]): js.Array[EmbeddedItem | EntryNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findEmbeddedAsset")(uid.asInstanceOf[js.Any], embeddedAssets.asInstanceOf[js.Any])).asInstanceOf[js.Array[EmbeddedItem | EntryNode]]
  
  inline def findEmbeddedEntry(uid: String, contentTypeUid: String): js.Array[EmbeddedItem | EntryNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findEmbeddedEntry")(uid.asInstanceOf[js.Any], contentTypeUid.asInstanceOf[js.Any])).asInstanceOf[js.Array[EmbeddedItem | EntryNode]]
  inline def findEmbeddedEntry(uid: String, contentTypeUid: String, embeddeditems: js.Array[EmbeddedItem | EntryNode]): js.Array[EmbeddedItem | EntryNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findEmbeddedEntry")(uid.asInstanceOf[js.Any], contentTypeUid.asInstanceOf[js.Any], embeddeditems.asInstanceOf[js.Any])).asInstanceOf[js.Array[EmbeddedItem | EntryNode]]
  
  inline def findEmbeddedItems(`object`: Metadata, entry: EntryEmbedable): js.Array[EmbeddedItem | EntryNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findEmbeddedItems")(`object`.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Array[EmbeddedItem | EntryNode]]
  
  inline def findGQLEmbeddedItems(metadata: Metadata, items: js.Array[EmbeddedItem | EntryNode]): js.Array[EmbeddedItem | EntryNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findGQLEmbeddedItems")(metadata.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[EmbeddedItem | EntryNode]]
  
  inline def findRenderString(item: EmbeddedItem, metadata: Metadata): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderString")(item.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def findRenderString(item: EmbeddedItem, metadata: Metadata, renderOptions: RenderOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderString")(item.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], renderOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def findRenderString(item: EntryNode, metadata: Metadata): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderString")(item.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def findRenderString(item: EntryNode, metadata: Metadata, renderOptions: RenderOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderString")(item.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], renderOptions.asInstanceOf[js.Any])).asInstanceOf[String]
}
