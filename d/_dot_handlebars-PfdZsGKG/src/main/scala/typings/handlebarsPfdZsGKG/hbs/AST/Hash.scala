package typings.handlebarsPfdZsGKG.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash
  extends StObject
     with Node {
  
  var pairs: js.Array[HashPair]
  
  @JSName("type")
  var type_Hash: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.Hash
}
object Hash {
  
  inline def apply(loc: SourceLocation, pairs: js.Array[HashPair]): Hash = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Hash")
    __obj.asInstanceOf[Hash]
  }
  
  extension [Self <: Hash](x: Self) {
    
    inline def setPairs(value: js.Array[HashPair]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
    
    inline def setPairsVarargs(value: HashPair*): Self = StObject.set(x, "pairs", js.Array(value*))
    
    inline def setType(value: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.Hash): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
