package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----设置
/* Rewritten from type alias, can be one of: 
  - typings.baiduApp.baiduAppStrings.scopeDotuserInfo
  - typings.baiduApp.baiduAppStrings.scopeDotuserLocation
  - typings.baiduApp.baiduAppStrings.scopeDotaddress
  - typings.baiduApp.baiduAppStrings.scopeDotinvoiceTitle
  - typings.baiduApp.baiduAppStrings.scopeDotwerun
  - typings.baiduApp.baiduAppStrings.scopeDotrecord
  - typings.baiduApp.baiduAppStrings.scopeDotwritePhotosAlbum
*/
trait Scope extends js.Object

object Scope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scopeDotaddress: typings.baiduApp.baiduAppStrings.scopeDotaddress = this.cast("scope.address")
  @scala.inline
  def scopeDotinvoiceTitle: typings.baiduApp.baiduAppStrings.scopeDotinvoiceTitle = this.cast("scope.invoiceTitle")
  @scala.inline
  def scopeDotrecord: typings.baiduApp.baiduAppStrings.scopeDotrecord = this.cast("scope.record")
  @scala.inline
  def scopeDotuserInfo: typings.baiduApp.baiduAppStrings.scopeDotuserInfo = this.cast("scope.userInfo")
  @scala.inline
  def scopeDotuserLocation: typings.baiduApp.baiduAppStrings.scopeDotuserLocation = this.cast("scope.userLocation")
  @scala.inline
  def scopeDotwerun: typings.baiduApp.baiduAppStrings.scopeDotwerun = this.cast("scope.werun")
  @scala.inline
  def scopeDotwritePhotosAlbum: typings.baiduApp.baiduAppStrings.scopeDotwritePhotosAlbum = this.cast("scope.writePhotosAlbum")
}

