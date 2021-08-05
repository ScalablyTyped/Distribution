package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.apiModelMod.List
  - typings.awsSdkBuildTypes.apiModelMod.Map
  - typings.awsSdkBuildTypes.apiModelMod.Structure
*/
trait ComplexShape extends StObject
object ComplexShape {
  
  inline def List(member: Member): typings.awsSdkBuildTypes.apiModelMod.List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.List]
  }
  
  inline def Map(key: Member, value: Member): typings.awsSdkBuildTypes.apiModelMod.Map = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("map")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Map]
  }
  
  inline def Structure(members: StringDictionary[StructureMember]): typings.awsSdkBuildTypes.apiModelMod.Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("structure")
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Structure]
  }
}
