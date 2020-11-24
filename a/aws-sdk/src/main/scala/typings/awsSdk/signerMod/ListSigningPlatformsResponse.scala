package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSigningPlatformsResponse extends js.Object {
  
  /**
    * Value for specifying the next set of paginated results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of all platforms that match the request parameters.
    */
  var platforms: js.UndefOr[SigningPlatforms] = js.native
}
object ListSigningPlatformsResponse {
  
  @scala.inline
  def apply(): ListSigningPlatformsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningPlatformsResponse]
  }
  
  @scala.inline
  implicit class ListSigningPlatformsResponseOps[Self <: ListSigningPlatformsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: SigningPlatform*): Self = this.set("platforms", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: SigningPlatforms): Self = this.set("platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
  }
}
