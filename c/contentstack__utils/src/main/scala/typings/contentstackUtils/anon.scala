package typings.contentstackUtils

import typings.contentstackUtils.embeddedObjectMod.EmbeddedItem
import typings.contentstackUtils.embeddedObjectMod.EntryEmbedable
import typings.contentstackUtils.jsonRteModelMod.EntryNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Entry extends StObject {
    
    var entry: EmbeddedItem | js.Array[EmbeddedItem]
    
    var paths: js.Array[String]
    
    var renderOption: js.UndefOr[typings.contentstackUtils.optionsMod.RenderOption] = js.undefined
  }
  object Entry {
    
    inline def apply(entry: EmbeddedItem | js.Array[EmbeddedItem], paths: js.Array[String]): Entry = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setEntry(value: EmbeddedItem | js.Array[EmbeddedItem]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryVarargs(value: EmbeddedItem*): Self = StObject.set(x, "entry", js.Array(value*))
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRenderOption(value: typings.contentstackUtils.optionsMod.RenderOption): Self = StObject.set(x, "renderOption", value.asInstanceOf[js.Any])
      
      inline def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
    }
  }
  
  trait Node extends StObject {
    
    var node: EntryNode
  }
  object Node {
    
    inline def apply(node: EntryNode): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setNode(value: EntryNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait Paths extends StObject {
    
    var entry: EntryEmbedable | js.Array[EntryEmbedable]
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    var renderOption: js.UndefOr[typings.contentstackUtils.optionsMod.RenderOption] = js.undefined
  }
  object Paths {
    
    inline def apply(entry: EntryEmbedable | js.Array[EntryEmbedable]): Paths = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paths]
    }
    
    extension [Self <: Paths](x: Self) {
      
      inline def setEntry(value: EntryEmbedable | js.Array[EntryEmbedable]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryVarargs(value: EntryEmbedable*): Self = StObject.set(x, "entry", js.Array(value*))
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRenderOption(value: typings.contentstackUtils.optionsMod.RenderOption): Self = StObject.set(x, "renderOption", value.asInstanceOf[js.Any])
      
      inline def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
    }
  }
  
  trait RenderOption extends StObject {
    
    var entry: EntryEmbedable | js.Array[EntryEmbedable]
    
    var paths: js.Array[String]
    
    var renderOption: js.UndefOr[typings.contentstackUtils.optionsMod.RenderOption] = js.undefined
  }
  object RenderOption {
    
    inline def apply(entry: EntryEmbedable | js.Array[EntryEmbedable], paths: js.Array[String]): RenderOption = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOption]
    }
    
    extension [Self <: RenderOption](x: Self) {
      
      inline def setEntry(value: EntryEmbedable | js.Array[EntryEmbedable]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryVarargs(value: EntryEmbedable*): Self = StObject.set(x, "entry", js.Array(value*))
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRenderOption(value: typings.contentstackUtils.optionsMod.RenderOption): Self = StObject.set(x, "renderOption", value.asInstanceOf[js.Any])
      
      inline def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
    }
  }
}
