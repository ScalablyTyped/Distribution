package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchDimensionConfiguration extends js.Object {
  /**
    * The default value of the dimension that is published to Amazon CloudWatch if you don't provide the value of the dimension when you send an email. This value has to meet the following criteria:   It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
    */
  var DefaultDimensionValue: typings.awsSdk.sesv2Mod.DefaultDimensionValue = js.native
  /**
    * The name of an Amazon CloudWatch dimension associated with an email sending metric. The name has to meet the following criteria:   It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
    */
  var DimensionName: typings.awsSdk.sesv2Mod.DimensionName = js.native
  /**
    * The location where the Amazon SES API v2 finds the value of a dimension to publish to Amazon CloudWatch. If you want to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail or SendRawEmail API, choose messageTag. If you want to use your own email headers, choose emailHeader. If you want to use link tags, choose linkTags.
    */
  var DimensionValueSource: typings.awsSdk.sesv2Mod.DimensionValueSource = js.native
}

object CloudWatchDimensionConfiguration {
  @scala.inline
  def apply(
    DefaultDimensionValue: DefaultDimensionValue,
    DimensionName: DimensionName,
    DimensionValueSource: DimensionValueSource
  ): CloudWatchDimensionConfiguration = {
    val __obj = js.Dynamic.literal(DefaultDimensionValue = DefaultDimensionValue.asInstanceOf[js.Any], DimensionName = DimensionName.asInstanceOf[js.Any], DimensionValueSource = DimensionValueSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudWatchDimensionConfiguration]
  }
}

