package typings.cpx

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cpx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cpx", "Watcher")
  @js.native
  class Watcher protected () extends EventEmitter {
    def this(options: WatchOptions) = this()
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
  }
  
  inline def copy(source: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copy(source: String, dest: String, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copy(
    source: String,
    dest: String,
    options: Unit,
    callback: js.Function1[/* error */ Error | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copy(source: String, dest: String, options: AsyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copy(
    source: String,
    dest: String,
    options: AsyncOptions,
    callback: js.Function1[/* error */ Error | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copySync(source: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copySync(source: String, dest: String, options: SyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def watch(source: String, dest: String): Watcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Watcher]
  inline def watch(source: String, dest: String, options: WatchOptions): Watcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Watcher]
  
  trait AsyncOptions
    extends StObject
       with SyncOptions {
    
    /** Function that creates a `stream.Transform` object to transform each copying file. */
    var transform: js.UndefOr[js.Function1[/* filepath */ String, js.Array[Transform]]] = js.undefined
  }
  object AsyncOptions {
    
    inline def apply(): AsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOptions]
    }
    
    extension [Self <: AsyncOptions](x: Self) {
      
      inline def setTransform(value: /* filepath */ String => js.Array[Transform]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait SyncOptions extends StObject {
    
    /** remove files that copied on past before copy. */
    var clean: js.UndefOr[Boolean] = js.undefined
    
    /** Follow symbolic links when copying from them. */
    var dereference: js.UndefOr[Boolean] = js.undefined
    
    /** Copy empty directories which is matched with the glob. */
    var includeEmptyDirs: js.UndefOr[Boolean] = js.undefined
    
    /** Preserve UID, GID, ATIME, and MTIME of files. */
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    /** Do not overwrite files on destination if the source file is older. */
    var update: js.UndefOr[Boolean] = js.undefined
  }
  object SyncOptions {
    
    inline def apply(): SyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncOptions]
    }
    
    extension [Self <: SyncOptions](x: Self) {
      
      inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      inline def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      inline def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      inline def setIncludeEmptyDirs(value: Boolean): Self = StObject.set(x, "includeEmptyDirs", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmptyDirsUndefined: Self = StObject.set(x, "includeEmptyDirs", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait WatchOptions
    extends StObject
       with AsyncOptions {
    
    /** Flag to not copy at the initial time of watch. */
    var initialCopy: js.UndefOr[Boolean] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    extension [Self <: WatchOptions](x: Self) {
      
      inline def setInitialCopy(value: Boolean): Self = StObject.set(x, "initialCopy", value.asInstanceOf[js.Any])
      
      inline def setInitialCopyUndefined: Self = StObject.set(x, "initialCopy", js.undefined)
    }
  }
}
