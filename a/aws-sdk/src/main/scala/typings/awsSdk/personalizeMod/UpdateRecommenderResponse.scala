package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRecommenderResponse extends StObject {
  
  /**
    * The same recommender Amazon Resource Name (ARN) as given in the request.
    */
  var recommenderArn: js.UndefOr[Arn] = js.undefined
}
object UpdateRecommenderResponse {
  
  inline def apply(): UpdateRecommenderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRecommenderResponse]
  }
  
  extension [Self <: UpdateRecommenderResponse](x: Self) {
    
    inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
    
    inline def setRecommenderArnUndefined: Self = StObject.set(x, "recommenderArn", js.undefined)
  }
}
