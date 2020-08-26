package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVoicesInput extends js.Object {
  /**
    * Specifies the engine (standard or neural) used by Amazon Polly when processing input text for speech synthesis. 
    */
  var Engine: js.UndefOr[typings.awsSdk.pollyMod.Engine] = js.native
  /**
    * Boolean value indicating whether to return any bilingual voices that use the specified language as an additional language. For instance, if you request all languages that use US English (es-US), and there is an Italian voice that speaks both Italian (it-IT) and US English, that voice will be included if you specify yes but not if you specify no.
    */
  var IncludeAdditionalLanguageCodes: js.UndefOr[typings.awsSdk.pollyMod.IncludeAdditionalLanguageCodes] = js.native
  /**
    *  The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list of voices returned. If you don't specify this optional parameter, all available voices are returned. 
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.pollyMod.LanguageCode] = js.native
  /**
    * An opaque pagination token returned from the previous DescribeVoices operation. If present, this indicates where to continue the listing.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.native
}

object DescribeVoicesInput {
  @scala.inline
  def apply(): DescribeVoicesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVoicesInput]
  }
  @scala.inline
  implicit class DescribeVoicesInputOps[Self <: DescribeVoicesInput] (val x: Self) extends AnyVal {
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
    def setEngine(value: Engine): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setIncludeAdditionalLanguageCodes(value: IncludeAdditionalLanguageCodes): Self = this.set("IncludeAdditionalLanguageCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAdditionalLanguageCodes: Self = this.set("IncludeAdditionalLanguageCodes", js.undefined)
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

