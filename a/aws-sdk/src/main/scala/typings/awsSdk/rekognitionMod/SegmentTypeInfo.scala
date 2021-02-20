package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentTypeInfo extends StObject {
  
  /**
    * The version of the model used to detect segments.
    */
  var ModelVersion: js.UndefOr[String] = js.native
  
  /**
    * The type of a segment (technical cue or shot detection).
    */
  var Type: js.UndefOr[SegmentType] = js.native
}
object SegmentTypeInfo {
  
  @scala.inline
  def apply(): SegmentTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentTypeInfo]
  }
  
  @scala.inline
  implicit class SegmentTypeInfoMutableBuilder[Self <: SegmentTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelVersion(value: String): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    @scala.inline
    def setType(value: SegmentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
