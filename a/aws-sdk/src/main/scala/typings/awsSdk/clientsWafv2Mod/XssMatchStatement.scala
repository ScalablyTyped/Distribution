package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XssMatchStatement extends StObject {
  
  /**
    * The part of the web request that you want WAF to inspect. 
    */
  var FieldToMatch: typings.awsSdk.clientsWafv2Mod.FieldToMatch
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. If you specify one or more transformations in a rule statement, WAF performs all transformations on the content of the request component identified by FieldToMatch, starting from the lowest priority setting, before inspecting the content for a match.
    */
  var TextTransformations: typings.awsSdk.clientsWafv2Mod.TextTransformations
}
object XssMatchStatement {
  
  inline def apply(FieldToMatch: FieldToMatch, TextTransformations: TextTransformations): XssMatchStatement = {
    val __obj = js.Dynamic.literal(FieldToMatch = FieldToMatch.asInstanceOf[js.Any], TextTransformations = TextTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XssMatchStatement] (val x: Self) extends AnyVal {
    
    inline def setFieldToMatch(value: FieldToMatch): Self = StObject.set(x, "FieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setTextTransformations(value: TextTransformations): Self = StObject.set(x, "TextTransformations", value.asInstanceOf[js.Any])
    
    inline def setTextTransformationsVarargs(value: TextTransformation*): Self = StObject.set(x, "TextTransformations", js.Array(value*))
  }
}
