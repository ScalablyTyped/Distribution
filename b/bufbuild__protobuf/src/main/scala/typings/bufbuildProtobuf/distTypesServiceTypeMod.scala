package typings.bufbuildProtobuf

import org.scalablytyped.runtime.StringDictionary
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodKind.BiDiStreaming
import typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodKind.ClientStreaming
import typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodKind.ServerStreaming
import typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodKind.Unary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesServiceTypeMod {
  
  @js.native
  sealed trait MethodIdempotency extends StObject
  @JSImport("@bufbuild/protobuf/dist/types/service-type", "MethodIdempotency")
  @js.native
  object MethodIdempotency extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MethodIdempotency & Double] = js.native
    
    /**
      * Idempotent, but may have side effects.
      */
    @js.native
    sealed trait Idempotent
      extends StObject
         with MethodIdempotency
    /* 2 */ val Idempotent: typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodIdempotency.Idempotent & Double = js.native
    
    /**
      * Idempotent, no side effects.
      */
    @js.native
    sealed trait NoSideEffects
      extends StObject
         with MethodIdempotency
    /* 1 */ val NoSideEffects: typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodIdempotency.NoSideEffects & Double = js.native
  }
  
  @js.native
  sealed trait MethodKind extends StObject
  @JSImport("@bufbuild/protobuf/dist/types/service-type", "MethodKind")
  @js.native
  object MethodKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MethodKind & Double] = js.native
    
    @js.native
    sealed trait BiDiStreaming
      extends StObject
         with MethodKind
    /* 3 */ val BiDiStreaming: typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodKind.BiDiStreaming & Double = js.native
    
    @js.native
    sealed trait ClientStreaming
      extends StObject
         with MethodKind
    /* 2 */ val ClientStreaming: typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodKind.ClientStreaming & Double = js.native
    
    @js.native
    sealed trait ServerStreaming
      extends StObject
         with MethodKind
    /* 1 */ val ServerStreaming: typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodKind.ServerStreaming & Double = js.native
    
    @js.native
    sealed trait Unary
      extends StObject
         with MethodKind
    /* 0 */ val Unary: typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodKind.Unary & Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoUnary[I, O]
    - typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoServerStreaming[I, O]
    - typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoClientStreaming[I, O]
    - typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoBiDiStreaming[I, O]
  */
  trait MethodInfo[I /* <: Message[I] */, O /* <: Message[O] */] extends StObject
  object MethodInfo {
    
    inline def MethodInfoBiDiStreaming[I /* <: Message[I] */, O /* <: Message[O] */](I: MessageType[I], O: MessageType[O], kind: BiDiStreaming, name: String): typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoBiDiStreaming[I, O] = {
      val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoBiDiStreaming[I, O]]
    }
    
    inline def MethodInfoClientStreaming[I /* <: Message[I] */, O /* <: Message[O] */](I: MessageType[I], O: MessageType[O], kind: ClientStreaming, name: String): typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoClientStreaming[I, O] = {
      val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoClientStreaming[I, O]]
    }
    
    inline def MethodInfoServerStreaming[I /* <: Message[I] */, O /* <: Message[O] */](I: MessageType[I], O: MessageType[O], kind: ServerStreaming, name: String): typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoServerStreaming[I, O] = {
      val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoServerStreaming[I, O]]
    }
    
    inline def MethodInfoUnary[I /* <: Message[I] */, O /* <: Message[O] */](I: MessageType[I], O: MessageType[O], kind: Unary, name: String): typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoUnary[I, O] = {
      val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodInfoUnary[I, O]]
    }
  }
  
  trait MethodInfoBiDiStreaming[I /* <: Message[I] */, O /* <: Message[O] */]
    extends StObject
       with miShared[I, O]
       with MethodInfo[I, O] {
    
    val kind: BiDiStreaming
  }
  object MethodInfoBiDiStreaming {
    
    inline def apply[I /* <: Message[I] */, O /* <: Message[O] */](I: MessageType[I], O: MessageType[O], kind: BiDiStreaming, name: String): MethodInfoBiDiStreaming[I, O] = {
      val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodInfoBiDiStreaming[I, O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MethodInfoBiDiStreaming[?, ?], I /* <: Message[I] */, O /* <: Message[O] */] (val x: Self & (MethodInfoBiDiStreaming[I, O])) extends AnyVal {
      
      inline def setKind(value: BiDiStreaming): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodInfoClientStreaming[I /* <: Message[I] */, O /* <: Message[O] */]
    extends StObject
       with miShared[I, O]
       with MethodInfo[I, O] {
    
    val kind: ClientStreaming
  }
  object MethodInfoClientStreaming {
    
    inline def apply[I /* <: Message[I] */, O /* <: Message[O] */](I: MessageType[I], O: MessageType[O], kind: ClientStreaming, name: String): MethodInfoClientStreaming[I, O] = {
      val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodInfoClientStreaming[I, O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MethodInfoClientStreaming[?, ?], I /* <: Message[I] */, O /* <: Message[O] */] (val x: Self & (MethodInfoClientStreaming[I, O])) extends AnyVal {
      
      inline def setKind(value: ClientStreaming): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodInfoServerStreaming[I /* <: Message[I] */, O /* <: Message[O] */]
    extends StObject
       with miShared[I, O]
       with MethodInfo[I, O] {
    
    val kind: ServerStreaming
  }
  object MethodInfoServerStreaming {
    
    inline def apply[I /* <: Message[I] */, O /* <: Message[O] */](I: MessageType[I], O: MessageType[O], kind: ServerStreaming, name: String): MethodInfoServerStreaming[I, O] = {
      val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodInfoServerStreaming[I, O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MethodInfoServerStreaming[?, ?], I /* <: Message[I] */, O /* <: Message[O] */] (val x: Self & (MethodInfoServerStreaming[I, O])) extends AnyVal {
      
      inline def setKind(value: ServerStreaming): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodInfoUnary[I /* <: Message[I] */, O /* <: Message[O] */]
    extends StObject
       with miShared[I, O]
       with MethodInfo[I, O] {
    
    val kind: Unary
  }
  object MethodInfoUnary {
    
    inline def apply[I /* <: Message[I] */, O /* <: Message[O] */](I: MessageType[I], O: MessageType[O], kind: Unary, name: String): MethodInfoUnary[I, O] = {
      val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodInfoUnary[I, O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MethodInfoUnary[?, ?], I /* <: Message[I] */, O /* <: Message[O] */] (val x: Self & (MethodInfoUnary[I, O])) extends AnyVal {
      
      inline def setKind(value: Unary): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceType extends StObject {
    
    /**
      * A map of local name (safe to use in ECMAScript) to method.
      */
    val methods: StringDictionary[MethodInfo[AnyMessage, AnyMessage]]
    
    /**
      * The fully qualified name of the service.
      */
    val typeName: String
  }
  object ServiceType {
    
    inline def apply(methods: StringDictionary[MethodInfo[AnyMessage, AnyMessage]], typeName: String): ServiceType = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceType] (val x: Self) extends AnyVal {
      
      inline def setMethods(value: StringDictionary[MethodInfo[AnyMessage, AnyMessage]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait miShared[I /* <: Message[I] */, O /* <: Message[O] */] extends StObject {
    
    val I: MessageType[I]
    
    val O: MessageType[O]
    
    val idempotency: js.UndefOr[MethodIdempotency] = js.undefined
    
    val name: String
  }
  object miShared {
    
    inline def apply[I /* <: Message[I] */, O /* <: Message[O] */](I: MessageType[I], O: MessageType[O], name: String): miShared[I, O] = {
      val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[miShared[I, O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: miShared[?, ?], I /* <: Message[I] */, O /* <: Message[O] */] (val x: Self & (miShared[I, O])) extends AnyVal {
      
      inline def setI(value: MessageType[I]): Self = StObject.set(x, "I", value.asInstanceOf[js.Any])
      
      inline def setIdempotency(value: MethodIdempotency): Self = StObject.set(x, "idempotency", value.asInstanceOf[js.Any])
      
      inline def setIdempotencyUndefined: Self = StObject.set(x, "idempotency", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setO(value: MessageType[O]): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
    }
  }
}
