package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterDbRevision extends StObject {
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A string representing the current cluster version.
    */
  var CurrentDatabaseRevision: js.UndefOr[String] = js.native
  
  /**
    * The date on which the database revision was released.
    */
  var DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.native
  
  /**
    * A list of RevisionTarget objects, where each object describes the database revision that a cluster can be updated to.
    */
  var RevisionTargets: js.UndefOr[RevisionTargetsList] = js.native
}
object ClusterDbRevision {
  
  @scala.inline
  def apply(): ClusterDbRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterDbRevision]
  }
  
  @scala.inline
  implicit class ClusterDbRevisionMutableBuilder[Self <: ClusterDbRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setCurrentDatabaseRevision(value: String): Self = StObject.set(x, "CurrentDatabaseRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDatabaseRevisionUndefined: Self = StObject.set(x, "CurrentDatabaseRevision", js.undefined)
    
    @scala.inline
    def setDatabaseRevisionReleaseDate(value: TStamp): Self = StObject.set(x, "DatabaseRevisionReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseRevisionReleaseDateUndefined: Self = StObject.set(x, "DatabaseRevisionReleaseDate", js.undefined)
    
    @scala.inline
    def setRevisionTargets(value: RevisionTargetsList): Self = StObject.set(x, "RevisionTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionTargetsUndefined: Self = StObject.set(x, "RevisionTargets", js.undefined)
    
    @scala.inline
    def setRevisionTargetsVarargs(value: RevisionTarget*): Self = StObject.set(x, "RevisionTargets", js.Array(value :_*))
  }
}
