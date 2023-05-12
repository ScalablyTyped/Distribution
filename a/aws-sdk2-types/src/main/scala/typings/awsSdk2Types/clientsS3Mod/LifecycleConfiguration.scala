package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleConfiguration extends StObject {
  
  /**
    * Specifies lifecycle configuration rules for an Amazon S3 bucket. 
    */
  var Rules: typings.awsSdk2Types.clientsS3Mod.Rules
}
object LifecycleConfiguration {
  
  inline def apply(Rules: Rules): LifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
