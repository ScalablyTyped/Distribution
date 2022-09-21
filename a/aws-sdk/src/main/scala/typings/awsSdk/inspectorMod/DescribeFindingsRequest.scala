package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFindingsRequest extends StObject {
  
  /**
    * The ARN that specifies the finding that you want to describe.
    */
  var findingArns: BatchDescribeArnList
  
  /**
    * The locale into which you want to translate a finding description, recommendation, and the short description that identifies the finding.
    */
  var locale: js.UndefOr[Locale] = js.undefined
}
object DescribeFindingsRequest {
  
  inline def apply(findingArns: BatchDescribeArnList): DescribeFindingsRequest = {
    val __obj = js.Dynamic.literal(findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFindingsRequest]
  }
  
  extension [Self <: DescribeFindingsRequest](x: Self) {
    
    inline def setFindingArns(value: BatchDescribeArnList): Self = StObject.set(x, "findingArns", value.asInstanceOf[js.Any])
    
    inline def setFindingArnsVarargs(value: Arn*): Self = StObject.set(x, "findingArns", js.Array(value*))
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
