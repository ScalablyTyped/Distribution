package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ipv6Pool extends js.Object {
  /**
    * The description for the address pool.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The CIDR blocks for the address pool.
    */
  var PoolCidrBlocks: js.UndefOr[PoolCidrBlocksSet] = js.native
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[String] = js.native
  /**
    * Any tags for the address pool.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Ipv6Pool {
  @scala.inline
  def apply(): Ipv6Pool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6Pool]
  }
  @scala.inline
  implicit class Ipv6PoolOps[Self <: Ipv6Pool] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setPoolCidrBlocksVarargs(value: PoolCidrBlock*): Self = this.set("PoolCidrBlocks", js.Array(value :_*))
    @scala.inline
    def setPoolCidrBlocks(value: PoolCidrBlocksSet): Self = this.set("PoolCidrBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolCidrBlocks: Self = this.set("PoolCidrBlocks", js.undefined)
    @scala.inline
    def setPoolId(value: String): Self = this.set("PoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolId: Self = this.set("PoolId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

