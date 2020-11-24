package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportPlaybackKeyPairResponse extends js.Object {
  
  var keyPair: js.UndefOr[PlaybackKeyPair] = js.native
}
object ImportPlaybackKeyPairResponse {
  
  @scala.inline
  def apply(): ImportPlaybackKeyPairResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportPlaybackKeyPairResponse]
  }
  
  @scala.inline
  implicit class ImportPlaybackKeyPairResponseOps[Self <: ImportPlaybackKeyPairResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyPair(value: PlaybackKeyPair): Self = this.set("keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPair: Self = this.set("keyPair", js.undefined)
  }
}
