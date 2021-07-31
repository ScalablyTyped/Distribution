package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Shape extends StObject
object Shape {
  
  @scala.inline
  def Blob(): typings.awsSdkBuildTypes.apiModelMod.Blob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("blob")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Blob]
  }
  
  @scala.inline
  def Boolean(): typings.awsSdkBuildTypes.apiModelMod.Boolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Boolean]
  }
  
  @scala.inline
  def Byte(): typings.awsSdkBuildTypes.apiModelMod.Byte = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Byte]
  }
  
  @scala.inline
  def Character(): typings.awsSdkBuildTypes.apiModelMod.Character = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("character")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Character]
  }
  
  @scala.inline
  def Double(): typings.awsSdkBuildTypes.apiModelMod.Double = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Double]
  }
  
  @scala.inline
  def Float(): typings.awsSdkBuildTypes.apiModelMod.Float = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Float]
  }
  
  @scala.inline
  def Integer(): typings.awsSdkBuildTypes.apiModelMod.Integer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Integer]
  }
  
  @scala.inline
  def List(member: Member): typings.awsSdkBuildTypes.apiModelMod.List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.List]
  }
  
  @scala.inline
  def Long(): typings.awsSdkBuildTypes.apiModelMod.Long = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Long]
  }
  
  @scala.inline
  def Map(key: Member, value: Member): typings.awsSdkBuildTypes.apiModelMod.Map = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("map")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Map]
  }
  
  @scala.inline
  def Short(): typings.awsSdkBuildTypes.apiModelMod.Short = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Short]
  }
  
  @scala.inline
  def String(): typings.awsSdkBuildTypes.apiModelMod.String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.String]
  }
  
  @scala.inline
  def Structure(members: StringDictionary[StructureMember]): typings.awsSdkBuildTypes.apiModelMod.Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("structure")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Structure]
  }
  
  @scala.inline
  def Timestamp(): typings.awsSdkBuildTypes.apiModelMod.Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Timestamp]
  }
}
