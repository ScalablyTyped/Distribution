package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBClusterSnapshotAttributesMessage extends StObject {
  
  /**
    * The identifier for the DB cluster snapshot to describe the attributes for.
    */
  var DBClusterSnapshotIdentifier: String
}
object DescribeDBClusterSnapshotAttributesMessage {
  
  inline def apply(DBClusterSnapshotIdentifier: String): DescribeDBClusterSnapshotAttributesMessage = {
    val __obj = js.Dynamic.literal(DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBClusterSnapshotAttributesMessage]
  }
  
  extension [Self <: DescribeDBClusterSnapshotAttributesMessage](x: Self) {
    
    inline def setDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
