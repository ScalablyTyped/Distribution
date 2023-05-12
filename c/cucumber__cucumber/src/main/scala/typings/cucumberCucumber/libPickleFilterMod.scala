package typings.cucumberCucumber

import typings.cucumberCucumber.anon.CwdFeaturePaths
import typings.cucumberCucumber.anon.GherkinDocument
import typings.cucumberMessages.mod.Pickle
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickleFilterMod {
  
  @JSImport("@cucumber/cucumber/lib/pickle_filter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PickleFilter {
    def this(param0: IPickleFilterOptions) = this()
    
    /* private */ /* CompleteClass */
    override val lineFilter: Any = js.native
    
    /* CompleteClass */
    override def matches(param0: GherkinDocument): Boolean = js.native
    
    /* private */ /* CompleteClass */
    override val nameFilter: Any = js.native
    
    /* private */ /* CompleteClass */
    override val tagFilter: Any = js.native
  }
  
  @JSImport("@cucumber/cucumber/lib/pickle_filter", "PickleLineFilter")
  @js.native
  open class PickleLineFilter protected () extends StObject {
    def this(cwd: String) = this()
    def this(cwd: String, featurePaths: js.Array[String]) = this()
    
    /* private */ val featureUriToLinesMapping: Any = js.native
    
    def getFeatureUriToLinesMapping(param0: CwdFeaturePaths): Record[String, js.Array[Double]] = js.native
    
    def matchesAnyLine(param0: IMatchesAnyLineRequest): Boolean = js.native
  }
  
  @JSImport("@cucumber/cucumber/lib/pickle_filter", "PickleNameFilter")
  @js.native
  open class PickleNameFilter () extends StObject {
    def this(names: js.Array[String]) = this()
    
    def matchesAnyName(pickle: Pickle): Boolean = js.native
    
    /* private */ val names: Any = js.native
  }
  
  @JSImport("@cucumber/cucumber/lib/pickle_filter", "PickleTagFilter")
  @js.native
  open class PickleTagFilter protected () extends StObject {
    def this(tagExpression: String) = this()
    
    def matchesAllTagExpressions(pickle: Pickle): Boolean = js.native
    
    /* private */ val tagExpressionNode: Any = js.native
  }
  
  trait IMatchesAnyLineRequest extends StObject {
    
    var gherkinDocument: typings.cucumberMessages.mod.GherkinDocument
    
    var pickle: Pickle
  }
  object IMatchesAnyLineRequest {
    
    inline def apply(gherkinDocument: typings.cucumberMessages.mod.GherkinDocument, pickle: Pickle): IMatchesAnyLineRequest = {
      val __obj = js.Dynamic.literal(gherkinDocument = gherkinDocument.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMatchesAnyLineRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMatchesAnyLineRequest] (val x: Self) extends AnyVal {
      
      inline def setGherkinDocument(value: typings.cucumberMessages.mod.GherkinDocument): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPickleFilterOptions extends StObject {
    
    var cwd: String
    
    var featurePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var names: js.UndefOr[js.Array[String]] = js.undefined
    
    var tagExpression: js.UndefOr[String] = js.undefined
  }
  object IPickleFilterOptions {
    
    inline def apply(cwd: String): IPickleFilterOptions = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickleFilterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPickleFilterOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setFeaturePaths(value: js.Array[String]): Self = StObject.set(x, "featurePaths", value.asInstanceOf[js.Any])
      
      inline def setFeaturePathsUndefined: Self = StObject.set(x, "featurePaths", js.undefined)
      
      inline def setFeaturePathsVarargs(value: String*): Self = StObject.set(x, "featurePaths", js.Array(value*))
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setTagExpression(value: String): Self = StObject.set(x, "tagExpression", value.asInstanceOf[js.Any])
      
      inline def setTagExpressionUndefined: Self = StObject.set(x, "tagExpression", js.undefined)
    }
  }
  
  trait PickleFilter extends StObject {
    
    /* private */ val lineFilter: Any
    
    def matches(param0: GherkinDocument): Boolean
    
    /* private */ val nameFilter: Any
    
    /* private */ val tagFilter: Any
  }
  object PickleFilter {
    
    inline def apply(lineFilter: Any, matches: GherkinDocument => Boolean, nameFilter: Any, tagFilter: Any): PickleFilter = {
      val __obj = js.Dynamic.literal(lineFilter = lineFilter.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), nameFilter = nameFilter.asInstanceOf[js.Any], tagFilter = tagFilter.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickleFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickleFilter] (val x: Self) extends AnyVal {
      
      inline def setLineFilter(value: Any): Self = StObject.set(x, "lineFilter", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: GherkinDocument => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      inline def setNameFilter(value: Any): Self = StObject.set(x, "nameFilter", value.asInstanceOf[js.Any])
      
      inline def setTagFilter(value: Any): Self = StObject.set(x, "tagFilter", value.asInstanceOf[js.Any])
    }
  }
}
