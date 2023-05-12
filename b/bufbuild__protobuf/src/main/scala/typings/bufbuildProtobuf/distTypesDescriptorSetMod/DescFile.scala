package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.file
import typings.bufbuildProtobuf.bufbuildProtobufStrings.proto2
import typings.bufbuildProtobuf.bufbuildProtobufStrings.proto3
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorProto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescFile
  extends StObject
     with AnyDesc {
  
  /**
    * Marked as deprecated in the protobuf source.
    */
  val deprecated: Boolean
  
  /**
    * Top-level enumerations declared in this file.
    * Note that more enumerations might be declared within message declarations.
    */
  val enums: js.Array[DescEnum]
  
  /**
    * Top-level extensions declared in this file.
    * Note that more extensions might be declared within message declarations.
    */
  val extensions: js.Array[DescExtension]
  
  /**
    * Get comments on the package element in the protobuf source.
    */
  def getPackageComments(): DescComments
  
  /**
    * Get comments on the syntax element in the protobuf source.
    */
  def getSyntaxComments(): DescComments
  
  var kind: file
  
  /**
    * Top-level messages declared in this file.
    * Note that more messages might be declared within message declarations.
    */
  val messages: js.Array[DescMessage]
  
  /**
    * The name of the file, excluding the .proto suffix.
    * For a protobuf file `foo/bar.proto`, this is `foo/bar`.
    */
  val name: String
  
  /**
    * The compiler-generated descriptor.
    */
  val proto: FileDescriptorProto
  
  /**
    * Services declared in this file.
    */
  val services: js.Array[DescService]
  
  /**
    * The syntax specified in the protobuf source.
    */
  val syntax: proto3 | proto2
}
object DescFile {
  
  inline def apply(
    deprecated: Boolean,
    enums: js.Array[DescEnum],
    extensions: js.Array[DescExtension],
    getPackageComments: () => DescComments,
    getSyntaxComments: () => DescComments,
    messages: js.Array[DescMessage],
    name: String,
    proto: FileDescriptorProto,
    services: js.Array[DescService],
    syntax: proto3 | proto2
  ): DescFile = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], enums = enums.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], getPackageComments = js.Any.fromFunction0(getPackageComments), getSyntaxComments = js.Any.fromFunction0(getSyntaxComments), kind = "file", messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFile] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setEnums(value: js.Array[DescEnum]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    inline def setEnumsVarargs(value: DescEnum*): Self = StObject.set(x, "enums", js.Array(value*))
    
    inline def setExtensions(value: js.Array[DescExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: DescExtension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setGetPackageComments(value: () => DescComments): Self = StObject.set(x, "getPackageComments", js.Any.fromFunction0(value))
    
    inline def setGetSyntaxComments(value: () => DescComments): Self = StObject.set(x, "getSyntaxComments", js.Any.fromFunction0(value))
    
    inline def setKind(value: file): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[DescMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: DescMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProto(value: FileDescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setServices(value: js.Array[DescService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: DescService*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSyntax(value: proto3 | proto2): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
  }
}
