package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConflictResolution extends StObject {
  
  /**
    * How the auto-merging process should resolve conflicts between different profiles.    RECENCY: Uses the data that was most recently updated.    SOURCE: Uses the data from a specific source. For example, if a company has been aquired or two departments have merged, data from the specified source is used. If two duplicate profiles are from the same source, then RECENCY is used again.  
    */
  var ConflictResolvingModel: typings.awsSdk.customerprofilesMod.ConflictResolvingModel
  
  /**
    * The ObjectType name that is used to resolve profile merging conflicts when choosing SOURCE as the ConflictResolvingModel.
    */
  var SourceName: js.UndefOr[string1To255] = js.undefined
}
object ConflictResolution {
  
  inline def apply(ConflictResolvingModel: ConflictResolvingModel): ConflictResolution = {
    val __obj = js.Dynamic.literal(ConflictResolvingModel = ConflictResolvingModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConflictResolution]
  }
  
  extension [Self <: ConflictResolution](x: Self) {
    
    inline def setConflictResolvingModel(value: ConflictResolvingModel): Self = StObject.set(x, "ConflictResolvingModel", value.asInstanceOf[js.Any])
    
    inline def setSourceName(value: string1To255): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "SourceName", js.undefined)
  }
}
