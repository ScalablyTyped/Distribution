package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexMatchStatement extends StObject {
  
  /**
    * The part of the web request that you want WAF to inspect. 
    */
  var FieldToMatch: typings.awsSdk.clientsWafv2Mod.FieldToMatch
  
  /**
    * The string representing the regular expression.
    */
  var RegexString: RegexPatternString
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. If you specify one or more transformations in a rule statement, WAF performs all transformations on the content of the request component identified by FieldToMatch, starting from the lowest priority setting, before inspecting the content for a match.
    */
  var TextTransformations: typings.awsSdk.clientsWafv2Mod.TextTransformations
}
object RegexMatchStatement {
  
  inline def apply(
    FieldToMatch: FieldToMatch,
    RegexString: RegexPatternString,
    TextTransformations: TextTransformations
  ): RegexMatchStatement = {
    val __obj = js.Dynamic.literal(FieldToMatch = FieldToMatch.asInstanceOf[js.Any], RegexString = RegexString.asInstanceOf[js.Any], TextTransformations = TextTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegexMatchStatement] (val x: Self) extends AnyVal {
    
    inline def setFieldToMatch(value: FieldToMatch): Self = StObject.set(x, "FieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setRegexString(value: RegexPatternString): Self = StObject.set(x, "RegexString", value.asInstanceOf[js.Any])
    
    inline def setTextTransformations(value: TextTransformations): Self = StObject.set(x, "TextTransformations", value.asInstanceOf[js.Any])
    
    inline def setTextTransformationsVarargs(value: TextTransformation*): Self = StObject.set(x, "TextTransformations", js.Array(value*))
  }
}
