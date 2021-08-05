package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleConfiguration extends StObject {
  
  /**
    * Specifies lifecycle configuration rules for an Amazon S3 bucket. 
    */
  var Rules: typings.awsSdk.s3Mod.Rules
}
object LifecycleConfiguration {
  
  inline def apply(Rules: Rules): LifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleConfiguration]
  }
  
  extension [Self <: LifecycleConfiguration](x: Self) {
    
    inline def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
