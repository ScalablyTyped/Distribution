package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedDataDetails extends StObject {
  
  /**
    * An occurrence of the specified type of sensitive data. Each occurrence can contain 1-128 characters.
    */
  var value: stringMin1Max128
}
object DetectedDataDetails {
  
  inline def apply(value: stringMin1Max128): DetectedDataDetails = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedDataDetails]
  }
  
  extension [Self <: DetectedDataDetails](x: Self) {
    
    inline def setValue(value: stringMin1Max128): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
