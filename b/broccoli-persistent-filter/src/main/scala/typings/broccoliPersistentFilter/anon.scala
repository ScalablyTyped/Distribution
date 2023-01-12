package typings.broccoliPersistentFilter

import typings.fsTreeDiff.libEntryMod.BaseEntry
import typings.fsTreeDiff.libEntryMod.DefaultEntry
import typings.fsTreeDiff.mod.Entry
import typings.fsTreeDiff.mod.FSTree
import typings.fsTreeDiff.mod.Patch
import typings.fsTreeDiff.mod.PatchDelegate
import typings.fsTreeDiff.mod.StaticOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined broccoli-persistent-filter.broccoli-persistent-filter/lib/strategies/strategy.ProcessStringResult<{}> */
  trait ProcessStringResult extends StObject {
    
    var output: String
  }
  object ProcessStringResult {
    
    inline def apply(output: String): ProcessStringResult = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessStringResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessStringResult] (val x: Self) extends AnyVal {
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<'output', string> */
  trait Recordoutputstring extends StObject {
    
    var output: String
  }
  object Recordoutputstring {
    
    inline def apply(output: String): Recordoutputstring = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recordoutputstring]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Recordoutputstring] (val x: Self) extends AnyVal {
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait SortAndExpand extends StObject {
    
    var sortAndExpand: Boolean
  }
  object SortAndExpand {
    
    inline def apply(sortAndExpand: Boolean): SortAndExpand = {
      val __obj = js.Dynamic.literal(sortAndExpand = sortAndExpand.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortAndExpand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortAndExpand] (val x: Self) extends AnyVal {
      
      inline def setSortAndExpand(value: Boolean): Self = StObject.set(x, "sortAndExpand", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofFSTree extends StObject {
    
    /* static member */
    def applyPatch(input: String, output: String, patch: Patch): Unit = js.native
    def applyPatch(input: String, output: String, patch: Patch, _delegate: PatchDelegate): Unit = js.native
    
    /* static member */
    def defaultIsEqual(entryA: DefaultEntry, entryB: DefaultEntry): Boolean = js.native
    
    /* static member */
    def fromEntries[T /* <: BaseEntry */](entries: js.Array[T]): FSTree[T] = js.native
    def fromEntries[T /* <: BaseEntry */](entries: js.Array[T], options: StaticOptions): FSTree[T] = js.native
    
    /* static member */
    def fromPaths(paths: js.Array[String]): FSTree[Entry] = js.native
    def fromPaths(paths: js.Array[String], options: StaticOptions): FSTree[Entry] = js.native
  }
}
