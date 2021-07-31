package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleRuleAndOperator extends StObject {
  
  /**
    * Prefix identifying one or more objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3controlMod.Prefix] = js.undefined
  
  /**
    * All of these tags must exist in the object's tag set in order for the rule to apply.
    */
  var Tags: js.UndefOr[S3TagSet] = js.undefined
}
object LifecycleRuleAndOperator {
  
  @scala.inline
  def apply(): LifecycleRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleRuleAndOperator]
  }
  
  @scala.inline
  implicit class LifecycleRuleAndOperatorMutableBuilder[Self <: LifecycleRuleAndOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setTags(value: S3TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: S3Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
