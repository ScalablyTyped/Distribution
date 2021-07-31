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
  var DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * A string that describes the changes and features that will be applied to the cluster when it is updated to the corresponding ClusterDbRevision.
    */
  var Description: js.UndefOr[String] = js.undefined
}
object RevisionTarget {
  
  @scala.inline
  def apply(): RevisionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionTarget]
  }
  
  @scala.inline
  implicit class RevisionTargetMutableBuilder[Self <: RevisionTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseRevision(value: String): Self = StObject.set(x, "DatabaseRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseRevisionReleaseDate(value: TStamp): Self = StObject.set(x, "DatabaseRevisionReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseRevisionReleaseDateUndefined: Self = StObject.set(x, "DatabaseRevisionReleaseDate", js.undefined)
    
    @scala.inline
    def setDatabaseRevisionUndefined: Self = StObject.set(x, "DatabaseRevision", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
