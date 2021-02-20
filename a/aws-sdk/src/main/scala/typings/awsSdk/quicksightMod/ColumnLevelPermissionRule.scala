package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnLevelPermissionRule extends StObject {
  
  /**
    * An array of column names.
    */
  var ColumnNames: js.UndefOr[ColumnNameList] = js.native
  
  /**
    * An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
    */
  var Principals: js.UndefOr[PrincipalList] = js.native
}
object ColumnLevelPermissionRule {
  
  @scala.inline
  def apply(): ColumnLevelPermissionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnLevelPermissionRule]
  }
  
  @scala.inline
  implicit class ColumnLevelPermissionRuleMutableBuilder[Self <: ColumnLevelPermissionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNames(value: ColumnNameList): Self = StObject.set(x, "ColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNamesUndefined: Self = StObject.set(x, "ColumnNames", js.undefined)
    
    @scala.inline
    def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "ColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: PrincipalList): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsUndefined: Self = StObject.set(x, "Principals", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: String*): Self = StObject.set(x, "Principals", js.Array(value :_*))
  }
}
