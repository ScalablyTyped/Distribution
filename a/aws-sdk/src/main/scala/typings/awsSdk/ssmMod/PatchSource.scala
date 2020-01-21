package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchSource extends js.Object {
  /**
    * The value of the yum repo configuration. For example:  [main]   cachedir=/var/cache/yum/$basesearch$releasever   keepcache=0   debuglevel=2 
    */
  var Configuration: PatchSourceConfiguration = js.native
  /**
    * The name specified to identify the patch source.
    */
  var Name: PatchSourceName = js.native
  /**
    * The specific operating system versions a patch repository applies to, such as "Ubuntu16.04", "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see PatchFilter.
    */
  var Products: PatchSourceProductList = js.native
}

object PatchSource {
  @scala.inline
  def apply(Configuration: PatchSourceConfiguration, Name: PatchSourceName, Products: PatchSourceProductList): PatchSource = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Products = Products.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchSource]
  }
}

