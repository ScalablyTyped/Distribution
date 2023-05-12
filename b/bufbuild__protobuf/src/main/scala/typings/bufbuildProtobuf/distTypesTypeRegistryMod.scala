package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.distTypesEnumMod.EnumType
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesServiceTypeMod.ServiceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypeRegistryMod {
  
  trait IEnumTypeRegistry extends StObject {
    
    /**
      * Find an enum type by its protobuf type name.
      */
    def findEnum(typeName: String): js.UndefOr[EnumType]
  }
  object IEnumTypeRegistry {
    
    inline def apply(findEnum: String => js.UndefOr[EnumType]): IEnumTypeRegistry = {
      val __obj = js.Dynamic.literal(findEnum = js.Any.fromFunction1(findEnum))
      __obj.asInstanceOf[IEnumTypeRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEnumTypeRegistry] (val x: Self) extends AnyVal {
      
      inline def setFindEnum(value: String => js.UndefOr[EnumType]): Self = StObject.set(x, "findEnum", js.Any.fromFunction1(value))
    }
  }
  
  trait IMessageTypeRegistry extends StObject {
    
    /**
      * Find a message type by its protobuf type name.
      */
    def findMessage(typeName: String): js.UndefOr[MessageType[AnyMessage]]
  }
  object IMessageTypeRegistry {
    
    inline def apply(findMessage: String => js.UndefOr[MessageType[AnyMessage]]): IMessageTypeRegistry = {
      val __obj = js.Dynamic.literal(findMessage = js.Any.fromFunction1(findMessage))
      __obj.asInstanceOf[IMessageTypeRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMessageTypeRegistry] (val x: Self) extends AnyVal {
      
      inline def setFindMessage(value: String => js.UndefOr[MessageType[AnyMessage]]): Self = StObject.set(x, "findMessage", js.Any.fromFunction1(value))
    }
  }
  
  trait IServiceTypeRegistry extends StObject {
    
    /**
      * Find a service type by its protobuf type name.
      */
    def findService(typeName: String): js.UndefOr[ServiceType]
  }
  object IServiceTypeRegistry {
    
    inline def apply(findService: String => js.UndefOr[ServiceType]): IServiceTypeRegistry = {
      val __obj = js.Dynamic.literal(findService = js.Any.fromFunction1(findService))
      __obj.asInstanceOf[IServiceTypeRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IServiceTypeRegistry] (val x: Self) extends AnyVal {
      
      inline def setFindService(value: String => js.UndefOr[ServiceType]): Self = StObject.set(x, "findService", js.Any.fromFunction1(value))
    }
  }
}
