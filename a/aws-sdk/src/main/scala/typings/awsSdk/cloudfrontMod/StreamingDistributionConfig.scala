package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingDistributionConfig extends js.Object {
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming distribution. 
    */
  var Aliases: js.UndefOr[typings.awsSdk.cloudfrontMod.Aliases] = js.native
  /**
    * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed. If the value of CallerReference is new (regardless of the content of the StreamingDistributionConfig object), CloudFront creates a new distribution. If CallerReference is a value that you already sent in a previous request to create a distribution, CloudFront returns a DistributionAlreadyExists error.
    */
  var CallerReference: String = js.native
  /**
    * Any comments you want to include about the streaming distribution. 
    */
  var Comment: String = js.native
  /**
    * Whether the streaming distribution is enabled to accept user requests for content.
    */
  var Enabled: Boolean = js.native
  /**
    * A complex type that controls whether access logs are written for the streaming distribution. 
    */
  var Logging: js.UndefOr[StreamingLoggingConfig] = js.native
  /**
    * A complex type that contains information about price class for this streaming distribution. 
    */
  var PriceClass: js.UndefOr[typings.awsSdk.cloudfrontMod.PriceClass] = js.native
  /**
    * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution. 
    */
  var S3Origin: typings.awsSdk.cloudfrontMod.S3Origin = js.native
  /**
    * A complex type that specifies any AWS accounts that you want to permit to create signed URLs for private content. If you want the distribution to use signed URLs, include this element; if you want the distribution to use public URLs, remove this element. For more information, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide. 
    */
  var TrustedSigners: typings.awsSdk.cloudfrontMod.TrustedSigners = js.native
}

object StreamingDistributionConfig {
  @scala.inline
  def apply(
    CallerReference: String,
    Comment: String,
    Enabled: Boolean,
    S3Origin: S3Origin,
    TrustedSigners: TrustedSigners
  ): StreamingDistributionConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], S3Origin = S3Origin.asInstanceOf[js.Any], TrustedSigners = TrustedSigners.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingDistributionConfig]
  }
  @scala.inline
  implicit class StreamingDistributionConfigOps[Self <: StreamingDistributionConfig] (val x: Self) extends AnyVal {
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
    def setCallerReference(value: String): Self = this.set("CallerReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Origin(value: S3Origin): Self = this.set("S3Origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustedSigners(value: TrustedSigners): Self = this.set("TrustedSigners", value.asInstanceOf[js.Any])
    @scala.inline
    def setAliases(value: Aliases): Self = this.set("Aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliases: Self = this.set("Aliases", js.undefined)
    @scala.inline
    def setLogging(value: StreamingLoggingConfig): Self = this.set("Logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("Logging", js.undefined)
    @scala.inline
    def setPriceClass(value: PriceClass): Self = this.set("PriceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriceClass: Self = this.set("PriceClass", js.undefined)
  }
  
}

