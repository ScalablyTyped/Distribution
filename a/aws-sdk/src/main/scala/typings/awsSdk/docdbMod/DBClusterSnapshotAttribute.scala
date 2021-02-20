package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterSnapshotAttribute extends StObject {
  
  /**
    * The name of the manual cluster snapshot attribute. The attribute named restore refers to the list of AWS accounts that have permission to copy or restore the manual cluster snapshot.
    */
  var AttributeName: js.UndefOr[String] = js.native
  
  /**
    * The values for the manual cluster snapshot attribute. If the AttributeName field is set to restore, then this element returns a list of IDs of the AWS accounts that are authorized to copy or restore the manual cluster snapshot. If a value of all is in the list, then the manual cluster snapshot is public and available for any AWS account to copy or restore.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.native
}
object DBClusterSnapshotAttribute {
  
  @scala.inline
  def apply(): DBClusterSnapshotAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotAttribute]
  }
  
  @scala.inline
  implicit class DBClusterSnapshotAttributeMutableBuilder[Self <: DBClusterSnapshotAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setAttributeValues(value: AttributeValueList): Self = StObject.set(x, "AttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValuesUndefined: Self = StObject.set(x, "AttributeValues", js.undefined)
    
    @scala.inline
    def setAttributeValuesVarargs(value: String*): Self = StObject.set(x, "AttributeValues", js.Array(value :_*))
  }
}
