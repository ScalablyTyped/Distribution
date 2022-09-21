package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPolicyViolationEventInit
  extends StObject
     with EventInit {
  
  var blockedURI: js.UndefOr[java.lang.String] = js.undefined
  
  var columnNumber: js.UndefOr[Double] = js.undefined
  
  var disposition: SecurityPolicyViolationEventDisposition
  
  var documentURI: java.lang.String
  
  var effectiveDirective: java.lang.String
  
  var lineNumber: js.UndefOr[Double] = js.undefined
  
  var originalPolicy: java.lang.String
  
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  
  var sample: js.UndefOr[java.lang.String] = js.undefined
  
  var sourceFile: js.UndefOr[java.lang.String] = js.undefined
  
  var statusCode: Double
  
  var violatedDirective: java.lang.String
}
object SecurityPolicyViolationEventInit {
  
  inline def apply(
    disposition: SecurityPolicyViolationEventDisposition,
    documentURI: java.lang.String,
    effectiveDirective: java.lang.String,
    originalPolicy: java.lang.String,
    statusCode: Double,
    violatedDirective: java.lang.String
  ): SecurityPolicyViolationEventInit = {
    val __obj = js.Dynamic.literal(disposition = disposition.asInstanceOf[js.Any], documentURI = documentURI.asInstanceOf[js.Any], effectiveDirective = effectiveDirective.asInstanceOf[js.Any], originalPolicy = originalPolicy.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], violatedDirective = violatedDirective.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPolicyViolationEventInit]
  }
  
  extension [Self <: SecurityPolicyViolationEventInit](x: Self) {
    
    inline def setBlockedURI(value: java.lang.String): Self = StObject.set(x, "blockedURI", value.asInstanceOf[js.Any])
    
    inline def setBlockedURIUndefined: Self = StObject.set(x, "blockedURI", js.undefined)
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    inline def setDisposition(value: SecurityPolicyViolationEventDisposition): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDocumentURI(value: java.lang.String): Self = StObject.set(x, "documentURI", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDirective(value: java.lang.String): Self = StObject.set(x, "effectiveDirective", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setOriginalPolicy(value: java.lang.String): Self = StObject.set(x, "originalPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrer(value: java.lang.String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setSample(value: java.lang.String): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    
    inline def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
    
    inline def setSourceFile(value: java.lang.String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setViolatedDirective(value: java.lang.String): Self = StObject.set(x, "violatedDirective", value.asInstanceOf[js.Any])
  }
}
