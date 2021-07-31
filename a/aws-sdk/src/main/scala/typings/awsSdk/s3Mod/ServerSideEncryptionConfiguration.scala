package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSideEncryptionConfiguration extends StObject {
  
  /**
    * Container for information about a particular server-side encryption configuration rule.
    */
  var Rules: ServerSideEncryptionRules
}
object ServerSideEncryptionConfiguration {
  
  @scala.inline
  def apply(Rules: ServerSideEncryptionRules): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class ServerSideEncryptionConfigurationMutableBuilder[Self <: ServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: ServerSideEncryptionRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: ServerSideEncryptionRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
