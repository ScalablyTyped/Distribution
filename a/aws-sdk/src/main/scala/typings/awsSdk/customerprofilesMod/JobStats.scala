package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStats extends StObject {
  
  /**
    * The number of matches found.
    */
  var NumberOfMatchesFound: js.UndefOr[long] = js.undefined
  
  /**
    * The number of merges completed.
    */
  var NumberOfMergesDone: js.UndefOr[long] = js.undefined
  
  /**
    * The number of profiles reviewed.
    */
  var NumberOfProfilesReviewed: js.UndefOr[long] = js.undefined
}
object JobStats {
  
  inline def apply(): JobStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStats]
  }
  
  extension [Self <: JobStats](x: Self) {
    
    inline def setNumberOfMatchesFound(value: long): Self = StObject.set(x, "NumberOfMatchesFound", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMatchesFoundUndefined: Self = StObject.set(x, "NumberOfMatchesFound", js.undefined)
    
    inline def setNumberOfMergesDone(value: long): Self = StObject.set(x, "NumberOfMergesDone", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMergesDoneUndefined: Self = StObject.set(x, "NumberOfMergesDone", js.undefined)
    
    inline def setNumberOfProfilesReviewed(value: long): Self = StObject.set(x, "NumberOfProfilesReviewed", value.asInstanceOf[js.Any])
    
    inline def setNumberOfProfilesReviewedUndefined: Self = StObject.set(x, "NumberOfProfilesReviewed", js.undefined)
  }
}
