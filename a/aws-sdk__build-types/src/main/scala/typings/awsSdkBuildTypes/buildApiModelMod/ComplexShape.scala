package typings.awsSdkBuildTypes.buildApiModelMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.buildApiModelMod.List
  - typings.awsSdkBuildTypes.buildApiModelMod.Map
  - typings.awsSdkBuildTypes.buildApiModelMod.Structure
*/
trait ComplexShape extends StObject
object ComplexShape {
  
  inline def List(member: Member): typings.awsSdkBuildTypes.buildApiModelMod.List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.List]
  }
  
  inline def Map(key: Member, value: Member): typings.awsSdkBuildTypes.buildApiModelMod.Map = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("map")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Map]
  }
  
  inline def Structure(members: StringDictionary[StructureMember]): typings.awsSdkBuildTypes.buildApiModelMod.Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("structure")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.buildApiModelMod.Structure]
  }
}
