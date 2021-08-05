package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBSnapshotAttributesMessage extends StObject {
  
  /**
    * The identifier for the DB snapshot to describe the attributes for.
    */
  var DBSnapshotIdentifier: String
}
object DescribeDBSnapshotAttributesMessage {
  
  inline def apply(DBSnapshotIdentifier: String): DescribeDBSnapshotAttributesMessage = {
    val __obj = js.Dynamic.literal(DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBSnapshotAttributesMessage]
  }
  
  extension [Self <: DescribeDBSnapshotAttributesMessage](x: Self) {
    
    inline def setDBSnapshotIdentifier(value: String): Self = StObject.set(x, "DBSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
