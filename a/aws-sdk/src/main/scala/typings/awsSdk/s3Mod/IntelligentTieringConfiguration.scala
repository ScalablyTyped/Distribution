package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntelligentTieringConfiguration extends StObject {
  
  /**
    * Specifies a bucket filter. The configuration only includes objects that meet the filter's criteria.
    */
  var Filter: js.UndefOr[IntelligentTieringFilter] = js.undefined
  
  /**
    * The ID used to identify the S3 Intelligent-Tiering configuration.
    */
  var Id: IntelligentTieringId
  
  /**
    * Specifies the status of the configuration.
    */
  var Status: IntelligentTieringStatus
  
  /**
    * Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
    */
  var Tierings: TieringList
}
object IntelligentTieringConfiguration {
  
  inline def apply(Id: IntelligentTieringId, Status: IntelligentTieringStatus, Tierings: TieringList): IntelligentTieringConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tierings = Tierings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntelligentTieringConfiguration]
  }
  
  extension [Self <: IntelligentTieringConfiguration](x: Self) {
    
    inline def setFilter(value: IntelligentTieringFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setId(value: IntelligentTieringId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: IntelligentTieringStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTierings(value: TieringList): Self = StObject.set(x, "Tierings", value.asInstanceOf[js.Any])
    
    inline def setTieringsVarargs(value: Tiering*): Self = StObject.set(x, "Tierings", js.Array(value*))
  }
}
