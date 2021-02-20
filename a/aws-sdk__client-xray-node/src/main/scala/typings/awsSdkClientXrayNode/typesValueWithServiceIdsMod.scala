package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesAnnotationValueMod.AnnotationValue
import typings.awsSdkClientXrayNode.typesAnnotationValueMod.UnmarshalledAnnotationValue
import typings.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typings.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesValueWithServiceIdsMod {
  
  @js.native
  trait UnmarshalledValueWithServiceIds extends ValueWithServiceIds {
    
    /**
      * <p>Values of the annotation.</p>
      */
    @JSName("AnnotationValue")
    var AnnotationValue_UnmarshalledValueWithServiceIds: js.UndefOr[UnmarshalledAnnotationValue] = js.native
    
    /**
      * <p>Services to which the annotation applies.</p>
      */
    @JSName("ServiceIds")
    var ServiceIds_UnmarshalledValueWithServiceIds: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.native
  }
  object UnmarshalledValueWithServiceIds {
    
    @scala.inline
    def apply(): UnmarshalledValueWithServiceIds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledValueWithServiceIds]
    }
    
    @scala.inline
    implicit class UnmarshalledValueWithServiceIdsMutableBuilder[Self <: UnmarshalledValueWithServiceIds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotationValue(value: UnmarshalledAnnotationValue): Self = StObject.set(x, "AnnotationValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationValueUndefined: Self = StObject.set(x, "AnnotationValue", js.undefined)
      
      @scala.inline
      def setServiceIds(value: js.Array[UnmarshalledServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      @scala.inline
      def setServiceIdsVarargs(value: UnmarshalledServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ValueWithServiceIds extends StObject {
    
    /**
      * <p>Values of the annotation.</p>
      */
    var AnnotationValue: js.UndefOr[typings.awsSdkClientXrayNode.typesAnnotationValueMod.AnnotationValue] = js.native
    
    /**
      * <p>Services to which the annotation applies.</p>
      */
    var ServiceIds: js.UndefOr[js.Array[ServiceId] | Iterable[ServiceId]] = js.native
  }
  object ValueWithServiceIds {
    
    @scala.inline
    def apply(): ValueWithServiceIds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueWithServiceIds]
    }
    
    @scala.inline
    implicit class ValueWithServiceIdsMutableBuilder[Self <: ValueWithServiceIds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotationValue(value: AnnotationValue): Self = StObject.set(x, "AnnotationValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationValueUndefined: Self = StObject.set(x, "AnnotationValue", js.undefined)
      
      @scala.inline
      def setServiceIds(value: js.Array[ServiceId] | Iterable[ServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      @scala.inline
      def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
    }
  }
}
