package typings.createTorrent

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import typings.std.File
import typings.std.FileList
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(input: String, cb: js.Function2[/* err */ Error | Null, /* torrent */ Buffer, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    input: String,
    opts: CreateTorrentOptions,
    cb: js.Function2[/* err */ Error | Null, /* torrent */ Buffer, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    input: js.Array[Buffer | File | ReadableStream | String],
    cb: js.Function2[Error | Null, /* torrent */ Buffer, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    input: js.Array[Buffer | File | ReadableStream | String],
    opts: CreateTorrentOptions,
    cb: js.Function2[Error | Null, /* torrent */ Buffer, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(input: Buffer, cb: js.Function2[/* err */ Error | Null, /* torrent */ Buffer, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    input: Buffer,
    opts: CreateTorrentOptions,
    cb: js.Function2[/* err */ Error | Null, /* torrent */ Buffer, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(input: ReadableStream, cb: js.Function2[/* err */ Error | Null, /* torrent */ Buffer, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    input: ReadableStream,
    opts: CreateTorrentOptions,
    cb: js.Function2[/* err */ Error | Null, /* torrent */ Buffer, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(input: FileList, cb: js.Function2[/* err */ Error | Null, /* torrent */ Buffer, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    input: FileList,
    opts: CreateTorrentOptions,
    cb: js.Function2[/* err */ Error | Null, /* torrent */ Buffer, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(input: File, cb: js.Function2[/* err */ Error | Null, /* torrent */ Buffer, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    input: File,
    opts: CreateTorrentOptions,
    cb: js.Function2[/* err */ Error | Null, /* torrent */ Buffer, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("create-torrent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CreateTorrentOptions extends StObject {
    
    // custom trackers (array of arrays of strings) (see [bep12](http://www.bittorrent.org/beps/bep_0012.html))
    var announceList: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    // free-form textual comments of the author
    var comment: js.UndefOr[String] = js.undefined
    
    // name and version of program used to create torrent
    var createdBy: js.UndefOr[String] = js.undefined
    
    // creation time in UNIX epoch format (default = now)
    var creationDate: js.UndefOr[Double] = js.undefined
    
    // add non-standard info dict entries, e.g. info.source, a convention for cross-seeding
    var info: js.UndefOr[Record[String, String]] = js.undefined
    
    // name of the torrent (default = basename of `path`, or 1st file's name)
    var name: js.UndefOr[String] = js.undefined
    
    // force a custom piece length (number of bytes)
    var pieceLength: js.UndefOr[Double] = js.undefined
    
    // is this a private .torrent? (default = false)
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    // web seed urls (see [bep19](http://www.bittorrent.org/beps/bep_0019.html))
    var urlList: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CreateTorrentOptions {
    
    @scala.inline
    def apply(): CreateTorrentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTorrentOptions]
    }
    
    @scala.inline
    implicit class CreateTorrentOptionsMutableBuilder[Self <: CreateTorrentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnounceList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "announceList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnounceListUndefined: Self = StObject.set(x, "announceList", js.undefined)
      
      @scala.inline
      def setAnnounceListVarargs(value: js.Array[String]*): Self = StObject.set(x, "announceList", js.Array(value :_*))
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
      
      @scala.inline
      def setCreationDate(value: Double): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setInfo(value: Record[String, String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPieceLength(value: Double): Self = StObject.set(x, "pieceLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPieceLengthUndefined: Self = StObject.set(x, "pieceLength", js.undefined)
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      @scala.inline
      def setUrlList(value: js.Array[String]): Self = StObject.set(x, "urlList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlListUndefined: Self = StObject.set(x, "urlList", js.undefined)
      
      @scala.inline
      def setUrlListVarargs(value: String*): Self = StObject.set(x, "urlList", js.Array(value :_*))
    }
  }
}
