package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pedigree[C] extends StObject {
  
  var ancestors: js.UndefOr[js.Array[C]] = js.undefined
  
  var commits: js.UndefOr[js.Array[Commit]] = js.undefined
  
  var descendants: js.UndefOr[js.Array[C]] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var patches: js.UndefOr[js.Array[Patch]] = js.undefined
  
  var variants: js.UndefOr[js.Array[C]] = js.undefined
}
object Pedigree {
  
  inline def apply[C](): Pedigree[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pedigree[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pedigree[?], C] (val x: Self & Pedigree[C]) extends AnyVal {
    
    inline def setAncestors(value: js.Array[C]): Self = StObject.set(x, "ancestors", value.asInstanceOf[js.Any])
    
    inline def setAncestorsUndefined: Self = StObject.set(x, "ancestors", js.undefined)
    
    inline def setAncestorsVarargs(value: C*): Self = StObject.set(x, "ancestors", js.Array(value*))
    
    inline def setCommits(value: js.Array[Commit]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setCommitsUndefined: Self = StObject.set(x, "commits", js.undefined)
    
    inline def setCommitsVarargs(value: Commit*): Self = StObject.set(x, "commits", js.Array(value*))
    
    inline def setDescendants(value: js.Array[C]): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    inline def setDescendantsUndefined: Self = StObject.set(x, "descendants", js.undefined)
    
    inline def setDescendantsVarargs(value: C*): Self = StObject.set(x, "descendants", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPatches(value: js.Array[Patch]): Self = StObject.set(x, "patches", value.asInstanceOf[js.Any])
    
    inline def setPatchesUndefined: Self = StObject.set(x, "patches", js.undefined)
    
    inline def setPatchesVarargs(value: Patch*): Self = StObject.set(x, "patches", js.Array(value*))
    
    inline def setVariants(value: js.Array[C]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: C*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
