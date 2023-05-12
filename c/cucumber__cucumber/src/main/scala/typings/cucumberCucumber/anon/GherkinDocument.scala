package typings.cucumberCucumber.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GherkinDocument extends StObject {
  
  var gherkinDocument: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGherkinDocument */ Any
  
  var pickle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPickle */ Any
}
object GherkinDocument {
  
  inline def apply(
    gherkinDocument: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGherkinDocument */ Any,
    pickle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPickle */ Any
  ): GherkinDocument = {
    val __obj = js.Dynamic.literal(gherkinDocument = gherkinDocument.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GherkinDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GherkinDocument] (val x: Self) extends AnyVal {
    
    inline def setGherkinDocument(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGherkinDocument */ Any
    ): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
    
    inline def setPickle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPickle */ Any
    ): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
  }
}
