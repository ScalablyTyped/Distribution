package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterSnapshotAttributesResult extends StObject {
  
  /**
    * The list of attributes and values for the cluster snapshot.
    */
  var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.undefined
  
  /**
    * The identifier of the cluster snapshot that the attributes apply to.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
}
object DBClusterSnapshotAttributesResult {
  
  @scala.inline
  def apply(): DBClusterSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotAttributesResult]
  }
  
  @scala.inline
  implicit class DBClusterSnapshotAttributesResultMutableBuilder[Self <: DBClusterSnapshotAttributesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterSnapshotAttributes(value: DBClusterSnapshotAttributeList): Self = StObject.set(x, "DBClusterSnapshotAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotAttributesUndefined: Self = StObject.set(x, "DBClusterSnapshotAttributes", js.undefined)
    
    @scala.inline
    def setDBClusterSnapshotAttributesVarargs(value: DBClusterSnapshotAttribute*): Self = StObject.set(x, "DBClusterSnapshotAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "DBClusterSnapshotIdentifier", js.undefined)
  }
}
