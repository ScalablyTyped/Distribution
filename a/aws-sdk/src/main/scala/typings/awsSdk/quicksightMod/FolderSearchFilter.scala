package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderSearchFilter extends StObject {
  
  /**
    * The name of a value that you want to use in the filter. For example, "Name": "PARENT_FOLDER_ARN".
    */
  var Name: js.UndefOr[FolderFilterAttribute] = js.undefined
  
  /**
    * The comparison operator that you want to use in the filter. For example, "Operator": "StringEquals".
    */
  var Operator: js.UndefOr[FilterOperator] = js.undefined
  
  /**
    * The value of the named item (in this example, PARENT_FOLDER_ARN), that you want to use as a filter. For example, "Value": "arn:aws:quicksight:us-east-1:1:folder/folderId".
    */
  var Value: js.UndefOr[String] = js.undefined
}
object FolderSearchFilter {
  
  inline def apply(): FolderSearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderSearchFilter]
  }
  
  extension [Self <: FolderSearchFilter](x: Self) {
    
    inline def setName(value: FolderFilterAttribute): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperator(value: FilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
