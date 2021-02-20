package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefineAnalysisSchemeRequest extends StObject {
  
  var AnalysisScheme: typings.awsSdk.cloudsearchMod.AnalysisScheme = js.native
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}
object DefineAnalysisSchemeRequest {
  
  @scala.inline
  def apply(AnalysisScheme: AnalysisScheme, DomainName: DomainName): DefineAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAnalysisSchemeRequest]
  }
  
  @scala.inline
  implicit class DefineAnalysisSchemeRequestMutableBuilder[Self <: DefineAnalysisSchemeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisScheme(value: AnalysisScheme): Self = StObject.set(x, "AnalysisScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
