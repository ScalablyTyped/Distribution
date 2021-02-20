package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateQualificationTypeResponse extends StObject {
  
  /**
    * The created Qualification type, returned as a QualificationType data structure.
    */
  var QualificationType: js.UndefOr[typings.awsSdk.mturkMod.QualificationType] = js.native
}
object CreateQualificationTypeResponse {
  
  @scala.inline
  def apply(): CreateQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQualificationTypeResponse]
  }
  
  @scala.inline
  implicit class CreateQualificationTypeResponseMutableBuilder[Self <: CreateQualificationTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQualificationType(value: QualificationType): Self = StObject.set(x, "QualificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationTypeUndefined: Self = StObject.set(x, "QualificationType", js.undefined)
  }
}
