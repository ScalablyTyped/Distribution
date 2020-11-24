package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCelebrityInfoResponse extends js.Object {
  
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * An array of URLs pointing to additional celebrity information. 
    */
  var Urls: js.UndefOr[typings.awsSdk.rekognitionMod.Urls] = js.native
}
object GetCelebrityInfoResponse {
  
  @scala.inline
  def apply(): GetCelebrityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCelebrityInfoResponse]
  }
  
  @scala.inline
  implicit class GetCelebrityInfoResponseOps[Self <: GetCelebrityInfoResponse] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: Url*): Self = this.set("Urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: Urls): Self = this.set("Urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("Urls", js.undefined)
  }
}
