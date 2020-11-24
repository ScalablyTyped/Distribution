package typings.cqrsDomain.anon

import typings.cqrsDomain.mod.SupportedDBTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthSource extends js.Object {
  
  var authSource: js.UndefOr[String] = js.native
  
  var dbName: js.UndefOr[String] = js.native
  
  var eventsCollectionName: js.UndefOr[String] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var snapshotsCollectionName: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var transactionsCollectionName: js.UndefOr[String] = js.native
  
  var `type`: SupportedDBTypes = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object AuthSource {
  
  @scala.inline
  def apply(`type`: SupportedDBTypes): AuthSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSource]
  }
  
  @scala.inline
  implicit class AuthSourceOps[Self <: AuthSource] (val x: Self) extends AnyVal {
    
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
    def setType(value: SupportedDBTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSource(value: String): Self = this.set("authSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthSource: Self = this.set("authSource", js.undefined)
    
    @scala.inline
    def setDbName(value: String): Self = this.set("dbName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbName: Self = this.set("dbName", js.undefined)
    
    @scala.inline
    def setEventsCollectionName(value: String): Self = this.set("eventsCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventsCollectionName: Self = this.set("eventsCollectionName", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSnapshotsCollectionName(value: String): Self = this.set("snapshotsCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotsCollectionName: Self = this.set("snapshotsCollectionName", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTransactionsCollectionName(value: String): Self = this.set("transactionsCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionsCollectionName: Self = this.set("transactionsCollectionName", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
