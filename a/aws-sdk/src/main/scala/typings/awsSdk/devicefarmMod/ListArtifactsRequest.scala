package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListArtifactsRequest extends StObject {
  
  /**
    * The run, job, suite, or test ARN.
    */
  var arn: AmazonResourceName
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The artifacts' type. Allowed values include:   FILE   LOG   SCREENSHOT  
    */
  var `type`: ArtifactCategory
}
object ListArtifactsRequest {
  
  inline def apply(arn: AmazonResourceName, `type`: ArtifactCategory): ListArtifactsRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArtifactsRequest]
  }
  
  extension [Self <: ListArtifactsRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setType(value: ArtifactCategory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
