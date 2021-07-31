package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBSnapshotAttributesResult extends StObject {
  
  /**
    * The list of attributes and values for the manual DB snapshot.
    */
  var DBSnapshotAttributes: js.UndefOr[DBSnapshotAttributeList] = js.undefined
  
  /**
    * The identifier of the manual DB snapshot that the attributes apply to.
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
}
object DBSnapshotAttributesResult {
  
  @scala.inline
  def apply(): DBSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSnapshotAttributesResult]
  }
  
  @scala.inline
  implicit class DBSnapshotAttributesResultMutableBuilder[Self <: DBSnapshotAttributesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSnapshotAttributes(value: DBSnapshotAttributeList): Self = StObject.set(x, "DBSnapshotAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSnapshotAttributesUndefined: Self = StObject.set(x, "DBSnapshotAttributes", js.undefined)
    
    @scala.inline
    def setDBSnapshotAttributesVarargs(value: DBSnapshotAttribute*): Self = StObject.set(x, "DBSnapshotAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDBSnapshotIdentifier(value: String): Self = StObject.set(x, "DBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSnapshotIdentifierUndefined: Self = StObject.set(x, "DBSnapshotIdentifier", js.undefined)
  }
}
