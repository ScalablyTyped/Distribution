package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionTarget extends StObject {
  
  /**
    * A unique string that identifies the version to update the cluster to. You can use this value in ModifyClusterDbRevision.
    */
  var DatabaseRevision: js.UndefOr[String] = js.undefined
  
  /**
    * The date on which the database revision was released.
    */
  var DatabaseRevisionReleaseDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A string that describes the changes and features that will be applied to the cluster when it is updated to the corresponding ClusterDbRevision.
    */
  var Description: js.UndefOr[String] = js.undefined
}
object RevisionTarget {
  
  inline def apply(): RevisionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionTarget]
  }
  
  extension [Self <: RevisionTarget](x: Self) {
    
    inline def setDatabaseRevision(value: String): Self = StObject.set(x, "DatabaseRevision", value.asInstanceOf[js.Any])
    
    inline def setDatabaseRevisionReleaseDate(value: js.Date): Self = StObject.set(x, "DatabaseRevisionReleaseDate", value.asInstanceOf[js.Any])
    
    inline def setDatabaseRevisionReleaseDateUndefined: Self = StObject.set(x, "DatabaseRevisionReleaseDate", js.undefined)
    
    inline def setDatabaseRevisionUndefined: Self = StObject.set(x, "DatabaseRevision", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
