package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsAndOperator extends StObject {
  
  /**
    * The prefix used when evaluating an AND predicate.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.undefined
  
  /**
    * The list of tags used when evaluating an AND predicate.
    */
  var Tags: js.UndefOr[TagSet] = js.undefined
}
object MetricsAndOperator {
  
  @scala.inline
  def apply(): MetricsAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsAndOperator]
  }
  
  @scala.inline
  implicit class MetricsAndOperatorMutableBuilder[Self <: MetricsAndOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setTags(value: TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
