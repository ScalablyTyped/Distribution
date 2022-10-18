package typings.awsSdkBuildTypes.buildApiModelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureMember
  extends StObject
     with Member {
  
  var location: js.UndefOr[MemberLocation] = js.undefined
  
  var streaming: js.UndefOr[scala.Boolean] = js.undefined
  
  var xmlNamespace: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XmlNamespace */ Any) | java.lang.String
  ] = js.undefined
}
object StructureMember {
  
  inline def apply(shape: java.lang.String): StructureMember = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMember]
  }
  
  extension [Self <: StructureMember](x: Self) {
    
    inline def setLocation(value: MemberLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setStreaming(value: scala.Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    inline def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
    
    inline def setXmlNamespace(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XmlNamespace */ Any) | java.lang.String
    ): Self = StObject.set(x, "xmlNamespace", value.asInstanceOf[js.Any])
    
    inline def setXmlNamespaceUndefined: Self = StObject.set(x, "xmlNamespace", js.undefined)
  }
}
