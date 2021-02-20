package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashKeyRange extends StObject {
  
  /**
    * The ending hash key of the hash key range.
    */
  var EndingHashKey: HashKey = js.native
  
  /**
    * The starting hash key of the hash key range.
    */
  var StartingHashKey: HashKey = js.native
}
object HashKeyRange {
  
  @scala.inline
  def apply(EndingHashKey: HashKey, StartingHashKey: HashKey): HashKeyRange = {
    val __obj = js.Dynamic.literal(EndingHashKey = EndingHashKey.asInstanceOf[js.Any], StartingHashKey = StartingHashKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashKeyRange]
  }
  
  @scala.inline
  implicit class HashKeyRangeMutableBuilder[Self <: HashKeyRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndingHashKey(value: HashKey): Self = StObject.set(x, "EndingHashKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingHashKey(value: HashKey): Self = StObject.set(x, "StartingHashKey", value.asInstanceOf[js.Any])
  }
}
