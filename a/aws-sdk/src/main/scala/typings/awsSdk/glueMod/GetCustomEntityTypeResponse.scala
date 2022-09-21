package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomEntityTypeResponse extends StObject {
  
  /**
    * A list of context words if specified when you created the custom pattern. If none of these context words are found within the vicinity of the regular expression the data will not be detected as sensitive data.
    */
  var ContextWords: js.UndefOr[typings.awsSdk.glueMod.ContextWords] = js.undefined
  
  /**
    * The name of the custom pattern that you retrieved.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * A regular expression string that is used for detecting sensitive data in a custom pattern.
    */
  var RegexString: js.UndefOr[NameString] = js.undefined
}
object GetCustomEntityTypeResponse {
  
  inline def apply(): GetCustomEntityTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomEntityTypeResponse]
  }
  
  extension [Self <: GetCustomEntityTypeResponse](x: Self) {
    
    inline def setContextWords(value: ContextWords): Self = StObject.set(x, "ContextWords", value.asInstanceOf[js.Any])
    
    inline def setContextWordsUndefined: Self = StObject.set(x, "ContextWords", js.undefined)
    
    inline def setContextWordsVarargs(value: NameString*): Self = StObject.set(x, "ContextWords", js.Array(value*))
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRegexString(value: NameString): Self = StObject.set(x, "RegexString", value.asInstanceOf[js.Any])
    
    inline def setRegexStringUndefined: Self = StObject.set(x, "RegexString", js.undefined)
  }
}
