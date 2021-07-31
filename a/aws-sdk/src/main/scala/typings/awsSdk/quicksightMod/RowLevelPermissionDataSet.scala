package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowLevelPermissionDataSet extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the permission dataset.
    */
  var Arn: typings.awsSdk.quicksightMod.Arn
  
  /**
    * The namespace associated with the row-level permissions dataset.
    */
  var Namespace: js.UndefOr[typings.awsSdk.quicksightMod.Namespace] = js.undefined
  
  /**
    * Permission policy.
    */
  var PermissionPolicy: RowLevelPermissionPolicy
}
object RowLevelPermissionDataSet {
  
  @scala.inline
  def apply(Arn: Arn, PermissionPolicy: RowLevelPermissionPolicy): RowLevelPermissionDataSet = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], PermissionPolicy = PermissionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowLevelPermissionDataSet]
  }
  
  @scala.inline
  implicit class RowLevelPermissionDataSetMutableBuilder[Self <: RowLevelPermissionDataSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    @scala.inline
    def setPermissionPolicy(value: RowLevelPermissionPolicy): Self = StObject.set(x, "PermissionPolicy", value.asInstanceOf[js.Any])
  }
}
