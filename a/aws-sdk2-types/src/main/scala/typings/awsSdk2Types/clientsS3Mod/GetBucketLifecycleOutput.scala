package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketLifecycleOutput extends StObject {
  
  /**
    * Container for a lifecycle rule.
    */
  var Rules: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Rules] = js.undefined
}
object GetBucketLifecycleOutput {
  
  inline def apply(): GetBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLifecycleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketLifecycleOutput] (val x: Self) extends AnyVal {
    
    inline def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
