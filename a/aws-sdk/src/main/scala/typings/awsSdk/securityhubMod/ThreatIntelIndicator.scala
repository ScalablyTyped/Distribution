package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatIntelIndicator extends js.Object {
  
  /**
    * The category of a threat intelligence indicator.
    */
  var Category: js.UndefOr[ThreatIntelIndicatorCategory] = js.native
  
  /**
    * Indicates when the most recent instance of a threat intelligence indicator was observed. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastObservedAt: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The source of the threat intelligence indicator.
    */
  var Source: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The URL to the page or site where you can get more information about the threat intelligence indicator.
    */
  var SourceUrl: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of threat intelligence indicator.
    */
  var Type: js.UndefOr[ThreatIntelIndicatorType] = js.native
  
  /**
    * The value of a threat intelligence indicator.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}
object ThreatIntelIndicator {
  
  @scala.inline
  def apply(): ThreatIntelIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatIntelIndicator]
  }
  
  @scala.inline
  implicit class ThreatIntelIndicatorOps[Self <: ThreatIntelIndicator] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: ThreatIntelIndicatorCategory): Self = this.set("Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    
    @scala.inline
    def setLastObservedAt(value: NonEmptyString): Self = this.set("LastObservedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastObservedAt: Self = this.set("LastObservedAt", js.undefined)
    
    @scala.inline
    def setSource(value: NonEmptyString): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    
    @scala.inline
    def setSourceUrl(value: NonEmptyString): Self = this.set("SourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUrl: Self = this.set("SourceUrl", js.undefined)
    
    @scala.inline
    def setType(value: ThreatIntelIndicatorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
