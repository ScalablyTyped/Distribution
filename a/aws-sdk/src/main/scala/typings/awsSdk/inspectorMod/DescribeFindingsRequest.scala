package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFindingsRequest extends StObject {
  
  /**
    * The ARN that specifies the finding that you want to describe.
    */
  var findingArns: BatchDescribeArnList = js.native
  
  /**
    * The locale into which you want to translate a finding description, recommendation, and the short description that identifies the finding.
    */
  var locale: js.UndefOr[Locale] = js.native
}
object DescribeFindingsRequest {
  
  @scala.inline
  def apply(findingArns: BatchDescribeArnList): DescribeFindingsRequest = {
    val __obj = js.Dynamic.literal(findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFindingsRequest]
  }
  
  @scala.inline
  implicit class DescribeFindingsRequestMutableBuilder[Self <: DescribeFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingArns(value: BatchDescribeArnList): Self = StObject.set(x, "findingArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingArnsVarargs(value: Arn*): Self = StObject.set(x, "findingArns", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
