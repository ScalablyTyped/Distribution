package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsAndOperator extends StObject {
  
  /**
    * The prefix to use when evaluating an AND predicate: The prefix that an object must have to be included in the metrics results.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.undefined
  
  /**
    * The list of tags to use when evaluating an AND predicate.
    */
  var Tags: js.UndefOr[TagSet] = js.undefined
}
object AnalyticsAndOperator {
  
  inline def apply(): AnalyticsAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsAndOperator]
  }
  
  extension [Self <: AnalyticsAndOperator](x: Self) {
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTags(value: TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
