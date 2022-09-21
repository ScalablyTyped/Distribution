package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Characters extends StObject {
  
  /**
    *  The number of characters present in the input text document as processed by Comprehend Medical. 
    */
  var OriginalTextCharacters: js.UndefOr[Integer] = js.undefined
}
object Characters {
  
  inline def apply(): Characters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Characters]
  }
  
  extension [Self <: Characters](x: Self) {
    
    inline def setOriginalTextCharacters(value: Integer): Self = StObject.set(x, "OriginalTextCharacters", value.asInstanceOf[js.Any])
    
    inline def setOriginalTextCharactersUndefined: Self = StObject.set(x, "OriginalTextCharacters", js.undefined)
  }
}
