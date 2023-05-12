package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.service
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.ServiceDescriptorProto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescService
  extends StObject
     with AnyDesc {
  
  /**
    * Marked as deprecated in the protobuf source.
    */
  val deprecated: Boolean
  
  /**
    * The file this service was declared in.
    */
  val file: DescFile
  
  /**
    * Get comments on the element in the protobuf source.
    */
  def getComments(): DescComments
  
  var kind: service
  
  /**
    * The RPCs this service declares.
    */
  val methods: js.Array[DescMethod]
  
  /**
    * The name of the service, as specified in the protobuf source.
    */
  val name: String
  
  /**
    * The compiler-generated descriptor.
    */
  val proto: ServiceDescriptorProto
  
  /**
    * The fully qualified name of the service. (We omit the leading dot.)
    */
  val typeName: String
}
object DescService {
  
  inline def apply(
    deprecated: Boolean,
    file: DescFile,
    getComments: () => DescComments,
    methods: js.Array[DescMethod],
    name: String,
    proto: ServiceDescriptorProto,
    typeName: String
  ): DescService = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "service", methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescService] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setFile(value: DescFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setGetComments(value: () => DescComments): Self = StObject.set(x, "getComments", js.Any.fromFunction0(value))
    
    inline def setKind(value: service): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMethods(value: js.Array[DescMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsVarargs(value: DescMethod*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProto(value: ServiceDescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
