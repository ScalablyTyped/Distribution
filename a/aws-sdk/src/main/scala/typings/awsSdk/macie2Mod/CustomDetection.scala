package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDetection extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom data identifier.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The total number of occurrences of the sensitive data that the custom data identifier detected.
    */
  var count: js.UndefOr[long] = js.undefined
  
  /**
    * The name of the custom data identifier.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * The location of 1-15 occurrences of the sensitive data that the custom data identifier detected. A finding includes location data for a maximum of 15 occurrences of sensitive data.
    */
  var occurrences: js.UndefOr[Occurrences] = js.undefined
}
object CustomDetection {
  
  @scala.inline
  def apply(): CustomDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDetection]
  }
  
  @scala.inline
  implicit class CustomDetectionMutableBuilder[Self <: CustomDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOccurrences(value: Occurrences): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
  }
}
