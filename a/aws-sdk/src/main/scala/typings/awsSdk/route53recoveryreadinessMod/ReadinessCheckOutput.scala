package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadinessCheckOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with a readiness check.
    */
  var ReadinessCheckArn: stringMax256
  
  /**
    * Name of a readiness check.
    */
  var ReadinessCheckName: js.UndefOr[stringMax64PatternAAZAZ09Z] = js.undefined
  
  /**
    * Name of the resource set to be checked.
    */
  var ResourceSet: stringMax64PatternAAZAZ09Z
  
  var Tags: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.Tags] = js.undefined
}
object ReadinessCheckOutput {
  
  inline def apply(ReadinessCheckArn: stringMax256, ResourceSet: stringMax64PatternAAZAZ09Z): ReadinessCheckOutput = {
    val __obj = js.Dynamic.literal(ReadinessCheckArn = ReadinessCheckArn.asInstanceOf[js.Any], ResourceSet = ResourceSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadinessCheckOutput]
  }
  
  extension [Self <: ReadinessCheckOutput](x: Self) {
    
    inline def setReadinessCheckArn(value: stringMax256): Self = StObject.set(x, "ReadinessCheckArn", value.asInstanceOf[js.Any])
    
    inline def setReadinessCheckName(value: stringMax64PatternAAZAZ09Z): Self = StObject.set(x, "ReadinessCheckName", value.asInstanceOf[js.Any])
    
    inline def setReadinessCheckNameUndefined: Self = StObject.set(x, "ReadinessCheckName", js.undefined)
    
    inline def setResourceSet(value: stringMax64PatternAAZAZ09Z): Self = StObject.set(x, "ResourceSet", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
