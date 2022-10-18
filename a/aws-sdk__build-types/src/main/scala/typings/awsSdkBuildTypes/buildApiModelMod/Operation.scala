package typings.awsSdkBuildTypes.buildApiModelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  var authtype: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion */ Any
  ] = js.undefined
  
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  
  var documentationUrl: js.UndefOr[java.lang.String] = js.undefined
  
  var errors: js.UndefOr[js.Array[StructureMember]] = js.undefined
  
  var http: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpTrait */ Any
  
  var input: js.UndefOr[StructureMember] = js.undefined
  
  var name: java.lang.String
  
  var output: js.UndefOr[StructureMember] = js.undefined
}
object Operation {
  
  inline def apply(
    http: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpTrait */ Any,
    name: java.lang.String
  ): Operation = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setAuthtype(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion */ Any
    ): Self = StObject.set(x, "authtype", value.asInstanceOf[js.Any])
    
    inline def setAuthtypeUndefined: Self = StObject.set(x, "authtype", js.undefined)
    
    inline def setDeprecated(value: scala.Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDocumentation(value: java.lang.String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationUrl(value: java.lang.String): Self = StObject.set(x, "documentationUrl", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUrlUndefined: Self = StObject.set(x, "documentationUrl", js.undefined)
    
    inline def setErrors(value: js.Array[StructureMember]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: StructureMember*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setHttp(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpTrait */ Any
    ): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setInput(value: StructureMember): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: StructureMember): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
