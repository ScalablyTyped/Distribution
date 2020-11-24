package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCachePolicyResult extends js.Object {
  
  /**
    * The cache policy.
    */
  var CachePolicy: js.UndefOr[typings.awsSdk.cloudfrontMod.CachePolicy] = js.native
  
  /**
    * The current version of the cache policy.
    */
  var ETag: js.UndefOr[String] = js.native
}
object GetCachePolicyResult {
  
  @scala.inline
  def apply(): GetCachePolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCachePolicyResult]
  }
  
  @scala.inline
  implicit class GetCachePolicyResultOps[Self <: GetCachePolicyResult] (val x: Self) extends AnyVal {
    
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
    def setCachePolicy(value: CachePolicy): Self = this.set("CachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachePolicy: Self = this.set("CachePolicy", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
  }
}
