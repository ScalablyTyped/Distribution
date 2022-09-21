package typings.contentstack

import typings.contentstackUtils.embeddedObjectMod.EntryEmbedable
import typings.contentstackUtils.optionsMod.RenderOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Entry extends StObject {
    
    var entry: EntryEmbedable | js.Array[EntryEmbedable]
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    var renderOption: js.UndefOr[RenderOption] = js.undefined
  }
  object Entry {
    
    inline def apply(entry: EntryEmbedable | js.Array[EntryEmbedable]): Entry = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setEntry(value: EntryEmbedable | js.Array[EntryEmbedable]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryVarargs(value: EntryEmbedable*): Self = StObject.set(x, "entry", js.Array(value*))
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRenderOption(value: RenderOption): Self = StObject.set(x, "renderOption", value.asInstanceOf[js.Any])
      
      inline def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
    }
  }
  
  trait Paths extends StObject {
    
    var entry: EntryEmbedable | js.Array[EntryEmbedable]
    
    var paths: js.Array[String]
    
    var renderOption: js.UndefOr[RenderOption] = js.undefined
  }
  object Paths {
    
    inline def apply(entry: EntryEmbedable | js.Array[EntryEmbedable], paths: js.Array[String]): Paths = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paths]
    }
    
    extension [Self <: Paths](x: Self) {
      
      inline def setEntry(value: EntryEmbedable | js.Array[EntryEmbedable]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryVarargs(value: EntryEmbedable*): Self = StObject.set(x, "entry", js.Array(value*))
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRenderOption(value: RenderOption): Self = StObject.set(x, "renderOption", value.asInstanceOf[js.Any])
      
      inline def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
    }
  }
}
