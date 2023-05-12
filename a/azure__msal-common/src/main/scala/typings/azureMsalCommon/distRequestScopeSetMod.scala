package typings.azureMsalCommon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestScopeSetMod {
  
  @JSImport("@azure/msal-common/dist/request/ScopeSet", "ScopeSet")
  @js.native
  open class ScopeSet protected () extends StObject {
    def this(inputScopes: js.Array[String]) = this()
    
    /**
      * Appends single scope if passed
      * @param newScope
      */
    def appendScope(newScope: String): Unit = js.native
    
    /**
      * Appends multiple scopes if passed
      * @param newScopes
      */
    def appendScopes(newScopes: js.Array[String]): Unit = js.native
    
    /**
      * Returns the scopes as an array of string values
      */
    def asArray(): js.Array[String] = js.native
    
    /**
      * Check if set of scopes contains only the defaults
      */
    def containsOnlyOIDCScopes(): Boolean = js.native
    
    /**
      * Check if a given scope is present in this set of scopes.
      * @param scope
      */
    def containsScope(scope: String): Boolean = js.native
    
    /**
      * Check if a set of scopes is present in this set of scopes.
      * @param scopeSet
      */
    def containsScopeSet(scopeSet: ScopeSet): Boolean = js.native
    
    /**
      * Returns size of set of scopes.
      */
    def getScopeCount(): Double = js.native
    
    /**
      * Check if scopes intersect between this set and another.
      * @param otherScopes
      */
    def intersectingScopeSets(otherScopes: ScopeSet): Boolean = js.native
    
    /**
      * Prints scopes into a space-delimited string
      */
    def printScopes(): String = js.native
    
    /**
      * Prints scopes into a space-delimited lower-case string (used for caching)
      */
    def printScopesLowerCase(): String = js.native
    
    /**
      * Removes default scopes from set of scopes
      * Primarily used to prevent cache misses if the default scopes are not returned from the server
      */
    def removeOIDCScopes(): Unit = js.native
    
    /**
      * Removes element from set of scopes.
      * @param scope
      */
    def removeScope(scope: String): Unit = js.native
    
    /* private */ var scopes: Any = js.native
    
    /**
      * Combines an array of scopes with the current set of scopes.
      * @param otherScopes
      */
    def unionScopeSets(otherScopes: ScopeSet): Set[String] = js.native
    
    /**
      * Used to validate the scopes input parameter requested  by the developer.
      * @param {Array<string>} inputScopes - Developer requested permissions. Not all scopes are guaranteed to be included in the access token returned.
      * @param {boolean} scopesRequired - Boolean indicating whether the scopes array is required or not
      */
    /* private */ var validateInputScopes: Any = js.native
  }
  /* static members */
  object ScopeSet {
    
    @JSImport("@azure/msal-common/dist/request/ScopeSet", "ScopeSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates the set of scopes to search for in cache lookups
      * @param inputScopeString
      * @returns
      */
    inline def createSearchScopes(inputScopeString: js.Array[String]): ScopeSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createSearchScopes")(inputScopeString.asInstanceOf[js.Any]).asInstanceOf[ScopeSet]
    
    /**
      * Factory method to create ScopeSet from space-delimited string
      * @param inputScopeString
      * @param appClientId
      * @param scopesRequired
      */
    inline def fromString(inputScopeString: String): ScopeSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(inputScopeString.asInstanceOf[js.Any]).asInstanceOf[ScopeSet]
  }
}
