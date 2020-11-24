package typings.createTorrent.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTorrentOptions extends js.Object {
  
  // custom trackers (array of arrays of strings) (see [bep12](http://www.bittorrent.org/beps/bep_0012.html))
  var announceList: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  // free-form textual comments of the author
  var comment: js.UndefOr[String] = js.native
  
  // name and version of program used to create torrent
  var createdBy: js.UndefOr[String] = js.native
  
  // creation time in UNIX epoch format (default = now)
  var creationDate: js.UndefOr[Double] = js.native
  
  // add non-standard info dict entries, e.g. info.source, a convention for cross-seeding
  var info: js.UndefOr[Record[String, String]] = js.native
  
  // name of the torrent (default = basename of `path`, or 1st file's name)
  var name: js.UndefOr[String] = js.native
  
  // force a custom piece length (number of bytes)
  var pieceLength: js.UndefOr[Double] = js.native
  
  // is this a private .torrent? (default = false)
  var `private`: js.UndefOr[Boolean] = js.native
  
  // web seed urls (see [bep19](http://www.bittorrent.org/beps/bep_0019.html))
  var urlList: js.UndefOr[js.Array[String]] = js.native
}
object CreateTorrentOptions {
  
  @scala.inline
  def apply(): CreateTorrentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTorrentOptions]
  }
  
  @scala.inline
  implicit class CreateTorrentOptionsOps[Self <: CreateTorrentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnounceListVarargs(value: js.Array[String]*): Self = this.set("announceList", js.Array(value :_*))
    
    @scala.inline
    def setAnnounceList(value: js.Array[js.Array[String]]): Self = this.set("announceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnounceList: Self = this.set("announceList", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setInfo(value: Record[String, String]): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPieceLength(value: Double): Self = this.set("pieceLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieceLength: Self = this.set("pieceLength", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setUrlListVarargs(value: String*): Self = this.set("urlList", js.Array(value :_*))
    
    @scala.inline
    def setUrlList(value: js.Array[String]): Self = this.set("urlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlList: Self = this.set("urlList", js.undefined)
  }
}
