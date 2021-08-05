package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  /**
    * Possible values are: In an Occurrences.lineRanges array, the number of lines from the beginning of the file to the end of the sensitive data. In an Occurrences.offsetRanges array, the number of characters from the beginning of the file to the end of the sensitive data. In a Page object, the number of lines (lineRange) or characters (offsetRange) from the beginning of the page to the end of the sensitive data.
    */
  var end: js.UndefOr[long] = js.undefined
  
  /**
    * Possible values are: In an Occurrences.lineRanges array, the number of lines from the beginning of the file to the beginning of the sensitive data. In an Occurrences.offsetRanges array, the number of characters from the beginning of the file to the beginning of the sensitive data. In a Page object, the number of lines (lineRange) or characters (offsetRange) from the beginning of the page to the beginning of the sensitive data.
    */
  var start: js.UndefOr[long] = js.undefined
  
  /**
    * The column number for the column that contains the data, if the file contains structured data.
    */
  var startColumn: js.UndefOr[long] = js.undefined
}
object Range {
  
  inline def apply(): Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setEnd(value: long): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: long): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartColumn(value: long): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
