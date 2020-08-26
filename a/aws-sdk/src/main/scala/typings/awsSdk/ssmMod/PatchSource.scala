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
  @scala.inline
  implicit class PatchSourceOps[Self <: PatchSource] (val x: Self) extends AnyVal {
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
    def setConfiguration(value: PatchSourceConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: PatchSourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductsVarargs(value: PatchSourceProduct*): Self = this.set("Products", js.Array(value :_*))
    @scala.inline
    def setProducts(value: PatchSourceProductList): Self = this.set("Products", value.asInstanceOf[js.Any])
  }
  
}

