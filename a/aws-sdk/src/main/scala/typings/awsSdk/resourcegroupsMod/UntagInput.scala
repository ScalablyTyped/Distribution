package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagInput extends StObject {
  
  /**
    * The ARN of the resource group from which to remove tags. The command removed both the specified keys and any values associated with those keys.
    */
  var Arn: GroupArn
  
  /**
    * The keys of the tags to be removed.
    */
  var Keys: TagKeyList
}
object UntagInput {
  
  inline def apply(Arn: GroupArn, Keys: TagKeyList): UntagInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagInput]
  }
  
  extension [Self <: UntagInput](x: Self) {
    
    inline def setArn(value: GroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: TagKeyList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: TagKey*): Self = StObject.set(x, "Keys", js.Array(value*))
  }
}
