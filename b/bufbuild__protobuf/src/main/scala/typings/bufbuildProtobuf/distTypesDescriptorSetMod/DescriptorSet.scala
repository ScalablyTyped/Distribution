package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptorSet extends StObject {
  
  /**
    * All enumerations, indexed by their fully qualified type name.
    * (We omit the leading dot.)
    */
  val enums: ReadonlyMap[String, DescEnum]
  
  /**
    * All extensions, indexed by their fully qualified type name.
    */
  val extensions: ReadonlyMap[String, DescExtension]
  
  /**
    * All files, in the order they were added to the set.
    */
  val files: js.Array[DescFile]
  
  /**
    * All messages, indexed by their fully qualified type name.
    * (We omit the leading dot.)
    */
  val messages: ReadonlyMap[String, DescMessage]
  
  /**
    * All services, indexed by their fully qualified type name.
    * (We omit the leading dot.)
    */
  val services: ReadonlyMap[String, DescService]
}
object DescriptorSet {
  
  inline def apply(
    enums: ReadonlyMap[String, DescEnum],
    extensions: ReadonlyMap[String, DescExtension],
    files: js.Array[DescFile],
    messages: ReadonlyMap[String, DescMessage],
    services: ReadonlyMap[String, DescService]
  ): DescriptorSet = {
    val __obj = js.Dynamic.literal(enums = enums.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptorSet] (val x: Self) extends AnyVal {
    
    inline def setEnums(value: ReadonlyMap[String, DescEnum]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: ReadonlyMap[String, DescExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Array[DescFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: DescFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setMessages(value: ReadonlyMap[String, DescMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setServices(value: ReadonlyMap[String, DescService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
  }
}
