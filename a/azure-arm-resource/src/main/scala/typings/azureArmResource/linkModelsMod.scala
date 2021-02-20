package typings.azureArmResource

import typings.msRestAzure.mod.CloudErrorParameters
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkModelsMod {
  
  @JSImport("azure-arm-resource/lib/link/models", "BaseResource")
  @js.native
  class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/link/models", "CloudError")
  @js.native
  class CloudError protected ()
    extends typings.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  @js.native
  trait Operation extends StObject {
    
    /**
      * The object that represents the operation.
      */
    var display: js.UndefOr[OperationDisplay] = js.native
    
    /**
      * Operation name: {provider}/{resource}/{operation}
      */
    var name: js.UndefOr[String] = js.native
  }
  object Operation {
    
    @scala.inline
    def apply(): Operation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operation]
    }
    
    @scala.inline
    implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: OperationDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait OperationDisplay extends StObject {
    
    /**
      * Description of the operation.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Operation type: Read, write, delete, etc.
      */
    var operation: js.UndefOr[String] = js.native
    
    /**
      * Service provider: Microsoft.Resources
      */
    var provider: js.UndefOr[String] = js.native
    
    /**
      * Resource on which the operation is performed: Profile, endpoint, etc.
      */
    var resource: js.UndefOr[String] = js.native
  }
  object OperationDisplay {
    
    @scala.inline
    def apply(): OperationDisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationDisplay]
    }
    
    @scala.inline
    implicit class OperationDisplayMutableBuilder[Self <: OperationDisplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    }
  }
  
  @js.native
  trait OperationListResult extends Array[Operation] {
    
    /**
      * URL to get the next set of operation list results if there are any.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ResourceLink
    extends typings.msRestAzure.mod.BaseResource {
    
    /**
      * The fully qualified ID of the resource link.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The name of the resource link.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * Properties for resource link.
      */
    var properties: js.UndefOr[ResourceLinkProperties] = js.native
    
    /**
      * The resource link object.
      */
    val `type`: js.UndefOr[js.Any] = js.native
  }
  
  @js.native
  trait ResourceLinkFilter extends StObject {
    
    /**
      * The ID of the target resource.
      */
    var targetId: String = js.native
  }
  object ResourceLinkFilter {
    
    @scala.inline
    def apply(targetId: String): ResourceLinkFilter = {
      val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceLinkFilter]
    }
    
    @scala.inline
    implicit class ResourceLinkFilterMutableBuilder[Self <: ResourceLinkFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceLinkProperties extends StObject {
    
    /**
      * Notes about the resource link.
      */
    var notes: js.UndefOr[String] = js.native
    
    /**
      * The fully qualified ID of the source resource in the link.
      */
    val sourceId: js.UndefOr[String] = js.native
    
    /**
      * The fully qualified ID of the target resource in the link.
      */
    var targetId: String = js.native
  }
  object ResourceLinkProperties {
    
    @scala.inline
    def apply(targetId: String): ResourceLinkProperties = {
      val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceLinkProperties]
    }
    
    @scala.inline
    implicit class ResourceLinkPropertiesMutableBuilder[Self <: ResourceLinkProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      @scala.inline
      def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
      
      @scala.inline
      def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceLinkResult extends Array[ResourceLink] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    val nextLink: js.UndefOr[String] = js.native
  }
}
