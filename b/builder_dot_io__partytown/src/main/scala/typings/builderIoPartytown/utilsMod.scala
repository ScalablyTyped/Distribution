package typings.builderIoPartytown

import typings.builderIoPartytown.anon.Dest
import typings.builderIoPartytown.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@builder.io/partytown/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyLibFiles(dest: String): js.Promise[Dest] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyLibFiles")(dest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Dest]]
  inline def copyLibFiles(dest: String, opts: CopyLibFilesOptions): js.Promise[Dest] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyLibFiles")(dest.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Dest]]
  
  inline def libDirPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("libDirPath")().asInstanceOf[String]
  inline def libDirPath(opts: LibDirOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("libDirPath")(opts.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def partytownRollup(opts: PartytownRollupOptions): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("partytownRollup")(opts.asInstanceOf[js.Any]).asInstanceOf[Name]
  
  inline def partytownVite(opts: PartytownViteOptions): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("partytownVite")(opts.asInstanceOf[js.Any]).asInstanceOf[Name]
  
  trait CopyLibFilesOptions extends StObject {
    
    /**
      * When set to `false` the `lib/debug` directory will not be copied. The default is
      * that both the production and debug directories are copied to the destination.
      */
    var debugDir: js.UndefOr[Boolean] = js.undefined
  }
  object CopyLibFilesOptions {
    
    inline def apply(): CopyLibFilesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyLibFilesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopyLibFilesOptions] (val x: Self) extends AnyVal {
      
      inline def setDebugDir(value: Boolean): Self = StObject.set(x, "debugDir", value.asInstanceOf[js.Any])
      
      inline def setDebugDirUndefined: Self = StObject.set(x, "debugDir", js.undefined)
    }
  }
  
  trait LibDirOptions extends StObject {
    
    /**
      * When the `debugDir` option is set to `true`, the returned
      * directory is the absolute path to the `lib/debug` directory.
      */
    var debugDir: js.UndefOr[Boolean] = js.undefined
  }
  object LibDirOptions {
    
    inline def apply(): LibDirOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LibDirOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LibDirOptions] (val x: Self) extends AnyVal {
      
      inline def setDebugDir(value: Boolean): Self = StObject.set(x, "debugDir", value.asInstanceOf[js.Any])
      
      inline def setDebugDirUndefined: Self = StObject.set(x, "debugDir", js.undefined)
    }
  }
  
  trait PartytownRollupOptions extends StObject {
    
    /**
      * When `debug` is set to `false`, the `lib/debug` directory will not be copied.
      * The default is that both the production and debug directories are copied to the destination.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /** An absolute path to the destination directory where the lib files should be copied. */
    var dest: String
  }
  object PartytownRollupOptions {
    
    inline def apply(dest: String): PartytownRollupOptions = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartytownRollupOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartytownRollupOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    }
  }
  
  type PartytownViteOptions = PartytownRollupOptions
}
