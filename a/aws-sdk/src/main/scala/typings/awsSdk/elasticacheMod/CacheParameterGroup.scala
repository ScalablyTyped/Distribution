package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheParameterGroup extends js.Object {
  /**
    * The ARN (Amazon Resource Name) of the cache parameter group.
    */
  var ARN: js.UndefOr[String] = js.native
  /**
    * The name of the cache parameter group family that this cache parameter group is compatible with. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The description for this cache parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates whether the parameter group is associated with a Global Datastore
    */
  var IsGlobal: js.UndefOr[Boolean] = js.native
}

object CacheParameterGroup {
  @scala.inline
  def apply(): CacheParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroup]
  }
  @scala.inline
  implicit class CacheParameterGroupOps[Self <: CacheParameterGroup] (val x: Self) extends AnyVal {
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
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    @scala.inline
    def setCacheParameterGroupFamily(value: String): Self = this.set("CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheParameterGroupFamily: Self = this.set("CacheParameterGroupFamily", js.undefined)
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = this.set("CacheParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheParameterGroupName: Self = this.set("CacheParameterGroupName", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setIsGlobal(value: Boolean): Self = this.set("IsGlobal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGlobal: Self = this.set("IsGlobal", js.undefined)
  }
  
}

