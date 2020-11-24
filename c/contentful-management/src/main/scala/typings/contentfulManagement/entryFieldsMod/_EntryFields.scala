package typings.contentfulManagement.entryFieldsMod

import typings.contentfulManagement.contentfulManagementStrings.Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _EntryFields extends js.Object
object _EntryFields {
  
  @scala.inline
  def Integer(`type`: typings.contentfulManagement.contentfulManagementStrings.Integer): _EntryFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EntryFields]
  }
  
  @scala.inline
  def Text(`type`: typings.contentfulManagement.contentfulManagementStrings.Text): _EntryFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EntryFields]
  }
  
  @scala.inline
  def Date(`type`: typings.contentfulManagement.contentfulManagementStrings.Date): _EntryFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EntryFields]
  }
  
  @scala.inline
  def Location(`type`: typings.contentfulManagement.contentfulManagementStrings.Location): _EntryFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EntryFields]
  }
  
  @scala.inline
  def Array(
    items: Entry | Asset | js.Symbol,
    `type`: typings.contentfulManagement.contentfulManagementStrings.Array
  ): _EntryFields = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EntryFields]
  }
  
  @scala.inline
  def Entry(linkType: typings.contentfulManagement.contentfulManagementStrings.Entry, `type`: Link): _EntryFields = {
    val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EntryFields]
  }
  
  @scala.inline
  def RichText(`type`: typings.contentfulManagement.contentfulManagementStrings.RichText): _EntryFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EntryFields]
  }
}
