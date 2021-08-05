package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashKeyRange extends StObject {
  
  /**
    * The ending hash key of the hash key range.
    */
  var EndingHashKey: HashKey
  
  /**
    * The starting hash key of the hash key range.
    */
  var StartingHashKey: HashKey
}
object HashKeyRange {
  
  inline def apply(EndingHashKey: HashKey, StartingHashKey: HashKey): HashKeyRange = {
    val __obj = js.Dynamic.literal(EndingHashKey = EndingHashKey.asInstanceOf[js.Any], StartingHashKey = StartingHashKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashKeyRange]
  }
  
  extension [Self <: HashKeyRange](x: Self) {
    
    inline def setEndingHashKey(value: HashKey): Self = StObject.set(x, "EndingHashKey", value.asInstanceOf[js.Any])
    
    inline def setStartingHashKey(value: HashKey): Self = StObject.set(x, "StartingHashKey", value.asInstanceOf[js.Any])
  }
}
