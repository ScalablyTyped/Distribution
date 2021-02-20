package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recommendation extends StObject {
  
  /**
    * Describes the recommended steps to take to remediate an issue identified in a finding.
    */
  var Text: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A URL to a page or site that contains information about how to remediate a finding.
    */
  var Url: js.UndefOr[NonEmptyString] = js.native
}
object Recommendation {
  
  @scala.inline
  def apply(): Recommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recommendation]
  }
  
  @scala.inline
  implicit class RecommendationMutableBuilder[Self <: Recommendation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: NonEmptyString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    @scala.inline
    def setUrl(value: NonEmptyString): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
