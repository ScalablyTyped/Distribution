package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineAnalysisSchemeRequest extends StObject {
  
  var AnalysisScheme: typings.awsSdk.cloudsearchMod.AnalysisScheme
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
}
object DefineAnalysisSchemeRequest {
  
  inline def apply(AnalysisScheme: AnalysisScheme, DomainName: DomainName): DefineAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAnalysisSchemeRequest]
  }
  
  extension [Self <: DefineAnalysisSchemeRequest](x: Self) {
    
    inline def setAnalysisScheme(value: AnalysisScheme): Self = StObject.set(x, "AnalysisScheme", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
