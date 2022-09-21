package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecommenderResponse extends StObject {
  
  /**
    * The properties of the recommender.
    */
  var recommender: js.UndefOr[Recommender] = js.undefined
}
object DescribeRecommenderResponse {
  
  inline def apply(): DescribeRecommenderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommenderResponse]
  }
  
  extension [Self <: DescribeRecommenderResponse](x: Self) {
    
    inline def setRecommender(value: Recommender): Self = StObject.set(x, "recommender", value.asInstanceOf[js.Any])
    
    inline def setRecommenderUndefined: Self = StObject.set(x, "recommender", js.undefined)
  }
}
