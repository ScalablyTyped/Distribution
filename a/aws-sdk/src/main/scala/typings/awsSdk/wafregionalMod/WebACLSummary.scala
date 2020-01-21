package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebACLSummary extends js.Object {
  /**
    * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
    */
  var Name: ResourceName = js.native
  /**
    * A unique identifier for a WebACL. You use WebACLId to get information about a WebACL (see GetWebACL), update a WebACL (see UpdateWebACL), and delete a WebACL from AWS WAF (see DeleteWebACL).  WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId = js.native
}

object WebACLSummary {
  @scala.inline
  def apply(Name: ResourceName, WebACLId: ResourceId): WebACLSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebACLSummary]
  }
}

