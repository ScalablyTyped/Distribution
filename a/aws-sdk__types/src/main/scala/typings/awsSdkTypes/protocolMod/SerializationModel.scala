package typings.awsSdkTypes.protocolMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.awsSdkTypesStrings.blob
import typings.awsSdkTypes.awsSdkTypesStrings.boolean
import typings.awsSdkTypes.awsSdkTypesStrings.float
import typings.awsSdkTypes.awsSdkTypesStrings.integer
import typings.awsSdkTypes.awsSdkTypesStrings.list
import typings.awsSdkTypes.awsSdkTypesStrings.map
import typings.awsSdkTypes.awsSdkTypesStrings.string
import typings.awsSdkTypes.awsSdkTypesStrings.structure
import typings.awsSdkTypes.awsSdkTypesStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkTypes.protocolMod.Blob
  - typings.awsSdkTypes.protocolMod.Boolean
  - typings.awsSdkTypes.protocolMod.Float
  - typings.awsSdkTypes.protocolMod.Integer
  - typings.awsSdkTypes.protocolMod.List
  - typings.awsSdkTypes.protocolMod.Map
  - typings.awsSdkTypes.protocolMod.String
  - typings.awsSdkTypes.protocolMod.Structure
  - typings.awsSdkTypes.protocolMod.Timestamp
*/
trait SerializationModel extends js.Object

object SerializationModel {
  @scala.inline
  def Timestamp(`type`: timestamp): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Structure(members: StringDictionary[Member], required: js.Array[java.lang.String], `type`: structure): SerializationModel = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Blob(`type`: blob): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Map(key: Member, `type`: map, value: Member): SerializationModel = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Integer(`type`: integer): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Boolean(`type`: boolean): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def String(`type`: string): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def List(member: Member, `type`: list): SerializationModel = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Float(`type`: float): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
}

