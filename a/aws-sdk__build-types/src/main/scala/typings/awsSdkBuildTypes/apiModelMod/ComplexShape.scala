package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.list
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.map
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.structure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkBuildTypes.apiModelMod.List
  - typings.awsSdkBuildTypes.apiModelMod.Map
  - typings.awsSdkBuildTypes.apiModelMod.Structure
*/
trait ComplexShape extends StObject
object ComplexShape {
  
  @scala.inline
  def List(member: Member, `type`: list): typings.awsSdkBuildTypes.apiModelMod.List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.List]
  }
  
  @scala.inline
  def Map(key: Member, `type`: map, value: Member): typings.awsSdkBuildTypes.apiModelMod.Map = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Map]
  }
  
  @scala.inline
  def Structure(members: StringDictionary[StructureMember], `type`: structure): typings.awsSdkBuildTypes.apiModelMod.Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsSdkBuildTypes.apiModelMod.Structure]
  }
}
