package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExclusionsRequest extends StObject {
  
  /**
    * The list of ARNs that specify the exclusions that you want to describe.
    */
  var exclusionArns: BatchDescribeExclusionsArnList
  
  /**
    * The locale into which you want to translate the exclusion's title, description, and recommendation.
    */
  var locale: js.UndefOr[Locale] = js.undefined
}
object DescribeExclusionsRequest {
  
  @scala.inline
  def apply(exclusionArns: BatchDescribeExclusionsArnList): DescribeExclusionsRequest = {
    val __obj = js.Dynamic.literal(exclusionArns = exclusionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExclusionsRequest]
  }
  
  @scala.inline
  implicit class DescribeExclusionsRequestMutableBuilder[Self <: DescribeExclusionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusionArns(value: BatchDescribeExclusionsArnList): Self = StObject.set(x, "exclusionArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionArnsVarargs(value: Arn*): Self = StObject.set(x, "exclusionArns", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
