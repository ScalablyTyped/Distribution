package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexPatternSet extends StObject {
  
  /**
    * A friendly name or description of the RegexPatternSet. You can't change Name after you create a RegexPatternSet.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The identifier for the RegexPatternSet. You use RegexPatternSetId to get information about a RegexPatternSet, update a RegexPatternSet, remove a RegexPatternSet from a RegexMatchSet, and delete a RegexPatternSet from AWS WAF.  RegexMatchSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId
  
  /**
    * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such as B[a@]dB[o0]t.
    */
  var RegexPatternStrings: typings.awsSdk.wafregionalMod.RegexPatternStrings
}
object RegexPatternSet {
  
  inline def apply(RegexPatternSetId: ResourceId, RegexPatternStrings: RegexPatternStrings): RegexPatternSet = {
    val __obj = js.Dynamic.literal(RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any], RegexPatternStrings = RegexPatternStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSet]
  }
  
  extension [Self <: RegexPatternSet](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRegexPatternSetId(value: ResourceId): Self = StObject.set(x, "RegexPatternSetId", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternStrings(value: RegexPatternStrings): Self = StObject.set(x, "RegexPatternStrings", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternStringsVarargs(value: RegexPatternString*): Self = StObject.set(x, "RegexPatternStrings", js.Array(value :_*))
  }
}
