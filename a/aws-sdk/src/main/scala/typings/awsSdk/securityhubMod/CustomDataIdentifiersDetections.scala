package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDataIdentifiersDetections extends StObject {
  
  /**
    * The ARN of the custom identifier that was used to detect the sensitive data.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The total number of occurrences of sensitive data that were detected.
    */
  var Count: js.UndefOr[Long] = js.undefined
  
  /**
    * he name of the custom identifier that detected the sensitive data.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Details about the sensitive data that was detected.
    */
  var Occurrences: js.UndefOr[typings.awsSdk.securityhubMod.Occurrences] = js.undefined
}
object CustomDataIdentifiersDetections {
  
  inline def apply(): CustomDataIdentifiersDetections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDataIdentifiersDetections]
  }
  
  extension [Self <: CustomDataIdentifiersDetections](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCount(value: Long): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOccurrences(value: Occurrences): Self = StObject.set(x, "Occurrences", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesUndefined: Self = StObject.set(x, "Occurrences", js.undefined)
  }
}
