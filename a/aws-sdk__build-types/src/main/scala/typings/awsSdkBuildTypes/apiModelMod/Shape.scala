package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.blob
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.boolean
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.byte
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.character
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.double
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.float
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.integer
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.list
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.long
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.map
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.short
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.string
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.structure
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.apiModelMod.Blob
  - typings.awsSdkBuildTypes.apiModelMod.Boolean
  - typings.awsSdkBuildTypes.apiModelMod.Byte
  - typings.awsSdkBuildTypes.apiModelMod.Character
  - typings.awsSdkBuildTypes.apiModelMod.Double
  - typings.awsSdkBuildTypes.apiModelMod.Float
  - typings.awsSdkBuildTypes.apiModelMod.Integer
  - typings.awsSdkBuildTypes.apiModelMod.List
  - typings.awsSdkBuildTypes.apiModelMod.Long
  - typings.awsSdkBuildTypes.apiModelMod.Map
  - typings.awsSdkBuildTypes.apiModelMod.Short
  - typings.awsSdkBuildTypes.apiModelMod.String
  - typings.awsSdkBuildTypes.apiModelMod.Structure
  - typings.awsSdkBuildTypes.apiModelMod.Timestamp
*/
trait Shape extends js.Object

object Shape {
  @scala.inline
  def Blob(`type`: blob): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Timestamp(`type`: timestamp): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def String(`type`: string): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Boolean(`type`: boolean): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def List(member: Member, `type`: list): Shape = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Float(`type`: float): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Character(`type`: character): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Integer(`type`: integer): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Long(`type`: long): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Byte(`type`: byte): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Double(`type`: double): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Structure(members: StringDictionary[StructureMember], `type`: structure): Shape = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Map(key: Member, `type`: map, value: Member): Shape = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Short(`type`: short): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

