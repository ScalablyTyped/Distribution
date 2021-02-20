package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntelligentTieringFilter extends StObject {
  
  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.
    */
  var And: js.UndefOr[IntelligentTieringAndOperator] = js.native
  
  /**
    * An object key name prefix that identifies the subset of objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  
  var Tag: js.UndefOr[typings.awsSdk.s3Mod.Tag] = js.native
}
object IntelligentTieringFilter {
  
  @scala.inline
  def apply(): IntelligentTieringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntelligentTieringFilter]
  }
  
  @scala.inline
  implicit class IntelligentTieringFilterMutableBuilder[Self <: IntelligentTieringFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: IntelligentTieringAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
