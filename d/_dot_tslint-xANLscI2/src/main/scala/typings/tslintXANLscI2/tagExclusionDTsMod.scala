package typings.tslintXANLscI2

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.tslintXANLscI2.anon.Content
import typings.tslintXANLscI2.exclusionDTsMod.Exclusion
import typings.tslintXANLscI2.exclusionDescriptorsDTsMod.ExclusionDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagExclusionDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/completed-docs/tagExclusion.d.ts", "TagExclusion")
  @js.native
  open class TagExclusion () extends Exclusion[ITagExclusionDescriptor] {
    def this(descriptor: Partial[ITagExclusionDescriptor]) = this()
    
    /* private */ val contentTags: Any = js.native
    
    /* private */ val existenceTags: Any = js.native
    
    /* private */ var getDocumentationNode: Any = js.native
    
    /* private */ var parseTagsWithContents: Any = js.native
  }
  
  type IContentTags = StringDictionary[String]
  
  trait ITagExclusionDescriptor
    extends StObject
       with ExclusionDescriptor {
    
    var tags: js.UndefOr[Content] = js.undefined
  }
  object ITagExclusionDescriptor {
    
    inline def apply(): ITagExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITagExclusionDescriptor]
    }
    
    extension [Self <: ITagExclusionDescriptor](x: Self) {
      
      inline def setTags(value: Content): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
