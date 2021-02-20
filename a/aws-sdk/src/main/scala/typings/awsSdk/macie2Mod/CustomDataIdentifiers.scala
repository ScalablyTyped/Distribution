package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDataIdentifiers extends StObject {
  
  /**
    * The custom data identifiers that detected the data, and the number of occurrences of the data that each identifier detected.
    */
  var detections: js.UndefOr[CustomDetections] = js.native
  
  /**
    * The total number of occurrences of the data that was detected by the custom data identifiers and produced the finding.
    */
  var totalCount: js.UndefOr[long] = js.native
}
object CustomDataIdentifiers {
  
  @scala.inline
  def apply(): CustomDataIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDataIdentifiers]
  }
  
  @scala.inline
  implicit class CustomDataIdentifiersMutableBuilder[Self <: CustomDataIdentifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetections(value: CustomDetections): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectionsUndefined: Self = StObject.set(x, "detections", js.undefined)
    
    @scala.inline
    def setDetectionsVarargs(value: CustomDetection*): Self = StObject.set(x, "detections", js.Array(value :_*))
    
    @scala.inline
    def setTotalCount(value: long): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
