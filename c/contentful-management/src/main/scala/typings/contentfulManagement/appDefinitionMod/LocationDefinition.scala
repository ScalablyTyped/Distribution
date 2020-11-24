package typings.contentfulManagement.appDefinitionMod

import typings.contentfulManagement.contentfulManagementStrings.`entry-field`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.contentfulManagement.appDefinitionMod.SingleLocationDefinition
  - typings.contentfulManagement.appDefinitionMod.EntryFieldLocationDefinition
*/
trait LocationDefinition extends js.Object
object LocationDefinition {
  
  @scala.inline
  def SingleLocationDefinition(location: AppLocation): LocationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationDefinition]
  }
  
  @scala.inline
  def EntryFieldLocationDefinition(fieldTypes: js.Array[FieldType], location: `entry-field`): LocationDefinition = {
    val __obj = js.Dynamic.literal(fieldTypes = fieldTypes.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationDefinition]
  }
}
