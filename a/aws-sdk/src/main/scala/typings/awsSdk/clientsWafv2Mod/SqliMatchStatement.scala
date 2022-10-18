package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqliMatchStatement extends StObject {
  
  /**
    * The part of the web request that you want WAF to inspect. 
    */
  var FieldToMatch: typings.awsSdk.clientsWafv2Mod.FieldToMatch
  
  /**
    * The sensitivity that you want WAF to use to inspect for SQL injection attacks.   HIGH detects more attacks, but might generate more false positives, especially if your web requests frequently contain unusual strings. For information about identifying and mitigating false positives, see Testing and tuning in the WAF Developer Guide.  LOW is generally a better choice for resources that already have other protections against SQL injection attacks or that have a low tolerance for false positives.  Default: LOW 
    */
  var SensitivityLevel: js.UndefOr[typings.awsSdk.clientsWafv2Mod.SensitivityLevel] = js.undefined
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. If you specify one or more transformations in a rule statement, WAF performs all transformations on the content of the request component identified by FieldToMatch, starting from the lowest priority setting, before inspecting the content for a match.
    */
  var TextTransformations: typings.awsSdk.clientsWafv2Mod.TextTransformations
}
object SqliMatchStatement {
  
  inline def apply(FieldToMatch: FieldToMatch, TextTransformations: TextTransformations): SqliMatchStatement = {
    val __obj = js.Dynamic.literal(FieldToMatch = FieldToMatch.asInstanceOf[js.Any], TextTransformations = TextTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqliMatchStatement]
  }
  
  extension [Self <: SqliMatchStatement](x: Self) {
    
    inline def setFieldToMatch(value: FieldToMatch): Self = StObject.set(x, "FieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setSensitivityLevel(value: SensitivityLevel): Self = StObject.set(x, "SensitivityLevel", value.asInstanceOf[js.Any])
    
    inline def setSensitivityLevelUndefined: Self = StObject.set(x, "SensitivityLevel", js.undefined)
    
    inline def setTextTransformations(value: TextTransformations): Self = StObject.set(x, "TextTransformations", value.asInstanceOf[js.Any])
    
    inline def setTextTransformationsVarargs(value: TextTransformation*): Self = StObject.set(x, "TextTransformations", js.Array(value*))
  }
}
