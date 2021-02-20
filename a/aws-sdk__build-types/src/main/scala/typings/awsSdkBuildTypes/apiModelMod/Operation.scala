package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends StObject {
  
  var authtype: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion */ js.Any
  ] = js.native
  
  var deprecated: js.UndefOr[scala.Boolean] = js.native
  
  var documentation: js.UndefOr[java.lang.String] = js.native
  
  var documentationUrl: js.UndefOr[java.lang.String] = js.native
  
  var errors: js.UndefOr[js.Array[StructureMember]] = js.native
  
  var http: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpTrait */ js.Any = js.native
  
  var input: js.UndefOr[StructureMember] = js.native
  
  var name: java.lang.String = js.native
  
  var output: js.UndefOr[StructureMember] = js.native
}
object Operation {
  
  @scala.inline
  def apply(
    http: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpTrait */ js.Any,
    name: java.lang.String
  ): Operation = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthtype(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion */ js.Any
    ): Self = StObject.set(x, "authtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthtypeUndefined: Self = StObject.set(x, "authtype", js.undefined)
    
    @scala.inline
    def setDeprecated(value: scala.Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDocumentation(value: java.lang.String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setDocumentationUrl(value: java.lang.String): Self = StObject.set(x, "documentationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUrlUndefined: Self = StObject.set(x, "documentationUrl", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[StructureMember]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: StructureMember*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setHttp(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpTrait */ js.Any
    ): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: StructureMember): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: StructureMember): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
