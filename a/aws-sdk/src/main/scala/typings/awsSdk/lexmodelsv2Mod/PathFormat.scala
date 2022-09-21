package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathFormat extends StObject {
  
  /**
    * A list of Amazon S3 prefixes that points to sub-folders in the Amazon S3 bucket. Specify this list if you only want Lex to read the files under this set of sub-folders.
    */
  var objectPrefixes: js.UndefOr[ObjectPrefixes] = js.undefined
}
object PathFormat {
  
  inline def apply(): PathFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathFormat]
  }
  
  extension [Self <: PathFormat](x: Self) {
    
    inline def setObjectPrefixes(value: ObjectPrefixes): Self = StObject.set(x, "objectPrefixes", value.asInstanceOf[js.Any])
    
    inline def setObjectPrefixesUndefined: Self = StObject.set(x, "objectPrefixes", js.undefined)
    
    inline def setObjectPrefixesVarargs(value: ObjectPrefix*): Self = StObject.set(x, "objectPrefixes", js.Array(value*))
  }
}
