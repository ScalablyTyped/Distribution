package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.structure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Structure
  extends StObject
     with ShapeDef
     with ComplexShape
     with Shape {
  
  var error: js.UndefOr[Error] = js.undefined
  
  var exception: js.UndefOr[scala.Boolean] = js.undefined
  
  var fault: js.UndefOr[scala.Boolean] = js.undefined
  
  var members: StringDictionary[StructureMember]
  
  var payload: js.UndefOr[java.lang.String] = js.undefined
  
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var topLevel: js.UndefOr[input | output] = js.undefined
  
  @JSName("type")
  val type_Structure: structure
}
object Structure {
  
  @scala.inline
  def apply(members: StringDictionary[StructureMember]): Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("structure")
    __obj.asInstanceOf[Structure]
  }
  
  @scala.inline
  implicit class StructureMutableBuilder[Self <: Structure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setException(value: scala.Boolean): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    @scala.inline
    def setFault(value: scala.Boolean): Self = StObject.set(x, "fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultUndefined: Self = StObject.set(x, "fault", js.undefined)
    
    @scala.inline
    def setMembers(value: StringDictionary[StructureMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: java.lang.String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setRequired(value: js.Array[java.lang.String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: java.lang.String*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    @scala.inline
    def setTopLevel(value: input | output): Self = StObject.set(x, "topLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLevelUndefined: Self = StObject.set(x, "topLevel", js.undefined)
    
    @scala.inline
    def setType(value: structure): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
