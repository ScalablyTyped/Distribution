package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefineAnalysisSchemeResponse extends StObject {
  
  var AnalysisScheme: AnalysisSchemeStatus = js.native
}
object DefineAnalysisSchemeResponse {
  
  @scala.inline
  def apply(AnalysisScheme: AnalysisSchemeStatus): DefineAnalysisSchemeResponse = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAnalysisSchemeResponse]
  }
  
  @scala.inline
  implicit class DefineAnalysisSchemeResponseMutableBuilder[Self <: DefineAnalysisSchemeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisScheme(value: AnalysisSchemeStatus): Self = StObject.set(x, "AnalysisScheme", value.asInstanceOf[js.Any])
  }
}
