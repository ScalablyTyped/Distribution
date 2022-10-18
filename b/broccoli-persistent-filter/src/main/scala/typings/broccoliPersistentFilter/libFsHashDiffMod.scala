package typings.broccoliPersistentFilter

import typings.broccoliPersistentFilter.anon.SortAndExpand
import typings.fsTreeDiff.libEntryMod.default
import typings.fsTreeDiff.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFsHashDiffMod {
  
  @JSImport("broccoli-persistent-filter/lib/fs-hash-diff", "FSHashTree")
  @js.native
  open class FSHashTree protected () extends ^[default | HashEntry] {
    /**
      * Creates an instance of FSHashTree.
      * @param [options] {{entries?: Array<Entry|HashEntry>, sortAndExpand?: boolean}}
      */
    def this(options: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<broccoli-persistent-filter.anon.TypeofFSTree & new <T extends fs-tree-diff.fs-tree-diff/lib/entry.BaseEntry = fs-tree-diff.fs-tree-diff/lib/entry.DefaultEntry>(): fs-tree-diff.fs-tree-diff.^<T>>[0] */ js.Any) = this()
  }
  /* static members */
  object FSHashTree {
    
    @JSImport("broccoli-persistent-filter/lib/fs-hash-diff", "FSHashTree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultIsEqual(entryA: HashEntry, entryB: HashEntry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultIsEqual")(entryA.asInstanceOf[js.Any], entryB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def defaultIsEqual(entryA: HashEntry, entryB: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultIsEqual")(entryA.asInstanceOf[js.Any], entryB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def defaultIsEqual(entryA: default, entryB: HashEntry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultIsEqual")(entryA.asInstanceOf[js.Any], entryB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def defaultIsEqual(entryA: default, entryB: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultIsEqual")(entryA.asInstanceOf[js.Any], entryB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromHashEntries(entries: js.Array[HashEntry | default]): FSHashTree = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHashEntries")(entries.asInstanceOf[js.Any]).asInstanceOf[FSHashTree]
    inline def fromHashEntries(entries: js.Array[HashEntry | default], options: SortAndExpand): FSHashTree = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHashEntries")(entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSHashTree]
  }
  
  @JSImport("broccoli-persistent-filter/lib/fs-hash-diff", "HashEntry")
  @js.native
  open class HashEntry protected () extends StObject {
    def this(relativePath: String, hash: String) = this()
    
    var hash: String = js.native
    
    def isDirectory(): Boolean = js.native
    
    var relativePath: String = js.native
  }
}
