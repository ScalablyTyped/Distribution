package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acceptstlschannelid extends js.Object {
  var accepts_tls_channel_id: js.UndefOr[Boolean] = js.native
  var ids: js.UndefOr[js.Array[String]] = js.native
  var matches: js.UndefOr[js.Array[String]] = js.native
}

object Acceptstlschannelid {
  @scala.inline
  def apply(): Acceptstlschannelid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acceptstlschannelid]
  }
  @scala.inline
  implicit class AcceptstlschannelidOps[Self <: Acceptstlschannelid] (val x: Self) extends AnyVal {
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
    def setAccepts_tls_channel_id(value: Boolean): Self = this.set("accepts_tls_channel_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepts_tls_channel_id: Self = this.set("accepts_tls_channel_id", js.undefined)
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setMatchesVarargs(value: String*): Self = this.set("matches", js.Array(value :_*))
    @scala.inline
    def setMatches(value: js.Array[String]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
  }
  
}

