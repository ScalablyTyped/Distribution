package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderMatch extends StObject {
  
  /**
    * Indicates whether the match is case sensitive. Defaults to false.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The header match type.
    */
  var `match`: HeaderMatchType
  
  /**
    * The name of the header.
    */
  var name: HeaderMatchName
}
object HeaderMatch {
  
  inline def apply(`match`: HeaderMatchType, name: HeaderMatchName): HeaderMatch = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderMatch] (val x: Self) extends AnyVal {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setMatch(value: HeaderMatchType): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setName(value: HeaderMatchName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
