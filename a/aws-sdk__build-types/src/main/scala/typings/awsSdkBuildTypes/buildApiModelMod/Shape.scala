package typings.awsSdkBuildTypes.buildApiModelMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.buildApiModelMod.Blob
  - typings.awsSdkBuildTypes.buildApiModelMod.Boolean
  - typings.awsSdkBuildTypes.buildApiModelMod.Byte
  - typings.awsSdkBuildTypes.buildApiModelMod.Character
  - typings.awsSdkBuildTypes.buildApiModelMod.Double
  - typings.awsSdkBuildTypes.buildApiModelMod.Float
  - typings.awsSdkBuildTypes.buildApiModelMod.Integer
  - typings.awsSdkBuildTypes.buildApiModelMod.List
  - typings.awsSdkBuildTypes.buildApiModelMod.Long
  - typings.awsSdkBuildTypes.buildApiModelMod.Map
  - typings.awsSdkBuildTypes.buildApiModelMod.Short
  - typings.awsSdkBuildTypes.buildApiModelMod.String
  - typings.awsSdkBuildTypes.buildApiModelMod.Structure
  - typings.awsSdkBuildTypes.buildApiModelMod.Timestamp
*/
trait Shape extends StObject
object Shape {
  
  inline def Blob(): typings.awsSdkBuildTypes.buildApiModelMod.Blob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("blob")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Blob]
  }
  
  inline def Boolean(): typings.awsSdkBuildTypes.buildApiModelMod.Boolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Boolean]
  }
  
  inline def Byte(): typings.awsSdkBuildTypes.buildApiModelMod.Byte = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Byte]
  }
  
  inline def Character(): typings.awsSdkBuildTypes.buildApiModelMod.Character = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("character")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Character]
  }
  
  inline def Double(): typings.awsSdkBuildTypes.buildApiModelMod.Double = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Double]
  }
  
  inline def Float(): typings.awsSdkBuildTypes.buildApiModelMod.Float = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Float]
  }
  
  inline def Integer(): typings.awsSdkBuildTypes.buildApiModelMod.Integer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Integer]
  }
  
  inline def List(member: Member): typings.awsSdkBuildTypes.buildApiModelMod.List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.List]
  }
  
  inline def Long(): typings.awsSdkBuildTypes.buildApiModelMod.Long = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Long]
  }
  
  inline def Map(key: Member, value: Member): typings.awsSdkBuildTypes.buildApiModelMod.Map = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("map")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Map]
  }
  
  inline def Short(): typings.awsSdkBuildTypes.buildApiModelMod.Short = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Short]
  }
  
  inline def String(): typings.awsSdkBuildTypes.buildApiModelMod.String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.String]
  }
  
  inline def Structure(members: StringDictionary[StructureMember]): typings.awsSdkBuildTypes.buildApiModelMod.Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("structure")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Structure]
  }
  
  inline def Timestamp(): typings.awsSdkBuildTypes.buildApiModelMod.Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Timestamp]
  }
}
