package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQualificationScoreResponse extends StObject {
  
  /**
    *  The Qualification data structure of the Qualification assigned to a user, including the Qualification type and the value (score). 
    */
  var Qualification: js.UndefOr[typings.awsSdk.mturkMod.Qualification] = js.native
}
object GetQualificationScoreResponse {
  
  @scala.inline
  def apply(): GetQualificationScoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQualificationScoreResponse]
  }
  
  @scala.inline
  implicit class GetQualificationScoreResponseMutableBuilder[Self <: GetQualificationScoreResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQualification(value: Qualification): Self = StObject.set(x, "Qualification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationUndefined: Self = StObject.set(x, "Qualification", js.undefined)
  }
}
