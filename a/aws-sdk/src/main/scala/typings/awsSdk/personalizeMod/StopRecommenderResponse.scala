package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRecommenderResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recommender you stopped.
    */
  var recommenderArn: js.UndefOr[Arn] = js.undefined
}
object StopRecommenderResponse {
  
  inline def apply(): StopRecommenderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRecommenderResponse]
  }
  
  extension [Self <: StopRecommenderResponse](x: Self) {
    
    inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
    
    inline def setRecommenderArnUndefined: Self = StObject.set(x, "recommenderArn", js.undefined)
  }
}
