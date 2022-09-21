package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterDbRevision extends StObject {
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A string representing the current cluster version.
    */
  var CurrentDatabaseRevision: js.UndefOr[String] = js.undefined
  
  /**
    * The date on which the database revision was released.
    */
  var DatabaseRevisionReleaseDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of RevisionTarget objects, where each object describes the database revision that a cluster can be updated to.
    */
  var RevisionTargets: js.UndefOr[RevisionTargetsList] = js.undefined
}
object ClusterDbRevision {
  
  inline def apply(): ClusterDbRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterDbRevision]
  }
  
  extension [Self <: ClusterDbRevision](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setCurrentDatabaseRevision(value: String): Self = StObject.set(x, "CurrentDatabaseRevision", value.asInstanceOf[js.Any])
    
    inline def setCurrentDatabaseRevisionUndefined: Self = StObject.set(x, "CurrentDatabaseRevision", js.undefined)
    
    inline def setDatabaseRevisionReleaseDate(value: js.Date): Self = StObject.set(x, "DatabaseRevisionReleaseDate", value.asInstanceOf[js.Any])
    
    inline def setDatabaseRevisionReleaseDateUndefined: Self = StObject.set(x, "DatabaseRevisionReleaseDate", js.undefined)
    
    inline def setRevisionTargets(value: RevisionTargetsList): Self = StObject.set(x, "RevisionTargets", value.asInstanceOf[js.Any])
    
    inline def setRevisionTargetsUndefined: Self = StObject.set(x, "RevisionTargets", js.undefined)
    
    inline def setRevisionTargetsVarargs(value: RevisionTarget*): Self = StObject.set(x, "RevisionTargets", js.Array(value*))
  }
}
