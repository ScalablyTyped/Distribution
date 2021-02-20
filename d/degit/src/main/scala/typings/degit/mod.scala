package typings.degit

import typings.degit.degitStrings.clone
import typings.degit.degitStrings.info
import typings.degit.degitStrings.remove
import typings.degit.degitStrings.warn
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("degit", JSImport.Default)
  @js.native
  def default(src: String, opts: Options): Degit = js.native
  
  @JSImport("degit", "Degit")
  @js.native
  class Degit protected () extends EventEmitter {
    def this(src: String) = this()
    def this(src: String, opts: Options) = this()
    
    /**
      * @async
      */
    def clone(dest: String): js.Promise[Unit] = js.native
    
    @JSName("on")
    def on_info(event: info, callback: js.Function1[/* info */ Info, Unit]): this.type = js.native
    @JSName("on")
    def on_warn(event: warn, callback: js.Function1[/* info */ Info, Unit]): this.type = js.native
    
    /**
      * @async
      */
    def remove(dir: String, dest: String, action: RemoveAction): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Action extends StObject {
    
    var action: String = js.native
    
    var cache: js.UndefOr[Boolean] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object Action {
    
    @scala.inline
    def apply(action: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait DegitAction extends Action {
    
    @JSName("action")
    var action_DegitAction: clone = js.native
    
    var src: String = js.native
  }
  object DegitAction {
    
    @scala.inline
    def apply(action: clone, src: String): DegitAction = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[DegitAction]
    }
    
    @scala.inline
    implicit class DegitActionMutableBuilder[Self <: DegitAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: clone): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.degit.degitStrings.DEST_NOT_EMPTY
    - typings.degit.degitStrings.MISSING_REF
    - typings.degit.degitStrings.COULD_NOT_DOWNLOAD
    - typings.degit.degitStrings.BAD_SRC
    - typings.degit.degitStrings.UNSUPPORTED_HOST
    - typings.degit.degitStrings.BAD_REF
    - typings.degit.degitStrings.COULD_NOT_FETCH
  */
  trait DegitErrorCode extends StObject
  object DegitErrorCode {
    
    @scala.inline
    def BAD_REF: typings.degit.degitStrings.BAD_REF = "BAD_REF".asInstanceOf[typings.degit.degitStrings.BAD_REF]
    
    @scala.inline
    def BAD_SRC: typings.degit.degitStrings.BAD_SRC = "BAD_SRC".asInstanceOf[typings.degit.degitStrings.BAD_SRC]
    
    @scala.inline
    def COULD_NOT_DOWNLOAD: typings.degit.degitStrings.COULD_NOT_DOWNLOAD = "COULD_NOT_DOWNLOAD".asInstanceOf[typings.degit.degitStrings.COULD_NOT_DOWNLOAD]
    
    @scala.inline
    def COULD_NOT_FETCH: typings.degit.degitStrings.COULD_NOT_FETCH = "COULD_NOT_FETCH".asInstanceOf[typings.degit.degitStrings.COULD_NOT_FETCH]
    
    @scala.inline
    def DEST_NOT_EMPTY: typings.degit.degitStrings.DEST_NOT_EMPTY = "DEST_NOT_EMPTY".asInstanceOf[typings.degit.degitStrings.DEST_NOT_EMPTY]
    
    @scala.inline
    def MISSING_REF: typings.degit.degitStrings.MISSING_REF = "MISSING_REF".asInstanceOf[typings.degit.degitStrings.MISSING_REF]
    
    @scala.inline
    def UNSUPPORTED_HOST: typings.degit.degitStrings.UNSUPPORTED_HOST = "UNSUPPORTED_HOST".asInstanceOf[typings.degit.degitStrings.UNSUPPORTED_HOST]
  }
  
  @js.native
  trait Info extends StObject {
    
    val code: String = js.native
    
    val dest: String = js.native
    
    val message: String = js.native
    
    val repo: Degit = js.native
  }
  object Info {
    
    @scala.inline
    def apply(code: String, dest: String, message: String, repo: Degit): Info = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepo(value: Degit): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.degit.degitStrings.SUCCESS
    - typings.degit.degitStrings.FILE_DOES_NOT_EXIST
    - typings.degit.degitStrings.REMOVED
    - typings.degit.degitStrings.DEST_NOT_EMPTY
    - typings.degit.degitStrings.DEST_IS_EMPTY
    - typings.degit.degitStrings.USING_CACHE
    - typings.degit.degitStrings.FOUND_MATCH
    - typings.degit.degitStrings.FILE_EXISTS
    - typings.degit.degitStrings.PROXY
    - typings.degit.degitStrings.DOWNLOADING
    - typings.degit.degitStrings.EXTRACTING
  */
  trait InfoCode extends StObject
  object InfoCode {
    
    @scala.inline
    def DEST_IS_EMPTY: typings.degit.degitStrings.DEST_IS_EMPTY = "DEST_IS_EMPTY".asInstanceOf[typings.degit.degitStrings.DEST_IS_EMPTY]
    
    @scala.inline
    def DEST_NOT_EMPTY: typings.degit.degitStrings.DEST_NOT_EMPTY = "DEST_NOT_EMPTY".asInstanceOf[typings.degit.degitStrings.DEST_NOT_EMPTY]
    
    @scala.inline
    def DOWNLOADING: typings.degit.degitStrings.DOWNLOADING = "DOWNLOADING".asInstanceOf[typings.degit.degitStrings.DOWNLOADING]
    
    @scala.inline
    def EXTRACTING: typings.degit.degitStrings.EXTRACTING = "EXTRACTING".asInstanceOf[typings.degit.degitStrings.EXTRACTING]
    
    @scala.inline
    def FILE_DOES_NOT_EXIST: typings.degit.degitStrings.FILE_DOES_NOT_EXIST = "FILE_DOES_NOT_EXIST".asInstanceOf[typings.degit.degitStrings.FILE_DOES_NOT_EXIST]
    
    @scala.inline
    def FILE_EXISTS: typings.degit.degitStrings.FILE_EXISTS = "FILE_EXISTS".asInstanceOf[typings.degit.degitStrings.FILE_EXISTS]
    
    @scala.inline
    def FOUND_MATCH: typings.degit.degitStrings.FOUND_MATCH = "FOUND_MATCH".asInstanceOf[typings.degit.degitStrings.FOUND_MATCH]
    
    @scala.inline
    def PROXY: typings.degit.degitStrings.PROXY = "PROXY".asInstanceOf[typings.degit.degitStrings.PROXY]
    
    @scala.inline
    def REMOVED: typings.degit.degitStrings.REMOVED = "REMOVED".asInstanceOf[typings.degit.degitStrings.REMOVED]
    
    @scala.inline
    def SUCCESS: typings.degit.degitStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.degit.degitStrings.SUCCESS]
    
    @scala.inline
    def USING_CACHE: typings.degit.degitStrings.USING_CACHE = "USING_CACHE".asInstanceOf[typings.degit.degitStrings.USING_CACHE]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * @default false
      */
    var cache: js.UndefOr[Boolean] = js.native
    
    /**
      * @default false
      */
    var force: js.UndefOr[Boolean] = js.native
    
    /**
      * @default undefined
      */
    var mode: js.UndefOr[ValidModes] = js.native
    
    /**
      * @default false
      */
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setMode(value: ValidModes): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait RemoveAction extends Action {
    
    @JSName("action")
    var action_RemoveAction: remove = js.native
    
    var files: js.Array[String] = js.native
  }
  object RemoveAction {
    
    @scala.inline
    def apply(action: remove, files: js.Array[String]): RemoveAction = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAction]
    }
    
    @scala.inline
    implicit class RemoveActionMutableBuilder[Self <: RemoveAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: remove): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.degit.degitStrings.tar
    - typings.degit.degitStrings.git
  */
  trait ValidModes extends StObject
  object ValidModes {
    
    @scala.inline
    def git: typings.degit.degitStrings.git = "git".asInstanceOf[typings.degit.degitStrings.git]
    
    @scala.inline
    def tar: typings.degit.degitStrings.tar = "tar".asInstanceOf[typings.degit.degitStrings.tar]
  }
}
