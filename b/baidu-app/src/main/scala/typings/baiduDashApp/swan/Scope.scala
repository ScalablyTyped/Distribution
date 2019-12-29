package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----设置
/* Rewritten from type alias, can be one of: 
  - typings.baiduDashApp.baiduDashAppStrings.scopeDotuserInfo
  - typings.baiduDashApp.baiduDashAppStrings.scopeDotuserLocation
  - typings.baiduDashApp.baiduDashAppStrings.scopeDotaddress
  - typings.baiduDashApp.baiduDashAppStrings.scopeDotinvoiceTitle
  - typings.baiduDashApp.baiduDashAppStrings.scopeDotwerun
  - typings.baiduDashApp.baiduDashAppStrings.scopeDotrecord
  - typings.baiduDashApp.baiduDashAppStrings.scopeDotwritePhotosAlbum
*/
trait Scope extends js.Object

object Scope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scopeDotaddress: typings.baiduDashApp.baiduDashAppStrings.scopeDotaddress = this.cast("scope.address")
  @scala.inline
  def scopeDotinvoiceTitle: typings.baiduDashApp.baiduDashAppStrings.scopeDotinvoiceTitle = this.cast("scope.invoiceTitle")
  @scala.inline
  def scopeDotrecord: typings.baiduDashApp.baiduDashAppStrings.scopeDotrecord = this.cast("scope.record")
  @scala.inline
  def scopeDotuserInfo: typings.baiduDashApp.baiduDashAppStrings.scopeDotuserInfo = this.cast("scope.userInfo")
  @scala.inline
  def scopeDotuserLocation: typings.baiduDashApp.baiduDashAppStrings.scopeDotuserLocation = this.cast("scope.userLocation")
  @scala.inline
  def scopeDotwerun: typings.baiduDashApp.baiduDashAppStrings.scopeDotwerun = this.cast("scope.werun")
  @scala.inline
  def scopeDotwritePhotosAlbum: typings.baiduDashApp.baiduDashAppStrings.scopeDotwritePhotosAlbum = this.cast("scope.writePhotosAlbum")
}

