package typings.cucumberCucumber

import typings.cucumberCucumber.anon.Coordinates
import typings.cucumberCucumber.anon.FilteredPickles
import typings.cucumberMessages.mod.GherkinDocument
import typings.cucumberMessages.mod.Location
import typings.cucumberMessages.mod.Pickle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiGherkinMod {
  
  @JSImport("@cucumber/cucumber/lib/api/gherkin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFilteredPicklesAndErrors(param0: Coordinates): js.Promise[FilteredPickles] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilteredPicklesAndErrors")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FilteredPickles]]
  
  trait PickleWithDocument extends StObject {
    
    var gherkinDocument: GherkinDocument
    
    var location: Location
    
    var pickle: Pickle
  }
  object PickleWithDocument {
    
    inline def apply(gherkinDocument: GherkinDocument, location: Location, pickle: Pickle): PickleWithDocument = {
      val __obj = js.Dynamic.literal(gherkinDocument = gherkinDocument.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickleWithDocument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickleWithDocument] (val x: Self) extends AnyVal {
      
      inline def setGherkinDocument(value: GherkinDocument): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    }
  }
}
