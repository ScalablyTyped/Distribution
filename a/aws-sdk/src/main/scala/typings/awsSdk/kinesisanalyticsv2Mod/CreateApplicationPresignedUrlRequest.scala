package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationPresignedUrlRequest extends js.Object {
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  
  /**
    * The duration in seconds for which the returned URL will be valid.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SessionExpirationDurationInSeconds] = js.native
  
  /**
    * The type of the extension for which to create and return a URL. Currently, the only valid extension URL type is FLINK_DASHBOARD_URL. 
    */
  var UrlType: typings.awsSdk.kinesisanalyticsv2Mod.UrlType = js.native
}
object CreateApplicationPresignedUrlRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, UrlType: UrlType): CreateApplicationPresignedUrlRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], UrlType = UrlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationPresignedUrlRequest]
  }
  
  @scala.inline
  implicit class CreateApplicationPresignedUrlRequestOps[Self <: CreateApplicationPresignedUrlRequest] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlType(value: UrlType): Self = this.set("UrlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionExpirationDurationInSeconds(value: SessionExpirationDurationInSeconds): Self = this.set("SessionExpirationDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionExpirationDurationInSeconds: Self = this.set("SessionExpirationDurationInSeconds", js.undefined)
  }
}
