package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  /**
    * Alias attached to the query, for ease of location.
    */
  var Alias: js.UndefOr[QueryInput] = js.undefined
  
  /**
    * List of pages associated with the query. The following is a list of rules for using this parameter.   If a page is not specified, it is set to ["1"] by default.   The following characters are allowed in the parameter's string: 0 1 2 3 4 5 6 7 8 9 - *. No whitespace is allowed.   When using * to indicate all pages, it must be the only element in the string.   You can use page intervals, such as [“1-3”, “1-1”, “4-*”]. Where * indicates last page of document.   Specified pages must be greater than 0 and less than or equal to the number of pages in the document.  
    */
  var Pages: js.UndefOr[QueryPages] = js.undefined
  
  /**
    * Question that Amazon Textract will apply to the document. An example would be "What is the customer's SSN?"
    */
  var Text: QueryInput
}
object Query {
  
  inline def apply(Text: QueryInput): Query = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setAlias(value: QueryInput): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setPages(value: QueryPages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "Pages", js.undefined)
    
    inline def setPagesVarargs(value: QueryPage*): Self = StObject.set(x, "Pages", js.Array(value*))
    
    inline def setText(value: QueryInput): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
