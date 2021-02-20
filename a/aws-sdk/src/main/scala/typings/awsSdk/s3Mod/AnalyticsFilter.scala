package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsFilter extends StObject {
  
  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.
    */
  var And: js.UndefOr[AnalyticsAndOperator] = js.native
  
  /**
    * The prefix to use when evaluating an analytics filter.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  
  /**
    * The tag to use when evaluating an analytics filter.
    */
  var Tag: js.UndefOr[typings.awsSdk.s3Mod.Tag] = js.native
}
object AnalyticsFilter {
  
  @scala.inline
  def apply(): AnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsFilter]
  }
  
  @scala.inline
  implicit class AnalyticsFilterMutableBuilder[Self <: AnalyticsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: AnalyticsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
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
