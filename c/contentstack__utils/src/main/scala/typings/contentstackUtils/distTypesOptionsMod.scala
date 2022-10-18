package typings.contentstackUtils

import org.scalablytyped.runtime.StringDictionary
import typings.contentstackUtils.distTypesJsonToHtmlMod.AnyNode
import typings.contentstackUtils.distTypesModelsEmbeddedObjectMod.EmbeddedItem
import typings.contentstackUtils.distTypesModelsEmbeddedObjectMod.EntryEmbedable
import typings.contentstackUtils.distTypesModelsJsonRteModelMod.EntryNode
import typings.contentstackUtils.distTypesModelsMetadataModelMod.Metadata
import typings.contentstackUtils.distTypesNodesNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOptionsMod {
  
  type Next = js.Function1[/* nodes */ js.Array[AnyNode], String]
  
  trait Option extends StObject {
    
    var entry: EntryEmbedable
    
    var renderOption: js.UndefOr[RenderOption] = js.undefined
  }
  object Option {
    
    inline def apply(entry: EntryEmbedable): Option = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setEntry(value: EntryEmbedable): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setRenderOption(value: RenderOption): Self = StObject.set(x, "renderOption", value.asInstanceOf[js.Any])
      
      inline def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
    }
  }
  
  type RenderContentType = StringDictionary[RenderItem]
  
  type RenderItem = js.Function2[/* item */ EmbeddedItem | EntryNode, /* metadata */ Metadata, String]
  
  type RenderMark = js.Function1[/* text */ String, String]
  
  type RenderNode = js.Function2[/* node */ default, /* next */ Next, String]
  
  type RenderOption = StringDictionary[RenderNode | RenderMark | RenderItem | RenderContentType]
}
