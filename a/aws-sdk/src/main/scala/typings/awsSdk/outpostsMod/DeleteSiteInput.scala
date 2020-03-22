package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSiteInput extends js.Object {
  var SiteId: typings.awsSdk.outpostsMod.SiteId = js.native
}

object DeleteSiteInput {
  @scala.inline
  def apply(SiteId: SiteId): DeleteSiteInput = {
    val __obj = js.Dynamic.literal(SiteId = SiteId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSiteInput]
  }
}

