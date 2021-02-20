package typings.builderUtil

import typings.fsExtra.mod.Stats
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  object CONCURRENCY {
    
    @JSImport("builder-util/out/fs", "CONCURRENCY")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("builder-util/out/fs", "CONCURRENCY.concurrency")
    @js.native
    def concurrency: Double = js.native
    @scala.inline
    def concurrency_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("builder-util/out/fs", "CopyFileTransformer")
  @js.native
  class CopyFileTransformer protected () extends StObject {
    def this(afterCopyTransformer: AfterCopyFileTransformer) = this()
    
    def afterCopyTransformer(file: String): js.Promise[Unit] = js.native
  }
  
  @JSImport("builder-util/out/fs", "DO_NOT_USE_HARD_LINKS")
  @js.native
  def DO_NOT_USE_HARD_LINKS(file: String): Boolean = js.native
  
  @JSImport("builder-util/out/fs", "FileCopier")
  @js.native
  class FileCopier () extends StObject {
    def this(isUseHardLinkFunction: js.Function1[/* file */ String, Boolean]) = this()
    def this(isUseHardLinkFunction: js.UndefOr[scala.Nothing], transformer: FileTransformer) = this()
    def this(isUseHardLinkFunction: js.Function1[/* file */ String, Boolean], transformer: FileTransformer) = this()
    def this(isUseHardLinkFunction: Null, transformer: FileTransformer) = this()
    
    def copy(src: String, dest: String): js.Promise[Unit] = js.native
    def copy(src: String, dest: String, stat: Stats): js.Promise[Unit] = js.native
    
    var isUseHardLink: Boolean = js.native
    
    val isUseHardLinkFunction: js.Any = js.native
    
    val transformer: js.Any = js.native
  }
  
  @JSImport("builder-util/out/fs", "MAX_FILE_REQUESTS")
  @js.native
  val MAX_FILE_REQUESTS: /* 8 */ Double = js.native
  
  @JSImport("builder-util/out/fs", "USE_HARD_LINKS")
  @js.native
  def USE_HARD_LINKS(file: String): Boolean = js.native
  
  @JSImport("builder-util/out/fs", "copyDir")
  @js.native
  def copyDir(src: String, destination: String): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyDir")
  @js.native
  def copyDir(src: String, destination: String, options: CopyDirOptions): js.Promise[_] = js.native
  
  @JSImport("builder-util/out/fs", "copyFile")
  @js.native
  def copyFile(src: String, dest: String): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyFile")
  @js.native
  def copyFile(src: String, dest: String, isEnsureDir: Boolean): js.Promise[_] = js.native
  
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(src: String, dest: String): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(
    src: String,
    dest: String,
    stats: js.UndefOr[scala.Nothing],
    isUseHardLink: js.UndefOr[scala.Nothing],
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(src: String, dest: String, stats: js.UndefOr[scala.Nothing], isUseHardLink: Boolean): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(
    src: String,
    dest: String,
    stats: js.UndefOr[scala.Nothing],
    isUseHardLink: Boolean,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Null,
    isUseHardLink: js.UndefOr[scala.Nothing],
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(src: String, dest: String, stats: Null, isUseHardLink: Boolean): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Null,
    isUseHardLink: Boolean,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(src: String, dest: String, stats: Stats): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Stats,
    isUseHardLink: js.UndefOr[scala.Nothing],
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(src: String, dest: String, stats: Stats, isUseHardLink: Boolean): js.Promise[_] = js.native
  @JSImport("builder-util/out/fs", "copyOrLinkFile")
  @js.native
  def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Stats,
    isUseHardLink: Boolean,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[_] = js.native
  
  @JSImport("builder-util/out/fs", "exists")
  @js.native
  def exists(file: String): js.Promise[Boolean] = js.native
  
  @JSImport("builder-util/out/fs", "statOrNull")
  @js.native
  def statOrNull(file: String): js.Promise[Stats | Null] = js.native
  
  @JSImport("builder-util/out/fs", "unlinkIfExists")
  @js.native
  def unlinkIfExists(file: String): js.Promise[Unit] = js.native
  
  @JSImport("builder-util/out/fs", "walk")
  @js.native
  def walk(initialDirPath: String): js.Promise[js.Array[String]] = js.native
  @JSImport("builder-util/out/fs", "walk")
  @js.native
  def walk(initialDirPath: String, filter: js.UndefOr[scala.Nothing], consumer: FileConsumer): js.Promise[js.Array[String]] = js.native
  @JSImport("builder-util/out/fs", "walk")
  @js.native
  def walk(initialDirPath: String, filter: Null, consumer: FileConsumer): js.Promise[js.Array[String]] = js.native
  @JSImport("builder-util/out/fs", "walk")
  @js.native
  def walk(initialDirPath: String, filter: Filter): js.Promise[js.Array[String]] = js.native
  @JSImport("builder-util/out/fs", "walk")
  @js.native
  def walk(initialDirPath: String, filter: Filter, consumer: FileConsumer): js.Promise[js.Array[String]] = js.native
  
  type AfterCopyFileTransformer = js.Function1[/* file */ String, js.Promise[Unit]]
  
  @js.native
  trait CopyDirOptions extends StObject {
    
    var filter: js.UndefOr[Filter | Null] = js.native
    
    var isUseHardLink: js.UndefOr[(js.Function1[/* file */ String, Boolean]) | Null] = js.native
    
    var transformer: js.UndefOr[FileTransformer | Null] = js.native
  }
  object CopyDirOptions {
    
    @scala.inline
    def apply(): CopyDirOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyDirOptions]
    }
    
    @scala.inline
    implicit class CopyDirOptionsMutableBuilder[Self <: CopyDirOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: (/* file */ String, /* stat */ Stats) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterNull: Self = StObject.set(x, "filter", null)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIsUseHardLink(value: /* file */ String => Boolean): Self = StObject.set(x, "isUseHardLink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsUseHardLinkNull: Self = StObject.set(x, "isUseHardLink", null)
      
      @scala.inline
      def setIsUseHardLinkUndefined: Self = StObject.set(x, "isUseHardLink", js.undefined)
      
      @scala.inline
      def setTransformer(
        value: /* file */ String => (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer
      ): Self = StObject.set(x, "transformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformerNull: Self = StObject.set(x, "transformer", null)
      
      @scala.inline
      def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
    }
  }
  
  @js.native
  trait FileConsumer extends StObject {
    
    def consume(file: String, fileStat: Stats, parent: String, siblingNames: js.Array[String]): js.Any = js.native
    
    /**
      * @default false
      */
    var isIncludeDir: js.UndefOr[Boolean] = js.native
  }
  object FileConsumer {
    
    @scala.inline
    def apply(consume: (String, Stats, String, js.Array[String]) => js.Any): FileConsumer = {
      val __obj = js.Dynamic.literal(consume = js.Any.fromFunction4(consume))
      __obj.asInstanceOf[FileConsumer]
    }
    
    @scala.inline
    implicit class FileConsumerMutableBuilder[Self <: FileConsumer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsume(value: (String, Stats, String, js.Array[String]) => js.Any): Self = StObject.set(x, "consume", js.Any.fromFunction4(value))
      
      @scala.inline
      def setIsIncludeDir(value: Boolean): Self = StObject.set(x, "isIncludeDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIncludeDirUndefined: Self = StObject.set(x, "isIncludeDir", js.undefined)
    }
  }
  
  type FileTransformer = js.Function1[
    /* file */ String, 
    (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer
  ]
  
  type Filter = js.Function2[/* file */ String, /* stat */ Stats, Boolean]
  
  @js.native
  trait Link extends StObject {
    
    val file: String = js.native
    
    val link: String = js.native
  }
  object Link {
    
    @scala.inline
    def apply(file: String, link: String): Link = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
}
