package typings.azureKustoData

import org.scalablytyped.runtime.StringDictionary
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcKustoTrustedEndpointsMod {
  
  @JSImport("azure-kusto-data/types/src/kustoTrustedEndpoints", "FastSuffixMatcher")
  @js.native
  open class FastSuffixMatcher () extends StObject {
    def this(rules: js.Array[MatchRule]) = this()
    
    var _suffixLength: Double = js.native
    
    def isMatch(candidate: String): Boolean = js.native
    
    var rules: StringDictionary[js.Array[MatchRule]] = js.native
  }
  /* static members */
  object FastSuffixMatcher {
    
    @JSImport("azure-kusto-data/types/src/kustoTrustedEndpoints", "FastSuffixMatcher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromExisting(): FastSuffixMatcher | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromExisting")().asInstanceOf[FastSuffixMatcher | Null]
    inline def createFromExisting(existing: Null, rules: js.Array[MatchRule]): FastSuffixMatcher | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromExisting")(existing.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[FastSuffixMatcher | Null]
    inline def createFromExisting(existing: FastSuffixMatcher): FastSuffixMatcher | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromExisting")(existing.asInstanceOf[js.Any]).asInstanceOf[FastSuffixMatcher | Null]
    inline def createFromExisting(existing: FastSuffixMatcher, rules: js.Array[MatchRule]): FastSuffixMatcher | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromExisting")(existing.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[FastSuffixMatcher | Null]
  }
  
  @JSImport("azure-kusto-data/types/src/kustoTrustedEndpoints", "MatchRule")
  @js.native
  open class MatchRule protected () extends StObject {
    def this(
      /**
      * The suffix which the candidate must end with in order to match.
      */
    suffix: String,
      /**
      * Indicates whether the match must be exact (the candidate must
      * not have any prefix) or not.
      */
    exact: Boolean
    ) = this()
    
    /**
      * Indicates whether the match must be exact (the candidate must
      * not have any prefix) or not.
      */
    var exact: Boolean = js.native
    
    /**
      * The suffix which the candidate must end with in order to match.
      */
    var suffix: String = js.native
  }
  
  @JSImport("azure-kusto-data/types/src/kustoTrustedEndpoints", "kustoTrustedEndpoints")
  @js.native
  val kustoTrustedEndpoints: KustoTrustedEndpointsImpl = js.native
  
  @js.native
  trait KustoTrustedEndpointsImpl extends StObject {
    
    def _isLocalAddress(host: String): Boolean = js.native
    
    def _validateHostnameIsTrusted(hostname: String, loginEndpoint: String): Unit = js.native
    
    def addTrustedHosts(rules: js.Array[MatchRule], replace: Boolean): Unit = js.native
    def addTrustedHosts(rules: Null, replace: Boolean): Unit = js.native
    
    var additionalMatcher: FastSuffixMatcher | Null = js.native
    
    var matchers: StringDictionary[FastSuffixMatcher] = js.native
    
    var overrideMatcher: (js.Function1[/* host */ String, Boolean]) | Null = js.native
    
    def setOverridePolicy(): Unit = js.native
    def setOverridePolicy(matcher: js.Function1[/* host */ String, Boolean]): Unit = js.native
    
    def validateTrustedEndpoint(url: String, loginEndpoint: String): Unit = js.native
    def validateTrustedEndpoint(url: URL, loginEndpoint: String): Unit = js.native
  }
}
