package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRulesPackagesRequest extends StObject {
  
  /**
    * The locale that you want to translate a rules package description into.
    */
  var locale: js.UndefOr[Locale] = js.undefined
  
  /**
    * The ARN that specifies the rules package that you want to describe.
    */
  var rulesPackageArns: BatchDescribeArnList
}
object DescribeRulesPackagesRequest {
  
  inline def apply(rulesPackageArns: BatchDescribeArnList): DescribeRulesPackagesRequest = {
    val __obj = js.Dynamic.literal(rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRulesPackagesRequest]
  }
  
  extension [Self <: DescribeRulesPackagesRequest](x: Self) {
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRulesPackageArns(value: BatchDescribeArnList): Self = StObject.set(x, "rulesPackageArns", value.asInstanceOf[js.Any])
    
    inline def setRulesPackageArnsVarargs(value: Arn*): Self = StObject.set(x, "rulesPackageArns", js.Array(value*))
  }
}
