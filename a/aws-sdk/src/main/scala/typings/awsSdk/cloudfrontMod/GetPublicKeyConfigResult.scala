package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPublicKeyConfigResult extends js.Object {
  
  /**
    * The identifier for this version of the public key configuration.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * A public key configuration.
    */
  var PublicKeyConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKeyConfig] = js.native
}
object GetPublicKeyConfigResult {
  
  @scala.inline
  def apply(): GetPublicKeyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyConfigResult]
  }
  
  @scala.inline
  implicit class GetPublicKeyConfigResultOps[Self <: GetPublicKeyConfigResult] (val x: Self) extends AnyVal {
    
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    
    @scala.inline
    def setPublicKeyConfig(value: PublicKeyConfig): Self = this.set("PublicKeyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyConfig: Self = this.set("PublicKeyConfig", js.undefined)
  }
}
