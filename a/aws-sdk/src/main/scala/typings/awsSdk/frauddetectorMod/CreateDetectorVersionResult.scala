package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDetectorVersionResult extends StObject {
  
  /**
    * The ID for the created version's parent detector.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  
  /**
    * The ID for the created detector. 
    */
  var detectorVersionId: js.UndefOr[nonEmptyString] = js.native
  
  /**
    * The status of the detector version.
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.native
}
object CreateDetectorVersionResult {
  
  @scala.inline
  def apply(): CreateDetectorVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDetectorVersionResult]
  }
  
  @scala.inline
  implicit class CreateDetectorVersionResultMutableBuilder[Self <: CreateDetectorVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    @scala.inline
    def setDetectorVersionId(value: nonEmptyString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionIdUndefined: Self = StObject.set(x, "detectorVersionId", js.undefined)
    
    @scala.inline
    def setStatus(value: DetectorVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
