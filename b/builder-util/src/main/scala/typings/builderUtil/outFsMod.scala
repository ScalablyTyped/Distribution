package typings.builderUtil

import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFsMod {
  
  @JSImport("builder-util/out/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CONCURRENCY {
    
    @JSImport("builder-util/out/fs", "CONCURRENCY")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("builder-util/out/fs", "CONCURRENCY.concurrency")
    @js.native
    def concurrency: Double = js.native
    inline def concurrency_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("builder-util/out/fs", "CopyFileTransformer")
  @js.native
  open class CopyFileTransformer protected () extends StObject {
    def this(afterCopyTransformer: AfterCopyFileTransformer) = this()
    
    def afterCopyTransformer(file: String): js.Promise[Unit] = js.native
  }
  
  inline def DO_NOT_USE_HARD_LINKS(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("DO_NOT_USE_HARD_LINKS")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("builder-util/out/fs", "FileCopier")
  @js.native
  open class FileCopier () extends StObject {
    def this(isUseHardLinkFunction: js.Function1[/* file */ String, Boolean]) = this()
    def this(isUseHardLinkFunction: js.Function1[/* file */ String, Boolean], transformer: FileTransformer) = this()
    def this(isUseHardLinkFunction: Null, transformer: FileTransformer) = this()
    def this(isUseHardLinkFunction: Unit, transformer: FileTransformer) = this()
    
    def copy(src: String, dest: String): js.Promise[Unit] = js.native
    def copy(src: String, dest: String, stat: Stats): js.Promise[Unit] = js.native
    
    var isUseHardLink: Boolean = js.native
    
    /* private */ val isUseHardLinkFunction: Any = js.native
    
    /* private */ val transformer: Any = js.native
  }
  
  @JSImport("builder-util/out/fs", "MAX_FILE_REQUESTS")
  @js.native
  val MAX_FILE_REQUESTS: /* 8 */ Double = js.native
  
  inline def USE_HARD_LINKS(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("USE_HARD_LINKS")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def copyDir(src: String, destination: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDir")(src.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyDir(src: String, destination: String, options: CopyDirOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDir")(src.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def copyFile(src: String, dest: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyFile(src: String, dest: String, isEnsureDir: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], isEnsureDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def copyOrLinkFile(src: String, dest: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyOrLinkFile(src: String, dest: String, stats: Null, isUseHardLink: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], isUseHardLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Null,
    isUseHardLink: Boolean,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], isUseHardLink.asInstanceOf[js.Any], exDevErrorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Null,
    isUseHardLink: Unit,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], isUseHardLink.asInstanceOf[js.Any], exDevErrorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyOrLinkFile(src: String, dest: String, stats: Unit, isUseHardLink: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], isUseHardLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Unit,
    isUseHardLink: Boolean,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], isUseHardLink.asInstanceOf[js.Any], exDevErrorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Unit,
    isUseHardLink: Unit,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], isUseHardLink.asInstanceOf[js.Any], exDevErrorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyOrLinkFile(src: String, dest: String, stats: Stats): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyOrLinkFile(src: String, dest: String, stats: Stats, isUseHardLink: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], isUseHardLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Stats,
    isUseHardLink: Boolean,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], isUseHardLink.asInstanceOf[js.Any], exDevErrorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Stats,
    isUseHardLink: Unit,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOrLinkFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], isUseHardLink.asInstanceOf[js.Any], exDevErrorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def exists(file: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def statOrNull(file: String): js.Promise[Stats | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("statOrNull")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats | Null]]
  
  inline def unlinkIfExists(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkIfExists")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def walk(initialDirPath: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(initialDirPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def walk(initialDirPath: String, filter: Null, consumer: FileConsumer): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(initialDirPath.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def walk(initialDirPath: String, filter: Unit, consumer: FileConsumer): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(initialDirPath.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def walk(initialDirPath: String, filter: Filter): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(initialDirPath.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def walk(initialDirPath: String, filter: Filter, consumer: FileConsumer): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(initialDirPath.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  type AfterCopyFileTransformer = js.Function1[/* file */ String, js.Promise[Unit]]
  
  trait CopyDirOptions extends StObject {
    
    var filter: js.UndefOr[Filter | Null] = js.undefined
    
    var isUseHardLink: js.UndefOr[(js.Function1[/* file */ String, Boolean]) | Null] = js.undefined
    
    var transformer: js.UndefOr[FileTransformer | Null] = js.undefined
  }
  object CopyDirOptions {
    
    inline def apply(): CopyDirOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyDirOptions]
    }
    
    extension [Self <: CopyDirOptions](x: Self) {
      
      inline def setFilter(value: (/* file */ String, /* stat */ Stats) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterNull: Self = StObject.set(x, "filter", null)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIsUseHardLink(value: /* file */ String => Boolean): Self = StObject.set(x, "isUseHardLink", js.Any.fromFunction1(value))
      
      inline def setIsUseHardLinkNull: Self = StObject.set(x, "isUseHardLink", null)
      
      inline def setIsUseHardLinkUndefined: Self = StObject.set(x, "isUseHardLink", js.undefined)
      
      inline def setTransformer(
        value: /* file */ String => (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer
      ): Self = StObject.set(x, "transformer", js.Any.fromFunction1(value))
      
      inline def setTransformerNull: Self = StObject.set(x, "transformer", null)
      
      inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
    }
  }
  
  trait FileConsumer extends StObject {
    
    def consume(file: String, fileStat: Stats, parent: String, siblingNames: js.Array[String]): Any
    
    /**
      * @default false
      */
    var isIncludeDir: js.UndefOr[Boolean] = js.undefined
  }
  object FileConsumer {
    
    inline def apply(consume: (String, Stats, String, js.Array[String]) => Any): FileConsumer = {
      val __obj = js.Dynamic.literal(consume = js.Any.fromFunction4(consume))
      __obj.asInstanceOf[FileConsumer]
    }
    
    extension [Self <: FileConsumer](x: Self) {
      
      inline def setConsume(value: (String, Stats, String, js.Array[String]) => Any): Self = StObject.set(x, "consume", js.Any.fromFunction4(value))
      
      inline def setIsIncludeDir(value: Boolean): Self = StObject.set(x, "isIncludeDir", value.asInstanceOf[js.Any])
      
      inline def setIsIncludeDirUndefined: Self = StObject.set(x, "isIncludeDir", js.undefined)
    }
  }
  
  type FileTransformer = js.Function1[
    /* file */ String, 
    (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer
  ]
  
  type Filter = js.Function2[/* file */ String, /* stat */ Stats, Boolean]
  
  trait Link extends StObject {
    
    val file: String
    
    val link: String
  }
  object Link {
    
    inline def apply(file: String, link: String): Link = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
}
