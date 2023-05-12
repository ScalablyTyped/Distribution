package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMatch extends StObject {
  
  /**
    * Indicates whether the match is case sensitive. Defaults to false.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of path match.
    */
  var `match`: PathMatchType
}
object PathMatch {
  
  inline def apply(`match`: PathMatchType): PathMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMatch] (val x: Self) extends AnyVal {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setMatch(value: PathMatchType): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
