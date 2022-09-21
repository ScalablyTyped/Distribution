package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownGender extends StObject {
  
  /**
    * A string value of the KnownGender info about the Celebrity.
    */
  var Type: js.UndefOr[KnownGenderType] = js.undefined
}
object KnownGender {
  
  inline def apply(): KnownGender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownGender]
  }
  
  extension [Self <: KnownGender](x: Self) {
    
    inline def setType(value: KnownGenderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
