package typings.cordovaPluginFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("FileError")
  @js.native
  class FileError protected ()
    extends StObject
       with typings.cordovaPluginFile.FileError {
    def this(code: Double) = this()
    
    /** Error code */
    /* CompleteClass */
    var code: Double = js.native
  }
  object FileError {
    
    @JSGlobal("FileError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("FileError.ABORT_ERR")
    @js.native
    def ABORT_ERR: Double = js.native
    @scala.inline
    def ABORT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABORT_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.ENCODING_ERR")
    @js.native
    def ENCODING_ERR: Double = js.native
    @scala.inline
    def ENCODING_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENCODING_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.INVALID_MODIFICATION_ERR")
    @js.native
    def INVALID_MODIFICATION_ERR: Double = js.native
    @scala.inline
    def INVALID_MODIFICATION_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_MODIFICATION_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.INVALID_STATE_ERR")
    @js.native
    def INVALID_STATE_ERR: Double = js.native
    @scala.inline
    def INVALID_STATE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_STATE_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.NOT_FOUND_ERR")
    @js.native
    def NOT_FOUND_ERR: Double = js.native
    @scala.inline
    def NOT_FOUND_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.NOT_READABLE_ERR")
    @js.native
    def NOT_READABLE_ERR: Double = js.native
    @scala.inline
    def NOT_READABLE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_READABLE_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.NO_MODIFICATION_ALLOWED_ERR")
    @js.native
    def NO_MODIFICATION_ALLOWED_ERR: Double = js.native
    @scala.inline
    def NO_MODIFICATION_ALLOWED_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_MODIFICATION_ALLOWED_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.PATH_EXISTS_ERR")
    @js.native
    def PATH_EXISTS_ERR: Double = js.native
    @scala.inline
    def PATH_EXISTS_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_EXISTS_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.QUOTA_EXCEEDED_ERR")
    @js.native
    def QUOTA_EXCEEDED_ERR: Double = js.native
    @scala.inline
    def QUOTA_EXCEEDED_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_EXCEEDED_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.SECURITY_ERR")
    @js.native
    def SECURITY_ERR: Double = js.native
    @scala.inline
    def SECURITY_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECURITY_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.SYNTAX_ERR")
    @js.native
    def SYNTAX_ERR: Double = js.native
    @scala.inline
    def SYNTAX_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNTAX_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.TYPE_MISMATCH_ERR")
    @js.native
    def TYPE_MISMATCH_ERR: Double = js.native
    @scala.inline
    def TYPE_MISMATCH_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_MISMATCH_ERR")(x.asInstanceOf[js.Any])
  }
  
  /* FileWriter states */
  object FileWriter {
    
    @JSGlobal("FileWriter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("FileWriter.DONE")
    @js.native
    def DONE: Double = js.native
    @scala.inline
    def DONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DONE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileWriter.INIT")
    @js.native
    def INIT: Double = js.native
    @scala.inline
    def INIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INIT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileWriter.WRITING")
    @js.native
    def WRITING: Double = js.native
    @scala.inline
    def WRITING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WRITING")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("LocalFileSystem")
  @js.native
  object LocalFileSystem extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.cordovaPluginFile.LocalFileSystem & Double] = js.native
    
    /* 1 */ val PERSISTENT: typings.cordovaPluginFile.LocalFileSystem.PERSISTENT & Double = js.native
    
    /* 0 */ val TEMPORARY: typings.cordovaPluginFile.LocalFileSystem.TEMPORARY & Double = js.native
  }
}
