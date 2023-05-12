package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LendingField extends StObject {
  
  var KeyDetection: js.UndefOr[LendingDetection] = js.undefined
  
  /**
    * The type of the lending document.
    */
  var Type: js.UndefOr[String] = js.undefined
  
  /**
    * An array of LendingDetection objects.
    */
  var ValueDetections: js.UndefOr[LendingDetectionList] = js.undefined
}
object LendingField {
  
  inline def apply(): LendingField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LendingField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LendingField] (val x: Self) extends AnyVal {
    
    inline def setKeyDetection(value: LendingDetection): Self = StObject.set(x, "KeyDetection", value.asInstanceOf[js.Any])
    
    inline def setKeyDetectionUndefined: Self = StObject.set(x, "KeyDetection", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValueDetections(value: LendingDetectionList): Self = StObject.set(x, "ValueDetections", value.asInstanceOf[js.Any])
    
    inline def setValueDetectionsUndefined: Self = StObject.set(x, "ValueDetections", js.undefined)
    
    inline def setValueDetectionsVarargs(value: LendingDetection*): Self = StObject.set(x, "ValueDetections", js.Array(value*))
  }
}
