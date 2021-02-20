package typings.cpx

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cpx", "Watcher")
  @js.native
  class Watcher protected () extends EventEmitter {
    def this(options: WatchOptions) = this()
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
  }
  
  @JSImport("cpx", "copy")
  @js.native
  def copy(source: String, dest: String): Unit = js.native
  @JSImport("cpx", "copy")
  @js.native
  def copy(source: String, dest: String, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
  @JSImport("cpx", "copy")
  @js.native
  def copy(
    source: String,
    dest: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ Error | Null, Unit]
  ): Unit = js.native
  @JSImport("cpx", "copy")
  @js.native
  def copy(source: String, dest: String, options: AsyncOptions): Unit = js.native
  @JSImport("cpx", "copy")
  @js.native
  def copy(
    source: String,
    dest: String,
    options: AsyncOptions,
    callback: js.Function1[/* error */ Error | Null, Unit]
  ): Unit = js.native
  
  @JSImport("cpx", "copySync")
  @js.native
  def copySync(source: String, dest: String): Unit = js.native
  @JSImport("cpx", "copySync")
  @js.native
  def copySync(source: String, dest: String, options: SyncOptions): Unit = js.native
  
  @JSImport("cpx", "watch")
  @js.native
  def watch(source: String, dest: String): Watcher = js.native
  @JSImport("cpx", "watch")
  @js.native
  def watch(source: String, dest: String, options: WatchOptions): Watcher = js.native
  
  @js.native
  trait AsyncOptions extends SyncOptions {
    
    /** Function that creates a `stream.Transform` object to transform each copying file. */
    var transform: js.UndefOr[js.Function1[/* filepath */ String, js.Array[Transform]]] = js.native
  }
  object AsyncOptions {
    
    @scala.inline
    def apply(): AsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOptions]
    }
    
    @scala.inline
    implicit class AsyncOptionsMutableBuilder[Self <: AsyncOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransform(value: /* filepath */ String => js.Array[Transform]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait SyncOptions extends StObject {
    
    /** remove files that copied on past before copy. */
    var clean: js.UndefOr[Boolean] = js.native
    
    /** Follow symbolic links when copying from them. */
    var dereference: js.UndefOr[Boolean] = js.native
    
    /** Copy empty directories which is matched with the glob. */
    var includeEmptyDirs: js.UndefOr[Boolean] = js.native
    
    /** Preserve UID, GID, ATIME, and MTIME of files. */
    var preserve: js.UndefOr[Boolean] = js.native
    
    /** Do not overwrite files on destination if the source file is older. */
    var update: js.UndefOr[Boolean] = js.native
  }
  object SyncOptions {
    
    @scala.inline
    def apply(): SyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncOptions]
    }
    
    @scala.inline
    implicit class SyncOptionsMutableBuilder[Self <: SyncOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      @scala.inline
      def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      @scala.inline
      def setIncludeEmptyDirs(value: Boolean): Self = StObject.set(x, "includeEmptyDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeEmptyDirsUndefined: Self = StObject.set(x, "includeEmptyDirs", js.undefined)
      
      @scala.inline
      def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      @scala.inline
      def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait WatchOptions extends AsyncOptions {
    
    /** Flag to not copy at the initial time of watch. */
    var initialCopy: js.UndefOr[Boolean] = js.native
  }
  object WatchOptions {
    
    @scala.inline
    def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit class WatchOptionsMutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialCopy(value: Boolean): Self = StObject.set(x, "initialCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialCopyUndefined: Self = StObject.set(x, "initialCopy", js.undefined)
    }
  }
}
