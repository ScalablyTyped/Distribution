package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchingResource extends StObject {
  
  /**
    * The details of an S3 bucket that Amazon Macie monitors and analyzes.
    */
  var matchingBucket: js.UndefOr[MatchingBucket] = js.undefined
}
object MatchingResource {
  
  inline def apply(): MatchingResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchingResource]
  }
  
  extension [Self <: MatchingResource](x: Self) {
    
    inline def setMatchingBucket(value: MatchingBucket): Self = StObject.set(x, "matchingBucket", value.asInstanceOf[js.Any])
    
    inline def setMatchingBucketUndefined: Self = StObject.set(x, "matchingBucket", js.undefined)
  }
}
